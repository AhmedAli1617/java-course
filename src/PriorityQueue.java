class PriorityQueue
    {
        private Task[] heap;   //array of objects
        private int heapSize, capacity;


        public PriorityQueue(int capacity)
        {
            this.capacity = capacity + 1;
            heap = new Task[this.capacity];
            heapSize = 0;
        }
        

        public void clear()
        {
            heap = new Task[capacity];
            heapSize = 0;
        }
        


        public boolean isEmpty()
        {
            return heapSize == 0;
        }
        

        public boolean isFull()
        {
            return heapSize == capacity - 1;
        }
        


        public int size()
        {
            return heapSize;
        }
        


        public void insert(String job, int priority)
        {
            Task newJob = new Task(job, priority);

            heap[++heapSize] = newJob;

            //cleaner is saved on the 0th index

            int pos = heapSize;

            // post =1
            // pos =2
            //pos =3
            while (pos != 1 && newJob.priority > heap[pos/2].priority)
            {
                heap[pos] = heap[pos/2];
                pos /=2;
            }

            //job='cleaner',priority=2
            //jon='manager',priority=5
            //job='clerk',priority=1

            //1st element insertion   cleaner,cleaner
            //2nd element insertion   cleaner,manager,manager   pos->1
            //3rd element insertion   cleaner,manager,clerk


            heap[pos] = newJob;
        }
        


        public Task remove()
        {
            int parent, child;
            Task item, temp;
            if (isEmpty() )
            {
                System.out.println("Heap is empty");
                return null;
            }

            item = heap[1];
            temp = heap[heapSize--];

            parent = 1;
            child = 2;
            while (child <= heapSize)
            {
                if (child < heapSize && heap[child].priority < heap[child + 1].priority)
                    child++;
                if (temp.priority >= heap[child].priority)
                    break;

                heap[parent] = heap[child];
                parent = child;
                child *= 2;
            }
            heap[parent] = temp;

            return item;
        }
    }
    
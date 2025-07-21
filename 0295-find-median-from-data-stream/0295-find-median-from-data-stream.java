class MedianFinder {
    PriorityQueue<Integer> min; // the larger part
    PriorityQueue<Integer> max; // the smaller part

    public MedianFinder() {
        min = new PriorityQueue<>();
        max = new PriorityQueue<>(new Comparator<Integer>() { // decreasing order
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(max.size() < min.size()){
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        System.out.println(max.peek() + " " + min.peek());
        if (max.size() == min.size()) {
            return (double)(max.peek() + min.peek()) / 2;
        }
        return max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
package com.turkcell.spring.demos.methodinvocation;

public abstract class QueueManager {

	private Queue queue;
	
	public void addToQueue() {
		Queue asyncQueue = createAsyncQueue();
		asyncQueue.increase();
		queue.increase();
	}
	
	protected abstract Queue createAsyncQueue();
	
	public Queue getQueue() {
		return queue;
	}
	public void setQueue(Queue queue) {
		this.queue = queue;
	}
}

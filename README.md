# Title : Parallel HTTP Request Handling in Spring using Kotlin Coroutines

## Description:
In this implementation, we utilize Spring’s WebClient as a non-blocking HTTP client in combination with Kotlin coroutines to perform multiple HTTP requests in parallel. The goal is to maximize throughput and reduce latency by executing remote API calls concurrently rather than sequentially.

By leveraging coroutineScope and async, each HTTP call is dispatched asynchronously and awaited collectively. This approach integrates seamlessly with Spring’s reactive ecosystem and enables efficient parallelism without blocking the underlying threads.

This method is particularly useful in microservices environments or when aggregating data from multiple external APIs.

### Key Technologies:

	•	Spring WebFlux (WebClient)
	•	Kotlin Coroutines (async, await)
	•	Structured concurrency
	•	Non-blocking I/O

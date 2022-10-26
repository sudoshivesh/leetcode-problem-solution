#1046. Last Stone Weight
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        heap = [-num for num in stones]
        # init max heap
        heapq.heapify(heap)
        # smash two heaviest stones from heap each time
        while len(heap) > 1:
            diff = heapq.heappop(heap) - heapq.heappop(heap)
            if diff != 0:
                heapq.heappush(heap, diff)
        return -heap[0] if len(heap) == 1 else 0

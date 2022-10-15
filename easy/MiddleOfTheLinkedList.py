#876. Middle of The Linked List
class Solution:
  def middleNode(self, head: ListNode) -> ListNode:
    slow = head
    fast = head

    while fast and fast.next:
      slow = slow.next
      fast = fast.next.next

    return slow

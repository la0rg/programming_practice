package main

import (
	"testing"

	. "github.com/la0rg/programming_practice/CrackingTheCodingInterview/LinkedLists/Go/2.1/list"
)

func TestRemoveDuplicates(t *testing.T) {
	list := NewLinkedList([]int{1, 2, 2, 1, 1, 3, 1, 2, 3, 4})
	(*LList)(list).RemoveDuplicates()
	if !list.Compare(NewLinkedList([]int{1, 2, 3, 4})) {
		t.Errorf("Expected 1->2->3->4, got: %v", list)
	}
	list = NewLinkedList([]int{2, 2, 1, 1, 1, 1, 3, -1, 4, 5, 6, 7, 1, 3, 1, 2, 3, 4})
	(*LList)(list).RemoveDuplicates()
	if !list.Compare(NewLinkedList([]int{2, 1, 3, -1, 4, 5, 6, 7})) {
		t.Errorf("Expected 2->1->3->-1->4->5->6->7, got: %v", list)
	}
}

func TestRemoveDuplicatesNoMemoryUsage(t *testing.T) {
	list := NewLinkedList([]int{1, 2, 2, 1, 1, 3, 1, 2, 3, 4})
	(*LList)(list).RemoveDuplicatesNoMemoryUsage()
	if !list.Compare(NewLinkedList([]int{1, 2, 3, 4})) {
		t.Errorf("Expected 1->2->3->4, got: %v", list)
	}
	list = NewLinkedList([]int{2, 2, 1, 1, 1, 1, 3, -1, 4, 5, 6, 7, 1, 3, 1, 2, 3, 4})
	(*LList)(list).RemoveDuplicatesNoMemoryUsage()
	if !list.Compare(NewLinkedList([]int{2, 1, 3, -1, 4, 5, 6, 7})) {
		t.Errorf("Expected 2->1->3->-1->4->5->6->7, got: %v", list)
	}
}

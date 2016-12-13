package list

import (
	"bytes"
	"fmt"
)

type Node struct {
	Value int
	Next  *Node
}

type LinkedList struct {
	Head *Node
}

func NewLinkedList(slice []int) *LinkedList {
	result := &LinkedList{}
	for _, v := range slice {
		result.Append(v)
	}
	return result
}

func (l *LinkedList) String() string {
	var buffer bytes.Buffer
	for current := l.Head; current != nil; current = current.Next {
		buffer.WriteString(fmt.Sprintf("%d -> ", current.Value))
	}
	return buffer.String()
}

func (l *LinkedList) Append(value int) *LinkedList {
	if l.Head == nil {
		l.Head = &Node{value, nil}
		return l
	}
	var current *Node
	for current = l.Head; current.Next != nil; current = current.Next {
	}
	current.Next = &Node{value, nil}
	return l
}

func (l *LinkedList) Compare(list *LinkedList) bool {
	if l == list {
		return true
	}
	if list == nil {
		return false
	}
	h1 := l.Head
	h2 := list.Head
	for h1 != nil {
		if h2 == nil || h1.Value != h2.Value {
			return false
		}
		h1 = h1.Next
		h2 = h2.Next
	}
	return true
}

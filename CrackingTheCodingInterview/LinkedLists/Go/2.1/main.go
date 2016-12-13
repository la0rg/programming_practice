package main

import . "github.com/la0rg/programming_practice/CrackingTheCodingInterview/LinkedLists/Go/2.1/list"

type LList LinkedList

func (l *LList) RemoveDuplicatesNoMemoryUsage() {
	for c := l.Head; c != nil; c = c.Next {
		for i := c; i.Next != nil; {
			if i.Next.Value == c.Value {
				i.Next = i.Next.Next
				continue
			}
			i = i.Next
		}
	}
}

func (l *LList) RemoveDuplicates() {
	checker := make(map[int]bool)
	previous := l.Head
	for c := l.Head; c != nil; c = c.Next {
		if checker[c.Value] {
			previous.Next = previous.Next.Next
		} else {
			checker[c.Value] = true
			previous = c
		}
	}
}

// For the solution we have defined k such that passing in k = 0
// would return the last element, k = 1 would return to the second to the last etc.
// Incorrect k values would return nil.
package main

import (
	"container/list"
)

// trivial solution
func FindKthToLast(l *list.List, k int) *list.Element {
	var elem *list.Element
	var size = 0
	for elem = l.Front(); elem != nil; elem, size = elem.Next(), size + 1 {}
	var i = 0
	for elem = l.Front(); i != size - k - 1 && elem != nil; elem, i = elem.Next(), i+1 {}
	return elem

}

// recursive solution
func FindKthToLastRec(l *list.List, k int) *list.Element {
	res, _ := recWalk(l.Front(), k)
	return res
}

func recWalk(e *list.Element, k int) (*list.Element, int) {
	// e == nill when an empty list is passed
	if e == nil || e.Next() == nil {
		if k == 0 {
			return e, 1
		} else {
			return nil, 1
		}
	}
	resNode, depth := recWalk(e.Next(), k)
	if depth == k {
		return e, depth+1
	}
	return resNode, depth+1
}

// iterative solution
// took the idea from Solutions
func FindKthToLastIter(l *list.List, k int) *list.Element {
	var p1, p2 *list.Element = l.Front(), l.Front()
	// negative k
	if k < 0{
		return nil
	}
	// move p2 to kth element
	for i := 0; i < k; i++ {
		// k is bigger than list size
		if p2 == nil {
			return nil
		}
		p2 = p2.Next()
	}

	// k equals to the size of the List
	if p2 == nil {
		return nil
	}

	// move p1 and p2 until p2 at the end of the List
	for ; p2.Next() != nil; p1, p2 = p1.Next(), p2.Next() {
	}

	return p1
}
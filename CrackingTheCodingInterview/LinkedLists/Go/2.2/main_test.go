package main

import (
	"testing"
	"container/list"
)

func TestFindKthToLast(t *testing.T) {
	l := list.New()
	l.PushBack(4)
	l.PushBack(3)
	l.PushBack(2)
	l.PushBack(1)
	l.PushBack(-1)
	l.PushBack(99)

	var element *list.Element
	var current = l.Back()
	for i, e := 0, l.Front(); e != nil; i, e = i + 1, e.Next() {
		element = FindKthToLast(l, i)
		if element == nil {
			t.Errorf("Expected: %d, found: nil", current.Value)
		}
		if element.Value != current.Value {
			t.Errorf("Expected: %d, found: %d", current.Value, element.Value)
		}
		current = current.Prev()
	}
}

func TestFindKthToLastRec(t *testing.T) {
	l := list.New()
	l.PushBack(4)
	l.PushBack(3)
	l.PushBack(2)
	l.PushBack(1)
	l.PushBack(-1)
	l.PushBack(99)

	var element *list.Element
	var current = l.Back()
	for i, e := 0, l.Front(); e != nil; i, e = i + 1, e.Next() {
		element = FindKthToLastRec(l, i)
		if element == nil {
			t.Errorf("Expected: %d, found: nil", current.Value)
		}
		if element.Value != current.Value {
			t.Errorf("Expected: %d, found: %d", current.Value, element.Value)
		}
		current = current.Prev()
	}
}

func TestFindKthToLastIter(t *testing.T) {
	l := list.New()
	l.PushBack(4)
	l.PushBack(3)
	l.PushBack(2)
	l.PushBack(1)
	l.PushBack(-1)
	l.PushBack(99)

	var element *list.Element
	var current = l.Back()
	for i, e := 0, l.Front(); e != nil; i, e = i + 1, e.Next() {
		element = FindKthToLastIter(l, i)
		if element == nil {
			t.Errorf("Expected: %d, found: nil", current.Value)
		}
		if element.Value != current.Value {
			t.Errorf("Expected: %d, found: %d", current.Value, element.Value)
		}
		current = current.Prev()
	}
}

func TestNegative(t *testing.T) {
	l := list.New()
	elem := FindKthToLast(l, 0)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLast(l, 20)
	if elem != nil {
		t.Error("Expected nil")
	}
	l.PushBack(1)
	l.PushBack(2)
	elem = FindKthToLast(l, -1)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLast(l, 20)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLastIter(l, 2)
	if elem != nil {
		t.Error("Expected nil")
	}
}

func TestNegativeRec(t *testing.T) {
	l := list.New()
	elem := FindKthToLastRec(l, 0)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLastRec(l, 20)
	if elem != nil {
		t.Error("Expected nil")
	}
	l.PushBack(1)
	l.PushBack(2)
	elem = FindKthToLastRec(l, -1)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLastRec(l, 20)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLastIter(l, 2)
	if elem != nil {
		t.Error("Expected nil")
	}
}

func TestNegativeIter(t *testing.T) {
	l := list.New()
	elem := FindKthToLastIter(l, 0)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLastIter(l, 20)
	if elem != nil {
		t.Error("Expected nil")
	}
	l.PushBack(1)
	l.PushBack(2)
	elem = FindKthToLastIter(l, -1)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLastIter(l, 20)
	if elem != nil {
		t.Error("Expected nil")
	}
	elem = FindKthToLastIter(l, 2)
	if elem != nil {
		t.Error("Expected nil")
	}
}


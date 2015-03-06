trait Test {
  default object {
    public var prop: Int = 0
      set(i : Int) {
        $prop = i
      }
  }
}

// TESTED_OBJECT_KIND: property
// TESTED_OBJECTS: Test, prop
// ABSENT: TRUE

// TESTED_OBJECT_KIND: property
// TESTED_OBJECTS: Test$Default, prop
// FLAGS: ACC_PRIVATE
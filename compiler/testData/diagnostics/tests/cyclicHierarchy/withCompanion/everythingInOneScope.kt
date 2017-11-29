// see https://jetbrains.quip.com/dc5aABhZoaQY

open class Container {
    open class Base {
        open fun m() {}
    }

    // note that Base() supertype will be resolved in scope that was created on recursion
    abstract class <!CYCLIC_SCOPES!>DerivedAbstract<!> : <!UNRESOLVED_REFERENCE!>Base<!>()

    companion <!CYCLIC_SCOPES!>object<!> : DerivedAbstract() {
        <!NOTHING_TO_OVERRIDE!>override<!> fun m() {}
    }
}









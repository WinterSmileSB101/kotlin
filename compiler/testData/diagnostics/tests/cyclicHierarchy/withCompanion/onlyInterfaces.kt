// see https://jetbrains.quip.com/dc5aABhZoaQY

open class Container {
    // Note that here we also have errors and diagnostics, even though there are actually no loops.
    // (this is case because we can't know if there are any loops without resolving, but resolving
    // itself provokes loops)

    interface Base {
        open fun m() {}
    }

    interface <!CYCLIC_SCOPES!>DerivedAbstract<!> : <!UNRESOLVED_REFERENCE!>Base<!>

    companion <!CYCLIC_SCOPES!>object<!> : DerivedAbstract {
        <!NOTHING_TO_OVERRIDE!>override<!> fun m() {}
    }
}
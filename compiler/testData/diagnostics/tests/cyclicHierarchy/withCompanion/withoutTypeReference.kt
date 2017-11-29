// see https://jetbrains.quip.com/dc5aABhZoaQY

abstract class <!CYCLIC_SCOPES!>DerivedAbstract<!> : C.Base()

class Data

open class C {
    open class <!CYCLIC_SCOPES!>Base<!> {
        open fun m() {}
    }

    val field = Data()

    companion <!CYCLIC_SCOPES!>object<!> : DerivedAbstract() {
        override fun m() {}
    }
}
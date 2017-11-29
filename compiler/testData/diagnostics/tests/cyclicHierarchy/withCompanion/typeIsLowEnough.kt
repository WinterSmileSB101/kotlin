// see https://jetbrains.quip.com/dc5aABhZoaQY

abstract class <!CYCLIC_SCOPES!>DerivedAbstract<!> : C.Base() {
    override abstract fun m()
}

public class C {
    class Data

    open class <!CYCLIC_SCOPES!>Base<!> () {
        open fun m() {}
    }

    // Note that Data is resolved succesfully here because we don't step on error-scope
    val data: Data = Data()

    companion <!CYCLIC_SCOPES!>object<!> : DerivedAbstract() {
        override fun m() {}
    }
}
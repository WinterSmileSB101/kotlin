// see https://jetbrains.quip.com/dc5aABhZoaQY

interface SomeIrrelevantInterface

// note that C.Base() supertype will be resolved in normal scope
abstract class <!CYCLIC_SCOPES!>DerivedAbstract<!> : C.Base()

class Data

public class C {

    val data: Data = Data()

    // Note that any supertype of Base will be resolved in error-scope, even if it absolutely irrelevant
    // to the types in cycle.
    open class <!CYCLIC_SCOPES!>Base<!>() : <!UNRESOLVED_REFERENCE!>SomeIrrelevantInterface<!>

    companion <!CYCLIC_SCOPES!>object<!> : DerivedAbstract()
}

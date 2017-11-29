// !WITH_NEW_INFERENCE
interface A {
    fun foo()
}

interface C: A
interface B: A

fun <T> test(x: T) where T : C?, T : B? {
    x?.foo()
    if (x != null) {
        <!NI;DEBUG_INFO_SMARTCAST, OI;DEBUG_INFO_SMARTCAST!>x<!>.foo()
    }
}

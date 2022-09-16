package defpackage;

import j$.util.function.BiPredicate;
/* compiled from: PG */
/* renamed from: akvg  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akvg implements BiPredicate {
    public static final /* synthetic */ akvg a = new akvg();

    private /* synthetic */ akvg() {
    }

    @Override // j$.util.function.BiPredicate
    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return biPredicate.getClass();
    }

    @Override // j$.util.function.BiPredicate
    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.BiPredicate
    public final /* synthetic */ BiPredicate or(BiPredicate biPredicate) {
        return biPredicate.getClass();
    }

    @Override // j$.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        Thread thread = (Thread) obj;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj2;
        return false;
    }
}

package defpackage;

import j$.util.function.Predicate;
/* compiled from: PG */
/* renamed from: lgw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lgw implements Predicate {
    public final /* synthetic */ Class a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgw(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.b != 0 ? predicate.getClass() : predicate.getClass();
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        if (this.b == 0) {
            return Predicate.CC.$default$negate(this);
        }
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.b != 0 ? predicate.getClass() : predicate.getClass();
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.b == 0) {
            return this.a.isInstance(obj);
        }
        return this.a.isInstance((dp) obj);
    }
}

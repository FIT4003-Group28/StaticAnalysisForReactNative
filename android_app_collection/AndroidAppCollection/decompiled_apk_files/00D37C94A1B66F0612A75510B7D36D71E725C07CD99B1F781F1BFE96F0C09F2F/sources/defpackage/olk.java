package defpackage;

import j$.util.function.Predicate;
/* compiled from: PG */
/* renamed from: olk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class olk implements Predicate {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ olk(int i, int i2) {
        this.b = i2;
        this.a = i;
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
        if (this.b != 0) {
            return ((okw) obj).c == this.a;
        }
        return ((okw) obj).b == this.a;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aldj  reason: default package */
/* loaded from: classes2.dex */
public final class aldj implements aldl {
    public final akqq a;
    public final int b;

    public aldj(akqq akqqVar, int i) {
        this.a = akqqVar;
        this.b = i;
    }

    @Override // defpackage.aldl
    public final <K, T extends aldk<K>> K a(T t, int i) {
        return (K) ((alec) t).b(this.a, this.b == 1 ? ((alec) t).e : ((alec) t).f, i);
    }
}

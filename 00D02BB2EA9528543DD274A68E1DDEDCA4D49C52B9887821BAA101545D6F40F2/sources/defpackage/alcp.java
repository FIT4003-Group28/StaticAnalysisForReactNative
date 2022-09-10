package defpackage;
/* compiled from: PG */
/* renamed from: alcp  reason: default package */
/* loaded from: classes2.dex */
public final class alcp implements aldl {
    public final akqq a;
    public final int b;

    public alcp(akqq akqqVar, int i) {
        this.a = akqqVar;
        this.b = i;
    }

    @Override // defpackage.aldl
    public final <K, T extends aldk<K>> K a(T t, int i) {
        alec alecVar = (alec) t;
        return (K) alecVar.b(this.a, alecVar.c.b(this.b, true), i);
    }
}

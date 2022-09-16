package defpackage;
/* compiled from: PG */
/* renamed from: azbo  reason: default package */
/* loaded from: classes2.dex */
public final class azbo extends aynr implements ayrg {
    final ayof a;

    public azbo(ayof ayofVar) {
        this.a = ayofVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        this.a.X(new azbn(aynsVar));
    }

    @Override // defpackage.ayrg
    public final ayoc a() {
        azbm azbmVar = new azbm(this.a);
        azqc.k();
        return azbmVar;
    }
}

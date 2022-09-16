package defpackage;
/* compiled from: PG */
/* renamed from: azba  reason: default package */
/* loaded from: classes2.dex */
public final class azba extends aynr {
    final ayof a;
    final ayqe b;

    public azba(ayof ayofVar, ayqe ayqeVar) {
        this.a = ayofVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        azaz azazVar = new azaz(aynsVar, this.b);
        aynsVar.sj(azazVar);
        this.a.X(azazVar);
    }
}

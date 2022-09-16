package defpackage;
/* compiled from: PG */
/* renamed from: azlf  reason: default package */
/* loaded from: classes2.dex */
public final class azlf extends aynr {
    final ayov a;
    final ayqe b;

    public azlf(ayov ayovVar, ayqe ayqeVar) {
        this.a = ayovVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        azle azleVar = new azle(aynsVar, this.b);
        aynsVar.sj(azleVar);
        this.a.W(azleVar);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: azft  reason: default package */
/* loaded from: classes2.dex */
public final class azft extends aynr implements ayrh {
    final ayok a;
    final ayqe b;

    public azft(ayok ayokVar, ayqe ayqeVar) {
        this.a = ayokVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        this.a.az(new azfs(aynsVar, this.b));
    }

    @Override // defpackage.ayrh
    public final ayoi a() {
        azfq azfqVar = new azfq(this.a, this.b);
        azqc.i();
        return azfqVar;
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvm  reason: default package */
/* loaded from: classes5.dex */
public final class cvm {
    public final dxio<ckcw> a;
    private final dxio<amfi> b;
    private final cvv c;
    private final dujz d;
    private final btnc<String, Boolean> e = new btnc<>(10);

    public cvm(dxio<amfi> dxioVar, dxio<ckcw> dxioVar2, cvv cvvVar, dujz dujzVar) {
        this.b = dxioVar;
        this.a = dxioVar2;
        this.c = cvvVar;
        this.d = dujzVar;
    }

    public final synchronized void a(becx becxVar) {
        int i;
        if (this.e.n(becxVar.a) == null) {
            this.e.Pz(becxVar.a, Boolean.TRUE);
            if ((!this.d.f || becxVar.b != 2) && (i = becxVar.b) != 7 && i != 8) {
                this.b.a().a(becxVar.a, "DelayedImpressionLogger#EventBusListener#onDelayedAdImpressionEvent", new cvl(this, becxVar.b));
                return;
            }
            this.c.a(becxVar.a, new cvk(this, becxVar.b));
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: bwir  reason: default package */
/* loaded from: classes4.dex */
final class bwir implements Runnable {
    final /* synthetic */ dthb a;
    final /* synthetic */ bwit b;

    public bwir(bwit bwitVar, dthb dthbVar) {
        this.b = bwitVar;
        this.a = dthbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bwit bwitVar = this.b;
        dthb dthbVar = this.a;
        if ((dthbVar.a & 4) != 0) {
            dtlv dtlvVar = dthbVar.e;
            if (dtlvVar == null) {
                dtlvVar = dtlv.f;
            }
            int a = dtlu.a(dtlvVar.e);
            if (a == 0 || a != 2) {
                int i = dtlvVar.e;
            }
            bwitVar.b.X(new bwnl(dtlvVar.a));
            bwitVar.f(false);
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: sir  reason: default package */
/* loaded from: classes7.dex */
final class sir implements acyt {
    final /* synthetic */ sis a;

    public sir(sis sisVar) {
        this.a = sisVar;
    }

    @Override // defpackage.acyt
    public final void a(boolean z) {
        int i;
        sis sisVar = this.a;
        aefv g = sisVar.g();
        if (g == null) {
            return;
        }
        cjql e = cjqg.e(g);
        cjtd k = cjqg.k(g);
        int i2 = g.c;
        if (e == null || k == null || i2 == (i = sisVar.am)) {
            return;
        }
        sisVar.ak.P(e, k, i2 > i ? dead.UP : dead.DOWN);
        sisVar.am = i2;
    }

    @Override // defpackage.acyt
    public final void b(int i) {
        if (i == 2) {
            sis sisVar = this.a;
            sisVar.ag.a(sisVar.ah);
        }
    }
}

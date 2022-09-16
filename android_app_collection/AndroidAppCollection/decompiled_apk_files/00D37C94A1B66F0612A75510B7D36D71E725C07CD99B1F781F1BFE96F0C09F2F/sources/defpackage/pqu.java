package defpackage;
/* compiled from: PG */
/* renamed from: pqu  reason: default package */
/* loaded from: classes4.dex */
final class pqu implements pri {
    public final int a;
    final /* synthetic */ pqx b;

    public pqu(pqx pqxVar, int i) {
        this.b = pqxVar;
        this.a = i;
    }

    @Override // defpackage.pri
    public final int a(pit pitVar, pmv pmvVar, int i) {
        pqx pqxVar = this.b;
        int i2 = this.a;
        if (pqxVar.v()) {
            return -3;
        }
        pqxVar.s(i2);
        int j = pqxVar.l[i2].j(pitVar, pmvVar, i, pqxVar.s);
        if (j != -3) {
            return j;
        }
        pqxVar.t(i2);
        return j;
    }

    @Override // defpackage.pri
    public final int b(long j) {
        pqx pqxVar = this.b;
        int i = this.a;
        if (pqxVar.v()) {
            return 0;
        }
        pqxVar.s(i);
        prh prhVar = pqxVar.l[i];
        int h = prhVar.h(j, pqxVar.s);
        prhVar.x(h);
        if (h != 0) {
            return h;
        }
        pqxVar.t(i);
        return 0;
    }

    @Override // defpackage.pri
    public final void c() {
        pqx pqxVar = this.b;
        pqxVar.l[this.a].s();
        pqxVar.u();
    }

    @Override // defpackage.pri
    public final boolean pZ() {
        pqx pqxVar = this.b;
        return !pqxVar.v() && pqxVar.l[this.a].z(pqxVar.s);
    }
}

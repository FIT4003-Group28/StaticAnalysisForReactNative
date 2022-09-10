package defpackage;
/* compiled from: PG */
/* renamed from: dstz  reason: default package */
/* loaded from: classes.dex */
final class dstz extends dstx<dsty, dsty> {
    static final dsty t(Object obj) {
        return ((dsqw) obj).bD;
    }

    static final void u(Object obj, dsty dstyVar) {
        ((dsqw) obj).bD = dstyVar;
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void a(dsty dstyVar, int i, long j) {
        dstyVar.e(dsut.c(i, 0), Long.valueOf(j));
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void b(dsty dstyVar, int i, int i2) {
        dstyVar.e(dsut.c(i, 5), Integer.valueOf(i2));
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void c(dsty dstyVar, int i, long j) {
        dstyVar.e(dsut.c(i, 1), Long.valueOf(j));
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void d(dsty dstyVar, int i, dspd dspdVar) {
        dstyVar.e(dsut.c(i, 2), dspdVar);
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void e(dsty dstyVar, int i, dsty dstyVar2) {
        dstyVar.e(dsut.c(i, 3), dstyVar2);
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ dsty f() {
        return dsty.a();
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ dsty g(dsty dstyVar) {
        dsty dstyVar2 = dstyVar;
        dstyVar2.c();
        return dstyVar2;
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void h(Object obj, dsty dstyVar) {
        u(obj, dstyVar);
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ dsty i(Object obj) {
        return t(obj);
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ dsty j(Object obj) {
        dsty t = t(obj);
        if (t == dsty.a) {
            dsty a = dsty.a();
            u(obj, a);
            return a;
        }
        return t;
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void k(Object obj, dsty dstyVar) {
        u(obj, dstyVar);
    }

    @Override // defpackage.dstx
    public final void l(Object obj) {
        t(obj).c();
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ dsty n(dsty dstyVar, dsty dstyVar2) {
        dsty dstyVar3 = dstyVar;
        dsty dstyVar4 = dstyVar2;
        return dstyVar4.equals(dsty.a) ? dstyVar3 : dsty.b(dstyVar3, dstyVar4);
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ int o(dsty dstyVar) {
        dsty dstyVar2 = dstyVar;
        int i = dstyVar2.e;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < dstyVar2.b; i3++) {
                int i4 = dstyVar2.c[i3];
                int Y = dspp.Y(1);
                i2 += Y + Y + dspp.P(2, dsut.b(i4)) + dspp.W(3, (dspd) dstyVar2.d[i3]);
            }
            dstyVar2.e = i2;
            return i2;
        }
        return i;
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ int p(dsty dstyVar) {
        return dstyVar.d();
    }

    @Override // defpackage.dstx
    public final boolean q() {
        return false;
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void r(dsty dstyVar, dspq dspqVar) {
        dstyVar.f(dspqVar);
    }

    @Override // defpackage.dstx
    public final /* bridge */ /* synthetic */ void s(dsty dstyVar, dspq dspqVar) {
        dsty dstyVar2 = dstyVar;
        for (int i = 0; i < dstyVar2.b; i++) {
            dspqVar.s(dsut.b(dstyVar2.c[i]), dstyVar2.d[i]);
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: crea  reason: default package */
/* loaded from: classes5.dex */
public final class crea extends crbc {
    private final ckuq a;
    private final byte[] b;

    public crea(ckuq ckuqVar, long[] jArr) {
        dbsk.s(ckuqVar);
        this.a = ckuqVar;
        ckwo bZ = ckwp.b.bZ();
        for (long j : jArr) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ckwp ckwpVar = (ckwp) bZ.b;
            dsri dsriVar = ckwpVar.a;
            if (!dsriVar.a()) {
                ckwpVar.a = dsqw.ci(dsriVar);
            }
            ckwpVar.a.d(j);
        }
        this.b = bZ.bK().bS();
    }

    @Override // defpackage.crbc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.crbc
    public final void b(crbb crbbVar) {
        if (crbbVar != null) {
            crbbVar.a(this);
        }
        this.a.e(this.b);
        if (crbbVar != null) {
            crbbVar.b(this);
        }
    }

    @Override // defpackage.crbc
    public final void c() {
    }

    @Override // defpackage.crbc
    public final long d() {
        return -1L;
    }

    @Override // defpackage.crbc
    public final void e(cres cresVar) {
    }
}

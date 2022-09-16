package defpackage;
/* compiled from: PG */
/* renamed from: cjnv  reason: default package */
/* loaded from: classes.dex */
public final class cjnv implements awnu {
    private final cjxd a;
    private final btvo b;
    private final dxio<akfa> c;
    private final bzqa d;
    private final cjnu e;
    private final ckcw f;

    public cjnv(cjxd cjxdVar, btvo btvoVar, dxio<akfa> dxioVar, bzqa bzqaVar, cjnu cjnuVar, ckcw ckcwVar) {
        this.a = cjxdVar;
        this.b = btvoVar;
        this.c = dxioVar;
        this.d = bzqaVar;
        this.e = cjnuVar;
        this.f = ckcwVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.USER_LOCATION_REPORTING;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.a.b() && this.c.a().c();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.e.a()) {
            duwv duwvVar = this.b.getLocationParameters().g;
            if (duwvVar == null) {
                duwvVar = duwv.d;
            }
            int i = duwvVar.a;
            int i2 = duwvVar.b;
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        int a;
        if (bzmkVar == bzmk.REPRESSED) {
            return false;
        }
        duwv duwvVar = this.b.getLocationParameters().g;
        if (duwvVar == null) {
            duwvVar = duwv.d;
        }
        if (this.e.a() && (a = duwu.a(duwvVar.a)) != 0 && a == 3) {
            this.d.a(new int[]{bzqb.LOCATION_HISTORY.d, bzqb.LOCATION_REPORTING.d}, new cjng(this.f), duwvVar.c);
            cjnu cjnuVar = this.e;
            if (cjnuVar.a()) {
                bvjj bvjjVar = cjnuVar.a;
                bvjk bvjkVar = bvjk.fh;
                duwv duwvVar2 = cjnuVar.b.getLocationParameters().g;
                if (duwvVar2 == null) {
                    duwvVar2 = duwv.d;
                }
                bvjjVar.W(bvjkVar, duwvVar2.b);
            }
            cjnuVar.a.S(bvjk.bx, true);
        }
        return true;
    }

    @Override // defpackage.awnu
    @dzsi
    public final ggg g() {
        return null;
    }
}

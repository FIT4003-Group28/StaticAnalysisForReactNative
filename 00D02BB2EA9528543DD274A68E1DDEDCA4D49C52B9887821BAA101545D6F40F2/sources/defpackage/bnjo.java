package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bnjo  reason: default package */
/* loaded from: classes3.dex */
public abstract class bnjo implements bnih, bnit {
    private final Activity a;
    private final bnix b;
    private final bniu c;
    private final bniw d;
    private final boolean e;
    private final bnig f;
    private final cpv g;
    private boolean h = false;
    private cqtv i = cqrp.d(dcyn.a);
    protected boolean l;

    /* JADX INFO: Access modifiers changed from: protected */
    public bnjo(Activity activity, bniv bnivVar, bniy bniyVar, cjtd cjtdVar, cpv cpvVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = activity;
        this.g = cpvVar;
        bniu a = bnivVar.a(this, cjtdVar, z, z2);
        this.c = a;
        this.d = new bniw(activity);
        this.f = new bnjn();
        this.b = bniyVar.a(a, cjtdVar, z4);
        this.e = z3;
    }

    private final boolean H() {
        if (w().booleanValue()) {
            return true;
        }
        iln ilnVar = iln.GEOCODE;
        int ordinal = e().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (ordinal != 4 && ordinal != 6) {
                    if (ordinal != 7) {
                        bvoo.f(new IllegalStateException("Current placemark type not supported"));
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract void A(btrm btrmVar);

    public abstract void B(btrm btrmVar);

    public void D() {
    }

    public void E() {
    }

    public void F() {
    }

    @Override // defpackage.bnih
    public Boolean G() {
        return false;
    }

    public jbk K(iln ilnVar) {
        throw null;
    }

    @Override // defpackage.bnih
    @dzsi
    public bnhy O() {
        return null;
    }

    @Override // defpackage.bnih
    public bfvq P() {
        return null;
    }

    @Override // defpackage.bnit
    public void PP(bniu bniuVar) {
        an(null);
    }

    public void PQ() {
    }

    public void PR() {
    }

    @Override // defpackage.bnih
    public bnid Q() {
        return this.d;
    }

    @Override // defpackage.bnih
    @dzsi
    public bmlh R() {
        return null;
    }

    @Override // defpackage.bnih
    public Boolean S() {
        return false;
    }

    public void T(Boolean bool) {
        this.h = bool.booleanValue();
    }

    public Boolean Y() {
        return false;
    }

    @Override // defpackage.bnih
    public bhdw Z() {
        return null;
    }

    @Override // defpackage.bnih
    public bees aa() {
        return null;
    }

    @Override // defpackage.bnih
    public Boolean ab() {
        return false;
    }

    @Override // defpackage.bnih
    public Boolean ac() {
        return false;
    }

    @Override // defpackage.bnih
    public bnig ad() {
        return this.f;
    }

    @Override // defpackage.bnih
    public Boolean ae() {
        boolean z = false;
        if (!af().booleanValue() && !ag().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnih
    public Boolean af() {
        boolean z = false;
        if (H() && !ab().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnih
    public Boolean ag() {
        boolean z = false;
        if (H() && ab().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnih
    public Boolean ah() {
        boolean z = false;
        if (Y().booleanValue()) {
            return false;
        }
        if (aq() != null && aq().a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnih
    public Boolean ai() {
        boolean z = false;
        if (ar() && !d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnih
    public Boolean aj() {
        boolean z = false;
        if ((j().booleanValue() || Y().booleanValue()) && !S().booleanValue() && !ai().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnih
    public Boolean ak() {
        boolean z = false;
        if (ag().booleanValue() && !j().booleanValue() && this.g.e(this.a)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bnih
    public cqtv al() {
        return this.i;
    }

    @Override // defpackage.bnih
    public void am(cqtv cqtvVar) {
        this.i = cqtvVar;
    }

    public void an(@dzsi jjn jjnVar) {
        if (jjnVar != null) {
            this.b.K(jjnVar);
            cqkx.p(this);
        }
        this.b.M(this.c.a(), this.c.l());
        cqkx.p(this.b);
        if (y() != null) {
            cqkx.p(y());
        }
        if (c() != null) {
            cqkx.p(c());
        }
        if (x() != null) {
            cqkx.p(x());
        }
        if (O() != null) {
            ((bdwt) O()).d();
        }
    }

    public void ao(boolean z) {
        this.l = z;
    }

    public bniu ap() {
        return this.c;
    }

    public bnix aq() {
        return this.b;
    }

    public boolean ar() {
        return this.h;
    }

    public boolean as() {
        return this.e;
    }

    public abstract void f(jjn jjnVar);

    public abstract void g(Bundle bundle);

    public abstract void h(Bundle bundle);

    @dzsi
    public abstract CharSequence p();

    public abstract void z(Context context, bwrs<ilo> bwrsVar);
}

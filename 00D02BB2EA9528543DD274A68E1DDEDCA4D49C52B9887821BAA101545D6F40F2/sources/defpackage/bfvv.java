package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bfvv  reason: default package */
/* loaded from: classes3.dex */
public class bfvv implements jkh, bfvq, bega {
    public final dxio<begg> a;
    private final Activity h;
    private final Executor i;
    private final aeht j;
    private final cqqw k = new bfvs(this);
    private dbsg<dnnn> l = dbpy.a;
    private String m = "";
    public boolean b = true;
    private boolean n = false;
    public int c = -1;
    private boolean o = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;
    final crzp<Boolean> g = new bfvt(this);

    public bfvv(Activity activity, cqhn cqhnVar, Executor executor, aeht aehtVar, dxio<begg> dxioVar) {
        this.h = activity;
        this.i = executor;
        this.j = aehtVar;
        this.a = dxioVar;
    }

    @Override // defpackage.jkh
    public void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
    }

    @Override // defpackage.jkh
    public void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void O() {
    }

    @Override // defpackage.jkh
    public void P(jkj jkjVar, jjn jjnVar, float f) {
    }

    @Override // defpackage.bfvq
    public Boolean a() {
        return w();
    }

    @Override // defpackage.bfvq
    public String b() {
        return this.m;
    }

    @Override // defpackage.bfvq
    public String c() {
        return !this.l.a() ? "" : aehr.e(this.h, this.l.b());
    }

    @Override // defpackage.bfvq
    public String d() {
        return this.h.getResources().getString(R.string.HOTEL_PRICES_FOOTER_LINK_TEXT);
    }

    @Override // defpackage.bfvq
    public cjtd e() {
        return cjtd.a(dtxy.iT);
    }

    @Override // defpackage.bfvq
    public cqkl f() {
        this.a.a().k(bege.PRICES);
        return cqkl.a;
    }

    @Override // defpackage.bfvq
    public cqfc g() {
        if (!this.f) {
            return null;
        }
        return new bfvu(this, !this.d);
    }

    @Override // defpackage.bfvq
    public void h() {
        bege j = this.a.a().j();
        if (j == null) {
            return;
        }
        int ordinal = j.ordinal();
        if (ordinal == 0) {
            boolean z = this.d;
            boolean z2 = this.e;
            if (z == z2) {
                return;
            }
            p(z2);
        } else if (ordinal != 6) {
            if (!this.d) {
                return;
            }
            p(false);
        } else if (this.d) {
        } else {
            p(true);
        }
    }

    @Override // defpackage.bfvq
    public Boolean i() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bfvq
    public Boolean j() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.bfvq
    public void k(boolean z) {
        this.o = z;
        cqkx.p(this);
    }

    public cqqw l() {
        return this.k;
    }

    public void m(int i) {
        this.c = i + i;
    }

    public void n() {
        crzm<Boolean> i = this.j.i();
        if (i != null) {
            i.d(this.g, this.i);
        }
    }

    public void o() {
        crzm<Boolean> i = this.j.i();
        if (i != null) {
            i.c(this.g);
        }
    }

    public final void p(boolean z) {
        if (this.d == z || this.f) {
            return;
        }
        this.f = true;
        this.d = z;
        cqkx.p(this);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null || !c.bS().a()) {
            u();
            return;
        }
        dnng b = c.bS().b();
        if (!aehr.b(b) || b.d.isEmpty()) {
            u();
            return;
        }
        dnnn dnnnVar = b.b;
        if (dnnnVar == null) {
            dnnnVar = dnnn.l;
        }
        this.l = dbsg.i(dnnnVar);
        this.m = b.d;
        this.n = true;
    }

    @Override // defpackage.bega
    public void u() {
        this.l = dbpy.a;
        this.m = "";
        this.n = false;
        this.c = -1;
        this.o = false;
        this.b = true;
        this.e = true;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.n);
    }
}

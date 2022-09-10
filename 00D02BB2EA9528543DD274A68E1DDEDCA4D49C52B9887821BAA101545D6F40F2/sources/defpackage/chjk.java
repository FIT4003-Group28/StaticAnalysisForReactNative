package defpackage;

import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chjk  reason: default package */
/* loaded from: classes4.dex */
public class chjk extends bfcb implements chmc {
    public final gga b;
    public final dbpk c;
    public final bwqv d;
    public final ilo e;
    public final bwrs<ilo> f;
    public final bvrb g;
    public final bfbl h;
    public final dbpg<Void, Uri> i;
    public boolean j;
    @dzsi
    public baal k;
    private final cjtd l;
    private final bexz m;
    private final bfcs n;
    private final bfbb o;
    private final bfaq p;
    private final dxio<bzmm> q;
    private final Executor r;
    private final bfbn s;
    private final bexy t;
    private final crzp<bfbm> u;

    public chjk(gga ggaVar, beya beyaVar, bfct bfctVar, bfbc bfbcVar, bfaq bfaqVar, dbpk dbpkVar, bwqv bwqvVar, bvrb bvrbVar, dxio<bzmm> dxioVar, Executor executor, bfbl bfblVar, bfbn bfbnVar, bwrs<ilo> bwrsVar) {
        super(ggaVar);
        chjh chjhVar = new chjh(this);
        this.t = chjhVar;
        this.u = new chji(this);
        chjj chjjVar = new chjj(this);
        this.i = chjjVar;
        this.j = true;
        this.b = ggaVar;
        this.p = bfaqVar;
        this.c = dbpkVar;
        dbpkVar.e(chjjVar);
        this.d = bwqvVar;
        this.g = bvrbVar;
        this.q = dxioVar;
        this.r = executor;
        this.h = bfblVar;
        this.s = bfbnVar;
        this.f = bwrsVar;
        bexz a = beyaVar.a(chjhVar);
        this.m = a;
        bfbb a2 = bfbcVar.a(bfby.THANKS_PAGE);
        this.o = a2;
        a2.t(bwrsVar);
        this.n = bfctVar.a(a2, a);
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.e = c;
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtyc.h;
        this.l = c2.a();
    }

    @Override // defpackage.bfcb, defpackage.jad
    public Boolean a() {
        boolean z = true;
        if (!this.j && this.k == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfcb, defpackage.jad
    public cqkl c() {
        boolean f;
        baal baalVar = this.k;
        if (baalVar == null) {
            return cqkl.a;
        }
        if (this.a) {
            f = this.m.g(baalVar);
        } else {
            f = this.m.f(baalVar);
        }
        if (f) {
            if (!this.a && !this.q.a().a(this.n) && j().booleanValue()) {
                this.o.y(true);
            }
            this.a = !this.a;
            cqkx.p(this);
        } else {
            gga ggaVar = this.b;
            cjxu.i(ggaVar, ggaVar.getString(R.string.LOCAL_FOLLOW_FAILURE_MESSAGE));
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        cjta c = cjtd.c(this.e.bZ());
        c.d = this.a ? dtyc.j : dtyc.i;
        return c.a();
    }

    @Override // defpackage.bfcb, defpackage.bfca
    public Boolean j() {
        boolean z = false;
        if (this.p.b(this.f) && !this.a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfca
    public CharSequence k() {
        return e();
    }

    @Override // defpackage.bfcb, defpackage.bfca
    public CharSequence l() {
        return j().booleanValue() ? this.b.getString(R.string.WELCOME_OFFER_ICON_DESCRIPTION) : "";
    }

    public void m() {
        this.s.a().a(this.u, this.r);
    }

    public void n() {
        this.s.a().c(this.u);
    }

    @Override // defpackage.chmc
    public CharSequence o() {
        return this.b.getString(R.string.REVIEW_SUBMITTED_LOCAL_FOLLOW_PROMPT_TEXT, new Object[]{this.e.n()});
    }

    @Override // defpackage.chmc
    public Boolean p() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.chmr
    public void q(cqiv cqivVar) {
        cqivVar.a(new chcr(), this);
    }

    @Override // defpackage.chmc
    public cjtd r() {
        return this.l;
    }
}

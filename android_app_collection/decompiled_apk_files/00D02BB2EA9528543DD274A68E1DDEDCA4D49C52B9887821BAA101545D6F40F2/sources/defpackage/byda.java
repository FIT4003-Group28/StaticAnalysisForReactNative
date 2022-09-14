package defpackage;

import android.content.DialogInterface;
import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byda  reason: default package */
/* loaded from: classes4.dex */
public class byda implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, bydc {
    static final long a = TimeUnit.SECONDS.toMillis(15);
    @dzsi
    public byct b;
    public final bvjj c;
    public final bttf d;
    public final gga e;
    public final cjxl f;
    public final dxio<awnv> g;
    public final dxio<akfa> h;
    public final Executor i;
    public final Executor j;
    public final gft k;
    private CharSequence l;
    private CharSequence m;
    private CharSequence n;
    private boolean o;
    private final cjqy p;
    private final bvsx q;
    private final cklf r;
    private final buka s;
    private final cqat t;
    private final dxio<bsvm> u;
    private final ckcw v;

    public byda(gga ggaVar, cklf cklfVar, buka bukaVar, cqat cqatVar, bvjj bvjjVar, bttf bttfVar, cjqy cjqyVar, cjxl cjxlVar, dxio<bsvm> dxioVar, dxio<awnv> dxioVar2, ckcw ckcwVar, dxio<akfa> dxioVar3, cqhn cqhnVar, Executor executor, Executor executor2, gft gftVar) {
        this.e = ggaVar;
        this.r = cklfVar;
        this.s = bukaVar;
        this.t = cqatVar;
        this.c = bvjjVar;
        this.d = bttfVar;
        this.p = cjqyVar;
        this.f = cjxlVar;
        this.u = dxioVar;
        this.g = dxioVar2;
        this.v = ckcwVar;
        this.h = dxioVar3;
        this.i = executor;
        this.j = executor2;
        this.k = gftVar;
        bvsx bvsxVar = new bvsx(ggaVar.getResources());
        this.q = bvsxVar;
        ClickableSpan f = cklfVar.f("maps_android_getstarted_howto", cjtd.a(dtyc.c));
        bvsu c = bvsxVar.c(R.string.LEARN_MORE_ABOUT_GMM);
        bvsu c2 = bvsxVar.c(R.string.LEARN_MORE);
        c2.k(f);
        c.a(c2);
        this.l = c.c();
        ClickableSpan aS = gfk.aS(ggaVar, cjqyVar, cjtd.a(dtyc.f), cjxr.a(bycr.b(bttfVar)));
        ClickableSpan e = jmw.e(ggaVar.getResources().getColor(R.color.gmm_blue), cjqyVar, dtyc.e, new Runnable(this) { // from class: bycu
            private final byda a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byda bydaVar = this.a;
                bydaVar.f.a(bydaVar.e);
            }
        });
        if (bycr.a(bttfVar)) {
            ClickableSpan aS2 = gfk.aS(ggaVar, cjqyVar, null, cjxr.l());
            bvsu c3 = bvsxVar.c(R.string.KOREA_LEGAL_TEXT);
            bvsu c4 = bvsxVar.c(R.string.TERMS_OF_SERVICE);
            c4.k(aS);
            bvsu c5 = bvsxVar.c(R.string.PRIVACY_POLICY);
            c5.k(e);
            bvsu c6 = bvsxVar.c(R.string.KOREAN_LOCATION_TERMS_OF_SERVICE);
            c6.k(aS2);
            c3.a(c4, c5, c6);
            this.m = c3.c();
        } else {
            bvsu c7 = bvsxVar.c(R.string.LEGAL_TEXT);
            bvsu c8 = bvsxVar.c(R.string.TERMS_OF_SERVICE);
            c8.k(aS);
            bvsu c9 = bvsxVar.c(R.string.PRIVACY_POLICY_IN_FULL_LEGAL_TEXT);
            c9.k(e);
            c7.a(c8, c9);
            this.m = c7.c();
        }
        bvsu c10 = bvsxVar.c(R.string.LOCATION_REPORT_TEXT);
        bvsu c11 = bvsxVar.c(R.string.MANAGE_LOCATION_REPORT_TEXT);
        c11.k(new bycx(this));
        c10.a(c11);
        this.n = c10.c();
    }

    @Override // defpackage.bydc
    public CharSequence a() {
        return this.m;
    }

    @Override // defpackage.bydc
    public Integer b() {
        return Integer.valueOf((int) R.drawable.product_logo_maps_color_144);
    }

    @Override // defpackage.bydc
    public CharSequence c() {
        return this.l;
    }

    @Override // defpackage.bydc
    public CharSequence d() {
        return this.n;
    }

    @Override // defpackage.bydc
    public Boolean e() {
        return Boolean.valueOf(!this.c.m(bvjk.bM, false));
    }

    @Override // defpackage.bydc
    public Boolean f() {
        return Boolean.valueOf(this.o);
    }

    public void g(Boolean bool) {
        boolean z = this.o;
        boolean booleanValue = bool.booleanValue();
        this.o = booleanValue;
        if (z != booleanValue) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.bydc
    public cqkl h() {
        ((ckco) this.v.a(ckid.a)).a(ckib.a(2));
        if (!((ges) this.k).aD) {
            return cqkl.a;
        }
        g(true);
        this.j.execute(new bycy(this));
        return cqkl.a;
    }

    @Override // defpackage.bydc
    public cqkl i() {
        ((ckco) this.v.a(ckid.a)).a(ckib.a(3));
        if (!((ges) this.k).aD) {
            return cqkl.a;
        }
        this.e.finish();
        return cqkl.a;
    }

    public cqkl j() {
        if (!((ges) this.k).aD) {
            return cqkl.a;
        }
        this.u.a().i();
        return cqkl.a;
    }

    @Override // defpackage.bydc
    public cjtd k() {
        return cjtd.a(dtyc.a);
    }

    @Override // defpackage.bydc
    public cjtd l() {
        return cjtd.a(dtyc.d);
    }

    public void m() {
        dbsk.l(this.b == null);
        this.b = o();
    }

    public void n() {
        this.b = null;
    }

    @dzsi
    public final byct o() {
        cqat cqatVar = this.t;
        if (((ges) this.k).aD) {
            byct byctVar = new byct(cqatVar, a);
            this.s.b(dunb.f, new bycz(byctVar), this.j);
            return byctVar;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (!((ges) this.k).aD) {
            return;
        }
        g(false);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (!((ges) this.k).aD) {
            return;
        }
        if (i == -2) {
            i();
        } else if (i != -1) {
        } else {
            h();
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfbb  reason: default package */
/* loaded from: classes3.dex */
public class bfbb implements bfas {
    private static final eatp c = eato.b("MM/dd/yyyy");
    private boolean A;
    @dzsi
    public Bitmap a;
    @dzsi
    public bfbj b;
    private final gga d;
    private final cqat e;
    private final bexz f;
    private final bfaq g;
    private final axru i;
    private final axrx j;
    private final bfby k;
    private final dxio<cjqq> l;
    private final cqkj m;
    private final bfbn n;
    private final dxio<afha> o;
    @dzsi
    private ilo p;
    @dzsi
    private dipk q;
    @dzsi
    private jic r;
    @dzsi
    private jic s;
    @dzsi
    private jic t;
    private Runnable y;
    private cjtd u = cjtd.b;
    private cjtd v = cjtd.b;
    private cjtd w = cjtd.b;
    private cjtd x = cjtd.b;
    private CharSequence z = "";
    private CharSequence B = "";
    private String C = "";
    private final bfba h = new bfba(this);

    public bfbb(gga ggaVar, cqat cqatVar, beya beyaVar, bfaq bfaqVar, axru axruVar, axrx axrxVar, dxio<cjqq> dxioVar, bfbl bfblVar, cqkj cqkjVar, bfbn bfbnVar, dxio<afha> dxioVar2, bfby bfbyVar) {
        this.d = ggaVar;
        this.e = cqatVar;
        this.g = bfaqVar;
        this.i = axruVar;
        this.j = axrxVar;
        this.l = dxioVar;
        this.m = cqkjVar;
        this.n = bfbnVar;
        this.o = dxioVar2;
        this.k = bfbyVar;
        this.f = beyaVar.a(null);
    }

    @Override // defpackage.bfas
    public Boolean a() {
        return Boolean.valueOf(this.A);
    }

    @Override // defpackage.bfas
    @dzsi
    public jic b() {
        return this.r;
    }

    @Override // defpackage.bfas
    public String c() {
        ilo iloVar = this.p;
        dbsk.s(iloVar);
        return iloVar.n();
    }

    @Override // defpackage.bfas
    @dzsi
    public jic d() {
        return this.s;
    }

    @Override // defpackage.bfas
    public String e() {
        ilo iloVar = this.p;
        dbsk.s(iloVar);
        return iloVar.cC().f;
    }

    @Override // defpackage.bfas
    @dzsi
    public jic f() {
        return this.t;
    }

    @Override // defpackage.bfas
    public CharSequence g() {
        dipk dipkVar = this.q;
        dbsk.s(dipkVar);
        return dipkVar.g;
    }

    @Override // defpackage.bfas
    public CharSequence h() {
        return this.z;
    }

    @Override // defpackage.bfas
    public CharSequence i() {
        return this.d.getString(R.string.WELCOME_OFFER_THANKS_TEXT, new Object[]{c()});
    }

    @Override // defpackage.bfas
    public CharSequence j() {
        return this.B;
    }

    @Override // defpackage.bfas
    public cqkl k() {
        Runnable runnable = this.y;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }

    @Override // defpackage.bfas
    public cjtd l() {
        return this.v;
    }

    @Override // defpackage.bfas
    public cqkl m() {
        if (this.i.a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            z();
        } else {
            this.j.b("android.permission.WRITE_EXTERNAL_STORAGE", new bfay(this));
        }
        return cqkl.a;
    }

    @Override // defpackage.bfas
    public cjtd n() {
        return this.x;
    }

    @Override // defpackage.bfas
    public Boolean o() {
        return Boolean.valueOf(!this.C.isEmpty());
    }

    @Override // defpackage.bfas
    public cqkl p() {
        this.o.a().k(this.d, this.C, 2);
        return cqkl.a;
    }

    @Override // defpackage.bfas
    public cjtd q() {
        return this.w;
    }

    @Override // defpackage.bfas
    public View.OnAttachStateChangeListener r() {
        return this.h;
    }

    public void s(bfbj bfbjVar) {
        this.b = bfbjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0194, code lost:
        if (r6 <= 0) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(defpackage.bwrs<defpackage.ilo> r14) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfbb.t(bwrs):void");
    }

    public void u() {
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.b = null;
        this.z = "";
        this.C = "";
        this.B = "";
        this.u = cjtd.b;
        this.v = cjtd.b;
        this.w = cjtd.b;
        this.x = cjtd.b;
    }

    public bwrs<ilo> v() {
        return bwrs.a(this.p);
    }

    public bfby w() {
        return this.k;
    }

    @dzsi
    public bfbj x() {
        return this.b;
    }

    public void y(boolean z) {
        final jeo jeoVar = new jeo(this.d, 16973840, new bezr(), this, this.m);
        this.A = z;
        this.y = new Runnable(jeoVar) { // from class: bfaw
            private final jeo a;

            {
                this.a = jeoVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.dismiss();
            }
        };
        jeoVar.setOnShowListener(new bfax(this));
        jeoVar.show();
        this.l.a().g().d(this.u);
    }

    public final void z() {
        if (this.a != null) {
            bfbn bfbnVar = this.n;
            bwrs a = bwrs.a(this.p);
            Bitmap bitmap = this.a;
            dbsk.s(bitmap);
            bfbnVar.a.a(new bfav(a, bitmap));
            return;
        }
        gga ggaVar = this.d;
        cjxu.i(ggaVar, ggaVar.getString(R.string.WELCOME_OFFER_SAVE_FAILURE_MESSAGE));
    }
}

package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bhix  reason: default package */
/* loaded from: classes3.dex */
public class bhix implements bhip {
    public final dxio<apyz> b;
    public final gga c;
    public String e;
    private final bhhf g;
    private final apyu h;
    private final Executor i;
    private final aqwq j;
    private final akfa k;
    private final cqat l;
    private final btvo m;
    private final cqkj n;
    @dzsi
    private jeo<bhed> o;
    @dzsi
    private bwrs<ilo> p;
    @dzsi
    private crzm<apsi<dbsg<apzn>>> s;
    @dzsi
    private btlu t;
    private static final dcqe f = dcqe.c("bhix");
    public static final dcep<Integer> a = dcep.D(0, 1, 3);
    public boolean d = false;
    private final crzp<apsi<dbsg<apzn>>> q = new crzp(this) { // from class: bhiv
        private final bhix a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            bhix bhixVar = this.a;
            apsi apsiVar = (apsi) crzmVar.l();
            boolean z = bhixVar.d;
            boolean z2 = false;
            if (apsiVar != null && apsiVar.b() == 3 && ((dbsg) apsiVar.a()).a()) {
                z2 = bhix.a.contains(Integer.valueOf(((apzn) ((dbsg) apsiVar.a()).b()).a()));
            }
            bhixVar.d = z2;
            if (z != z2) {
                cqkx.p(bhixVar);
            }
        }
    };
    private boolean r = true;

    public bhix(bhhf bhhfVar, apyu apyuVar, Executor executor, cqhn cqhnVar, aqwq aqwqVar, akfa akfaVar, cqat cqatVar, btvo btvoVar, dxio<apyz> dxioVar, gga ggaVar, cqkj cqkjVar) {
        this.g = bhhfVar;
        this.h = apyuVar;
        this.i = executor;
        this.j = aqwqVar;
        this.k = akfaVar;
        this.l = cqatVar;
        this.m = btvoVar;
        this.b = dxioVar;
        this.c = ggaVar;
        this.n = cqkjVar;
    }

    private final boolean g() {
        btlu btluVar = this.t;
        return btluVar != null && btluVar.l();
    }

    @Override // defpackage.bhip
    public Boolean a() {
        boolean z = false;
        if (this.g.q(this.p) && this.d && !this.r) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bhip
    public cjtd b(ddho ddhoVar) {
        ilo iloVar = (ilo) bwrs.b(this.p);
        cjta c = cjtd.c(iloVar == null ? null : iloVar.a());
        c.d = ddhoVar;
        if (this.e != null) {
            ddes bZ = ddet.D.bZ();
            ddii bZ2 = ddij.e.bZ();
            String str = this.e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddij ddijVar = (ddij) bZ2.b;
            str.getClass();
            ddijVar.a |= 2;
            ddijVar.c = str;
            ddij bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            bK.getClass();
            ddetVar.m = bK;
            ddetVar.a |= 1024;
            c.s(bZ.bK());
        }
        return c.a();
    }

    @Override // defpackage.bhip
    public cqkl c() {
        this.r = true;
        if (!TextUtils.isEmpty(this.e)) {
            int i = this.j.c(this.e, this.t).b;
            dsxg bZ = dsxh.c.bZ();
            int i2 = i + 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dsxh) bZ.b).b = i2;
            long b = this.l.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dsxh) bZ.b).a = b;
            dsxh bK = bZ.bK();
            aqwq aqwqVar = this.j;
            String str = this.e;
            btlu btluVar = this.t;
            synchronized (aqwqVar.e) {
                aqwqVar.d.am(aqwq.g(str), btluVar, bK);
            }
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bhip
    public cqkl d() {
        if (!g()) {
            return cqkl.a;
        }
        if (!TextUtils.isEmpty(this.e)) {
            if (this.o == null) {
                jeo<bhed> jeoVar = new jeo<>(this.c, 16973840, new bhee(), new bhed(), this.n);
                this.o = jeoVar;
                jeoVar.setCancelable(false);
                this.o.show();
            }
            apyu apyuVar = this.h;
            String str = this.e;
            btlu btluVar = this.t;
            dbsk.s(btluVar);
            deha.q(apyuVar.d(str, btluVar), new bhiw(this), this.i);
        }
        return cqkl.a;
    }

    @Override // defpackage.bhip
    public cqkl e() {
        this.b.a().I();
        return cqkl.a;
    }

    public final void f() {
        jeo<bhed> jeoVar = this.o;
        if (jeoVar != null) {
            jeoVar.dismiss();
            this.o = null;
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        boolean z = false;
        if (c == null) {
            bvoo.h("Placemark should not be null.", new Object[0]);
        } else if (!this.g.q(bwrsVar)) {
        } else {
            this.p = bwrsVar;
            this.t = this.k.j();
            this.e = c.cQ();
            if (this.s == null && g()) {
                apyu apyuVar = this.h;
                String str = this.e;
                btlu btluVar = this.t;
                dbsk.s(btluVar);
                crzm<apsi<dbsg<apzn>>> b = apyuVar.b(str, btluVar);
                this.s = b;
                b.d(this.q, this.i);
            }
            dsxh c2 = this.j.c(this.e, this.t);
            if (c2.b > 0) {
                long b2 = this.l.b();
                long j = c2.a;
                int max = Math.max(1, c2.b);
                int i = this.m.getMerchantModeParameters().p;
                float f2 = this.m.getMerchantModeParameters().q;
                double millis = TimeUnit.DAYS.toMillis(i);
                double pow = Math.pow(f2, max - 1);
                Double.isNaN(millis);
                if (b2 - j <= millis * pow) {
                    z = true;
                }
            }
            this.r = z;
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.p = null;
        crzm<apsi<dbsg<apzn>>> crzmVar = this.s;
        if (crzmVar != null) {
            crzmVar.c(this.q);
            this.s = null;
        }
    }

    @Override // defpackage.bega
    public Boolean w() {
        return a();
    }
}

package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqkh  reason: default package */
/* loaded from: classes2.dex */
public final class aqkh {
    public final apyx a;
    public final dxio<aqgn> b;
    public final dxio<aqgo> c;
    public final dxio<aqcn> d;
    public final aqhu e;
    private final cqhn k;
    private final dxio<aqav> l;
    private final dxio<aprv> m;
    private final dxio<akfa> n;
    private final Executor o;
    @dzsi
    private aqbx r;
    @dzsi
    private cuss<Integer> s;
    @dzsi
    private cuss<Integer> t;
    @dzsi
    private crzm<apsi<Set<String>>> u;
    @dzsi
    private crzp<apsi<Set<String>>> v;
    private final cusr<Integer> p = new cusr(this) { // from class: aqkd
        private final aqkh a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            aqkh aqkhVar = this.a;
            Integer num = (Integer) obj;
            aqkhVar.f = num.intValue();
            aqhu aqhuVar = aqkhVar.e;
            hxy hxyVar = null;
            if (aqkhVar.a.b() && num.intValue() > 0) {
                hxyVar = aqkhVar.e(num);
            }
            aqhuVar.j(0, hxyVar);
            aqkhVar.e.k(0, aqkhVar.a.b() ? aqkhVar.d.a().a(num.intValue()) : "");
            aqkhVar.i = true;
            aqkhVar.d();
        }
    };
    private final cusr<Integer> q = new cusr(this) { // from class: aqke
        private final aqkh a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            aqkh aqkhVar = this.a;
            Integer num = (Integer) obj;
            aqkhVar.g = num.intValue();
            aqhu aqhuVar = aqkhVar.e;
            hxy hxyVar = null;
            if (aqkhVar.a.b() && num.intValue() > 0) {
                hxyVar = aqkhVar.e(num);
            }
            aqhuVar.j(1, hxyVar);
            aqkhVar.e.k(1, aqkhVar.a.b() ? aqkhVar.d.a().a(num.intValue()) : "");
            aqkhVar.j = true;
            aqkhVar.d();
        }
    };
    public int f = 0;
    public int g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    public aqkh(Activity activity, cqhn cqhnVar, apyx apyxVar, dxio<aqav> dxioVar, dxio<aprv> dxioVar2, dxio<akfa> dxioVar3, dxio<aqgn> dxioVar4, dxio<aqgo> dxioVar5, dxio<aqcn> dxioVar6, Executor executor, aqhu aqhuVar) {
        this.k = cqhnVar;
        this.a = apyxVar;
        this.l = dxioVar;
        this.e = aqhuVar;
        this.m = dxioVar2;
        this.n = dxioVar3;
        this.b = dxioVar4;
        this.c = dxioVar5;
        this.d = dxioVar6;
        this.o = executor;
        String str = "";
        aqhuVar.h(0, apyxVar.b() ? activity.getString(R.string.PERSONAL_INBOX_TOGGLE_TEXT) : str);
        aqhuVar.l(0, cjtd.a(dtxv.bZ));
        aqhuVar.h(1, apyxVar.b() ? activity.getString(R.string.BUSINESS_INBOX_TOGGLE_TEXT) : str);
        aqhuVar.l(1, cjtd.a(dtxv.bJ));
    }

    private final synchronized void g() {
        crzp<apsi<Set<String>>> crzpVar;
        crzm<apsi<Set<String>>> crzmVar = this.u;
        if (crzmVar != null && (crzpVar = this.v) != null) {
            crzmVar.c(crzpVar);
        }
        cuss<Integer> cussVar = this.s;
        if (cussVar != null) {
            cussVar.g(this.p);
        }
        cuss<Integer> cussVar2 = this.t;
        if (cussVar2 != null) {
            cussVar2.g(this.q);
        }
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
    }

    public final synchronized void a(final aqbx aqbxVar) {
        if (aqbxVar.equals(this.r)) {
            return;
        }
        btlu j = this.n.a().j();
        if (j != null && j.l()) {
            if (this.r != null) {
                g();
                this.h = false;
                this.i = false;
                this.j = false;
            }
            this.r = aqbxVar;
            this.u = this.m.a().c(j);
            crzp<apsi<Set<String>>> crzpVar = new crzp(this, aqbxVar) { // from class: aqkf
                private final aqkh a;
                private final aqbx b;

                {
                    this.a = this;
                    this.b = aqbxVar;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    this.a.c(crzmVar, this.b.b);
                }
            };
            this.v = crzpVar;
            this.u.d(crzpVar, this.o);
            cuss<Integer> a = this.l.a().d().a(aqbxVar.a, dbss.ALWAYS_TRUE, 99);
            this.s = a;
            dbsk.s(a);
            a.q(this.p);
        }
    }

    public final synchronized void b() {
        this.r = null;
        g();
    }

    public final synchronized void c(crzm<apsi<Set<String>>> crzmVar, ctyy ctyyVar) {
        final apsi<Set<String>> l = crzmVar.l();
        if (l == null) {
            return;
        }
        cuss<Integer> cussVar = this.t;
        if (cussVar != null) {
            cussVar.g(this.q);
        }
        cuss<Integer> a = this.l.a().d().a(ctyyVar, new dbsl(this, l) { // from class: aqkg
            private final aqkh a;
            private final apsi b;

            {
                this.a = this;
                this.b = l;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                aqkh aqkhVar = this.a;
                cufw cufwVar = (cufw) obj;
                return cufwVar != null && aqkhVar.b.a().b(cufwVar) && aqkhVar.c.a().b(cufwVar, dcdc.r((Collection) this.b.a()));
            }
        }, 99);
        this.t = a;
        a.q(this.q);
    }

    public final hxy e(Integer num) {
        hxz f = hya.f(this.k);
        f.d(num);
        return f.a();
    }

    public final int f() {
        int intValue = this.e.a().intValue();
        if (intValue != 0) {
            return intValue != 1 ? 1 : 3;
        }
        return 2;
    }

    public final synchronized void d() {
        if (this.h) {
            return;
        }
        if (this.i && this.j) {
            if (this.f <= 0 || this.g != 0) {
                this.e.i(1);
            } else {
                this.e.i(0);
            }
            this.h = true;
        }
    }
}

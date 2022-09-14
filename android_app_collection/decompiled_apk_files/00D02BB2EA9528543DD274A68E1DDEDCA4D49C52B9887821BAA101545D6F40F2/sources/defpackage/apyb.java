package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apyb  reason: default package */
/* loaded from: classes2.dex */
public final class apyb {
    private final Executor a;
    private final akfa b;
    private final apyv c;
    private final apyx d;
    private final dxio<aqgl> e;
    private final dxio<apyc> f;
    @dzsi
    private aqgk g;
    @dzsi
    private crzp<btlu> h;
    @dzsi
    private apya i;

    public apyb(Executor executor, akfa akfaVar, apyv apyvVar, apyx apyxVar, dxio<aqgl> dxioVar, dxio<apyc> dxioVar2) {
        this.a = executor;
        this.b = akfaVar;
        this.c = apyvVar;
        this.d = apyxVar;
        this.e = dxioVar;
        this.f = dxioVar2;
    }

    private final void d() {
        apya apyaVar;
        aqgk aqgkVar = this.g;
        if (aqgkVar == null || (apyaVar = this.i) == null) {
            return;
        }
        aqgkVar.b(apyaVar);
        this.g = null;
        this.i = null;
    }

    public final synchronized void a() {
        if (!this.d.b()) {
            return;
        }
        if (this.h != null) {
            return;
        }
        this.h = new crzp(this) { // from class: apxy
            private final apyb a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.c(crzmVar);
            }
        };
        crzm<btlu> C = this.b.C();
        crzp<btlu> crzpVar = this.h;
        dbsk.s(crzpVar);
        C.d(crzpVar, this.a);
    }

    public final synchronized void b() {
        if (this.h != null) {
            crzm<btlu> C = this.b.C();
            crzp<btlu> crzpVar = this.h;
            dbsk.s(crzpVar);
            C.c(crzpVar);
            this.h = null;
        }
        d();
    }

    public final synchronized void c(crzm<btlu> crzmVar) {
        d();
        btlu l = crzmVar.l();
        if (l != null && this.c.a()) {
            this.g = this.e.a().a(l, apxz.a);
            apyc a = this.f.a();
            Application a2 = a.a.a();
            apyc.a(a2, 1);
            dxio a3 = ((dxjh) a.b).a();
            apyc.a(a3, 2);
            dxio a4 = ((dxjh) a.c).a();
            apyc.a(a4, 3);
            dxio a5 = ((dxjh) a.d).a();
            apyc.a(a5, 4);
            dxio a6 = ((dxjh) a.e).a();
            apyc.a(a6, 5);
            apyc.a(l, 6);
            this.i = new apya(a2, a3, a4, a5, a6, l);
            aqgk aqgkVar = this.g;
            dbsk.s(aqgkVar);
            aqgkVar.a(this.i, this.a);
        }
    }
}

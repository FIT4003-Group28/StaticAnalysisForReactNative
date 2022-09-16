package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tid  reason: default package */
/* loaded from: classes7.dex */
public class tid implements tib, tjg, tjy {
    public tjz a;
    private final Executor c;
    private final ufg d;
    private final suy e;
    private final tka f;
    @dzsi
    private crzp<uff> g;
    private boolean b = true;
    private boolean h = false;
    private boolean i = false;

    public tid(Executor executor, ufg ufgVar, suy suyVar, tka tkaVar) {
        this.c = executor;
        this.d = ufgVar;
        this.e = suyVar;
        this.f = tkaVar;
    }

    @Override // defpackage.tib
    public tjg a() {
        return this;
    }

    @Override // defpackage.tib
    public void b(boolean z) {
        if (this.h != z) {
            this.h = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.tib
    public void c(boolean z) {
        if (this.i != z) {
            this.i = z;
            cqkx.p(this);
        }
    }

    @Override // defpackage.tib
    public void d() {
        this.g = new crzp(this) { // from class: tic
            private final tid a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                tjz tjzVar = this.a.a;
                if (tjzVar != null) {
                    uff uffVar = (uff) crzmVar.l();
                    dbsk.s(uffVar);
                    tjzVar.j(uffVar.a());
                }
            }
        };
        crzm<uff> a = this.d.a();
        crzp<uff> crzpVar = this.g;
        dbsk.s(crzpVar);
        a.d(crzpVar, this.c);
    }

    @Override // defpackage.tib
    public void e() {
        if (this.g != null) {
            crzm<uff> a = this.d.a();
            crzp<uff> crzpVar = this.g;
            dbsk.s(crzpVar);
            a.c(crzpVar);
            this.g = null;
        }
    }

    @Override // defpackage.tib
    public void f(Bundle bundle) {
        bundle.putBoolean("HeaderControllerImpl.waypointsExpanded", i().booleanValue());
    }

    @Override // defpackage.tib
    public void g(Bundle bundle) {
        h(bundle.getBoolean("HeaderControllerImpl.waypointsExpanded", i().booleanValue()));
    }

    public void h(boolean z) {
        if (this.b != z) {
            this.b = z;
            tjz tjzVar = this.a;
            if (tjzVar != null) {
                tjzVar.i(z);
            }
            cqkx.p(this);
        }
    }

    @Override // defpackage.tjg
    public Boolean i() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.tjg
    public Boolean j() {
        boolean z = false;
        if (this.i && m().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.tjg
    public Boolean k() {
        return Boolean.valueOf(!j().booleanValue());
    }

    @Override // defpackage.tjg
    public tji l() {
        if (this.a == null) {
            tka tkaVar = this.f;
            uff l = this.d.a().l();
            dbsk.s(l);
            dcdc<amvh> a = l.a();
            boolean booleanValue = i().booleanValue();
            gga a2 = tkaVar.a.a();
            tka.a(a2, 1);
            tka.a(tkaVar.b.a(), 2);
            isd a3 = tkaVar.c.a();
            tka.a(a3, 3);
            tgg a4 = tkaVar.d.a();
            tka.a(a4, 4);
            tkd a5 = tkaVar.e.a();
            tka.a(a5, 5);
            tka.a(this, 6);
            tka.a(a, 7);
            this.a = new tjz(a2, a3, a4, a5, this, a, booleanValue);
        }
        return this.a;
    }

    @Override // defpackage.tjg
    public Boolean m() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.tjy
    public void n(int i) {
        uff l = this.d.a().l();
        dbsk.s(l);
        this.e.aJ(l.a(), i);
    }

    @Override // defpackage.tjy
    public void o(boolean z) {
        if (!this.b) {
            this.b = true;
            cqkx.p(this);
        }
    }

    @Override // defpackage.tjy
    public void p() {
        uew f = ((uer) this.d).f();
        Collections.reverse(f.a);
        f.k(true);
    }

    @Override // defpackage.tjy
    public void q() {
        this.e.w(dbpy.a);
    }
}

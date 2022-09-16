package defpackage;

import android.graphics.Canvas;
import android.view.Surface;
import com.google.ar.core.Frame;
/* compiled from: PG */
/* renamed from: dvu  reason: default package */
/* loaded from: classes6.dex */
public final class dvu implements daf, dtv {
    private static final bnvs a = new bnvs(0.0f, -1.0f, 0.0f);
    private final dua b;
    private final dae c;
    private final dbrn<akqq, akse> d;
    private final cze e;
    private final czd f;
    private final czd g;
    @dzsi
    private dtu h;
    @dzsi
    private dtu i;
    @dzsi
    private dtu j;
    @dzsi
    private dtu k;
    @dzsi
    private dtu l;
    @dzsi
    private dtu m;
    @dzsi
    private dtu n;
    @dzsi
    private akqq o;
    @dzsi
    private dtk p;
    private dfgu q;
    @dzsi
    private dvr r;
    private final dvh s;

    public dvu(dvh dvhVar, dua duaVar, dbrn dbrnVar, cze czeVar, czd czdVar, czd czdVar2) {
        duy duyVar = new duy();
        this.q = dfgu.STOPPED;
        this.s = dvhVar;
        this.b = duaVar;
        this.d = dbrnVar;
        this.e = czeVar;
        this.f = czdVar;
        this.g = czdVar2;
        this.c = duyVar;
    }

    private final void i() {
        dua duaVar = this.b;
        dtk dtkVar = this.p;
        dfgu dfguVar = this.q;
        if (this.h == null) {
            dtu B = duaVar.B(dvh.f());
            this.h = B;
            dbsk.s(B);
            this.i = B.B(dvh.k(0.0f, -0.8f, -1.5f));
        }
        if (dtkVar == null || !dtkVar.b) {
            j();
        } else if (this.j == null) {
            dtu dtuVar = this.i;
            dbsk.s(dtuVar);
            dtu B2 = dtuVar.B(dvh.i(1.0f, 0.0f, 30.0f));
            this.j = B2;
            dbsk.s(B2);
            dtu B3 = B2.B(dvh.g(1.0f));
            this.k = B3;
            dbsk.s(B3);
            B3.A(this.c, 0.6f);
            Surface a2 = this.c.a();
            if (a2 != null && a2.isValid()) {
                Canvas lockHardwareCanvas = a2.lockHardwareCanvas();
                try {
                    lockHardwareCanvas.drawColor(-1118482);
                } finally {
                    a2.unlockCanvasAndPost(lockHardwareCanvas);
                }
            }
            dtu dtuVar2 = this.j;
            dbsk.s(dtuVar2);
            dtu B4 = dtuVar2.B(dvh.k(0.0f, -0.01f, 0.0f));
            B4.n();
            B4.z(0.63750005f);
            B4.u();
        }
        if (dtkVar == null || !dtkVar.b) {
            k();
        } else {
            if (this.l == null) {
                dtu dtuVar3 = this.i;
                dbsk.s(dtuVar3);
                dtu B5 = dtuVar3.B(dvh.k(0.0f, 0.0f, 0.0f));
                this.l = B5;
                dtu B6 = B5.B(dvh.i(-1.0f, 0.0f, -30.0f)).B(dvh.k(0.0f, 0.01f, 0.0f));
                this.m = B6;
                B6.u();
                this.m.n();
                this.m.w(this.e, this.f, new bnvs(0.012f, 0.012f, 0.012f));
            }
            if (dfguVar == dfgu.LOCALIZED) {
                dtu dtuVar4 = this.m;
                dbsk.s(dtuVar4);
                dtuVar4.y(0.0f);
            } else {
                dtu dtuVar5 = this.m;
                dbsk.s(dtuVar5);
                dtuVar5.y(0.5f);
            }
        }
        if (dtkVar == null || !dtkVar.b || dtkVar.d.size() <= 0) {
            l();
            return;
        }
        akqq akqqVar = null;
        dtj dtjVar = null;
        for (dtj dtjVar2 : dtkVar.d) {
            dgau b = dgau.b(dtjVar2.f);
            if (b == null) {
                b = dgau.MANEUVER_UNKNOWN;
            }
            if (b == dgau.DESTINATION) {
                dtjVar = dtjVar2;
            }
        }
        if (dtjVar != null) {
            duhe duheVar = dtjVar.b;
            if (duheVar == null) {
                duheVar = duhe.c;
            }
            akqqVar = new akqq(duheVar.a, duheVar.b);
        }
        this.o = akqqVar;
        if (this.r != null || this.k == null || this.n != null) {
            return;
        }
        bnvs m = m(akqqVar);
        this.r = dvh.k(m.e(), m.f(), m.g());
        dtu dtuVar6 = this.k;
        dbsk.s(dtuVar6);
        dtu B7 = dtuVar6.B(this.r).B(dvh.g(-1.0f));
        this.n = B7;
        B7.u();
        this.n.n();
        this.n.w(this.e, this.g, new bnvs(0.05f, 0.05f, 0.05f));
    }

    private final void j() {
        dtu dtuVar = this.k;
        if (dtuVar != null) {
            dtuVar.f();
            this.k = null;
        }
        dtu dtuVar2 = this.j;
        if (dtuVar2 != null) {
            dtuVar2.f();
            this.j = null;
        }
    }

    private final void k() {
        dtu dtuVar = this.l;
        if (dtuVar == null) {
            return;
        }
        dtuVar.f();
        this.l = null;
    }

    private final void l() {
        dtu dtuVar = this.n;
        if (dtuVar == null) {
            return;
        }
        dtuVar.f();
        this.n = null;
    }

    private final bnvs m(@dzsi akqq akqqVar) {
        akse a2;
        if (akqqVar != null && (a2 = this.d.a(akqqVar)) != null) {
            float f = a2.b;
            float f2 = a2.c;
            bnvs bnvsVar = new bnvs(((f + f) - 1.0f) * 0.6f, 0.0f, (-((f2 + f2) - 1.0f)) * 0.6f);
            return bnvsVar.d() > 0.6f ? a : bnvsVar;
        }
        return a;
    }

    @Override // defpackage.czg
    public final void a() {
        j();
        k();
        l();
        dtu dtuVar = this.h;
        if (dtuVar != null) {
            dtuVar.f();
        }
    }

    @Override // defpackage.daf
    public final dae c() {
        return this.c;
    }

    @Override // defpackage.dah
    public final void d(akqq akqqVar, float f) {
    }

    @Override // defpackage.dtv
    public final void e(dua duaVar) {
    }

    @Override // defpackage.dtv
    public final void f() {
    }

    @Override // defpackage.dtv
    public final void g(Frame frame, @dzsi dad dadVar, dfgv dfgvVar, float f) {
        dfgu b = dfgu.b(dfgvVar.b);
        if (b == null) {
            b = dfgu.NONE;
        }
        if (this.q != b) {
            this.q = b;
            i();
        }
        dvr dvrVar = this.r;
        if (dvrVar != null) {
            bnvs m = m(this.o);
            dvrVar.j(m.e(), m.f(), m.g());
        }
    }

    @Override // defpackage.dtv
    public final void h(float f) {
    }

    @Override // defpackage.daf
    public final void b(@dzsi dtk dtkVar) {
        dtk dtkVar2 = this.p;
        if (dtkVar2 == null) {
            if (dtkVar == null) {
                return;
            }
            this.p = dtkVar;
        } else if (dtkVar != null) {
            if (dtkVar2.equals(dtkVar)) {
                return;
            }
            this.p = dtkVar;
        } else {
            this.p = null;
        }
        i();
    }
}

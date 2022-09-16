package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: kmx  reason: default package */
/* loaded from: classes3.dex */
public final class kmx implements knh, kbk, nqj, ezg {
    public final airw a;
    public final aypf b;
    public ayny c;
    public aynx d;
    private final kbl e;
    private final nml f;
    private final ezh g;
    private final avch h;
    private final avcg i;
    private final yve j;
    private boolean k;
    private boolean l;

    public kmx(airw airwVar, kbl kblVar, nml nmlVar, ezh ezhVar, yve yveVar, avch avchVar) {
        this.a = airwVar;
        this.h = avchVar;
        avcj avcjVar = avchVar.g;
        this.i = (avcg) (avcjVar == null ? avcj.a : avcjVar).qm(avcg.b);
        this.e = kblVar;
        this.f = nmlVar;
        this.g = ezhVar;
        this.b = new aypf();
        this.j = yveVar;
    }

    @Override // defpackage.knh
    public final aynx a() {
        if (this.d == null) {
            this.d = aynx.k(new aynz() { // from class: kmu
                @Override // defpackage.aynz
                public final void a(ayny aynyVar) {
                    final kmx kmxVar = kmx.this;
                    kmxVar.c = aynyVar;
                    kmxVar.b.d(kmxVar.a.ao().aa(new ayqb() { // from class: kmw
                        @Override // defpackage.ayqb
                        public final void a(Object obj) {
                            ahhm ahhmVar = (ahhm) obj;
                            kmx.this.d();
                        }
                    }, kjt.f));
                    kmxVar.d();
                    aynyVar.d(banl.n(new aypv() { // from class: kmv
                        @Override // defpackage.aypv
                        public final void a() {
                            kmx kmxVar2 = kmx.this;
                            kmxVar2.b.c();
                            kmxVar2.d = null;
                            kmxVar2.c = null;
                        }
                    }));
                }
            }, aynq.BUFFER);
        }
        return this.d;
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (this.k) {
            this.k = false;
            d();
        }
    }

    @Override // defpackage.knh
    public final void c() {
        this.e.a(this);
        this.f.g().a(this);
        this.g.i(this);
    }

    public final void d() {
        ayny aynyVar = this.c;
        if (aynyVar == null) {
            return;
        }
        boolean z = true;
        if (!this.k || this.l || ((fgu) this.j.c()).j >= 2) {
            z = false;
        } else {
            String i = this.f.i();
            if (i != null) {
                Iterator it = this.i.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (i.equals((String) it.next())) {
                            break;
                        }
                    } else {
                        for (aqvl aqvlVar : this.i.d) {
                            if (i.equals((aqvlVar.b & 2) != 0 ? aqvlVar.d : null)) {
                            }
                        }
                    }
                }
                z = false;
            }
        }
        aynyVar.a(kmn.b(z, this.h));
    }

    @Override // defpackage.nqj
    public final void g(nmc nmcVar) {
        d();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        if (!this.k) {
            this.k = true;
            d();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        this.l = ezxVar.b();
        d();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }
}

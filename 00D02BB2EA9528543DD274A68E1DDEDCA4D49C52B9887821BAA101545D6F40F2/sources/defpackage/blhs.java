package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: blhs  reason: default package */
/* loaded from: classes3.dex */
public class blhs {
    private static final dcqe d = dcqe.c("blhs");
    @dzsi
    blho a;
    @dzsi
    blhw b;
    @dzsi
    public blhp c;
    private final btvo e;
    private final cebr f;
    private final blic g;
    private final blhi h;
    private final blie i;
    private final blhm j;
    private final blha k;
    private final cdjk l;
    private ilo m;
    private final blhw n;

    public blhs(boolean z, cdjk cdjkVar, btvo btvoVar, cebr cebrVar, blic blicVar, blhi blhiVar, blie blieVar, blhm blhmVar, blha blhaVar) {
        this.e = btvoVar;
        this.f = cebrVar;
        this.g = blicVar;
        this.h = blhiVar;
        this.i = blieVar;
        this.j = blhmVar;
        this.k = blhaVar;
        this.l = cdjkVar;
        blgp blgpVar = new blgp();
        blgpVar.a = "";
        blgpVar.b = "";
        blgpVar.h(false);
        blgpVar.i(blif.a);
        blgpVar.d(akqi.a);
        blgpVar.h(z);
        this.n = blgpVar.l();
    }

    private final void i(blhw blhwVar) {
        blho blheVar;
        if (this.m == null) {
            return;
        }
        blho blhoVar = this.a;
        if (blhoVar != null) {
            if (blhoVar.e.k(blhwVar)) {
                this.b = null;
                return;
            } else if (blhoVar.d()) {
                this.b = blhwVar;
                return;
            }
        }
        ilo iloVar = this.m;
        if (!blhwVar.c() || !this.f.a()) {
            dccx F = dcdc.F();
            cebq a = this.k.a.a();
            blha.a(a, 1);
            blha.a(iloVar, 2);
            blha.a(blhwVar, 3);
            F.g(new blgz(a, iloVar, blhwVar));
            if (this.f.a() || this.f.c(iloVar)) {
                this.l.equals(cdjk.PLACESHEET_REVIEWS);
                blhi blhiVar = this.h;
                cdqt bn = iloVar.bn();
                btvo a2 = blhiVar.a.a();
                blhi.a(a2, 1);
                buuy a3 = blhiVar.b.a();
                blhi.a(a3, 2);
                dehq a4 = blhiVar.c.a();
                blhi.a(a4, 3);
                blhi.a(bn, 4);
                blhi.a(blhwVar, 5);
                F.g(new blhh(a2, a3, a4, bn, blhwVar));
            } else {
                blic blicVar = this.g;
                btvo a5 = blicVar.a.a();
                blic.a(a5, 1);
                butl a6 = blicVar.b.a();
                blic.a(a6, 2);
                dehq a7 = blicVar.c.a();
                blic.a(a7, 3);
                blic.a(iloVar, 4);
                blic.a(blhwVar, 5);
                F.g(new blib(a5, a6, a7, iloVar, blhwVar));
            }
            if (this.e.getUgcParameters().ap().b) {
                blhm blhmVar = this.j;
                Activity activity = (Activity) ((dxjd) blhmVar.a).a;
                blhm.a(activity, 1);
                buti a8 = blhmVar.b.a();
                blhm.a(a8, 2);
                dehq a9 = blhmVar.c.a();
                blhm.a(a9, 3);
                blhm.a(blhwVar, 4);
                F.g(new blhl(activity, a8, a9, blhwVar));
            }
            dcdc f = F.f();
            blhf.a(blhwVar, 1);
            blhf.a(f, 2);
            blheVar = new blhe(blhwVar, f);
        } else {
            blie blieVar = this.i;
            cdqt bn2 = iloVar.bn();
            btvo a10 = blieVar.a.a();
            blie.a(a10, 1);
            buuy a11 = blieVar.b.a();
            blie.a(a11, 2);
            dehq a12 = blieVar.c.a();
            blie.a(a12, 3);
            blie.a(bn2, 4);
            blie.a(blhwVar, 5);
            blheVar = new blid(a10, a11, a12, bn2, blhwVar);
        }
        this.a = blheVar;
        this.b = null;
        blhp blhpVar = this.c;
        if (blhpVar != null) {
            blhpVar.a();
        }
        blho blhoVar2 = this.a;
        if (blhoVar2 == null) {
            return;
        }
        blhoVar2.e(new blhn(this) { // from class: blhr
            private final blhs a;

            {
                this.a = this;
            }

            @Override // defpackage.blhn
            public final void a(blhy blhyVar) {
                this.a.b(blhyVar);
            }
        });
    }

    public final void a(ilo iloVar) {
        blhw i;
        this.m = iloVar;
        blho blhoVar = this.a;
        if (blhoVar == null) {
            i = this.n.i(iloVar.ai());
        } else {
            i = blhoVar.e.i(iloVar.ai());
        }
        blho blhoVar2 = this.a;
        if (blhoVar2 != null) {
            blhoVar2.f = true;
            this.a = null;
        }
        i(i);
    }

    public final void b(blhy blhyVar) {
        blhw blhwVar = this.b;
        if (blhwVar != null) {
            i(blhwVar);
            return;
        }
        blhp blhpVar = this.c;
        if (blhpVar == null) {
            return;
        }
        blhpVar.b(blhyVar);
    }

    public final void c() {
        blho blhoVar = this.a;
        if (blhoVar != null && !blhoVar.d()) {
            this.a.e(new blhn(this) { // from class: blhq
                private final blhs a;

                {
                    this.a = this;
                }

                @Override // defpackage.blhn
                public final void a(blhy blhyVar) {
                    this.a.b(blhyVar);
                }
            });
        }
    }

    public final String d() {
        blho blhoVar = this.a;
        return blhoVar == null ? "" : blhoVar.e.b();
    }

    public final dbsg<djck> e() {
        blho blhoVar = this.a;
        return blhoVar == null ? dbpy.a : blhoVar.e.f();
    }

    public final blif f() {
        blho blhoVar = this.a;
        if (blhoVar == null) {
            return blif.a;
        }
        return blhoVar.e.d();
    }

    public final boolean g() {
        blho blhoVar = this.a;
        if (blhoVar == null) {
            return false;
        }
        return blhoVar.a();
    }

    public final void h(@dzsi String str, @dzsi blif blifVar, @dzsi djck djckVar, @dzsi String str2) {
        blhw blhwVar;
        blho blhoVar;
        blhw blhwVar2 = this.b;
        if (blhwVar2 == null && (blhoVar = this.a) != null) {
            blhwVar2 = blhoVar.e;
        }
        if (blhwVar2 == null) {
            return;
        }
        if (blhwVar2.c()) {
            bvoo.h("setCurrentParams() is not supported for self posts", new Object[0]);
            return;
        }
        if (str != null) {
            blhv h = blhwVar2.h();
            h.e(str);
            blhwVar = h.l();
        } else {
            blhwVar = blhwVar2;
        }
        if (blifVar != null) {
            blhv h2 = blhwVar.h();
            h2.i(blifVar);
            blhwVar = h2.l();
        }
        if (djckVar != null) {
            blhv h3 = blhwVar.h();
            h3.k(djckVar);
            blhwVar = h3.l();
        }
        if (str2 != null) {
            blhwVar = blhwVar.j(str2);
        } else if (!blhwVar.k(blhwVar2)) {
            blhwVar = blhwVar.j("");
        }
        i(blhwVar);
    }
}

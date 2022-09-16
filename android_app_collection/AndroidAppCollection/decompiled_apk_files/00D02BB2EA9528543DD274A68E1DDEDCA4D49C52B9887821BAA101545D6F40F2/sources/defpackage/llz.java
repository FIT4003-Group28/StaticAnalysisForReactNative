package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: llz  reason: default package */
/* loaded from: classes7.dex */
public final class llz extends nor {
    public final lme a;
    public ldm b;
    private final cjsz c;
    private final kdg d;
    private final not e;
    private final asmp f;
    private final lxf g;
    private final ncm h;
    private final atmi i;
    private final cqkf<lmb> j;

    public llz(cqkj cqkjVar, lmf lmfVar, final noo nooVar, final kdi kdiVar, final nop nopVar, kdg kdgVar, final ldm ldmVar, final int i, final int i2, cqat cqatVar, final btrm btrmVar, ksh kshVar, cjqy cjqyVar, cjqq cjqqVar, not notVar, asmp asmpVar, lxf lxfVar, ncm ncmVar, boolean z, atmi atmiVar) {
        super(cjqyVar, cjqqVar);
        this.c = new cjsz(dtxm.bI);
        this.d = kdgVar;
        this.b = ldmVar;
        this.e = notVar;
        this.f = asmpVar;
        this.g = lxfVar;
        this.h = ncmVar;
        this.i = atmiVar;
        boolean z2 = false;
        this.j = cqkjVar.d(new llt(z), notVar.a(), false);
        Runnable runnable = new Runnable(btrmVar, i, i2, nooVar) { // from class: llu
            private final btrm a;
            private final int b;
            private final int c;
            private final noo d;

            {
                this.a = btrmVar;
                this.b = i;
                this.c = i2;
                this.d = nooVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                btrm btrmVar2 = this.a;
                int i3 = this.b;
                int i4 = this.c;
                noo nooVar2 = this.d;
                btrmVar2.b(crhx.b(i3 + 1, i4 + 1));
                nooVar2.a();
            }
        };
        Runnable runnable2 = new Runnable(nopVar, kdiVar, ldmVar) { // from class: llv
            private final nop a;
            private final kdi b;
            private final ldm c;

            {
                this.a = nopVar;
                this.b = kdiVar;
                this.c = ldmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                koe.a(this.a, this.b, this.c);
            }
        };
        z2 = i2 > 1 ? true : z2;
        Context context = cqkjVar.d;
        lmf.a(ldmVar, 1);
        lmf.a(runnable, 2);
        lmf.a(runnable2, 4);
        lmf.a(nooVar, 6);
        lmf.a(cqatVar, 7);
        lmf.a(context, 8);
        lmf.a(kshVar, 9);
        npo a = lmfVar.a.a();
        lmf.a(a, 11);
        lmf.a(atmiVar, 12);
        btvo a2 = lmfVar.b.a();
        lmf.a(a2, 13);
        this.a = new lme(ldmVar, runnable, null, runnable2, z2, nooVar, cqatVar, context, kshVar, z, a, atmiVar, a2);
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        this.h.a(this.b, new ksu(this) { // from class: llw
            private final llz a;

            {
                this.a = this;
            }

            @Override // defpackage.ksu
            public final void a(ldm ldmVar) {
                llz llzVar = this.a;
                llzVar.b = ldmVar;
                llzVar.a.p(ldmVar);
            }
        }, false);
        this.j.e(this.a);
        this.i.as(new Runnable(this) { // from class: llx
            private final llz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        });
    }

    @Override // defpackage.non
    @dzsi
    public final noq b() {
        s(this.c);
        this.d.f(kdc.MAP_BUTTONS_DISABLED);
        this.g.l(true);
        akra f = akra.f(this.b.o());
        if (f != null) {
            this.f.p(dcdc.f(f), false, false, 1, true);
        }
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        return this.j.c();
    }

    @Override // defpackage.nor, defpackage.non
    public final void e() {
        this.f.v();
        this.f.x();
        this.d.f(kdc.MAP_INTERACTION_AND_BUTTONS_ENABLED);
        this.g.l(false);
        t();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        this.i.at(new Runnable(this) { // from class: lly
            private final llz a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.k();
            }
        });
        this.j.e(null);
    }

    @Override // defpackage.non
    public final String g() {
        return "DestinationInfoOverlay";
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.e.b(noeVar, this.j.c());
    }

    public final void k() {
        cqkx.p(this.a);
    }
}

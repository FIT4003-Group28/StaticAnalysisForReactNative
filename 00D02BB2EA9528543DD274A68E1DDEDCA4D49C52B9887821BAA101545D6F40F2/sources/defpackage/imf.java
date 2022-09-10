package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: imf  reason: default package */
/* loaded from: classes.dex */
public final class imf extends itb implements ine {
    public final dxio<ing> a;
    public final dxio<ina> b;
    public final Executor c;
    public final dxio<afec> d;
    public boolean e;
    private final dxio<inc> f;
    private final dxio<ind> g;
    private final cjxd h;
    private final Boolean i;
    private final bvjj j;
    private final dxio<akfa> k;
    private final dxio<gcg> o;
    private final dxio<gce> p;
    private boolean s;
    private boolean t = false;
    private final crzp<btlu> q = new crzp(this) { // from class: imc
        private final imf a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            final imf imfVar = this.a;
            final btlu q = btlu.q((btlu) crzmVar.l());
            imfVar.c.execute(new Runnable(imfVar, q) { // from class: ime
                private final imf a;
                private final btlu b;

                {
                    this.a = imfVar;
                    this.b = q;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    imf imfVar2 = this.a;
                    boolean o = this.b.o();
                    if (imfVar2.e == o) {
                        return;
                    }
                    imfVar2.e = o;
                    imfVar2.f();
                    imfVar2.b.a().b(true);
                    imfVar2.j(imfVar2.d.a().a());
                    imfVar2.a.a().a();
                    if (!imfVar2.w()) {
                        return;
                    }
                    imfVar2.e();
                }
            });
        }
    };
    private final crzp<Boolean> r = new crzp(this) { // from class: imd
        private final imf a;

        {
            this.a = this;
        }

        @Override // defpackage.crzp
        public final void On(crzm crzmVar) {
            imf imfVar = this.a;
            if (imfVar.d.a().a()) {
                imfVar.a.a().a();
            }
        }
    };

    public imf(dxio<inc> dxioVar, dxio<ind> dxioVar2, dxio<ing> dxioVar3, cjxd cjxdVar, Boolean bool, bvjj bvjjVar, dxio<akfa> dxioVar4, dxio<ina> dxioVar5, Executor executor, dxio<afec> dxioVar6, dxio<gcg> dxioVar7, dxio<gce> dxioVar8) {
        this.f = dxioVar;
        this.g = dxioVar2;
        this.a = dxioVar3;
        this.h = cjxdVar;
        this.i = bool;
        this.j = bvjjVar;
        this.k = dxioVar4;
        this.b = dxioVar5;
        this.c = executor;
        this.d = dxioVar6;
        this.o = dxioVar7;
        this.p = dxioVar8;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        boolean z = false;
        if (this.h.b() && !this.i.booleanValue() && !this.j.m(bvjk.hd, false)) {
            z = true;
        }
        this.s = z;
        btlu j = this.k.a().j();
        j(this.d.a().a());
        this.e = btlu.p(j);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        e();
    }

    @Override // defpackage.itb
    public final void Po() {
        super.Po();
        f();
    }

    public final void e() {
        if (!this.s || this.t) {
            return;
        }
        inc a = this.f.a();
        a.b.a().a().a().h(a);
        a.c.a().C().d(a.d, a.f);
        a.a.g.a(a.e.a());
        ind a2 = this.g.a();
        if (a2.a.a().a().g().a()) {
            a2.a.a().a().g().b().b(a2);
        }
        this.k.a().C().a(this.q, this.c);
        if (this.o.a().a()) {
            this.p.a().g().a(this.r, this.c);
        }
        this.t = true;
    }

    public final void f() {
        if (!this.s || !this.t) {
            return;
        }
        inc a = this.f.a();
        a.b.a().a().a().j(a);
        a.c.a().C().c(a.d);
        a.a.g.b(a.e.a());
        ind a2 = this.g.a();
        if (a2.a.a().a().g().a()) {
            a2.a.a().a().g().b().c(a2);
        }
        this.k.a().C().c(this.q);
        if (this.o.a().a()) {
            this.p.a().g().c(this.r);
        }
        this.t = false;
    }

    @Override // defpackage.ine
    public final void i(ViewGroup viewGroup, boolean z) {
        if (this.s) {
            ing a = this.a.a();
            bvrj.UI_THREAD.c();
            a.b(false);
            if (a.c == null) {
                return;
            }
            a.c();
            if (z) {
                viewGroup.addView(a.c);
                viewGroup.setVisibility(0);
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    @Override // defpackage.ine
    public final void j(boolean z) {
        if (!this.s || !this.b.a().a().g().a()) {
            return;
        }
        this.b.a().a().g().b().a(z);
    }

    @Override // defpackage.ine
    public final void k() {
        this.f.a().b();
    }
}

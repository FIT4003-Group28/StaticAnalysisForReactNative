package defpackage;

import android.opengl.Matrix;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: alpd  reason: default package */
/* loaded from: classes2.dex */
public class alpd implements bnut {
    protected final akpq a;
    protected final akzh i;
    protected final bnvr j = new bnvr();
    protected bnvu k = bnvu.a;
    boolean l = false;
    public final ArrayList<Runnable> m = dchl.a();
    private final bnvr b = new bnvr();
    private final bnvr c = new bnvr();
    public boolean n = false;
    public akqq o = new akqq();
    public float p = 1.0f;
    public final bnvs q = new bnvs();
    private final bnvs d = new bnvs();
    private final bnvs e = new bnvs();
    private akra f = new akra();
    private float g = 1.0f;
    private final float[] h = new float[4];
    private float s = 1.0f;
    public final Runnable r = new Runnable(this) { // from class: alox
        private final alpd a;

        {
            this.a = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            dcdc r;
            alpd alpdVar = this.a;
            synchronized (alpdVar) {
                r = dcdc.r(alpdVar.m);
                alpdVar.m.clear();
            }
            int size = r.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) r.get(i)).run();
            }
        }
    };

    public alpd(akpq akpqVar, akzh akzhVar) {
        this.a = akpqVar;
        this.i = akzhVar;
    }

    private final void a(Runnable runnable) {
        if (bnuq.b()) {
            runnable.run();
            return;
        }
        this.a.e(runnable);
        this.a.d();
    }

    @Override // defpackage.akvk
    public final void c(Runnable runnable) {
        boolean z;
        synchronized (this) {
            z = this.l;
            this.m.add(runnable);
        }
        if (z) {
            this.a.e(this.r);
            this.a.d();
        }
    }

    @Override // defpackage.akvk
    public final void d() {
        final bnvu u = u();
        u.getClass();
        a(new Runnable(u) { // from class: aloy
            private final bnvu a;

            {
                this.a = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bnvu bnvuVar = this.a;
                int i = bnvuVar.b;
                if ((i & 1) == 0) {
                    bnvuVar.b = i + 1;
                }
            }
        });
    }

    @Override // defpackage.akvk
    public final void e() {
        final bnvu u = u();
        u.getClass();
        a(new Runnable(u) { // from class: aloz
            private final bnvu a;

            {
                this.a = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bnvu bnvuVar = this.a;
                int i = bnvuVar.b;
                if ((i & 1) != 0) {
                    bnvuVar.b = i - 1;
                }
            }
        });
    }

    @Override // defpackage.akvk
    public final void f(final float f, final float f2, final float f3) {
        a(new Runnable(this, f, f2, f3) { // from class: alpb
            private final alpd a;
            private final float b;
            private final float c;
            private final float d;

            {
                this.a = this;
                this.b = f;
                this.c = f2;
                this.d = f3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alpd alpdVar = this.a;
                float f4 = this.b;
                float f5 = this.c;
                float f6 = this.d;
                synchronized (alpdVar) {
                    alpdVar.q.a(f4, f5, f6);
                    alpdVar.n = true;
                }
            }
        });
    }

    @Override // defpackage.akvk
    public final void g(final float f) {
        a(new Runnable(this, f) { // from class: alpc
            private final alpd a;
            private final float b;

            {
                this.a = this;
                this.b = f;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alpd alpdVar = this.a;
                float f2 = this.b;
                synchronized (alpdVar) {
                    alpdVar.p = f2;
                    alpdVar.n = true;
                }
            }
        });
    }

    @Override // defpackage.akvk
    public boolean h() {
        throw null;
    }

    @Override // defpackage.akvk
    public final void j(final akqq akqqVar) {
        a(new Runnable(this, akqqVar) { // from class: alpa
            private final alpd a;
            private final akqq b;

            {
                this.a = this;
                this.b = akqqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alpd alpdVar = this.a;
                akqq akqqVar2 = this.b;
                synchronized (alpdVar) {
                    alpdVar.o = akqqVar2;
                    alpdVar.n = true;
                }
            }
        });
    }

    @Override // defpackage.bnut
    public final void s() {
        boolean z;
        dbsk.l(bnuq.b());
        synchronized (this) {
            z = this.n;
            this.e.b(this.q);
            this.f = akra.f(this.o);
            this.g = this.p;
            this.s = this.k.g;
            this.n = false;
        }
        if (z) {
            this.b.g();
            amgp.a(this.i, this.f, akyx.w(this.i, this.i.t(this.f, true)), this.h);
            bnvr bnvrVar = this.b;
            float[] fArr = this.h;
            bnvrVar.h(fArr[0], fArr[1], fArr[2]);
            this.d.a(1.0f, 0.0f, 0.0f);
            this.b.c(this.d, this.e.e());
            this.d.a(0.0f, 1.0f, 0.0f);
            this.b.c(this.d, this.e.f());
            this.d.a(0.0f, 0.0f, 1.0f);
            this.b.c(this.d, this.e.g());
            bnvr bnvrVar2 = new bnvr();
            this.b.b(bnvrVar2, this.j);
            this.b.f(bnvrVar2);
            this.b.d(1.0f / this.s);
            this.b.d(this.g * this.h[3]);
            this.c.f(this.b);
            bnvr bnvrVar3 = this.c;
            if (bnvrVar3.b) {
                return;
            }
            float[] fArr2 = new float[16];
            if (!Matrix.invertM(fArr2, 0, bnvrVar3.a, 0)) {
                return;
            }
            System.arraycopy(fArr2, 0, bnvrVar3.a, 0, 16);
        }
    }

    @Override // defpackage.bnut
    public final float[] t() {
        return this.b.a;
    }

    @Override // defpackage.bnut
    public final synchronized bnvu u() {
        return this.k;
    }
}

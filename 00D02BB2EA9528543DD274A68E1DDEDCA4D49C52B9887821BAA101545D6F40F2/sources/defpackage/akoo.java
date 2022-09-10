package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akoo  reason: default package */
/* loaded from: classes.dex */
public final class akoo implements akpe {
    private static final dcqe l = dcqe.c("akoo");
    public final dbty<akqq> a;
    @dzsi
    public final akpj b;
    @dzsi
    public final ckcw c;
    public final dxio<ammc> d;
    @dzsi
    public Boolean e;
    public final bttf f;
    public final bvjj g;
    public final cjqy h;
    public final Executor j;
    private final dzsj<dwwr> k;
    public float i = -1.0f;
    private final dxio<alad> m = btsp.b(new dbty(this) { // from class: akol
        private final akoo a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            int i;
            akqq a;
            final akoo akooVar = this.a;
            alaa a2 = alad.a();
            akpj akpjVar = akooVar.b;
            if (akpjVar != null) {
                i = akpjVar.c(a2);
            } else {
                akooVar.j.execute(new Runnable(akooVar) { // from class: akom
                    private final akoo a;

                    {
                        this.a = akooVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cjqy cjqyVar = this.a.h;
                        cjsx i2 = cjsy.i();
                        i2.b(ddda.cP);
                        cjqyVar.k(i2.a());
                    }
                });
                a2.b(akzd.b(akooVar.f.a()));
                i = 1;
            }
            akooVar.e = Boolean.valueOf(i != 3);
            if (i == 1) {
                akooVar.i = 15.0f;
            } else {
                akooVar.i = a2.c;
            }
            ckcw ckcwVar = akooVar.c;
            if (ckcwVar != null) {
                ckcwVar.b(ckgx.AUTO_PAN_MODE_ENABLED, new ckcx(akooVar) { // from class: akon
                    private final akoo a;

                    {
                        this.a = akooVar;
                    }

                    @Override // defpackage.ckcx
                    public final void a(ddyf ddyfVar) {
                        boolean equals = Boolean.TRUE.equals(this.a.e);
                        if (ddyfVar.c) {
                            ddyfVar.bF();
                            ddyfVar.c = false;
                        }
                        ddyq ddyqVar = (ddyq) ddyfVar.b;
                        ddyq ddyqVar2 = ddyq.K;
                        ddyqVar.a |= 32768;
                        ddyqVar.m = equals;
                    }
                });
            }
            akpj akpjVar2 = akooVar.b;
            if (akpjVar2 != null) {
                akpjVar2.b();
            }
            if (Boolean.TRUE.equals(akooVar.e) && (a = akooVar.a.a()) != null) {
                akooVar.d.a().i();
                a2.d(akra.f(a));
                a2.c = akooVar.e(akooVar.g, akooVar.i);
            }
            akooVar.d.a().k();
            return a2.a();
        }
    });

    public akoo(dbty<akqq> dbtyVar, @dzsi akpj akpjVar, @dzsi ckcw ckcwVar, dxio<ammc> dxioVar, dzsj<dwwr> dzsjVar, bttf bttfVar, bvjj bvjjVar, cjqy cjqyVar, Executor executor) {
        this.a = dbtyVar;
        this.b = akpjVar;
        this.c = ckcwVar;
        this.d = dxioVar;
        this.k = dzsjVar;
        this.f = bttfVar;
        this.g = bvjjVar;
        this.h = cjqyVar;
        this.j = executor;
    }

    @Override // defpackage.akpe
    public final alad a() {
        return this.m.a();
    }

    @Override // defpackage.akpe
    public final boolean b() {
        Boolean bool = this.e;
        if (bool == null) {
            bvoo.h("Attempted to access lastTrackingLocationState before value is initialized from storage", new Object[0]);
            return true;
        }
        return bool.booleanValue();
    }

    @Override // defpackage.akpe
    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.akpe
    public final float d() {
        this.m.a();
        return e(this.g, this.i);
    }

    public final float e(bvjj bvjjVar, float f) {
        bvjjVar.s(bvjk.L, dktk.UNKNOWN_ASSISTIVE_TAB_TYPE.o);
        float f2 = this.k.a().j;
        if (f2 >= 0.0f) {
            f = f2;
        }
        return Math.min(21.0f, Math.max(2.0f, f));
    }

    @Override // defpackage.akpe
    public final void f(alaa alaaVar, @dzsi akqq akqqVar) {
        alaaVar.d(akra.f(akqqVar));
        alaaVar.c = d();
    }
}

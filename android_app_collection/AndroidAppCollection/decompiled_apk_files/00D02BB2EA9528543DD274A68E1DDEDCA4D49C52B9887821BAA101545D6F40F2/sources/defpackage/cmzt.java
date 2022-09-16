package defpackage;

import android.content.Context;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: cmzt  reason: default package */
/* loaded from: classes5.dex */
public final class cmzt extends cmzc {
    public final Context c;
    public final cmze d;
    public final cmzh e;
    public final cmvr f;
    public final Looper g;
    public final int h;
    private final Object i;
    private volatile dehn<Void> j;

    public cmzt(Context context, cmze cmzeVar, cmzh cmzhVar, cmvr cmvrVar, Looper looper, int i, int i2) {
        super(i2);
        this.i = new Object();
        this.c = context;
        this.d = cmzeVar;
        this.e = cmzhVar;
        this.f = cmvrVar;
        this.g = looper;
        this.h = i;
    }

    @Override // defpackage.cmzc, defpackage.cmwc
    public final boolean b() {
        return this.b.get() != null && super.b();
    }

    @Override // defpackage.cmzc, defpackage.cmwz
    public final void d() {
        synchronized (this.i) {
            if (this.j != null) {
                this.j.Pk(new Runnable(this) { // from class: cmzk
                    private final cmzt a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g();
                    }
                }, dege.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cmwz f() {
        return new cndc(this.c, this.d, this.e, this.f, this.g, this.h, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        super.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        super.c();
    }

    @Override // defpackage.cmzc, defpackage.cmwz
    public final void c() {
        dehn<Void> dehnVar;
        dehn h;
        synchronized (this.i) {
            if (this.j == null) {
                if (!cnxs.c()) {
                    cncs h2 = cncu.h(this.c, cmzr.a, cmzs.a);
                    h2.a = this.h;
                    final cncu a = h2.a();
                    dehn g = deee.g(deee.g(deew.h(degp.q(a.a()), new dbrn(a) { // from class: cmzn
                        private final cncu a;

                        {
                            this.a = a;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            Void r3 = (Void) obj;
                            boolean d = this.a.d();
                            if (cmwk.a("CAR.TOKEN", 4)) {
                                int i = cnjc.a;
                            }
                            if (d) {
                                return ddid.NO_FALLBACK_GH_CAR_USED;
                            }
                            return ddid.GH_MIGRATION_DISABLED;
                        }
                    }, dege.a), cnai.class, cmzo.a, dege.a), Exception.class, cmzp.a, dege.a);
                    a.getClass();
                    ((degp) g).Pk(new Runnable(a) { // from class: cmzq
                        private final cncu a;

                        {
                            this.a = a;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.c();
                        }
                    }, dege.a);
                    h = deew.h(g, new dbrn(this) { // from class: cmzm
                        private final cmzt a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            cmzt cmztVar = this.a;
                            ddid ddidVar = (ddid) obj;
                            if (ddidVar != ddid.NO_FALLBACK_GH_CAR_USED) {
                                if (!cmxe.a().booleanValue()) {
                                    return new cmyk(cmztVar.c, cmztVar.d, cmztVar.e, cmztVar.f, cmztVar.g, cmztVar.h, cmztVar.a, ddidVar);
                                }
                                return new cndf(cmztVar.c, cmztVar.d, cmztVar.e, cmztVar.f, cmztVar.g, cmztVar.h, cmztVar.a, ddidVar);
                            }
                            return cmztVar.f();
                        }
                    }, dege.a);
                } else {
                    h = deha.a(f());
                }
                this.j = deew.h(degp.q(h), new dbrn(this) { // from class: cmzl
                    private final cmzt a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        this.a.b.set((cmwz) obj);
                        return null;
                    }
                }, dege.a);
            }
            dehnVar = this.j;
        }
        dehnVar.Pk(new Runnable(this) { // from class: cmzj
            private final cmzt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.h();
            }
        }, dege.a);
    }
}

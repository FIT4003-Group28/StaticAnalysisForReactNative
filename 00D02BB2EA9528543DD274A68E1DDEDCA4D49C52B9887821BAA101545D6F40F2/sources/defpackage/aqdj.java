package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aqdj  reason: default package */
/* loaded from: classes2.dex */
public final class aqdj {
    public final HashMap<ctyy, cuss<Integer>> a = new HashMap<>();
    public final btrm b;
    public final dxio<aqav> c;
    public final dxio<aqbv> d;
    public final dxio<aqaa> e;
    public final dxio<aqgn> f;
    private final bvrb g;
    private final apyv h;
    private final apyx i;

    public aqdj(btrm btrmVar, bvrb bvrbVar, apyv apyvVar, apyx apyxVar, dxio<aqav> dxioVar, dxio<aqbv> dxioVar2, dxio<aqaa> dxioVar3, dxio<aqgn> dxioVar4) {
        this.b = btrmVar;
        this.g = bvrbVar;
        this.h = apyvVar;
        this.i = apyxVar;
        this.c = dxioVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
    }

    private final synchronized void c(ctyy ctyyVar) {
        final dehn<Integer> a;
        dbsg<btlu> b = this.d.a().b(ctyyVar);
        if (!b.a() || (aqda.c(ctyyVar) && !this.h.b(b.b()))) {
            return;
        }
        if (!this.a.containsKey(ctyyVar)) {
            HashMap<ctyy, cuss<Integer>> hashMap = this.a;
            csug d = this.c.a().d();
            final aqgn a2 = this.f.a();
            a2.getClass();
            hashMap.put(ctyyVar, d.a(ctyyVar, new dbsl(a2) { // from class: aqdd
                private final aqgn a;

                {
                    this.a = a2;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.b((cufw) obj);
                }
            }, 99));
        }
        this.d.a();
        cuss<Integer> cussVar = this.a.get(ctyyVar);
        dbsk.s(cussVar);
        final dehn c = aqbv.c(cussVar);
        if (this.h.b(b.b())) {
            a = d(ctyyVar);
        } else {
            a = deha.a(0);
        }
        deha.k(c, a).b(new Callable(this, c, a) { // from class: aqde
            private final aqdj a;
            private final dehn b;
            private final dehn c;

            {
                this.a = this;
                this.b = c;
                this.c = a;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    this.a.b(((Integer) deha.r(this.b)).intValue() + ((Integer) deha.r(this.c)).intValue());
                    return null;
                } catch (Exception e) {
                    bvoo.d(e);
                    return null;
                }
            }
        }, dege.a);
    }

    private final synchronized dehn<Integer> d(ctyy ctyyVar) {
        dehn<dbsg<ctyy>> b;
        csuu b2 = this.c.a().b();
        String f = ctyyVar.b().a().f();
        if (f == null) {
            b = deha.a(dbpy.a);
        } else {
            int d = aqda.d(ctyyVar);
            int i = 2;
            if (d != 1) {
                i = d != 2 ? 0 : 1;
            }
            ContactId b3 = aqda.b(f, i);
            if (b3 == null) {
                b = deha.a(dbpy.a);
            } else {
                b = b2.b(b3);
            }
        }
        return deew.g(b, new defg(this) { // from class: aqdf
            private final aqdj a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                aqdj aqdjVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (dbsgVar == null || !dbsgVar.a()) {
                    return deha.a(0);
                }
                if (!aqdjVar.a.containsKey(dbsgVar.b())) {
                    final aqgn a = aqdjVar.f.a();
                    a.getClass();
                    aqdjVar.a.put((ctyy) dbsgVar.b(), aqdjVar.c.a().d().a((ctyy) dbsgVar.b(), new dbsl(a) { // from class: aqdh
                        private final aqgn a;

                        {
                            this.a = a;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj2) {
                            return this.a.b((cufw) obj2);
                        }
                    }, 99));
                }
                aqdjVar.d.a();
                cuss<Integer> cussVar = aqdjVar.a.get(dbsgVar.b());
                dbsk.s(cussVar);
                return aqbv.c(cussVar);
            }
        }, dege.a);
    }

    public final void a(final ctyy ctyyVar) {
        if (this.i.f()) {
            c(ctyyVar);
        } else {
            this.g.b(new Runnable(this, ctyyVar) { // from class: aqdc
                private final aqdj a;
                private final ctyy b;

                {
                    this.a = this;
                    this.b = ctyyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final aqdj aqdjVar = this.a;
                    ((ctct) aqdjVar.c.a().c()).H(this.b).w(cugo.INCOMING_RECEIVED).k(new cusr(aqdjVar) { // from class: aqdi
                        private final aqdj a;

                        {
                            this.a = aqdjVar;
                        }

                        @Override // defpackage.cusr
                        public final void a(Object obj) {
                            this.a.b(((Integer) obj).intValue());
                        }
                    });
                }
            }, bvrj.BACKGROUND_THREADPOOL);
        }
    }

    public final void b(final int i) {
        this.g.b(new Runnable(this, i) { // from class: aqdg
            private final aqdj a;
            private final int b;

            {
                this.a = this;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqdj aqdjVar = this.a;
                aqdjVar.e.a().c(this.b);
                aqdjVar.b.b(new gdu());
                aqdjVar.b.b(new gdw());
            }
        }, bvrj.UI_THREAD);
    }
}

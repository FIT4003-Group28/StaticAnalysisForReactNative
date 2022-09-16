package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: csxv  reason: default package */
/* loaded from: classes5.dex */
public final class csxv implements csuf {
    public final ctog b;
    public final cttq h;
    private final Context i;
    private final ctgc j;
    public final Object c = new Object();
    public final Object d = new Object();
    final Map<Pair<ctyy, ContactId>, dehn<cufj>> f = new HashMap();
    final Map<Pair<ctyy, ContactId>, dehn<cufj>> g = new HashMap();
    public final dehp a = cstu.b().a;
    public final Random e = new Random();

    public csxv(Context context, ctgc ctgcVar, cttq cttqVar, ctog ctogVar) {
        this.i = context;
        this.j = ctgcVar;
        this.h = cttqVar;
        this.b = ctogVar;
    }

    @Override // defpackage.csuf
    public final cuss<cufj> a(ctyy ctyyVar, ContactId contactId) {
        return e(ctyyVar, contactId, csxk.a);
    }

    @Override // defpackage.csuf
    public final cuss<cufj> b(ctyy ctyyVar, ContactId contactId) {
        return e(ctyyVar, contactId, csxl.a);
    }

    @Override // defpackage.csuf
    public final cuss<cufj> c(ctyy ctyyVar, ContactId contactId) {
        return e(ctyyVar, contactId, dbss.ALWAYS_FALSE);
    }

    @Override // defpackage.csuf
    public final void d(final ctyy ctyyVar, final cufj cufjVar) {
        if (!cufjVar.d().a()) {
            return;
        }
        ctog ctogVar = this.b;
        ctxm r = ctxn.r();
        r.g(37);
        r.n(ctyyVar.b().e());
        r.o(ctyyVar.c().J());
        r.c(cufjVar.a());
        ctogVar.b(r.a());
        dehn c = this.a.c(new csvn(this.i, cufjVar.d().b()));
        deha.q(c, new csxu(this, ctyyVar, cufjVar), dege.a);
        deew.h(c, new dbrn(this, cufjVar, ctyyVar) { // from class: csxr
            private final csxv a;
            private final cufj b;
            private final ctyy c;

            {
                this.a = this;
                this.b = cufjVar;
                this.c = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cufj a;
                csxv csxvVar = this.a;
                cufj cufjVar2 = this.b;
                ctyy ctyyVar2 = this.c;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    cufi m = cufjVar2.m();
                    m.h(false);
                    m.f(bitmap);
                    a = m.a();
                    ctog ctogVar2 = csxvVar.b;
                    ctxm r2 = ctxn.r();
                    r2.g(38);
                    r2.n(ctyyVar2.b().e());
                    r2.o(ctyyVar2.c().J());
                    r2.c(cufjVar2.a());
                    ctogVar2.b(r2.a());
                } else {
                    cufi m2 = cufjVar2.m();
                    m2.h(true);
                    a = m2.a();
                    ctog ctogVar3 = csxvVar.b;
                    ctxm r3 = ctxn.r();
                    r3.g(39);
                    r3.n(ctyyVar2.b().e());
                    r3.o(ctyyVar2.c().J());
                    r3.c(cufjVar2.a());
                    ctogVar3.b(r3.a());
                }
                csxvVar.f(ctyyVar2).ar(a);
                return a;
            }
        }, dege.a);
    }

    public final cuss<cufj> e(final ctyy ctyyVar, final ContactId contactId, final dbsl<cufj> dbslVar) {
        return cusl.d(f(ctyyVar).u(contactId), new dbrn(this, contactId, dbslVar, ctyyVar) { // from class: csxm
            private final csxv a;
            private final ContactId b;
            private final dbsl c;
            private final ctyy d;

            {
                this.a = this;
                this.b = contactId;
                this.c = dbslVar;
                this.d = ctyyVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final csxv csxvVar = this.a;
                final ContactId contactId2 = this.b;
                dbsl dbslVar2 = this.c;
                final ctyy ctyyVar2 = this.d;
                dbsg dbsgVar = (dbsg) obj;
                if (!dbsgVar.a()) {
                    cufi n = cufj.n();
                    n.c(contactId2);
                    n.e(-1L);
                    n.j(dcdc.e());
                    n.m(dcdc.e());
                    dbsgVar = dbsg.i(n.a());
                }
                boolean a = dbslVar2.a((cufj) dbsgVar.b());
                final cufj cufjVar = (cufj) dbsgVar.b();
                final dehn<cufj> dehnVar = null;
                if (a) {
                    synchronized (csxvVar.c) {
                        dehnVar = csxvVar.f.get(Pair.create(ctyyVar2, contactId2));
                        if (dehnVar != null && !dehnVar.isDone()) {
                            cstl.a("LitContactCtrlr");
                        }
                        ctmm c = ctmn.c();
                        ((ctmh) c).a = "sync contact profile";
                        c.b(ctmr.c);
                        final ctmn a2 = c.a();
                        final dehn f = deha.f(new deff(csxvVar, ctyyVar2, cufjVar, a2) { // from class: csxn
                            private final csxv a;
                            private final ctyy b;
                            private final cufj c;
                            private final ctmn d;

                            {
                                this.a = csxvVar;
                                this.b = ctyyVar2;
                                this.c = cufjVar;
                                this.d = a2;
                            }

                            @Override // defpackage.deff
                            public final dehn a() {
                                csxv csxvVar2 = this.a;
                                ctyy ctyyVar3 = this.b;
                                cufj cufjVar2 = this.c;
                                ctmn ctmnVar = this.d;
                                cttq cttqVar = csxvVar2.h;
                                return cttqVar.a.a(UUID.randomUUID(), new ctwb(cttqVar.b, ctyyVar3, cufjVar2.a()), cttqVar.a.d.d(), ctyyVar3, ctmnVar, true);
                            }
                        }, csxvVar.a);
                        dehnVar = deew.h(deha.k(f).b(new Callable(csxvVar, ctyyVar2, cufjVar, f) { // from class: csxo
                            private final csxv a;
                            private final ctyy b;
                            private final cufj c;
                            private final dehn d;

                            {
                                this.a = csxvVar;
                                this.b = ctyyVar2;
                                this.c = cufjVar;
                                this.d = f;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                byte[] b;
                                int length;
                                csxv csxvVar2 = this.a;
                                ctyy ctyyVar3 = this.b;
                                cufj cufjVar2 = this.c;
                                dehn dehnVar2 = this.d;
                                long v = dxzy.v();
                                int w = (int) dxzy.w();
                                ctfh ctfhVar = (ctfh) deha.r(dehnVar2);
                                cstd.a();
                                long currentTimeMillis = System.currentTimeMillis() + csxvVar2.e.nextInt(w) + v;
                                int b2 = ctfhVar.b();
                                int i = b2 - 1;
                                if (b2 != 0) {
                                    if (i != 1) {
                                        if (i == 2) {
                                            cstl.a("LitContactCtrlr");
                                            cufi m = cufjVar2.m();
                                            cstd.a();
                                            m.e(Long.valueOf(System.currentTimeMillis() + csxvVar2.e.nextInt(w)));
                                            cufj a3 = m.a();
                                            csxvVar2.f(ctyyVar3).ar(a3);
                                            return a3;
                                        }
                                        cstl.a("LitContactCtrlr");
                                        cufi m2 = cufjVar2.m();
                                        m2.e(Long.valueOf(currentTimeMillis));
                                        return m2.a();
                                    } else if (!ctfhVar.a().a()) {
                                        cstl.a("LitContactCtrlr");
                                        return cufjVar2;
                                    } else {
                                        final cufi n2 = cufj.n();
                                        n2.c(cufjVar2.a());
                                        n2.k(ctfhVar.a().b().a());
                                        n2.e(Long.valueOf(currentTimeMillis));
                                        n2.j(ctfhVar.a().b().h());
                                        n2.m(ctfhVar.a().b().i());
                                        if (ctfhVar.a().b().b().a()) {
                                            n2.b(ctfhVar.a().b().b().b());
                                        }
                                        if (ctfhVar.a().b().j().a()) {
                                            n2.i(ctfhVar.a().b().j().b());
                                        }
                                        if (ctfhVar.a().b().c().a()) {
                                            n2.g(ctfhVar.a().b().c().b());
                                            dbsg<Bitmap> e = cufjVar2.e();
                                            n2.getClass();
                                            cstn.a(e, new mw(n2) { // from class: csxq
                                                private final cufi a;

                                                {
                                                    this.a = n2;
                                                }

                                                @Override // defpackage.mw
                                                public final void a(Object obj2) {
                                                    this.a.f((Bitmap) obj2);
                                                }
                                            });
                                            if (!cufjVar2.d().equals(ctfhVar.a().b().c())) {
                                                n2.h(true);
                                            }
                                        } else if (ctfhVar.a().b().d().a() && (length = (b = ctfhVar.a().b().d().b()).length) > 0) {
                                            n2.f(BitmapFactory.decodeByteArray(b, 0, length));
                                        }
                                        dbsg<cufx> k = ctfhVar.a().b().k();
                                        if (k.a()) {
                                            n2.d(k.b());
                                        }
                                        cufj a4 = n2.a();
                                        csxvVar2.f(ctyyVar3).ar(a4);
                                        return a4;
                                    }
                                }
                                throw null;
                            }
                        }, dege.a), new dbrn(csxvVar, cufjVar, ctyyVar2) { // from class: csxp
                            private final csxv a;
                            private final cufj b;
                            private final ctyy c;

                            {
                                this.a = csxvVar;
                                this.b = cufjVar;
                                this.c = ctyyVar2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj2) {
                                csxv csxvVar2 = this.a;
                                cufj cufjVar2 = this.b;
                                ctyy ctyyVar3 = this.c;
                                cufj cufjVar3 = (cufj) obj2;
                                if (!cufjVar2.d().equals(cufjVar3.d()) || !cufjVar3.e().a()) {
                                    csxvVar2.d(ctyyVar3, cufjVar3);
                                }
                                return cufjVar3;
                            }
                        }, dege.a);
                        csxvVar.f.put(Pair.create(ctyyVar2, contactId2), dehnVar);
                    }
                } else if (cufjVar.f() && cufjVar.d().a()) {
                    synchronized (csxvVar.d) {
                        dehnVar = csxvVar.g.get(Pair.create(ctyyVar2, cufjVar.a()));
                        if (dehnVar != null && !dehnVar.isDone() && !dehnVar.isCancelled()) {
                            cstl.a("LitContactCtrlr");
                        }
                        dehnVar = csxvVar.a.c(new Callable(csxvVar, ctyyVar2, cufjVar) { // from class: csxs
                            private final csxv a;
                            private final ctyy b;
                            private final cufj c;

                            {
                                this.a = csxvVar;
                                this.b = ctyyVar2;
                                this.c = cufjVar;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                csxv csxvVar2 = this.a;
                                ctyy ctyyVar3 = this.b;
                                cufj cufjVar2 = this.c;
                                csxvVar2.d(ctyyVar3, cufjVar2);
                                return cufjVar2;
                            }
                        });
                        csxvVar.g.put(Pair.create(ctyyVar2, cufjVar.a()), dehnVar);
                    }
                }
                if (dehnVar != null) {
                    csxvVar.a.a(new Runnable(csxvVar, dehnVar, ctyyVar2, contactId2) { // from class: csxt
                        private final csxv a;
                        private final dehn b;
                        private final ctyy c;
                        private final ContactId d;

                        {
                            this.a = csxvVar;
                            this.b = dehnVar;
                            this.c = ctyyVar2;
                            this.d = contactId2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            csxv csxvVar2 = this.a;
                            dehn dehnVar2 = this.b;
                            ctyy ctyyVar3 = this.c;
                            ContactId contactId3 = this.d;
                            try {
                                cufj cufjVar2 = (cufj) dehnVar2.get();
                                synchronized (csxvVar2.c) {
                                    csxvVar2.f.remove(Pair.create(ctyyVar3, contactId3));
                                }
                            } catch (InterruptedException | ExecutionException unused) {
                                cstl.a("LitContactCtrlr");
                            }
                        }
                    });
                }
                return cufjVar;
            }
        });
    }

    public final cusm f(ctyy ctyyVar) {
        return this.j.a(ctyyVar);
    }
}

package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.concurrent.atomic.AtomicMarkableReference;
/* compiled from: PG */
/* renamed from: cncb  reason: default package */
/* loaded from: classes.dex */
public abstract class cncb implements cnab, cnjb {
    public final cnea a;
    final cnac b;
    public final Looper c;
    public final cncl d;
    public final AtomicMarkableReference<dcep<String>> e;
    public cnix f;
    private final cnem<cnei> g;
    private final cnem<cneh> h;

    /* JADX INFO: Access modifiers changed from: protected */
    public cncb(Looper looper) {
        cncl cnclVar = new cncl();
        this.g = new cnem<>(new cnek(this) { // from class: cnak
            private final cncb a;

            {
                this.a = this;
            }

            @Override // defpackage.cnek
            public final Object a() {
                dbsk.s(this.a.h());
                return new cnei();
            }
        }, new cnel() { // from class: cnao
            @Override // defpackage.cnel
            public final void a(Object obj) {
                ((cnei) obj).e();
            }
        });
        this.h = new cnem<>(new cnek(this) { // from class: cnar
            private final cncb a;

            {
                this.a = this;
            }

            @Override // defpackage.cnek
            public final Object a() {
                dbsk.s(this.a.h());
                return new cneh();
            }
        }, cnau.a);
        this.a = new cnea();
        this.e = new AtomicMarkableReference<>(null, false);
        this.f = new cnix(dbtb.a);
        this.c = looper;
        this.d = cnclVar;
        this.b = new cnca(this);
    }

    private final void s() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append('@');
        sb.append(hexString);
        sb.toString();
    }

    @Override // defpackage.cnab
    public final boolean a() {
        try {
            final cmxn h = h();
            cnix cnixVar = this.f;
            h.getClass();
            return ((Boolean) cnixVar.b(new cnjk(h) { // from class: cnaz
                private final cmxn a;

                {
                    this.a = h;
                }

                @Override // defpackage.cnjk, java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.a.g());
                }
            }, false)).booleanValue();
        } catch (RemoteException | IllegalStateException unused) {
            return false;
        }
    }

    @Override // defpackage.cnab
    public final CarInfo b() {
        return (CarInfo) this.f.f(new cnjk(this) { // from class: cnbo
            private final cncb a;

            {
                this.a = this;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                return this.a.h().e();
            }
        });
    }

    @Override // defpackage.cnab
    @Deprecated
    public final CarUiInfo c() {
        return k(CarDisplayId.a).a();
    }

    @Override // defpackage.cnab
    public final cmwv d() {
        return (cmwv) this.f.h(new cnjk(this) { // from class: cnay
            private final cncb a;

            {
                this.a = this;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                final cncb cncbVar = this.a;
                return (cnik) cncbVar.d.a(cnik.class, new cnck(cncbVar) { // from class: cnby
                    private final cncb a;

                    {
                        this.a = cncbVar;
                    }

                    @Override // defpackage.cnck
                    public final Object a() {
                        cncb cncbVar2 = this.a;
                        cmya s = cncbVar2.h().s();
                        dbsk.s(s);
                        return new cnik(s, cncbVar2.c);
                    }
                });
            }
        });
    }

    @Override // defpackage.cnab
    public final cnif e() {
        return (cnif) this.f.f(new cnjk(this) { // from class: cnax
            private final cncb a;

            {
                this.a = this;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                final cncb cncbVar = this.a;
                return (cnif) cncbVar.d.a(cnif.class, new cnck(cncbVar) { // from class: cnbz
                    private final cncb a;

                    {
                        this.a = cncbVar;
                    }

                    @Override // defpackage.cnck
                    public final Object a() {
                        cncb cncbVar2 = this.a;
                        cnif cnifVar = new cnif(cncbVar2.h().t(), cncbVar2.c);
                        cnifVar.d.e(cnifVar.a);
                        return cnifVar;
                    }
                });
            }
        });
    }

    @Override // defpackage.cnab
    public final void f(final Intent intent) {
        for (cmvv cmvvVar : cmvw.a.values()) {
        }
        this.f.g(new cnjl(this, intent) { // from class: cnat
            private final cncb a;
            private final Intent b;

            {
                this.a = this;
                this.b = intent;
            }

            @Override // defpackage.cnjl
            public final void a() {
                cncb cncbVar = this.a;
                Intent intent2 = this.b;
                if (cncbVar.h().j(intent2)) {
                    return;
                }
                String valueOf = String.valueOf(intent2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("No matching component for intent: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        });
    }

    @Override // defpackage.cnab
    public final void g(final byte[] bArr, int i) {
        cnix cnixVar = this.f;
        try {
            new cnjl(this, bArr, 59) { // from class: cnas
                private final cncb a;
                private final byte[] b;
                private final int c = 59;

                {
                    this.a = this;
                    this.b = bArr;
                }

                @Override // defpackage.cnjl
                public final void a() {
                    cncb cncbVar = this.a;
                    cncbVar.h().k(this.b, 58);
                }
            }.a();
        } catch (RemoteException e) {
            cnixVar.c(e);
            throw new RuntimeException("Exception was unexpectedly not rethrown!", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract cmxn h();

    public final void i() {
        if (cmwk.a("CAR.CLIENT", 3)) {
            s();
            int i = cnjc.a;
        }
        this.a.e(this.b);
        cnix cnixVar = this.f;
        try {
            new cnjl(this) { // from class: cnav
                private final cncb a;

                {
                    this.a = this;
                }

                @Override // defpackage.cnjl
                public final void a() {
                    cncb cncbVar = this.a;
                    cncbVar.h().h(cncbVar.a);
                }
            }.a();
        } catch (RemoteException e) {
            cnixVar.a(e);
        }
    }

    public final void j(cnac cnacVar) {
        this.a.e(cnacVar);
    }

    public final cnhz k(final CarDisplayId carDisplayId) {
        return (cnhz) this.f.f(new cnjk(this, carDisplayId) { // from class: cnbx
            private final cncb a;
            private final CarDisplayId b;

            {
                this.a = this;
                this.b = carDisplayId;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                return this.a.m(this.b);
            }
        });
    }

    @Override // defpackage.cnjb
    public final boolean l(final cniz cnizVar) {
        cnix cnixVar = this.f;
        cnjk cnjkVar = new cnjk(this, cnizVar) { // from class: cnap
            private final cncb a;
            private final cniz b;

            {
                this.a = this;
                this.b = cnizVar;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                cncb cncbVar = this.a;
                cniz cnizVar2 = this.b;
                cmxn h = cncbVar.h();
                String str = cnizVar2.f;
                boolean z = cnizVar2.g;
                return Boolean.valueOf(h.p(str));
            }
        };
        boolean z = cnizVar.g;
        return ((Boolean) cnixVar.b(cnjkVar, false)).booleanValue();
    }

    public final cnhz m(final CarDisplayId carDisplayId) {
        Object obj;
        dcep<String> reference = this.e.getReference();
        if (reference == null) {
            int i = cnjc.a;
            cnix cnixVar = this.f;
            try {
                obj = new cnjk(this) { // from class: cnal
                    private final cncb a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.cnjk, java.util.concurrent.Callable
                    public final Object call() {
                        return dcep.K(this.a.h().r(dcdc.e()));
                    }
                }.call();
            } catch (RemoteException e) {
                cnixVar.a(e);
                obj = null;
            }
            reference = (dcep) obj;
            if (reference != null) {
                reference.isEmpty();
                this.e.compareAndSet(null, reference, true, true);
            }
            dbsk.m(CarDisplayId.a.equals(carDisplayId), "LegacyCarDisplayInfoProvider should be used only for the primary car display.");
            return (cnhz) this.d.a(cndm.class, new cnck(this) { // from class: cnbc
                private final cncb a;

                {
                    this.a = this;
                }

                @Override // defpackage.cnck
                public final Object a() {
                    final cncb cncbVar = this.a;
                    return new cndm(new cnbu(cncbVar), new dzsj(cncbVar) { // from class: cnbv
                        private final cncb a;

                        {
                            this.a = cncbVar;
                        }

                        @Override // defpackage.dzsj
                        public final Object a() {
                            return this.a.f;
                        }
                    });
                }
            });
        }
        if (reference.contains("MULTI_DISPLAY")) {
            return (cnhz) this.d.c(cndx.class, carDisplayId.a(), new cnck(this, carDisplayId) { // from class: cnbb
                private final cncb a;
                private final CarDisplayId b;

                {
                    this.a = this;
                    this.b = carDisplayId;
                }

                @Override // defpackage.cnck
                public final Object a() {
                    final cncb cncbVar = this.a;
                    return new cndx(new cnbd(cncbVar, this.b), new dzsj(cncbVar) { // from class: cnbe
                        private final cncb a;

                        {
                            this.a = cncbVar;
                        }

                        @Override // defpackage.dzsj
                        public final Object a() {
                            return this.a.f;
                        }
                    });
                }
            });
        }
        dbsk.m(CarDisplayId.a.equals(carDisplayId), "LegacyCarDisplayInfoProvider should be used only for the primary car display.");
        return (cnhz) this.d.a(cndm.class, new cnck(this) { // from class: cnbc
            private final cncb a;

            {
                this.a = this;
            }

            @Override // defpackage.cnck
            public final Object a() {
                final cncb cncbVar = this.a;
                return new cndm(new cnbu(cncbVar), new dzsj(cncbVar) { // from class: cnbv
                    private final cncb a;

                    {
                        this.a = cncbVar;
                    }

                    @Override // defpackage.dzsj
                    public final Object a() {
                        return this.a.f;
                    }
                });
            }
        });
    }

    public void n() {
        if (cmwk.a("CAR.CLIENT", 3)) {
            s();
            int i = cnjc.a;
        }
        this.a.f(this.b);
        this.a.c();
        this.a.g();
        o();
        try {
            h().i(this.a);
        } catch (RemoteException | IllegalStateException unused) {
        }
        this.e.set(null, false);
        this.d.d(cmwi.class, cnbf.a);
        this.d.e(cner.class);
    }

    public final void o() {
        if (cmwk.a("CAR.CLIENT", 3)) {
            s();
            int i = cnjc.a;
        }
        p();
        this.g.c();
        cnem<cneh> cnemVar = this.h;
        if (cnemVar != null) {
            cnemVar.c();
        }
        this.e.compareAndSet(null, null, true, false);
    }

    protected final void p() {
        if (cmwk.a("CAR.CLIENT", 3)) {
            s();
            int i = cnjc.a;
        }
        this.d.d(cnhv.class, cnbg.a);
        this.d.d(cneq.class, cnbh.a);
        this.d.d(cnhw.class, cnbi.a);
        this.d.d(cmwa.class, cnbj.a);
        this.d.d(cmwl.class, cnbk.a);
        this.d.d(cnif.class, cnbl.a);
        this.d.d(cnig.class, cnbm.a);
        this.d.d(cmwo.class, cnbn.a);
        this.d.d(cnik.class, cnbp.a);
        this.d.d(cnev.class, cnbq.a);
        this.d.d(cndm.class, cnbr.a);
        this.d.f(cnjm.class, cnbs.a);
        this.d.g(cnil.class);
        this.d.f(cndx.class, cnbt.a);
        try {
            this.d.g(cnhy.class);
        } catch (NoClassDefFoundError unused) {
            int i2 = cnjc.a;
        }
    }

    public final boolean q(final String str) {
        return ((Boolean) this.f.d(new cnjk(this, str) { // from class: cnam
            private final cncb a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                cncb cncbVar = this.a;
                return Boolean.valueOf(cncbVar.h().o(this.b));
            }
        })).booleanValue();
    }

    public final int r(final String str) {
        return ((Integer) this.f.d(new cnjk(this, str) { // from class: cnan
            private final cncb a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                cncb cncbVar = this.a;
                return Integer.valueOf(cncbVar.h().q(this.b));
            }
        })).intValue();
    }
}

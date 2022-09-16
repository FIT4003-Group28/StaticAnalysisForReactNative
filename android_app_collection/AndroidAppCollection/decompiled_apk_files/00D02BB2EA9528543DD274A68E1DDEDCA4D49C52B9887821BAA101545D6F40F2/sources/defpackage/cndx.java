package defpackage;

import com.google.android.gms.car.CarUiInfo;
/* compiled from: PG */
/* renamed from: cndx  reason: default package */
/* loaded from: classes5.dex */
public final class cndx implements cnhz {
    public final cnem<cneg> a = new cnem<>(new cnek(this) { // from class: cndn
        private final cndx a;

        {
            this.a = this;
        }

        @Override // defpackage.cnek
        public final Object a() {
            cndx cndxVar = this.a;
            cneg cnegVar = new cneg();
            cnew a = cndxVar.d.a();
            dbsk.s(a);
            a.f(cnegVar);
            return cnegVar;
        }
    }, new cnel(this) { // from class: cndq
        private final cndx a;

        {
            this.a = this;
        }

        @Override // defpackage.cnel
        public final void a(Object obj) {
            cneg cnegVar = (cneg) obj;
            cnew a = this.a.d.a();
            if (a != null) {
                a.g(cnegVar);
            }
            cnegVar.c();
        }
    });
    public final cnem<cnec> b = new cnem<>(new cnek(this) { // from class: cndr
        private final cndx a;

        {
            this.a = this;
        }

        @Override // defpackage.cnek
        public final Object a() {
            cndx cndxVar = this.a;
            cnec cnecVar = new cnec();
            cnew a = cndxVar.d.a();
            dbsk.s(a);
            a.h(cnecVar);
            return cnecVar;
        }
    }, new cnel(this) { // from class: cnds
        private final cndx a;

        {
            this.a = this;
        }

        @Override // defpackage.cnel
        public final void a(Object obj) {
            cnec cnecVar = (cnec) obj;
            cnew a = this.a.d.a();
            if (a != null) {
                a.i(cnecVar);
            }
            cnecVar.c();
        }
    });
    public final cnem<cnee> c = new cnem<>(new cnek(this) { // from class: cndt
        private final cndx a;

        {
            this.a = this;
        }

        @Override // defpackage.cnek
        public final Object a() {
            cndx cndxVar = this.a;
            cnee cneeVar = new cnee();
            cnew a = cndxVar.d.a();
            dbsk.s(a);
            a.j(cneeVar);
            return cneeVar;
        }
    }, new cnel(this) { // from class: cndu
        private final cndx a;

        {
            this.a = this;
        }

        @Override // defpackage.cnel
        public final void a(Object obj) {
            cnee cneeVar = (cnee) obj;
            cnew a = this.a.d.a();
            if (a != null) {
                a.k(cneeVar);
            }
            cneeVar.c();
        }
    });
    public final cnbd d;
    private final dzsj<cnix> e;

    public cndx(cnbd cnbdVar, dzsj dzsjVar) {
        this.d = cnbdVar;
        this.e = dzsjVar;
    }

    @Override // defpackage.cnhz
    public final CarUiInfo a() {
        return (CarUiInfo) this.e.a().f(new cnjk(this) { // from class: cndv
            private final cndx a;

            {
                this.a = this;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                cnew a = this.a.d.a();
                dbsk.s(a);
                return a.e();
            }
        });
    }

    @Override // defpackage.cnhz
    public final void b(final cngq cngqVar) {
        this.e.a().g(new cnjl(this, cngqVar) { // from class: cndw
            private final cndx a;
            private final cngq b;

            {
                this.a = this;
                this.b = cngqVar;
            }

            @Override // defpackage.cnjl
            public final void a() {
                this.a.a.a(new cnel(this.b) { // from class: cndp
                    private final cngq a;

                    {
                        this.a = r1;
                    }

                    @Override // defpackage.cnel
                    public final void a(Object obj) {
                        ((cneg) obj).d(this.a);
                    }
                });
            }
        });
    }

    @Override // defpackage.cnhz
    public final void c(final cngq cngqVar) {
        this.a.b(new cnej(cngqVar) { // from class: cndo
            private final cngq a;

            {
                this.a = cngqVar;
            }

            @Override // defpackage.cnej
            public final void a(Object obj) {
                ((cneg) obj).e(this.a);
            }
        });
    }
}

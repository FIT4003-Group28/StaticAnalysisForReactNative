package defpackage;

import com.google.android.gms.car.CarUiInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cndm  reason: default package */
/* loaded from: classes5.dex */
public final class cndm implements cnhz {
    public final cnem<cneg> a = new cnem<>(new cnek(this) { // from class: cndg
        private final cndm a;

        {
            this.a = this;
        }

        @Override // defpackage.cnek
        public final Object a() {
            cndm cndmVar = this.a;
            cneg cnegVar = new cneg();
            cndmVar.b.a().l(cnegVar);
            return cnegVar;
        }
    }, new cnel(this) { // from class: cndh
        private final cndm a;

        {
            this.a = this;
        }

        @Override // defpackage.cnel
        public final void a(Object obj) {
            cneg cnegVar = (cneg) obj;
            cmxn a = this.a.b.a();
            if (a != null) {
                a.m(cnegVar);
            }
            cnegVar.c();
        }
    });
    public final cnbu b;
    private final dzsj<cnix> c;

    public cndm(cnbu cnbuVar, dzsj dzsjVar) {
        this.b = cnbuVar;
        this.c = dzsjVar;
    }

    @Override // defpackage.cnhz
    public final CarUiInfo a() {
        return (CarUiInfo) this.c.a().f(new cnjk(this) { // from class: cndi
            private final cndm a;

            {
                this.a = this;
            }

            @Override // defpackage.cnjk, java.util.concurrent.Callable
            public final Object call() {
                return this.a.b.a().f();
            }
        });
    }

    @Override // defpackage.cnhz
    public final void b(final cngq cngqVar) {
        this.c.a().g(new cnjl(this, cngqVar) { // from class: cndj
            private final cndm a;
            private final cngq b;

            {
                this.a = this;
                this.b = cngqVar;
            }

            @Override // defpackage.cnjl
            public final void a() {
                cndm cndmVar = this.a;
                final cngq cngqVar2 = this.b;
                cndmVar.a.a(new cnel(cngqVar2) { // from class: cndl
                    private final cngq a;

                    {
                        this.a = cngqVar2;
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
        this.a.b(new cnej(cngqVar) { // from class: cndk
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

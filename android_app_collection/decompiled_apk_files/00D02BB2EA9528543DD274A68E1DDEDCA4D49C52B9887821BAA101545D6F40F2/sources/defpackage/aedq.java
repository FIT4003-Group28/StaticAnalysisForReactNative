package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aedq  reason: default package */
/* loaded from: classes2.dex */
public final class aedq implements aeck {
    public boolean a;
    public boolean b;
    public boolean c;
    private final afzu d;
    private final afzt e;
    private final dxio<apyz> f;
    private final crzp<Integer> g;
    private final bvqg<auql> h;
    private final Executor i;
    private final aecm j;
    private final boolean k;
    private final auql l;

    public aedq(final dxio dxioVar, afzu afzuVar, dxio dxioVar2, auql auqlVar, auom auomVar, final Executor executor, Executor executor2, aecm aecmVar) {
        this.j = aecmVar;
        this.d = afzuVar;
        this.e = new afzt(this, executor, dxioVar) { // from class: aedk
            private final aedq a;
            private final Executor b;
            private final dxio c;

            {
                this.a = this;
                this.b = executor;
                this.c = dxioVar;
            }

            @Override // defpackage.afzt
            public final void a(final afzu afzuVar2) {
                final aedq aedqVar = this.a;
                Executor executor3 = this.b;
                final dxio dxioVar3 = this.c;
                executor3.execute(new Runnable(aedqVar, dxioVar3, afzuVar2) { // from class: aedp
                    private final aedq a;
                    private final dxio b;
                    private final afzu c;

                    {
                        this.a = aedqVar;
                        this.b = dxioVar3;
                        this.c = afzuVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aedq aedqVar2 = this.a;
                        aedqVar2.a = this.c.b(((akfa) this.b.a()).j());
                        aedqVar2.d();
                    }
                });
            }
        };
        this.k = auomVar.b;
        this.l = auqlVar;
        this.h = new bvqg(this, executor) { // from class: aedl
            private final aedq a;
            private final Executor b;

            {
                this.a = this;
                this.b = executor;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                final aedq aedqVar = this.a;
                final auql auqlVar2 = (auql) obj;
                this.b.execute(new Runnable(aedqVar, auqlVar2) { // from class: aedo
                    private final aedq a;
                    private final auql b;

                    {
                        this.a = aedqVar;
                        this.b = auqlVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aedq aedqVar2 = this.a;
                        aedqVar2.b = this.b.c();
                        aedqVar2.d();
                    }
                });
            }
        };
        this.f = dxioVar2;
        this.g = new crzp(this, executor) { // from class: aedm
            private final aedq a;
            private final Executor b;

            {
                this.a = this;
                this.b = executor;
            }

            @Override // defpackage.crzp
            public final void On(final crzm crzmVar) {
                final aedq aedqVar = this.a;
                this.b.execute(new Runnable(aedqVar, crzmVar) { // from class: aedn
                    private final aedq a;
                    private final crzm b;

                    {
                        this.a = aedqVar;
                        this.b = crzmVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aedq aedqVar2 = this.a;
                        crzm crzmVar2 = this.b;
                        boolean z = false;
                        if (crzmVar2.l() != null) {
                            Integer num = (Integer) crzmVar2.l();
                            dbsk.s(num);
                            if (num.intValue() > 0) {
                                z = true;
                            }
                        }
                        aedqVar2.c = z;
                        aedqVar2.d();
                    }
                });
            }
        };
        this.i = executor2;
    }

    @Override // defpackage.aeck
    public final String a() {
        return "updates";
    }

    @Override // defpackage.aeck
    public final void b() {
        this.d.d(this.e);
        this.f.a().r().d(this.g, this.i);
        if (this.k) {
            this.l.a(this.h);
        }
    }

    @Override // defpackage.aeck
    public final void c() {
        this.d.e(this.e);
        this.f.a().r().c(this.g);
        if (this.k) {
            this.l.b(this.h);
        }
    }

    public final void d() {
        aecm aecmVar = this.j;
        dktk dktkVar = dktk.UPDATES;
        boolean z = true;
        if (!this.a && !this.b && !this.c) {
            z = false;
        }
        aecmVar.b(dktkVar, z);
    }
}

package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajln  reason: default package */
/* loaded from: classes2.dex */
public class ajln {
    public final dxio<ckcw> a;
    public final ajzn b;
    public final ajsj c;
    private final Executor d;
    private final dxio<cjnx> e;

    public ajln(Executor executor, dxio<ckcw> dxioVar, ajzn ajznVar, dxio<cjnx> dxioVar2, ajsj ajsjVar) {
        this.d = executor;
        this.a = dxioVar;
        this.b = ajznVar;
        this.e = dxioVar2;
        this.c = ajsjVar;
    }

    public final void a(btlu btluVar, final ckgz ckgzVar) {
        final dehn<cora> i = this.e.a().i(btluVar);
        i.Pk(new Runnable(this, i, ckgzVar) { // from class: ajll
            private final ajln a;
            private final dehn b;
            private final ckgz c;

            {
                this.a = this;
                this.b = i;
                this.c = ckgzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajln ajlnVar = this.a;
                dehn dehnVar = this.b;
                ckgz ckgzVar2 = this.c;
                cora coraVar = (cora) deha.s(dehnVar);
                int i2 = 1;
                if (coraVar != null) {
                    boolean z = !ajlnVar.b.b();
                    boolean z2 = !coraVar.e();
                    boolean z3 = !coraVar.c();
                    boolean z4 = !ajlnVar.b.c();
                    boolean z5 = !coraVar.g();
                    boolean z6 = !coraVar.f();
                    if (z && z2 && z3 && z4 && z5) {
                        if (z6) {
                            i2 = 65;
                        } else {
                            z6 = false;
                        }
                    }
                    i2 = (!z2 || !z3 || !z4 || !z5 || !z6) ? (!z || !z3 || !z4 || !z5 || !z6) ? (!z || !z2 || !z4 || !z5 || !z6) ? (!z || !z2 || !z3 || !z5 || !z6) ? (!z || !z2 || !z3 || !z4 || !z6) ? (!z || !z2 || !z3 || !z4 || !z5) ? (!z3 || !z4 || !z5 || !z6) ? (!z2 || !z4 || !z5 || !z6) ? (!z || !z4 || !z5 || !z6) ? (!z2 || !z3 || !z5 || !z6) ? (!z || !z3 || !z5 || !z6) ? (!z || !z2 || !z5 || !z6) ? (!z2 || !z3 || !z4 || !z6) ? (!z || !z3 || !z4 || !z6) ? (!z || !z2 || !z4 || !z6) ? (!z || !z2 || !z3 || !z6) ? (!z2 || !z3 || !z4 || !z5) ? (!z || !z3 || !z4 || !z5) ? (!z || !z2 || !z4 || !z5) ? (!z || !z2 || !z3 || !z5) ? (!z || !z2 || !z3 || !z4) ? (!z4 || !z5 || !z6) ? (!z3 || !z5 || !z6) ? (!z2 || !z5 || !z6) ? (!z || !z5 || !z6) ? (!z3 || !z4 || !z6) ? (!z2 || !z4 || !z6) ? (!z || !z4 || !z6) ? (!z2 || !z3 || !z6) ? (!z || !z3 || !z6) ? (!z || !z2 || !z6) ? (!z3 || !z4 || !z5) ? (!z2 || !z4 || !z5) ? (!z || !z4 || !z5) ? (!z2 || !z3 || !z5) ? (!z || !z3 || !z5) ? (!z || !z2 || !z5) ? (!z2 || !z3 || !z4) ? (!z || !z3 || !z4) ? (!z || !z2 || !z4) ? (!z || !z2 || !z3) ? (!z5 || !z6) ? (!z4 || !z6) ? (!z3 || !z6) ? (!z2 || !z6) ? (!z || !z6) ? (!z4 || !z5) ? (!z3 || !z5) ? (!z2 || !z5) ? (!z || !z5) ? (!z3 || !z4) ? (!z2 || !z4) ? (!z || !z4) ? (!z2 || !z3) ? (!z || !z3) ? (!z || !z2) ? z6 ? 19 : z5 ? 18 : z4 ? 6 : z3 ? 5 : z2 ? 4 : z ? 3 : 2 : 7 : 8 : 10 : 9 : 11 : 12 : 20 : 21 : 22 : 23 : 24 : 25 : 26 : 27 : 28 : 13 : 14 : 15 : 16 : 29 : 30 : 31 : 32 : 33 : 34 : 35 : 36 : 37 : 38 : 39 : 40 : 41 : 42 : 43 : 44 : 17 : 45 : 46 : 47 : 48 : 49 : 50 : 51 : 52 : 53 : 54 : 55 : 56 : 57 : 58 : 59 : 60 : 61 : 62 : 63 : 64;
                }
                ((ckco) ajlnVar.a.a().a(ckgzVar2)).a(ckga.a(i2));
            }
        }, this.d);
    }

    public final void b(final String str, final ckgz ckgzVar) {
        this.d.execute(new Runnable(this, str, ckgzVar) { // from class: ajlm
            private final ajln a;
            private final String b;
            private final ckgz c;

            {
                this.a = this;
                this.b = str;
                this.c = ckgzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajln ajlnVar = this.a;
                String str2 = this.b;
                ckgz ckgzVar2 = this.c;
                dbsg<btlu> h = ajlnVar.c.h(str2);
                if (h.a()) {
                    ajlnVar.a(h.b(), ckgzVar2);
                } else {
                    ((ckco) ajlnVar.a.a().a(ckgzVar2)).a(ckga.a(1));
                }
            }
        });
    }
}

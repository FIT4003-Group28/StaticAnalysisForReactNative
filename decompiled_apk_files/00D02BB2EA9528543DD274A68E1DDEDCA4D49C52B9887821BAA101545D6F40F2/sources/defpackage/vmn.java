package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vmn  reason: default package */
/* loaded from: classes7.dex */
public final class vmn implements avie, avia {
    public final deig<Boolean> a = deig.d();
    public final akrk b;
    @dzsi
    public avib c;
    final /* synthetic */ vmo d;

    public vmn(vmo vmoVar, akrk akrkVar) {
        this.d = vmoVar;
        this.b = akrkVar;
    }

    @Override // defpackage.avie
    public final void a(boolean z) {
        if (z) {
            d(false);
            return;
        }
        final crzm<avkr> C = this.d.a.C();
        C.j().Pk(new Runnable(this, C) { // from class: vmm
            private final vmn a;
            private final crzm b;

            {
                this.a = this;
                this.b = C;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
                r6 = r6 + 1;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r14 = this;
                    vmn r0 = r14.a
                    crzm r1 = r14.b
                    java.lang.Object r1 = r1.l()
                    avkr r1 = (defpackage.avkr) r1
                    r2 = 0
                    if (r1 != 0) goto L11
                    r0.d(r2)
                    return
                L11:
                    dcdn r1 = r1.c()
                    dccr r1 = r1.values()
                    java.util.ArrayList r3 = new java.util.ArrayList
                    int r4 = r1.size()
                    r3.<init>(r4)
                    java.util.Iterator r1 = r1.iterator()
                L26:
                    boolean r4 = r1.hasNext()
                    if (r4 == 0) goto L95
                    java.lang.Object r4 = r1.next()
                    dltm r4 = (defpackage.dltm) r4
                    vmo r5 = r0.d
                    avzm r5 = r5.b
                    dlug r4 = r4.c
                    if (r4 != 0) goto L3c
                    dlug r4 = defpackage.dlug.c
                L3c:
                    avzl r4 = r5.a(r4)
                    dcdc r4 = r4.b()
                    int r5 = r4.size()
                    r6 = 0
                L49:
                    if (r6 >= r5) goto L26
                    java.lang.Object r7 = r4.get(r6)
                    akqs r7 = (defpackage.akqs) r7
                    akqq r8 = r7.b
                    double r8 = r8.b
                    akqq r10 = r7.a
                    double r11 = r10.b
                    int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                    if (r13 < 0) goto L71
                    akrp r8 = new akrp
                    akra r9 = defpackage.akqg.a(r10)
                    akqq r7 = r7.b
                    akra r7 = defpackage.akqg.a(r7)
                    r8.<init>(r9, r7)
                    aksj r7 = defpackage.aksj.c(r8)
                    goto L8f
                L71:
                    akrp r8 = new akrp
                    akra r9 = defpackage.akqg.a(r10)
                    akqq r7 = r7.b
                    akra r7 = defpackage.akqg.a(r7)
                    akra r10 = new akra
                    r11 = 1073741824(0x40000000, float:2.0)
                    r10.<init>(r11, r2)
                    akra r7 = r7.C(r10)
                    r8.<init>(r9, r7)
                    aksj r7 = defpackage.aksj.c(r8)
                L8f:
                    r3.add(r7)
                    int r6 = r6 + 1
                    goto L49
                L95:
                    akrk r1 = r0.b
                    int r4 = r1.l()
                    r5 = 1
                    r6 = 1
                L9d:
                    if (r6 >= r4) goto Lf7
                    int r7 = r6 + (-1)
                    akra r7 = r1.m(r7)
                    akra r8 = r1.m(r6)
                    r9 = 0
                Laa:
                    int r10 = r3.size()
                    if (r9 >= r10) goto Lce
                    java.lang.Object r10 = r3.get(r9)
                    aksj r10 = (defpackage.aksj) r10
                    boolean r10 = r10.j(r7)
                    if (r10 == 0) goto Lcb
                    java.lang.Object r10 = r3.get(r9)
                    aksj r10 = (defpackage.aksj) r10
                    boolean r10 = r10.j(r8)
                    if (r10 == 0) goto Lcb
                    int r6 = r6 + 1
                    goto L9d
                Lcb:
                    int r9 = r9 + 1
                    goto Laa
                Lce:
                    akrk r1 = r0.b
                    akrp r1 = r1.a()
                    aksj r1 = defpackage.aksj.c(r1)
                    r2 = 4607632778762754458(0x3ff199999999999a, double:1.1)
                    aksj r1 = r1.l(r2, r2)
                    akqs r1 = defpackage.akqg.d(r1)
                    vmo r2 = r0.d
                    awby r2 = r2.d
                    r3 = 1065353216(0x3f800000, float:1.0)
                    avib r1 = r2.a(r1, r3, r0, r5)
                    r0.c = r1
                    avib r0 = r0.c
                    r0.g()
                    return
                Lf7:
                    r0.d(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.vmm.run():void");
            }
        }, this.d.c);
    }

    @Override // defpackage.avia
    public final void b() {
        avib avibVar = this.c;
        dbsk.s(avibVar);
        d(avibVar.b());
    }

    @Override // defpackage.avia
    public final void c() {
        d(false);
    }

    public final void d(boolean z) {
        this.a.j(Boolean.valueOf(z));
    }
}

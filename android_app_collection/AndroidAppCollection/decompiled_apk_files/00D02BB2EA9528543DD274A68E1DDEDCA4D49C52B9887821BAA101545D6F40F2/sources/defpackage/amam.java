package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amam  reason: default package */
/* loaded from: classes2.dex */
public final class amam implements Runnable {
    final /* synthetic */ ambs a;
    final /* synthetic */ amaw b;

    public amam(amaw amawVar, ambs ambsVar) {
        this.b = amawVar;
        this.a = ambsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dmxx dmxxVar;
        alyh alyhVar;
        int i;
        final alyh alyhVar2;
        amam amamVar = this;
        amamVar.b.f.e();
        final amaw amawVar = amamVar.b;
        List<dmxx> list = amamVar.a.c;
        if (list != null) {
            if (amawVar.h.equals(akry.PERSONALIZED_SMARTMAPS)) {
                amby ambyVar = amawVar.v;
                amcl amclVar = ambyVar.b;
                final amci amciVar = ambyVar.c;
                if (amciVar != null) {
                    int i2 = 0;
                    for (dmxx dmxxVar2 : list) {
                        i2 += dmxxVar2.c.size();
                    }
                    int[] iArr = new int[i2 * 3];
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < list.size()) {
                        dmxx dmxxVar3 = list.get(i3);
                        drsu drsuVar = dmxxVar3.a;
                        if (drsuVar == null) {
                            drsuVar = drsu.e;
                        }
                        alyh alyhVar3 = new alyh(drsuVar.b, drsuVar.c, drsuVar.d);
                        int size = dmxxVar3.c.size();
                        if (size > 0) {
                            int i5 = dmxxVar3.b;
                            int i6 = size / i5;
                            for (int i7 = 0; i7 < i6; i7++) {
                                int i8 = 0;
                                while (i8 < i5) {
                                    List<dmxx> list2 = list;
                                    int i9 = i6;
                                    alyh alyhVar4 = new alyh(alyhVar3.a, alyhVar3.b + i8, alyhVar3.c + i7);
                                    final int f = dmxxVar3.c.f((i7 * i5) + i8);
                                    if (f != -1) {
                                        dmxxVar = dmxxVar3;
                                        alyhVar = alyhVar3;
                                        i = i5;
                                        alyhVar2 = alyhVar4;
                                        alyg y = amawVar.y(amclVar, alyhVar2);
                                        if (y != null) {
                                            amze c = y.c();
                                            dsqp dsqpVar = (dsqp) c.cu(5);
                                            dsqpVar.bC(c);
                                            amzd amzdVar = (amzd) dsqpVar;
                                            long a = amawVar.c.a(amawVar.h, amawVar.f);
                                            if (amzdVar.c) {
                                                amzdVar.bF();
                                                amzdVar.c = false;
                                            }
                                            amze amzeVar = (amze) amzdVar.b;
                                            amze amzeVar2 = amze.o;
                                            int i10 = amzeVar.a | 64;
                                            amzeVar.a = i10;
                                            amzeVar.h = a;
                                            amzeVar.a = i10 | 16;
                                            amzeVar.f = f;
                                            y.d(amzdVar.bK());
                                        }
                                        amawVar.u.execute(new Runnable(amawVar, amciVar, alyhVar2, f) { // from class: amag
                                            private final amaw a;
                                            private final amci b;
                                            private final alyh c;
                                            private final int d;

                                            {
                                                this.a = amawVar;
                                                this.b = amciVar;
                                                this.c = alyhVar2;
                                                this.d = f;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                amaw amawVar2 = this.a;
                                                this.b.c(this.c, amawVar2.w.a(), bvom.a(Locale.getDefault()), amawVar2.o, this.d);
                                            }
                                        });
                                    } else {
                                        alyg y2 = amawVar.y(amclVar, alyhVar4);
                                        boolean z = (y2 == null || (y2.c().a & 16) == 0) ? false : true;
                                        String a2 = amawVar.w.a();
                                        String a3 = bvom.a(Locale.getDefault());
                                        int i11 = amawVar.o;
                                        dmxxVar = dmxxVar3;
                                        alyhVar = alyhVar3;
                                        long a4 = amawVar.c.a(akry.PERSONALIZED_SMARTMAPS, amawVar.f);
                                        amzd bZ = amze.o.bZ();
                                        i = i5;
                                        amza a5 = alym.a(amawVar.i, amawVar.j, amawVar.h.J, alyhVar4, a2, a3);
                                        if (bZ.c) {
                                            bZ.bF();
                                            bZ.c = false;
                                        }
                                        amze amzeVar3 = (amze) bZ.b;
                                        a5.getClass();
                                        amzeVar3.b = a5;
                                        int i12 = amzeVar3.a | 1;
                                        amzeVar3.a = i12;
                                        if (a4 != -1) {
                                            i12 |= 64;
                                            amzeVar3.a = i12;
                                            amzeVar3.h = a4;
                                        }
                                        if (i11 != 0) {
                                            amzeVar3.a = i12 | 256;
                                            amzeVar3.j = i11;
                                        }
                                        alyhVar2 = alyhVar4;
                                        amclVar.o(alyhVar2, new alyq(bZ.bK(), amawVar.h, alyhVar2).a());
                                        if (z) {
                                            amad amadVar = amawVar.n;
                                            dbsk.s(amadVar);
                                            amadVar.a(alyhVar2);
                                        }
                                        iArr[i4] = alyhVar2.a;
                                        iArr[i4 + 1] = alyhVar2.b;
                                        iArr[i4 + 2] = alyhVar2.c;
                                        i4 += 3;
                                        f = -1;
                                    }
                                    for (amcn amcnVar : amawVar.g.a()) {
                                        amcnVar.c(alyhVar2, f);
                                    }
                                    i8++;
                                    list = list2;
                                    i6 = i9;
                                    dmxxVar3 = dmxxVar;
                                    alyhVar3 = alyhVar;
                                    i5 = i;
                                }
                            }
                        }
                        i3++;
                        list = list;
                    }
                    if (i4 > 0) {
                        final int[] copyOf = Arrays.copyOf(iArr, i4);
                        amawVar.u.execute(new Runnable(amawVar, amciVar, copyOf) { // from class: amaf
                            private final amaw a;
                            private final amci b;
                            private final int[] c;

                            {
                                this.a = amawVar;
                                this.b = amciVar;
                                this.c = copyOf;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                amaw amawVar2 = this.a;
                                amci amciVar2 = this.b;
                                int[] iArr2 = this.c;
                                amawVar2.f.e();
                                amciVar2.f(iArr2);
                                amawVar2.f.e();
                                int length = iArr2.length;
                            }
                        });
                    }
                }
            }
            amamVar.b.f.e();
        }
        amamVar = this;
        amamVar.b.f.e();
    }
}

package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: qo  reason: default package */
/* loaded from: classes4.dex */
public final class qo {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final qn d;
    private final int e;
    private final int f;

    public qo(qn qnVar, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = qnVar;
        int b = qnVar.b();
        this.e = b;
        int a = qnVar.a();
        this.f = a;
        cmf cmfVar = list.isEmpty() ? null : (cmf) list.get(0);
        if (cmfVar == null || cmfVar.a != 0 || cmfVar.b != 0) {
            list.add(0, new cmf(0, 0, 0));
        }
        list.add(new cmf(b, a, 0));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cmf cmfVar2 = (cmf) it.next();
            for (int i = 0; i < cmfVar2.c; i++) {
                int i2 = cmfVar2.a + i;
                int i3 = cmfVar2.b + i;
                int i4 = true != this.d.c(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        int i5 = 0;
        for (cmf cmfVar3 : this.a) {
            while (i5 < cmfVar3.a) {
                if (this.b[i5] == 0) {
                    int size = this.a.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i6 < size) {
                            cmf cmfVar4 = (cmf) this.a.get(i6);
                            while (i7 < cmfVar4.b) {
                                if (this.c[i7] != 0 || !this.d.d(i5, i7)) {
                                    i7++;
                                } else {
                                    int i8 = true != this.d.c(i5, i7) ? 4 : 8;
                                    this.b[i5] = (i7 << 4) | i8;
                                    this.c[i7] = i8 | (i5 << 4);
                                }
                            }
                            i7 = cmfVar4.b();
                            i6++;
                        }
                    }
                }
                i5++;
            }
            i5 = cmfVar3.a();
        }
    }

    private static psr b(Collection collection, int i, boolean z) {
        psr psrVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                psrVar = null;
                break;
            }
            psrVar = (psr) it.next();
            if (psrVar.a == i && psrVar.b == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            psr psrVar2 = (psr) it.next();
            if (z) {
                psrVar2.c--;
            } else {
                psrVar2.c++;
            }
        }
        return psrVar;
    }

    public final void a(xo xoVar) {
        int i;
        psr b;
        int i2;
        int i3;
        qm qmVar = new qm(new qg(xoVar));
        int i4 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i5 = this.e;
        int i6 = this.f;
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                cmf cmfVar = (cmf) this.a.get(size);
                int a = cmfVar.a();
                int b2 = cmfVar.b();
                while (true) {
                    if (i5 <= a) {
                        break;
                    }
                    i5--;
                    int i7 = this.b[i5];
                    if ((i7 & 12) != 0) {
                        psr b3 = b(arrayDeque, i7 >> 4, false);
                        if (b3 != null) {
                            int i8 = (i4 - b3.c) - 1;
                            qmVar.b(i5, i8);
                            if ((i7 & 4) != 0) {
                                qmVar.c(i8);
                            }
                        } else {
                            arrayDeque.add(new psr(i5, (i4 - i5) - 1, true));
                        }
                    } else {
                        if (qmVar.b != 2 || (i3 = qmVar.c) < i5 || i3 > i5 + 1) {
                            qmVar.a();
                            qmVar.c = i5;
                            qmVar.d = 1;
                            qmVar.b = 2;
                        } else {
                            qmVar.d++;
                            qmVar.c = i5;
                        }
                        i4--;
                    }
                }
                while (i6 > b2) {
                    i6--;
                    int i9 = this.c[i6];
                    if ((i9 & 12) == 0) {
                        if (qmVar.b == 1 && i5 >= (i2 = qmVar.c)) {
                            int i10 = qmVar.d;
                            if (i5 <= i2 + i10) {
                                qmVar.d = i10 + 1;
                                qmVar.c = Math.min(i5, i2);
                                i4++;
                            }
                        }
                        qmVar.a();
                        qmVar.c = i5;
                        qmVar.d = 1;
                        qmVar.b = 1;
                        i4++;
                    } else {
                        if (b(arrayDeque, i9 >> 4, true) == null) {
                            arrayDeque.add(new psr(i6, i4 - i5, false));
                        } else {
                            qmVar.b((i4 - b.c) - 1, i5);
                            if ((i9 & 4) != 0) {
                                qmVar.c(i5);
                            }
                        }
                    }
                }
                int i11 = cmfVar.a;
                int i12 = cmfVar.b;
                for (i = 0; i < cmfVar.c; i++) {
                    if ((this.b[i11] & 15) == 2) {
                        qmVar.c(i11);
                    }
                    i11++;
                }
                i5 = cmfVar.a;
                i6 = cmfVar.b;
            } else {
                qmVar.a();
                return;
            }
        }
    }
}

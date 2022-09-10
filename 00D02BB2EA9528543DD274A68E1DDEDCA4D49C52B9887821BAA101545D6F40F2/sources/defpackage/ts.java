package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ts  reason: default package */
/* loaded from: classes7.dex */
public final class ts {
    private final List<tr> a;
    private final int[] b;
    private final int[] c;
    private final tp d;
    private final int e;
    private final int f;
    private final boolean g;

    public ts(tp tpVar, List<tr> list, int[] iArr, int[] iArr2, boolean z) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = tpVar;
        int a = tpVar.a();
        this.e = a;
        int b = tpVar.b();
        this.f = b;
        this.g = z;
        tr trVar = list.isEmpty() ? null : list.get(0);
        if (trVar == null || trVar.a != 0 || trVar.b != 0) {
            list.add(0, new tr(0, 0, 0));
        }
        list.add(new tr(a, b, 0));
        for (tr trVar2 : list) {
            for (int i = 0; i < trVar2.c; i++) {
                int i2 = trVar2.a + i;
                int i3 = trVar2.b + i;
                int i4 = true != this.d.d(i2, i3) ? 2 : 1;
                this.b[i2] = (i3 << 4) | i4;
                this.c[i3] = (i2 << 4) | i4;
            }
        }
        if (this.g) {
            int i5 = 0;
            for (tr trVar3 : this.a) {
                while (i5 < trVar3.a) {
                    if (this.b[i5] == 0) {
                        int size = this.a.size();
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            if (i6 < size) {
                                tr trVar4 = this.a.get(i6);
                                while (i7 < trVar4.b) {
                                    if (this.c[i7] != 0 || !this.d.c(i5, i7)) {
                                        i7++;
                                    } else {
                                        int i8 = true != this.d.d(i5, i7) ? 4 : 8;
                                        this.b[i5] = (i7 << 4) | i8;
                                        this.c[i7] = i8 | (i5 << 4);
                                    }
                                }
                                i7 = trVar4.b();
                                i6++;
                            }
                        }
                    }
                    i5++;
                }
                i5 = trVar3.a();
            }
        }
    }

    private static tu c(Collection<tu> collection, int i, boolean z) {
        tu tuVar;
        Iterator<tu> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                tuVar = null;
                break;
            }
            tuVar = it.next();
            if (tuVar.a == i && tuVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            tu next = it.next();
            if (z) {
                next.b--;
            } else {
                next.b++;
            }
        }
        return tuVar;
    }

    public final void a(abg abgVar) {
        b(new tm(abgVar));
    }

    public final void b(ty tyVar) {
        int i;
        tu c;
        int i2;
        int i3;
        tn tnVar = new tn(tyVar);
        int i4 = this.e;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i5 = this.e;
        int i6 = this.f;
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                tr trVar = this.a.get(size);
                int a = trVar.a();
                int b = trVar.b();
                while (true) {
                    if (i5 <= a) {
                        break;
                    }
                    i5--;
                    int i7 = this.b[i5];
                    if ((i7 & 12) != 0) {
                        int i8 = i7 >> 4;
                        tu c2 = c(arrayDeque, i8, false);
                        if (c2 != null) {
                            int i9 = (i4 - c2.b) - 1;
                            tnVar.d(i5, i9);
                            if ((i7 & 4) != 0) {
                                tnVar.e(i9, this.d.e(i5, i8));
                            }
                        } else {
                            arrayDeque.add(new tu(i5, (i4 - i5) - 1, true));
                        }
                    } else {
                        if (tnVar.b != 2 || (i3 = tnVar.c) < i5 || i3 > i5 + 1) {
                            tnVar.c();
                            tnVar.c = i5;
                            tnVar.d = 1;
                            tnVar.b = 2;
                        } else {
                            tnVar.d++;
                            tnVar.c = i5;
                        }
                        i4--;
                    }
                }
                while (i6 > b) {
                    i6--;
                    int i10 = this.c[i6];
                    if ((i10 & 12) == 0) {
                        if (tnVar.b == 1 && i5 >= (i2 = tnVar.c)) {
                            int i11 = tnVar.d;
                            if (i5 <= i2 + i11) {
                                tnVar.d = i11 + 1;
                                tnVar.c = Math.min(i5, i2);
                                i4++;
                            }
                        }
                        tnVar.c();
                        tnVar.c = i5;
                        tnVar.d = 1;
                        tnVar.b = 1;
                        i4++;
                    } else {
                        int i12 = i10 >> 4;
                        if (c(arrayDeque, i12, true) == null) {
                            arrayDeque.add(new tu(i6, i4 - i5, false));
                        } else {
                            tnVar.d((i4 - c.b) - 1, i5);
                            if ((i10 & 4) != 0) {
                                tnVar.e(i5, this.d.e(i12, i6));
                            }
                        }
                    }
                }
                int i13 = trVar.a;
                int i14 = trVar.b;
                for (i = 0; i < trVar.c; i++) {
                    if ((this.b[i13] & 15) == 2) {
                        tnVar.e(i13, this.d.e(i13, i14));
                    }
                    i13++;
                    i14++;
                }
                i5 = trVar.a;
                i6 = trVar.b;
            } else {
                tnVar.c();
                return;
            }
        }
    }
}

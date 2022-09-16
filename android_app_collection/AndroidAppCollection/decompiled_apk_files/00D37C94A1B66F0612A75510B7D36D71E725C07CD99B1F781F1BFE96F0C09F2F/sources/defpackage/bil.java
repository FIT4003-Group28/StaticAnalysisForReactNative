package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bil  reason: default package */
/* loaded from: classes2.dex */
public final class bil {
    private static final Comparator e = new wd(6);
    final int[] a;
    final int[] b;
    final List c;
    final bjj[] d;
    private final float[] f = new float[3];

    public bil(int[] iArr, int i, bjj[] bjjVarArr, byte[] bArr) {
        bik bikVar;
        int i2;
        this.d = bjjVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            int g = g(Color.blue(i4), 8, 5) | (g(Color.red(i4), 8, 5) << 10) | (g(Color.green(i4), 8, 5) << 5);
            iArr[i3] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                gy.h(f(i6), this.f);
                if (h(this.f)) {
                    iArr2[i6] = 0;
                }
            }
            if (iArr2[i6] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.a = iArr3;
        int i7 = 0;
        for (int i8 = 0; i8 < 32768; i8++) {
            if (iArr2[i8] > 0) {
                iArr3[i7] = i8;
                i7++;
            }
        }
        if (i5 > i) {
            PriorityQueue<bik> priorityQueue = new PriorityQueue(i, e);
            priorityQueue.offer(new bik(this, 0, this.a.length - 1));
            while (priorityQueue.size() < i && (bikVar = (bik) priorityQueue.poll()) != null && bikVar.c()) {
                if (bikVar.c()) {
                    int i9 = bikVar.e - bikVar.d;
                    int i10 = bikVar.g - bikVar.f;
                    int i11 = bikVar.i - bikVar.h;
                    int i12 = (i9 < i10 || i9 < i11) ? (i10 < i9 || i10 < i11) ? -1 : -2 : -3;
                    bil bilVar = bikVar.j;
                    int[] iArr4 = bilVar.a;
                    int[] iArr5 = bilVar.b;
                    e(iArr4, i12, bikVar.a, bikVar.b);
                    Arrays.sort(iArr4, bikVar.a, bikVar.b + 1);
                    e(iArr4, i12, bikVar.a, bikVar.b);
                    int i13 = bikVar.c / 2;
                    int i14 = bikVar.a;
                    int i15 = 0;
                    while (true) {
                        int i16 = bikVar.b;
                        if (i14 <= i16) {
                            i15 += iArr5[iArr4[i14]];
                            if (i15 >= i13) {
                                i2 = Math.min(i16 - 1, i14);
                                break;
                            }
                            i14++;
                        } else {
                            i2 = bikVar.a;
                            break;
                        }
                    }
                    bik bikVar2 = new bik(bikVar.j, i2 + 1, bikVar.b);
                    bikVar.b = i2;
                    bikVar.b();
                    priorityQueue.offer(bikVar2);
                    priorityQueue.offer(bikVar);
                } else {
                    throw new IllegalStateException("Can not split a box with only 1 color");
                }
            }
            ArrayList arrayList = new ArrayList(priorityQueue.size());
            for (bik bikVar3 : priorityQueue) {
                bil bilVar2 = bikVar3.j;
                int[] iArr6 = bilVar2.a;
                int[] iArr7 = bilVar2.b;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                for (int i21 = bikVar3.a; i21 <= bikVar3.b; i21++) {
                    int i22 = iArr6[i21];
                    int i23 = iArr7[i22];
                    i17 += i23;
                    i18 += d(i22) * i23;
                    i19 += c(i22) * i23;
                    i20 += i23 * b(i22);
                }
                float f = i17;
                bip bipVar = new bip(a(Math.round(i18 / f), Math.round(i19 / f), Math.round(i20 / f)), i17);
                if (!h(bipVar.c())) {
                    arrayList.add(bipVar);
                }
            }
            this.c = arrayList;
            return;
        }
        this.c = new ArrayList();
        for (int i24 = 0; i24 < i5; i24++) {
            int i25 = iArr3[i24];
            this.c.add(new bip(f(i25), iArr2[i25]));
        }
    }

    static int a(int i, int i2, int i3) {
        return Color.rgb(g(i, 5, 8), g(i2, 5, 8), g(i3, 5, 8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i) {
        return i & 31;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i) {
        return (i >> 5) & 31;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i) {
        return (i >> 10) & 31;
    }

    static void e(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = b(i4) | (c(i4) << 10) | (d(i4) << 5);
                i2++;
            }
        } else if (i != -1) {
        } else {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = d(i5) | (b(i5) << 10) | (c(i5) << 5);
                i2++;
            }
        }
    }

    private static int f(int i) {
        return a(d(i), c(i), b(i));
    }

    private static int g(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    private final boolean h(float[] fArr) {
        int length;
        bjj[] bjjVarArr = this.d;
        if (bjjVarArr != null && (length = bjjVarArr.length) > 0) {
            for (int i = 0; i < length; i++) {
                bjj bjjVar = this.d[i];
                if (fArr[2] < 0.95f && fArr[2] > 0.05f) {
                    float f = fArr[0];
                    if (f < 10.0f || f > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}

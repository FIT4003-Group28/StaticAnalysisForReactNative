package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: alwm  reason: default package */
/* loaded from: classes2.dex */
public final class alwm extends alyv {
    private final int b;
    private final int[] c;
    private final int d;
    private final int e;
    private final int f;
    private final int[] g;
    private final int[] h;

    static {
        int[] iArr = new int[22];
        for (int i = 0; i < 22; i++) {
            iArr[i] = i;
        }
        new alwm(iArr, 0, 1, 21);
    }

    public alwm(int[] iArr, int i, int i2, int i3) {
        super(dcdc.e());
        this.c = iArr;
        this.b = i2;
        this.f = i3;
        int length = iArr.length;
        this.e = iArr[length - 1];
        this.d = i;
        TreeSet treeSet = new TreeSet();
        for (int i4 = 0; i4 < length; i4++) {
            treeSet.add(Integer.valueOf(this.c[i4]));
        }
        int i5 = this.e + 1;
        int[] iArr2 = new int[i5];
        this.g = iArr2;
        int[] iArr3 = new int[i5];
        this.h = iArr3;
        int i6 = -1;
        Arrays.fill(iArr2, -1);
        Arrays.fill(iArr3, -1);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            this.g[intValue] = i6;
            if (i6 >= 0) {
                this.h[i6] = intValue;
            }
            i6 = intValue;
        }
    }

    @Override // defpackage.alyv
    public final int a() {
        return this.f;
    }

    @Override // defpackage.alyv
    public final int b(float f) {
        int floor = (int) Math.floor((f - this.d) * this.b);
        int[] iArr = this.c;
        if (floor >= iArr.length) {
            return this.e;
        }
        if (floor >= 0) {
            return iArr[floor];
        }
        return -1;
    }

    @Override // defpackage.alyv
    public final int c(int i) {
        if (i >= 0) {
            int[] iArr = this.g;
            if (i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.alyv
    public final int d(int i) {
        if (i >= 0) {
            int[] iArr = this.h;
            if (i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }
        return -1;
    }

    @Override // defpackage.alyv
    public final int e() {
        return this.e;
    }
}

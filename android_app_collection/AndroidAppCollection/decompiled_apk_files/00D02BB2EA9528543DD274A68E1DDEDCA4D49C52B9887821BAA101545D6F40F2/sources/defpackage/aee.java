package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aee  reason: default package */
/* loaded from: classes2.dex */
final class aee {
    int[] a;
    List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i < length) {
            return;
        }
        while (length <= i) {
            length += length;
        }
        int[] iArr3 = new int[length];
        this.a = iArr3;
        int length2 = iArr.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        int[] iArr4 = this.a;
        Arrays.fill(iArr4, length2, iArr4.length, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        a(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.a;
        int length = iArr3.length;
        Arrays.fill(iArr3, length - i2, length, -1);
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        a(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.a, i, i3, -1);
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.b.get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a = i4 + i2;
            }
        }
    }

    public final void e(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = this.b.get(i);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a) {
                this.b.remove(i);
            }
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a) {
                this.b.add(i, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
        }
        this.b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f(int i) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.b.get(size);
        } while (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a != i);
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.b;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this.b.get(size).a >= i) {
                    this.b.remove(size);
                }
            }
        }
        i(i);
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem h(int i, int i2, int i3) {
        List<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = this.b.get(i4);
            int i5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b == i3 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.d)) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r5) {
        /*
            r4 = this;
            int[] r0 = r4.a
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.length
            if (r5 < r0) goto L9
            return
        L9:
            java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
            r1 = -1
            if (r0 != 0) goto L10
        Le:
            r0 = -1
            goto L45
        L10:
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.f(r5)
            if (r0 == 0) goto L1b
            java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.b
            r2.remove(r0)
        L1b:
            java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
            int r0 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r0) goto L33
            java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.a
            if (r3 >= r5) goto L34
            int r2 = r2 + 1
            goto L22
        L33:
            r2 = -1
        L34:
            if (r2 == r1) goto Le
            java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
            java.lang.Object r0 = r0.get(r2)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.b
            r3.remove(r2)
            int r0 = r0.a
        L45:
            if (r0 != r1) goto L51
            int[] r0 = r4.a
            int r2 = r0.length
            java.util.Arrays.fill(r0, r5, r2, r1)
            int[] r5 = r4.a
            int r5 = r5.length
            return
        L51:
            int[] r2 = r4.a
            int r2 = r2.length
            int r0 = r0 + 1
            int r0 = java.lang.Math.min(r0, r2)
            int[] r2 = r4.a
            java.util.Arrays.fill(r2, r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aee.i(int):void");
    }
}

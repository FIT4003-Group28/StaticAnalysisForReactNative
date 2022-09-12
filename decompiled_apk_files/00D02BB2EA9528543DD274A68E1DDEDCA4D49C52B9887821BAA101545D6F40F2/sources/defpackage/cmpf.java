package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmpf  reason: default package */
/* loaded from: classes5.dex */
public final class cmpf {
    public final cmpb a;
    public int[] b;
    public long[] c;
    private boolean[] d;
    private long[] e;

    public cmpf(cmpb cmpbVar) {
        this.a = cmpbVar;
    }

    private static final int A(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.p();
        }
        return flexItem.o();
    }

    private static final int B(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.o();
        }
        return flexItem.p();
    }

    private static final int C(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.n();
        }
        return flexItem.m();
    }

    private static final int D(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.m();
        }
        return flexItem.n();
    }

    private static final int E(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.b();
        }
        return flexItem.a();
    }

    private static final int F(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static final boolean G(int i, int i2, cmpc cmpcVar) {
        return i == i2 + (-1) && cmpcVar.a() != 0;
    }

    public static final int n(long j) {
        return (int) (j >> 32);
    }

    static final long o(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static final int[] p(int i, List<cmpe> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (cmpe cmpeVar : list) {
            int i3 = cmpeVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, cmpeVar.b);
            i2++;
        }
        return iArr;
    }

    private final void q(List<cmpc> list, cmpc cmpcVar, int i, int i2) {
        cmpcVar.m = i2;
        this.a.A(cmpcVar);
        cmpcVar.p = i;
        list.add(cmpcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.g()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.g()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.i()
            if (r1 <= r3) goto L26
            int r1 = r0.i()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.h()
            if (r2 >= r5) goto L32
            int r2 = r0.h()
            goto L3e
        L32:
            int r5 = r0.j()
            if (r2 <= r5) goto L3d
            int r2 = r0.j()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.y(r8, r1, r0, r7)
            cmpb r0 = r6.a
            r0.H(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpf.r(android.view.View, int):void");
    }

    private final void s(int i, int i2, cmpc cmpcVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        float f;
        int i7;
        double d;
        double d2;
        float f2 = cmpcVar.j;
        if (f2 <= 0.0f || i3 < (i5 = cmpcVar.e)) {
            return;
        }
        float f3 = (i3 - i5) / f2;
        cmpcVar.e = i4 + cmpcVar.f;
        int i8 = 0;
        if (!z) {
            cmpcVar.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i9 = 0;
        float f4 = 0.0f;
        while (i8 < cmpcVar.h) {
            int i10 = cmpcVar.o + i8;
            View c = this.a.c(i10);
            if (c == null || c.getVisibility() == 8) {
                i6 = i5;
                f = f3;
            } else {
                FlexItem flexItem = (FlexItem) c.getLayoutParams();
                int h = this.a.h();
                if (h == 0 || h == 1) {
                    i6 = i5;
                    int measuredWidth = c.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = c.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = n(jArr2[i10]);
                    }
                    if (this.d[i10]) {
                        f = f3;
                    } else if (flexItem.d() > 0.0f) {
                        float d3 = measuredWidth + (flexItem.d() * f3);
                        if (i8 == cmpcVar.h - 1) {
                            d3 += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(d3);
                        if (round > flexItem.i()) {
                            round = flexItem.i();
                            z2 = true;
                            this.d[i10] = true;
                            cmpcVar.j -= flexItem.d();
                            f = f3;
                        } else {
                            f4 += d3 - round;
                            f = f3;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                round++;
                                Double.isNaN(d4);
                                d = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round--;
                                Double.isNaN(d4);
                                d = d4 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int v = v(i2, flexItem, cmpcVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        c.measure(makeMeasureSpec, v);
                        int measuredWidth2 = c.getMeasuredWidth();
                        int measuredHeight2 = c.getMeasuredHeight();
                        y(i10, makeMeasureSpec, v, c);
                        this.a.H(i10, c);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    } else {
                        f = f3;
                    }
                    int max = Math.max(i9, measuredHeight + flexItem.n() + flexItem.p() + this.a.q(c));
                    cmpcVar.e += measuredWidth + flexItem.m() + flexItem.o();
                    i7 = max;
                } else {
                    int measuredHeight3 = c.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = n(jArr3[i10]);
                    }
                    int measuredWidth3 = c.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    i6 = i5;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (!this.d[i10] && flexItem.d() > 0.0f) {
                        float d5 = measuredHeight3 + (flexItem.d() * f3);
                        if (i8 == cmpcVar.h - 1) {
                            d5 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(d5);
                        if (round2 > flexItem.j()) {
                            round2 = flexItem.j();
                            this.d[i10] = true;
                            cmpcVar.j -= flexItem.d();
                            z2 = true;
                        } else {
                            f4 += d5 - round2;
                            double d6 = f4;
                            if (d6 > 1.0d) {
                                round2++;
                                Double.isNaN(d6);
                                d2 = d6 - 1.0d;
                            } else if (d6 < -1.0d) {
                                round2--;
                                Double.isNaN(d6);
                                d2 = d6 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int u = u(i, flexItem, cmpcVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        c.measure(u, makeMeasureSpec2);
                        measuredWidth3 = c.getMeasuredWidth();
                        measuredHeight3 = c.getMeasuredHeight();
                        y(i10, u, makeMeasureSpec2, c);
                        this.a.H(i10, c);
                    }
                    i7 = Math.max(i9, measuredWidth3 + flexItem.m() + flexItem.o() + this.a.q(c));
                    cmpcVar.e += measuredHeight3 + flexItem.n() + flexItem.p();
                    f = f3;
                }
                cmpcVar.g = Math.max(cmpcVar.g, i7);
                i9 = i7;
            }
            i8++;
            f3 = f;
            i5 = i6;
        }
        int i11 = i5;
        if (!z2 || i11 == cmpcVar.e) {
            return;
        }
        s(i, i2, cmpcVar, i3, i4, true);
    }

    private final void t(int i, int i2, cmpc cmpcVar, int i3, int i4, boolean z) {
        float f;
        int i5;
        cmpc cmpcVar2 = cmpcVar;
        int i6 = cmpcVar2.e;
        float f2 = cmpcVar2.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i6) {
            return;
        }
        float f4 = (i6 - i3) / f2;
        cmpcVar2.e = i4 + cmpcVar2.f;
        int i7 = 0;
        if (!z) {
            cmpcVar2.g = Integer.MIN_VALUE;
        }
        boolean z2 = false;
        int i8 = 0;
        float f5 = 0.0f;
        while (i7 < cmpcVar2.h) {
            int i9 = cmpcVar2.o + i7;
            View c = this.a.c(i9);
            if (c == null || c.getVisibility() == 8) {
                f = f4;
            } else {
                FlexItem flexItem = (FlexItem) c.getLayoutParams();
                int h = this.a.h();
                if (h == 0 || h == 1) {
                    int measuredWidth = c.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = c.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = n(jArr2[i9]);
                    }
                    if (this.d[i9]) {
                        f = f4;
                    } else if (flexItem.e() > 0.0f) {
                        float e = measuredWidth - (flexItem.e() * f4);
                        if (i7 == cmpcVar2.h - 1) {
                            e += f5;
                            f5 = 0.0f;
                        }
                        int round = Math.round(e);
                        if (round < flexItem.g()) {
                            round = flexItem.g();
                            z2 = true;
                            this.d[i9] = true;
                            cmpcVar2.k -= flexItem.e();
                            f = f4;
                        } else {
                            f5 += e - round;
                            f = f4;
                            double d = f5;
                            if (d > 1.0d) {
                                round++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f5 += 1.0f;
                            }
                        }
                        int v = v(i2, flexItem, cmpcVar2.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        c.measure(makeMeasureSpec, v);
                        int measuredWidth2 = c.getMeasuredWidth();
                        int measuredHeight2 = c.getMeasuredHeight();
                        y(i9, makeMeasureSpec, v, c);
                        this.a.H(i9, c);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    } else {
                        f = f4;
                    }
                    int max = Math.max(i8, measuredHeight + flexItem.n() + flexItem.p() + this.a.q(c));
                    cmpcVar2.e += measuredWidth + flexItem.m() + flexItem.o();
                    i5 = max;
                } else {
                    int measuredHeight3 = c.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = n(jArr3[i9]);
                    }
                    int measuredWidth3 = c.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (!this.d[i9] && flexItem.e() > f3) {
                        float e2 = measuredHeight3 - (flexItem.e() * f4);
                        if (i7 == cmpcVar2.h - 1) {
                            e2 += f5;
                            f5 = 0.0f;
                        }
                        int round2 = Math.round(e2);
                        if (round2 < flexItem.h()) {
                            round2 = flexItem.h();
                            this.d[i9] = true;
                            cmpcVar2.k -= flexItem.e();
                            z2 = true;
                        } else {
                            f5 += e2 - round2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                round2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f5 += 1.0f;
                            }
                            cmpcVar2 = cmpcVar;
                        }
                        int u = u(i, flexItem, cmpcVar2.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        c.measure(u, makeMeasureSpec2);
                        int measuredWidth4 = c.getMeasuredWidth();
                        int measuredHeight4 = c.getMeasuredHeight();
                        y(i9, u, makeMeasureSpec2, c);
                        this.a.H(i9, c);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i5 = Math.max(i8, measuredWidth3 + flexItem.m() + flexItem.o() + this.a.q(c));
                    cmpcVar2.e += measuredHeight3 + flexItem.n() + flexItem.p();
                    f = f4;
                }
                cmpcVar2.g = Math.max(cmpcVar2.g, i5);
                i8 = i5;
            }
            i7++;
            f4 = f;
            f3 = 0.0f;
        }
        if (!z2 || i6 == cmpcVar2.e) {
            return;
        }
        t(i, i2, cmpcVar, i3, i4, true);
    }

    private final int u(int i, FlexItem flexItem, int i2) {
        cmpb cmpbVar = this.a;
        int r = cmpbVar.r(i, cmpbVar.getPaddingLeft() + this.a.getPaddingRight() + flexItem.m() + flexItem.o() + i2, flexItem.a());
        int size = View.MeasureSpec.getSize(r);
        if (size > flexItem.i()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.i(), View.MeasureSpec.getMode(r));
        }
        return size < flexItem.g() ? View.MeasureSpec.makeMeasureSpec(flexItem.g(), View.MeasureSpec.getMode(r)) : r;
    }

    private final int v(int i, FlexItem flexItem, int i2) {
        cmpb cmpbVar = this.a;
        int s = cmpbVar.s(i, cmpbVar.getPaddingTop() + this.a.getPaddingBottom() + flexItem.n() + flexItem.p() + i2, flexItem.b());
        int size = View.MeasureSpec.getSize(s);
        if (size > flexItem.j()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.j(), View.MeasureSpec.getMode(s));
        }
        return size < flexItem.h() ? View.MeasureSpec.makeMeasureSpec(flexItem.h(), View.MeasureSpec.getMode(s)) : s;
    }

    private final void w(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.n()) - flexItem.p()) - this.a.q(view), flexItem.h()), flexItem.j());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        y(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.a.H(i2, view);
    }

    private final void x(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.m()) - flexItem.o()) - this.a.q(view), flexItem.g()), flexItem.i());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredHeight = n(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        y(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.a.H(i2, view);
    }

    private final void y(int i, int i2, int i3, View view) {
        long[] jArr = this.c;
        if (jArr != null) {
            jArr[i] = o(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = o(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static final List<cmpc> z(List<cmpc> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        cmpc cmpcVar = new cmpc();
        cmpcVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(cmpcVar);
                i3 = 0;
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(cmpcVar);
            }
            i3++;
        }
        return arrayList;
    }

    public final List<cmpe> a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            cmpe cmpeVar = new cmpe();
            cmpeVar.b = ((FlexItem) this.a.b(i2).getLayoutParams()).c();
            cmpeVar.a = i2;
            arrayList.add(cmpeVar);
        }
        return arrayList;
    }

    public final void b(cmpd cmpdVar, int i, int i2, int i3, int i4, List<cmpc> list) {
        c(cmpdVar, i, i2, i3, i4, -1, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f4, code lost:
        if (r2 < (r7 + r9)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.cmpd r29, int r30, int r31, int r32, int r33, int r34, java.util.List<defpackage.cmpc> r35) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmpf.c(cmpd, int, int, int, int, int, java.util.List):void");
    }

    public final void d(int i, int i2) {
        e(i, i2, 0);
    }

    public final void e(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int a = this.a.a();
        boolean[] zArr = this.d;
        int i4 = 0;
        if (zArr == null) {
            if (a < 10) {
                a = 10;
            }
            this.d = new boolean[a];
        } else {
            int length = zArr.length;
            if (length < a) {
                int i5 = length + length;
                if (i5 >= a) {
                    a = i5;
                }
                this.d = new boolean[a];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 >= this.a.a()) {
            return;
        }
        int h = this.a.h();
        int h2 = this.a.h();
        if (h2 == 0 || h2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            if (mode != 1073741824) {
                size = this.a.t();
            }
            paddingLeft = this.a.getPaddingLeft();
            paddingRight = this.a.getPaddingRight();
        } else if (h2 == 2 || h2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.a.t();
            }
            paddingLeft = this.a.getPaddingTop();
            paddingRight = this.a.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + h);
        }
        int i6 = paddingLeft + paddingRight;
        int[] iArr = this.b;
        if (iArr != null) {
            i4 = iArr[i3];
        }
        List<cmpc> G = this.a.G();
        int size2 = G.size();
        while (i4 < size2) {
            cmpc cmpcVar = G.get(i4);
            if (cmpcVar.e < size) {
                s(i, i2, cmpcVar, size, i6, false);
            } else {
                t(i, i2, cmpcVar, size, i6, false);
            }
            i4++;
        }
    }

    public final void f(int i, int i2, int i3) {
        int i4;
        int i5;
        int round;
        int h = this.a.h();
        if (h == 0 || h == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (h == 2 || h == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + h);
        }
        List<cmpc> G = this.a.G();
        if (i4 == 1073741824) {
            int v = this.a.v() + i3;
            int i6 = 0;
            if (G.size() == 1) {
                G.get(0).g = i5 - i3;
            } else if (G.size() >= 2) {
                int k = this.a.k();
                if (k == 1) {
                    cmpc cmpcVar = new cmpc();
                    cmpcVar.g = i5 - v;
                    G.add(0, cmpcVar);
                } else if (k == 2) {
                    this.a.setFlexLines(z(G, i5, v));
                } else if (k == 3) {
                    if (v >= i5) {
                        return;
                    }
                    float size2 = (i5 - v) / (G.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = G.size();
                    float f = 0.0f;
                    while (i6 < size3) {
                        arrayList.add(G.get(i6));
                        if (i6 != G.size() - 1) {
                            cmpc cmpcVar2 = new cmpc();
                            if (i6 == G.size() - 2) {
                                int round2 = Math.round(f + size2);
                                cmpcVar2.g = round2;
                                round = round2;
                                f = 0.0f;
                            } else {
                                round = Math.round(size2);
                                cmpcVar2.g = round;
                            }
                            f += size2 - round;
                            if (f > 1.0f) {
                                cmpcVar2.g = round + 1;
                                f -= 1.0f;
                            } else if (f < -1.0f) {
                                cmpcVar2.g = round - 1;
                                f += 1.0f;
                            }
                            arrayList.add(cmpcVar2);
                        }
                        i6++;
                    }
                    this.a.setFlexLines(arrayList);
                } else if (k == 4) {
                    if (v >= i5) {
                        this.a.setFlexLines(z(G, i5, v));
                        return;
                    }
                    int size4 = G.size();
                    int i7 = (i5 - v) / (size4 + size4);
                    ArrayList arrayList2 = new ArrayList();
                    cmpc cmpcVar3 = new cmpc();
                    cmpcVar3.g = i7;
                    for (cmpc cmpcVar4 : G) {
                        arrayList2.add(cmpcVar3);
                        arrayList2.add(cmpcVar4);
                        arrayList2.add(cmpcVar3);
                    }
                    this.a.setFlexLines(arrayList2);
                } else if (k == 5 && v < i5) {
                    float size5 = (i5 - v) / G.size();
                    int size6 = G.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        cmpc cmpcVar5 = G.get(i6);
                        float f3 = cmpcVar5.g + size5;
                        if (i6 == G.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int round3 = Math.round(f3);
                        f2 += f3 - round3;
                        if (f2 > 1.0f) {
                            round3++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            round3--;
                            f2 += 1.0f;
                        }
                        cmpcVar5.g = round3;
                        i6++;
                    }
                }
            }
        }
    }

    public final void g() {
        h(0);
    }

    public final void h(int i) {
        View c;
        if (i >= this.a.a()) {
            return;
        }
        int h = this.a.h();
        if (this.a.l() == 4) {
            int[] iArr = this.b;
            List<cmpc> G = this.a.G();
            int size = G.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                cmpc cmpcVar = G.get(i2);
                int i3 = cmpcVar.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = cmpcVar.o + i4;
                    if (i4 < this.a.a() && (c = this.a.c(i5)) != null && c.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) c.getLayoutParams();
                        if (flexItem.f() == -1 || flexItem.f() == 4) {
                            if (h == 0 || h == 1) {
                                w(c, cmpcVar.g, i5);
                            } else if (h == 2 || h == 3) {
                                x(c, cmpcVar.g, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: " + h);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (cmpc cmpcVar2 : this.a.G()) {
            for (Integer num : cmpcVar2.n) {
                View c2 = this.a.c(num.intValue());
                if (h == 0 || h == 1) {
                    w(c2, cmpcVar2.g, num.intValue());
                } else if (h == 2 || h == 3) {
                    x(c2, cmpcVar2.g, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: " + h);
                }
            }
        }
    }

    public final void i(View view, cmpc cmpcVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int l = this.a.l();
        if (flexItem.f() != -1) {
            l = flexItem.f();
        }
        int i5 = cmpcVar.g;
        if (l != 0) {
            if (l == 1) {
                if (this.a.j() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.p(), i3, i6 - flexItem.p());
                    return;
                }
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.n(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.n());
                return;
            } else if (l == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.n()) - flexItem.p()) / 2;
                if (this.a.j() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                return;
            } else if (l == 3) {
                if (this.a.j() != 2) {
                    int max = Math.max(cmpcVar.l - view.getBaseline(), flexItem.n());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                }
                int max2 = Math.max((cmpcVar.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.p());
                view.layout(i, i2 - max2, i3, i4 - max2);
                return;
            } else if (l != 4) {
                return;
            }
        }
        if (this.a.j() != 2) {
            view.layout(i, i2 + flexItem.n(), i3, i4 + flexItem.n());
        } else {
            view.layout(i, i2 - flexItem.p(), i3, i4 - flexItem.p());
        }
    }

    public final void j(View view, cmpc cmpcVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int l = this.a.l();
        if (flexItem.f() != -1) {
            l = flexItem.f();
        }
        int i5 = cmpcVar.g;
        if (l != 0) {
            if (l == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.o(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.o(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.m(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.m(), i4);
                    return;
                }
            } else if (l == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            } else if (l != 3 && l != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.m(), i2, i3 + flexItem.m(), i4);
        } else {
            view.layout(i - flexItem.o(), i2, i3 - flexItem.o(), i4);
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.e = new long[i];
            return;
        }
        int length = jArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length + length;
        if (i2 >= i) {
            i = i2;
        }
        this.e = Arrays.copyOf(jArr, i);
    }

    public final void l(int i) {
        long[] jArr = this.c;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.c = new long[i];
            return;
        }
        int length = jArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length + length;
        if (i2 >= i) {
            i = i2;
        }
        this.c = Arrays.copyOf(jArr, i);
    }

    public final void m(int i) {
        int[] iArr = this.b;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.b = new int[i];
            return;
        }
        int length = iArr.length;
        if (length >= i) {
            return;
        }
        int i2 = length + length;
        if (i2 >= i) {
            i = i2;
        }
        this.b = Arrays.copyOf(iArr, i);
    }
}

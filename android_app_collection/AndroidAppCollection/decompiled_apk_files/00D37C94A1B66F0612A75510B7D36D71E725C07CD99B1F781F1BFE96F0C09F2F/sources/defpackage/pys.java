package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: pys  reason: default package */
/* loaded from: classes4.dex */
public final class pys {
    public final pyo a;
    public int[] b;
    public long[] c;
    private boolean[] d;
    private long[] e;

    public pys(pyo pyoVar) {
        this.a = pyoVar;
    }

    private final void A(int i, int i2, int i3, View view) {
        long[] jArr = this.c;
        if (jArr != null) {
            jArr[i] = p(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = p(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static final List B(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        pyp pypVar = new pyp();
        pypVar.g = (i - i2) / 2;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            if (i3 == 0) {
                arrayList.add(pypVar);
                i3 = 0;
            }
            arrayList.add((pyp) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(pypVar);
            }
            i3++;
        }
        return arrayList;
    }

    private static final int C(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.f();
        }
        return flexItem.h();
    }

    private static final int D(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.h();
        }
        return flexItem.f();
    }

    private static final int E(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.i();
        }
        return flexItem.g();
    }

    private static final int F(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.g();
        }
        return flexItem.i();
    }

    private static final int G(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.e();
        }
        return flexItem.o();
    }

    private static final int H(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static final boolean I(int i, int i2, pyp pypVar) {
        return i == i2 + (-1) && pypVar.a() != 0;
    }

    static final long p(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static final int q(long j) {
        return (int) (j >> 32);
    }

    public static final int[] r(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            pyr pyrVar = (pyr) it.next();
            int i3 = pyrVar.a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, pyrVar.b);
            i2++;
        }
        return iArr;
    }

    private final int s(int i, FlexItem flexItem, int i2) {
        pyo pyoVar = this.a;
        int c = pyoVar.c(i, pyoVar.getPaddingTop() + this.a.getPaddingBottom() + flexItem.i() + flexItem.f() + i2, flexItem.e());
        int size = View.MeasureSpec.getSize(c);
        if (size > flexItem.j()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.j(), View.MeasureSpec.getMode(c));
        }
        return size < flexItem.l() ? View.MeasureSpec.makeMeasureSpec(flexItem.l(), View.MeasureSpec.getMode(c)) : c;
    }

    private final int t(int i, FlexItem flexItem, int i2) {
        pyo pyoVar = this.a;
        int g = pyoVar.g(i, pyoVar.getPaddingLeft() + this.a.getPaddingRight() + flexItem.g() + flexItem.h() + i2, flexItem.o());
        int size = View.MeasureSpec.getSize(g);
        if (size > flexItem.k()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.k(), View.MeasureSpec.getMode(g));
        }
        return size < flexItem.m() ? View.MeasureSpec.makeMeasureSpec(flexItem.m(), View.MeasureSpec.getMode(g)) : g;
    }

    private final void u(List list, pyp pypVar, int i, int i2) {
        pypVar.m = i2;
        this.a.H(pypVar);
        pypVar.p = i;
        list.add(pypVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.m()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.m()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.k()
            if (r1 <= r3) goto L26
            int r1 = r0.k()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.l()
            if (r2 >= r5) goto L32
            int r2 = r0.l()
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
            r6.A(r8, r1, r0, r7)
            pyo r0 = r6.a
            r0.J(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pys.v(android.view.View, int):void");
    }

    private final void w(int i, int i2, pyp pypVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        float f;
        int i7;
        double d;
        double d2;
        float f2 = pypVar.j;
        if (f2 <= 0.0f || i3 < (i5 = pypVar.e)) {
            return;
        }
        float f3 = (i3 - i5) / f2;
        pypVar.e = i4 + pypVar.f;
        int i8 = 0;
        if (!z) {
            pypVar.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        boolean z2 = false;
        int i9 = 0;
        float f4 = 0.0f;
        while (i8 < pypVar.h) {
            int i10 = pypVar.o + i8;
            View u = this.a.u(i10);
            if (u == null || u.getVisibility() == 8) {
                i6 = i5;
                f = f3;
            } else {
                FlexItem flexItem = (FlexItem) u.getLayoutParams();
                int k = this.a.k();
                if (k == 0 || k == 1) {
                    i6 = i5;
                    int measuredWidth = u.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i10];
                    }
                    int measuredHeight = u.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = q(jArr2[i10]);
                    }
                    if (this.d[i10]) {
                        f = f3;
                    } else if (flexItem.b() > 0.0f) {
                        float b = measuredWidth + (flexItem.b() * f3);
                        if (i8 == pypVar.h - 1) {
                            b += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(b);
                        if (round > flexItem.k()) {
                            round = flexItem.k();
                            z2 = true;
                            this.d[i10] = true;
                            pypVar.j -= flexItem.b();
                            f = f3;
                        } else {
                            f4 += b - round;
                            f = f3;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                round++;
                                Double.isNaN(d3);
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                Double.isNaN(d3);
                                d = d3 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int s = s(i2, flexItem, pypVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        u.measure(makeMeasureSpec, s);
                        int measuredWidth2 = u.getMeasuredWidth();
                        int measuredHeight2 = u.getMeasuredHeight();
                        A(i10, makeMeasureSpec, s, u);
                        this.a.J(i10, u);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    } else {
                        f = f3;
                    }
                    int max = Math.max(i9, measuredHeight + flexItem.i() + flexItem.f() + this.a.i(u));
                    pypVar.e += measuredWidth + flexItem.g() + flexItem.h();
                    i7 = max;
                } else {
                    int measuredHeight3 = u.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = q(jArr3[i10]);
                    }
                    int measuredWidth3 = u.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    i6 = i5;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i10];
                    }
                    if (!this.d[i10] && flexItem.b() > 0.0f) {
                        float b2 = measuredHeight3 + (flexItem.b() * f3);
                        if (i8 == pypVar.h - 1) {
                            b2 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(b2);
                        if (round2 > flexItem.j()) {
                            round2 = flexItem.j();
                            this.d[i10] = true;
                            pypVar.j -= flexItem.b();
                            z2 = true;
                        } else {
                            f4 += b2 - round2;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                round2++;
                                Double.isNaN(d4);
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                Double.isNaN(d4);
                                d2 = d4 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int t = t(i, flexItem, pypVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        u.measure(t, makeMeasureSpec2);
                        measuredWidth3 = u.getMeasuredWidth();
                        measuredHeight3 = u.getMeasuredHeight();
                        A(i10, t, makeMeasureSpec2, u);
                        this.a.J(i10, u);
                    }
                    i7 = Math.max(i9, measuredWidth3 + flexItem.g() + flexItem.h() + this.a.i(u));
                    pypVar.e += measuredHeight3 + flexItem.i() + flexItem.f();
                    f = f3;
                }
                pypVar.g = Math.max(pypVar.g, i7);
                i9 = i7;
            }
            i8++;
            f3 = f;
            i5 = i6;
        }
        int i11 = i5;
        if (!z2 || i11 == pypVar.e) {
            return;
        }
        w(i, i2, pypVar, i3, i4, true);
    }

    private final void x(int i, int i2, pyp pypVar, int i3, int i4, boolean z) {
        float f;
        int i5;
        pyp pypVar2 = pypVar;
        int i6 = pypVar2.e;
        float f2 = pypVar2.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i6) {
            return;
        }
        float f4 = (i6 - i3) / f2;
        pypVar2.e = i4 + pypVar2.f;
        int i7 = 0;
        if (!z) {
            pypVar2.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
        boolean z2 = false;
        int i8 = 0;
        float f5 = 0.0f;
        while (i7 < pypVar2.h) {
            int i9 = pypVar2.o + i7;
            View u = this.a.u(i9);
            if (u == null || u.getVisibility() == 8) {
                f = f4;
            } else {
                FlexItem flexItem = (FlexItem) u.getLayoutParams();
                int k = this.a.k();
                if (k == 0 || k == 1) {
                    int measuredWidth = u.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = u.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = q(jArr2[i9]);
                    }
                    if (this.d[i9]) {
                        f = f4;
                    } else if (flexItem.c() > 0.0f) {
                        float c = measuredWidth - (flexItem.c() * f4);
                        if (i7 == pypVar2.h - 1) {
                            c += f5;
                            f5 = 0.0f;
                        }
                        int round = Math.round(c);
                        if (round < flexItem.m()) {
                            round = flexItem.m();
                            z2 = true;
                            this.d[i9] = true;
                            pypVar2.k -= flexItem.c();
                            f = f4;
                        } else {
                            f5 += c - round;
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
                        int s = s(i2, flexItem, pypVar2.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        u.measure(makeMeasureSpec, s);
                        int measuredWidth2 = u.getMeasuredWidth();
                        int measuredHeight2 = u.getMeasuredHeight();
                        A(i9, makeMeasureSpec, s, u);
                        this.a.J(i9, u);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    } else {
                        f = f4;
                    }
                    int max = Math.max(i8, measuredHeight + flexItem.i() + flexItem.f() + this.a.i(u));
                    pypVar2.e += measuredWidth + flexItem.g() + flexItem.h();
                    i5 = max;
                } else {
                    int measuredHeight3 = u.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = q(jArr3[i9]);
                    }
                    int measuredWidth3 = u.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (!this.d[i9] && flexItem.c() > f3) {
                        float c2 = measuredHeight3 - (flexItem.c() * f4);
                        if (i7 == pypVar2.h - 1) {
                            c2 += f5;
                            f5 = 0.0f;
                        }
                        int round2 = Math.round(c2);
                        if (round2 < flexItem.l()) {
                            round2 = flexItem.l();
                            this.d[i9] = true;
                            pypVar2.k -= flexItem.c();
                            z2 = true;
                        } else {
                            f5 += c2 - round2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                round2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f5 += 1.0f;
                            }
                            pypVar2 = pypVar;
                        }
                        int t = t(i, flexItem, pypVar2.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        u.measure(t, makeMeasureSpec2);
                        int measuredWidth4 = u.getMeasuredWidth();
                        int measuredHeight4 = u.getMeasuredHeight();
                        A(i9, t, makeMeasureSpec2, u);
                        this.a.J(i9, u);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    i5 = Math.max(i8, measuredWidth3 + flexItem.g() + flexItem.h() + this.a.i(u));
                    pypVar2.e += measuredHeight3 + flexItem.i() + flexItem.f();
                    f = f4;
                }
                pypVar2.g = Math.max(pypVar2.g, i5);
                i8 = i5;
            }
            i7++;
            f4 = f;
            f3 = 0.0f;
        }
        if (!z2 || i6 == pypVar2.e) {
            return;
        }
        x(i, i2, pypVar, i3, i4, true);
    }

    private final void y(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.g()) - flexItem.h()) - this.a.i(view), flexItem.m()), flexItem.k());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredHeight = q(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        A(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.a.J(i2, view);
    }

    private final void z(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.i()) - flexItem.f()) - this.a.i(view), flexItem.l()), flexItem.j());
        long[] jArr = this.e;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        A(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.a.J(i2, view);
    }

    public final List a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            pyr pyrVar = new pyr();
            pyrVar.b = ((FlexItem) this.a.t(i2).getLayoutParams()).n();
            pyrVar.a = i2;
            arrayList.add(pyrVar);
        }
        return arrayList;
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
    public final void b(defpackage.pyq r29, int r30, int r31, int r32, int r33, int r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pys.b(pyq, int, int, int, int, int, java.util.List):void");
    }

    public final void c(pyq pyqVar, int i, int i2, int i3, int i4, List list) {
        b(pyqVar, i, i2, i3, i4, -1, list);
    }

    public final void d(pyq pyqVar, int i, int i2, int i3, int i4, List list) {
        b(pyqVar, i2, i, i3, i4, -1, list);
    }

    public final void e(List list, int i) {
        int i2 = this.b[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.b;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.c;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final void f(int i, int i2, int i3) {
        int i4;
        int i5;
        int round;
        int k = this.a.k();
        if (k == 0 || k == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (k == 2 || k == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + k);
        }
        List<pyp> w = this.a.w();
        if (i4 == 1073741824) {
            int r = this.a.r() + i3;
            int i6 = 0;
            if (w.size() == 1) {
                ((pyp) w.get(0)).g = i5 - i3;
            } else if (w.size() >= 2) {
                int a = this.a.a();
                if (a == 1) {
                    pyp pypVar = new pyp();
                    pypVar.g = i5 - r;
                    w.add(0, pypVar);
                } else if (a == 2) {
                    this.a.I(B(w, i5, r));
                } else if (a == 3) {
                    if (r >= i5) {
                        return;
                    }
                    float size2 = (i5 - r) / (w.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = w.size();
                    float f = 0.0f;
                    while (i6 < size3) {
                        arrayList.add((pyp) w.get(i6));
                        if (i6 != w.size() - 1) {
                            pyp pypVar2 = new pyp();
                            if (i6 == w.size() - 2) {
                                int round2 = Math.round(f + size2);
                                pypVar2.g = round2;
                                round = round2;
                                f = 0.0f;
                            } else {
                                round = Math.round(size2);
                                pypVar2.g = round;
                            }
                            f += size2 - round;
                            if (f > 1.0f) {
                                pypVar2.g = round + 1;
                                f -= 1.0f;
                            } else if (f < -1.0f) {
                                pypVar2.g = round - 1;
                                f += 1.0f;
                            }
                            arrayList.add(pypVar2);
                        }
                        i6++;
                    }
                    this.a.I(arrayList);
                } else if (a == 4) {
                    if (r >= i5) {
                        this.a.I(B(w, i5, r));
                        return;
                    }
                    int size4 = w.size();
                    int i7 = (i5 - r) / (size4 + size4);
                    ArrayList arrayList2 = new ArrayList();
                    pyp pypVar3 = new pyp();
                    pypVar3.g = i7;
                    for (pyp pypVar4 : w) {
                        arrayList2.add(pypVar3);
                        arrayList2.add(pypVar4);
                        arrayList2.add(pypVar3);
                    }
                    this.a.I(arrayList2);
                } else if (a == 5 && r < i5) {
                    float size5 = (i5 - r) / w.size();
                    int size6 = w.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        pyp pypVar5 = (pyp) w.get(i6);
                        float f3 = pypVar5.g + size5;
                        if (i6 == w.size() - 1) {
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
                        pypVar5.g = round3;
                        i6++;
                    }
                }
            }
        }
    }

    public final void g(int i, int i2) {
        h(i, i2, 0);
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int l = this.a.l();
        boolean[] zArr = this.d;
        int i4 = 0;
        if (zArr == null) {
            if (l < 10) {
                l = 10;
            }
            this.d = new boolean[l];
        } else {
            int length = zArr.length;
            if (length < l) {
                int i5 = length + length;
                if (i5 >= l) {
                    l = i5;
                }
                this.d = new boolean[l];
            } else {
                Arrays.fill(zArr, false);
            }
        }
        if (i3 >= this.a.l()) {
            return;
        }
        int k = this.a.k();
        int k2 = this.a.k();
        if (k2 == 0 || k2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            if (mode != 1073741824) {
                size = this.a.p();
            }
            paddingLeft = this.a.getPaddingLeft();
            paddingRight = this.a.getPaddingRight();
        } else if (k2 == 2 || k2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.a.p();
            }
            paddingLeft = this.a.getPaddingTop();
            paddingRight = this.a.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + k);
        }
        int i6 = paddingLeft + paddingRight;
        int[] iArr = this.b;
        if (iArr != null) {
            i4 = iArr[i3];
        }
        List w = this.a.w();
        int size2 = w.size();
        while (i4 < size2) {
            pyp pypVar = (pyp) w.get(i4);
            if (pypVar.e < size) {
                w(i, i2, pypVar, size, i6, false);
            } else {
                x(i, i2, pypVar, size, i6, false);
            }
            i4++;
        }
    }

    public final void i(int i) {
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

    public final void j(int i) {
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

    public final void l(View view, pyp pypVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int b = this.a.b();
        if (flexItem.d() != -1) {
            b = flexItem.d();
        }
        int i5 = pypVar.g;
        if (b != 0) {
            if (b == 1) {
                if (this.a.m() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.f(), i3, i6 - flexItem.f());
                    return;
                }
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.i(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.i());
                return;
            } else if (b == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.i()) - flexItem.f()) / 2;
                if (this.a.m() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                return;
            } else if (b == 3) {
                if (this.a.m() != 2) {
                    int max = Math.max(pypVar.l - view.getBaseline(), flexItem.i());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                }
                int max2 = Math.max((pypVar.l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.f());
                view.layout(i, i2 - max2, i3, i4 - max2);
                return;
            } else if (b != 4) {
                return;
            }
        }
        if (this.a.m() != 2) {
            view.layout(i, i2 + flexItem.i(), i3, i4 + flexItem.i());
        } else {
            view.layout(i, i2 - flexItem.f(), i3, i4 - flexItem.f());
        }
    }

    public final void m(View view, pyp pypVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int b = this.a.b();
        if (flexItem.d() != -1) {
            b = flexItem.d();
        }
        int i5 = pypVar.g;
        if (b != 0) {
            if (b == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.h(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.h(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.g(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.g(), i4);
                    return;
                }
            } else if (b == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            } else if (b != 3 && b != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.g(), i2, i3 + flexItem.g(), i4);
        } else {
            view.layout(i - flexItem.h(), i2, i3 - flexItem.h(), i4);
        }
    }

    public final void n() {
        o(0);
    }

    public final void o(int i) {
        View u;
        if (i >= this.a.l()) {
            return;
        }
        int k = this.a.k();
        if (this.a.b() == 4) {
            int[] iArr = this.b;
            List w = this.a.w();
            int size = w.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                pyp pypVar = (pyp) w.get(i2);
                int i3 = pypVar.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = pypVar.o + i4;
                    if (i4 < this.a.l() && (u = this.a.u(i5)) != null && u.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) u.getLayoutParams();
                        if (flexItem.d() == -1 || flexItem.d() == 4) {
                            if (k == 0 || k == 1) {
                                z(u, pypVar.g, i5);
                            } else if (k == 2 || k == 3) {
                                y(u, pypVar.g, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: " + k);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (pyp pypVar2 : this.a.w()) {
            for (Integer num : pypVar2.n) {
                View u2 = this.a.u(num.intValue());
                if (k == 0 || k == 1) {
                    z(u2, pypVar2.g, num.intValue());
                } else if (k == 2 || k == 3) {
                    y(u2, pypVar2.g, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: " + k);
                }
            }
        }
    }
}

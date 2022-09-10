package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cok  reason: default package */
/* loaded from: classes5.dex */
public final class cok extends abs {
    private int M;
    public final Context a;
    public cou c;
    public LruCache<View, coj> f;
    public boolean h;
    private boolean i;
    private coh m;
    private boolean o;
    private final AccelerateInterpolator j = new AccelerateInterpolator(2.0f);
    public boolean b = false;
    private int k = 1;
    private int l = 0;
    private int n = 0;
    private int F = 0;
    public int d = -1;
    public int e = -1;
    private int G = -1;
    private int H = -1;
    private int I = -1;
    private int J = -1;
    private int K = -1;
    private boolean L = false;
    private int N = -1;
    public boolean g = true;
    private final boolean O = true;

    public cok(Context context) {
        this.a = context;
    }

    private final View W(aca acaVar, View view, int i) {
        int i2;
        int bA;
        int bj;
        int bm = bm(view);
        if (i == 0) {
            i2 = bm - 1;
        } else {
            i2 = bm + 1;
            i = 1;
        }
        View d = acaVar.d(i2);
        bt(d);
        abt abtVar = (abt) d.getLayoutParams();
        abt abtVar2 = (abt) view.getLayoutParams();
        int paddingLeft = getPaddingLeft() + abtVar.leftMargin;
        int bk = bk(d) + paddingLeft;
        if (i == 0) {
            bj = (view.getTop() - abtVar2.topMargin) - abtVar.bottomMargin;
            bA = bj - bj(d);
        } else {
            bA = abtVar.topMargin + bA(view) + abtVar2.bottomMargin;
            bj = bj(d) + bA;
        }
        br(d, paddingLeft, bA, bk, bj);
        if (i == 0) {
            aC(d, 0);
        } else {
            aB(d);
        }
        return d;
    }

    private final boolean X(aci aciVar, int i, View view, int i2) {
        int bm = bm(view);
        if (i2 == 0) {
            if (bm == 0) {
                return false;
            }
        } else if (bm >= aciVar.b() - 1) {
            return false;
        } else {
            i2 = 1;
        }
        View aM = aM();
        if (aM != null) {
            int bm2 = bm(aM);
            if (i2 == 0 && bm >= bm2 - 2) {
                return true;
            }
            if (i2 == 1 && bm <= bm2 + 2) {
                return true;
            }
        }
        if (i != -1) {
            if (i2 == 0 && bm >= i - 1) {
                return true;
            }
            if (i2 == 1 && bm <= i + 1) {
                return true;
            }
        }
        abt ak = ak(view);
        int bD = bD(view) - ak.topMargin;
        int bA = bA(view) - ak.bottomMargin;
        int paddingBottom = this.E - getPaddingBottom();
        if (i2 != 0 || bD >= getPaddingTop() - this.E) {
            return i2 != 1 || bA <= paddingBottom;
        }
        return false;
    }

    private final void Z() {
        ab(false);
    }

    private final void ab(boolean z) {
        Integer ac;
        int intValue;
        if (aJ() != 0) {
            if (aN() != this.M || z) {
                this.F = bm(o());
                this.d = -1;
            }
            this.M = aN();
            int i = this.F;
            if (i == -1 || (ac = ac(i)) == null) {
                return;
            }
            int i2 = this.d;
            if (i2 == -1) {
                intValue = Integer.MIN_VALUE;
            } else {
                Integer ac2 = ac(i2);
                if (ac2 == null) {
                    return;
                }
                intValue = ac2.intValue();
            }
            if (ac.intValue() < getPaddingTop()) {
                this.d = this.F;
                int i3 = this.e;
                this.F = i3;
                this.e = P(i3);
            } else if (this.F <= 0 || intValue < getPaddingTop()) {
                this.d = N(this.F);
                this.e = P(this.F);
            } else {
                this.e = this.F;
                int i4 = this.d;
                this.F = i4;
                this.d = N(i4);
            }
        }
    }

    private final Integer ac(int i) {
        if (i < 0) {
            return null;
        }
        View I = I(i);
        if (I != null) {
            return Integer.valueOf(bD(I) - ak(I).topMargin);
        }
        if (aJ() == 0) {
            return null;
        }
        int bm = bm(aK(0));
        int bm2 = bm(aK(aJ() - 1));
        if (i < bm) {
            return Integer.MIN_VALUE;
        }
        return i > bm2 ? Integer.MAX_VALUE : null;
    }

    private final Integer ad(int i) {
        if (aJ() == 0) {
            return null;
        }
        int bm = bm(aK(0));
        int bm2 = bm(aK(aJ() - 1));
        return i < bm ? Integer.valueOf(bm) : i > bm2 ? Integer.valueOf(bm2) : Integer.valueOf(i);
    }

    private final void ae(int i) {
        this.G = i;
        this.H = N(i);
        this.I = P(i);
    }

    private final void af() {
        this.G = -1;
        this.H = -1;
        this.I = -1;
    }

    private final int ag() {
        int i = this.K;
        if (i != -1) {
            return i;
        }
        int k = k();
        View aK = aK(k);
        if (bm(aK) == 0 && k < aJ() - 1) {
            aK = aK(k + 1);
        }
        abt ak = ak(aK);
        int bj = bj(aK) + ak.topMargin + ak.bottomMargin;
        if (bj == 0) {
            return this.a.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_sample_row_height);
        }
        this.K = bj;
        return bj;
    }

    private final int ah() {
        return (this.E - getPaddingTop()) - getPaddingBottom();
    }

    private static abt ak(View view) {
        return (abt) view.getLayoutParams();
    }

    private final boolean al() {
        return this.a.getResources().getConfiguration().navigation == 2;
    }

    @Override // defpackage.abs
    public final boolean E() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r0 <= r3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View F() {
        /*
            r4 = this;
            int r0 = r4.J
            r1 = -1
            if (r0 == r1) goto L1b
            r0 = 0
        L6:
            int r2 = r4.aJ()
            if (r0 >= r2) goto L1b
            android.view.View r2 = r4.aK(r0)
            int r2 = bm(r2)
            int r3 = r4.J
            if (r2 == r3) goto L1c
            int r0 = r0 + 1
            goto L6
        L1b:
            r0 = -1
        L1c:
            if (r0 < 0) goto L37
            int r2 = r4.aJ()
            if (r0 < r2) goto L25
            goto L37
        L25:
            int r2 = r4.k()
            int r3 = r4.t()
            int r3 = java.lang.Math.max(r3, r2)
            if (r2 == r1) goto L37
            if (r0 < r2) goto L37
            if (r0 <= r3) goto L38
        L37:
            r0 = -1
        L38:
            if (r0 == r1) goto L3f
            android.view.View r0 = r4.aK(r0)
            return r0
        L3f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cok.F():android.view.View");
    }

    public final boolean G() {
        return k() <= 0;
    }

    public final boolean H() {
        int l = l();
        View q = q();
        return l == -1 || l == aN() + (-1) || (q == null ? -1 : bm(q)) == aN() + (-1);
    }

    public final void J(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        L();
    }

    public final boolean K(RecyclerView recyclerView, int i) {
        int i2;
        if (aJ() != 0 && !this.o) {
            if (Math.abs(i) < 0 || Math.abs(this.n) < 0) {
                int k = k();
                if (k == -1) {
                    return false;
                }
                recyclerView.n(bm(aK(k)));
                return true;
            }
            boolean z = i > 0 || (i == 0 && this.n >= 0);
            boolean z2 = i < 0 || (i == 0 && this.n < 0);
            if (z && this.e != -1) {
                recyclerView.n(this.F);
                return true;
            } else if (z2 && (i2 = this.d) != -1) {
                recyclerView.n(i2);
                return true;
            } else {
                int i3 = this.n;
                int i4 = this.d;
                int i5 = this.e;
                StringBuilder sb = new StringBuilder(157);
                sb.append("Error setting scroll for fling! flingVelocity: \t");
                sb.append(i);
                sb.append("\tlastDragDistance: ");
                sb.append(i3);
                sb.append("\tpageUpAtStartOfDrag: ");
                sb.append(i4);
                sb.append("\tpageDownAtStartOfDrag: ");
                sb.append(i5);
                sb.toString();
                coh cohVar = this.m;
                if (cohVar == null) {
                    return false;
                }
                recyclerView.n(cohVar.f);
                return true;
            }
        }
        return false;
    }

    public final void L() {
        if (!this.b) {
            return;
        }
        if (this.k == 1) {
            View I = I(this.F);
            if (I == null) {
                return;
            }
            int bD = bD(I) - ak(I).topMargin;
            View I2 = I(this.d);
            if (I2 == null) {
                return;
            }
            int bD2 = (bD(I2) - ak(I2).topMargin) - bD;
            float abs = (Math.abs(bD2) - (bD - getPaddingTop())) / Math.abs(bD2);
            RecyclerView recyclerView = (RecyclerView) aK(0).getParent();
            int[] iArr = new int[2];
            recyclerView.getLocationInWindow(iArr);
            int paddingTop = iArr[1] + recyclerView.getPaddingTop();
            int aJ = aJ();
            for (int i = 0; i < aJ; i++) {
                View aK = aK(i);
                int bm = bm(aK);
                if (bm < this.d) {
                    aK.setAlpha(0.0f);
                    M(aK, -paddingTop);
                } else if (bm < this.F) {
                    abt ak = ak(aK);
                    int i2 = ak.topMargin < 0 ? -ak.topMargin : 0;
                    if (ak.bottomMargin < 0) {
                        i2 -= ak.bottomMargin;
                    }
                    float interpolation = this.j.getInterpolation(abs);
                    aK.setAlpha(1.0f);
                    M(aK, -((int) ((i2 + paddingTop) * interpolation)));
                } else {
                    aK.setAlpha(1.0f);
                    M(aK, 0.0f);
                }
            }
        } else if (aJ() != 0) {
            int i3 = -1;
            int aJ2 = aJ() - 1;
            while (true) {
                if (aJ2 < 0) {
                    break;
                }
                View aK2 = aK(aJ2);
                if (bD(aK2) - ak(aK2).topMargin <= getPaddingTop()) {
                    i3 = aJ2;
                    break;
                }
                aJ2--;
            }
            RecyclerView recyclerView2 = (RecyclerView) aK(0).getParent();
            int[] iArr2 = new int[2];
            recyclerView2.getLocationInWindow(iArr2);
            int paddingTop2 = iArr2[1] + recyclerView2.getPaddingTop();
            int aJ3 = aJ();
            for (int i4 = 0; i4 < aJ3; i4++) {
                View aK3 = aK(i4);
                abt ak2 = ak(aK3);
                int i5 = ak2.topMargin < 0 ? paddingTop2 - ak2.topMargin : paddingTop2;
                if (ak2.bottomMargin < 0) {
                    i5 -= ak2.bottomMargin;
                }
                if (i4 < i3) {
                    aK3.setAlpha(0.0f);
                } else if (i4 > i3) {
                    aK3.setAlpha(1.0f);
                    M(aK3, 0.0f);
                } else {
                    int bj = bj(aK3);
                    int i6 = ak2.topMargin;
                    int i7 = ak2.bottomMargin;
                    float interpolation2 = this.j.getInterpolation(1.0f - (((bA(aK3) + ak2.bottomMargin) - getPaddingTop()) / ((bj + i6) + i7)));
                    aK3.setAlpha(1.0f);
                    M(aK3, -(i5 * interpolation2));
                }
            }
        }
    }

    public final void M(View view, float f) {
        if (this.f.get(view) == null) {
            coj cojVar = new coj();
            cojVar.setFillEnabled(true);
            cojVar.setFillAfter(true);
            cojVar.setDuration(0L);
            this.f.put(view, cojVar);
        }
        coj cojVar2 = this.f.get(view);
        cojVar2.reset();
        cojVar2.a = f;
        cojVar2.setStartTime(-1L);
        view.setAnimation(cojVar2);
        cojVar2.startNow();
    }

    final int N(int i) {
        if (i == -1) {
            return -1;
        }
        View I = I(i);
        if (I == null) {
            Integer ad = ad(i);
            return ad == null ? i : ad.intValue();
        }
        int bD = bD(I) - ak(I).topMargin;
        int i2 = i;
        while (i2 > 0) {
            i2--;
            View I2 = I(i2);
            if (I2 == null) {
                return i2 + 1;
            }
            if (bD(I2) - ak(I2).topMargin < bD - this.E) {
                int i3 = i2 + 1;
                return i3 == i ? i2 : i3;
            }
        }
        return 0;
    }

    @Override // defpackage.abs
    public final void O(int i) {
        if (this.g) {
            this.i = true;
            af();
        }
        this.N = i;
        as();
    }

    final int P(int i) {
        if (i == -1) {
            return -1;
        }
        View I = I(i);
        if (I == null) {
            Integer ad = ad(i);
            return ad == null ? i : ad.intValue();
        }
        int bD = bD(I) - ak(I).topMargin;
        int i2 = i;
        while (i2 < aN() - 1) {
            i2++;
            View I2 = I(i2);
            if (I2 == null) {
                return i2 - 1;
            }
            if (bD(I2) - ak(I2).topMargin > this.E + bD) {
                int i3 = i2 - 1;
                return i3 == i ? i2 : i3;
            }
        }
        return i2;
    }

    @Override // defpackage.abs
    public final int R(aci aciVar) {
        View o = o();
        if (o == null) {
            return 0;
        }
        abt ak = ak(o);
        float bm = bm(o) - Math.min((bD(o) - ak.topMargin) / ((bj(o) + ak.topMargin) + ak.bottomMargin), 1.0f);
        int b = aciVar.b() - Math.max(ah() / ag(), 1);
        if (b <= 0) {
            return 0;
        }
        float f = b;
        if (bm < f) {
            return (int) ((bm * 1000.0f) / f);
        }
        return 1000;
    }

    @Override // defpackage.abs
    public final boolean RY() {
        return true;
    }

    @Override // defpackage.abs
    public final View Sb(View view, int i, aca acaVar, aci aciVar) {
        return null;
    }

    @Override // defpackage.abs
    public final void Sg() {
        this.K = -1;
    }

    @Override // defpackage.abs
    public final int T(aci aciVar) {
        if (aJ() <= 1) {
            return 0;
        }
        int max = Math.max(ah() / ag(), 1);
        if (aciVar.b() > max) {
            return (max * 1000) / aciVar.b();
        }
        return 1000;
    }

    @Override // defpackage.abs
    public final int V(aci aciVar) {
        return 1000;
    }

    @Override // defpackage.abs
    public final void am(RecyclerView recyclerView) {
        this.L = false;
    }

    @Override // defpackage.abs
    public final void ao(RecyclerView recyclerView, int i) {
        coh cohVar = new coh(this, this.a, i, coi.STANDARD);
        this.m = cohVar;
        cohVar.g = i;
        aw(cohVar);
    }

    @Override // defpackage.abs
    public final void av(RecyclerView recyclerView) {
        Z();
        L();
    }

    @Override // defpackage.abs
    public final void bb(int i) {
        if (i == 0) {
            View aM = aM();
            if (aM != null && (bD(aM) >= this.E - getPaddingBottom() || bA(aM) <= getPaddingTop())) {
                if (al()) {
                    aM.setHovered(false);
                }
                aM.clearFocus();
                as();
            }
        } else if (i == 1) {
            this.n = 0;
        }
        if (i != 2) {
            this.m = null;
        }
        this.l = i;
        Z();
    }

    @Override // defpackage.abs
    public final boolean bu(ArrayList<View> arrayList, int i) {
        int k;
        int i2;
        if (aM() == null && (k = k()) != -1) {
            if (al()) {
                while (k < aJ()) {
                    View aK = aK(k);
                    if (aK != null) {
                        aK.addFocusables(arrayList, i);
                    }
                    k++;
                }
                return true;
            } else if (i == 2 || i == 1) {
                int t = t();
                if (t < k) {
                    t = k;
                }
                if (!G() && (i2 = k + 1) < aN() && k < t && aK(i2).hasFocusable()) {
                    k = i2;
                }
                if (!H() && t > 0 && t > k) {
                    int i3 = t - 1;
                    if (aK(i3).hasFocusable()) {
                        t = i3;
                    }
                }
                while (k <= t) {
                    View aK2 = aK(k);
                    if (aK2 != null) {
                        aK2.addFocusables(arrayList, i);
                    }
                    k++;
                }
                return true;
            } else {
                if (i != 33 && i != 130 && i != 66) {
                    if (i == 17) {
                        i = 17;
                    }
                    return false;
                }
                View F = F();
                if (F != null) {
                    F.addFocusables(arrayList, i);
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        r9.n(bm(r4));
     */
    @Override // defpackage.abs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bx(android.support.v7.widget.RecyclerView r9, android.view.View r10) {
        /*
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L4
            return r0
        L4:
            int r1 = r8.G
            r2 = -1
            if (r1 != r2) goto L10
            int r1 = r8.l()
            r8.ae(r1)
        L10:
            int r1 = bm(r10)
            int r2 = r8.J
            if (r1 != r2) goto L19
            goto L75
        L19:
            r8.J = r1
            int r1 = r8.ah()
            int r2 = bD(r10)
            int r3 = bA(r10)
            int r10 = r9.indexOfChild(r10)
        L2b:
            if (r10 < 0) goto L75
            android.view.View r4 = r8.aK(r10)
            if (r4 != 0) goto L46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 34
            r4.<init>(r5)
            java.lang.String r5 = "Child is null at index "
            r4.append(r5)
            r4.append(r10)
            r4.toString()
            goto L72
        L46:
            if (r10 != 0) goto L50
            int r10 = bm(r4)
            r9.n(r10)
            goto L75
        L50:
            int r5 = r10 + (-1)
            android.view.View r5 = r8.aK(r5)
            if (r5 == 0) goto L72
            int r6 = bD(r5)
            int r5 = bD(r5)
            int r5 = r3 - r5
            int r6 = r2 - r6
            int r7 = r1 / 2
            if (r6 > r7) goto L6a
            if (r5 <= r1) goto L72
        L6a:
            int r10 = bm(r4)
            r9.n(r10)
            goto L75
        L72:
            int r10 = r10 + (-1)
            goto L2b
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cok.bx(android.support.v7.widget.RecyclerView, android.view.View):boolean");
    }

    @Override // defpackage.abs
    public final void d(aca acaVar, aci aciVar) {
        int i;
        ViewGroup viewGroup;
        int i2;
        int i3;
        int i4 = this.N;
        if (i4 == -1) {
            View o = o();
            if (o != null) {
                i3 = bm(o);
                if (i3 < 0) {
                    i3 = k();
                }
                i2 = bD(o);
            } else {
                i2 = -1;
                i3 = 0;
            }
            int i5 = i3;
            i = i2;
            i4 = i5;
        } else {
            this.N = -1;
            this.F = i4;
            this.d = -1;
            this.e = -1;
            i = -1;
        }
        aQ(acaVar);
        int min = Math.min(i4, aN() - 1);
        if (min >= 0) {
            View d = acaVar.d(min);
            abt ak = ak(d);
            bt(d);
            int paddingLeft = getPaddingLeft() + ak.leftMargin;
            if (i == -1) {
                i = ak.topMargin;
            }
            br(d, paddingLeft, i, bk(d) + paddingLeft, bj(d) + i);
            aB(d);
            View view = d;
            while (X(aciVar, min, view, 0)) {
                view = W(acaVar, view, 0);
            }
            while (X(aciVar, min, d, 1)) {
                d = W(acaVar, d, 1);
            }
        }
        if (!this.L) {
            ab(true);
            this.L = true;
        } else {
            Z();
        }
        L();
        af();
        if (this.i) {
            if (!this.a.getResources().getBoolean(R.bool.has_wheel) && !al()) {
                return;
            }
            this.i = false;
            View p = p();
            if (p == null || ((ViewGroup) p.getParent()).isInTouchMode()) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            p.addFocusables(arrayList, 0);
            View view2 = arrayList.isEmpty() ? null : arrayList.get(0);
            if (view2 == null) {
                return;
            }
            if (this.h) {
                ViewGroup viewGroup2 = view2.getParent() instanceof ViewGroup ? (ViewGroup) view2.getParent() : null;
                loop2: while (true) {
                    viewGroup = viewGroup2;
                    while (viewGroup2 != null) {
                        if (viewGroup2.getParent() instanceof ViewGroup) {
                            viewGroup2 = (ViewGroup) viewGroup2.getParent();
                            continue;
                        } else {
                            viewGroup2 = null;
                            continue;
                        }
                        if (viewGroup2 != null) {
                            break;
                        }
                    }
                }
                if (viewGroup == null) {
                    return;
                }
                ArrayList<View> arrayList2 = new ArrayList<>();
                viewGroup.addFocusables(arrayList2, 0);
                if (!arrayList2.contains(view2)) {
                    return;
                }
            }
            p.requestFocus();
        }
    }

    @Override // defpackage.abs
    public final abt f() {
        return new abt(-1, -2);
    }

    public final int k() {
        for (int i = 0; i < aJ(); i++) {
            View aK = aK(i);
            abt ak = ak(aK);
            int bD = bD(aK);
            if (this.O) {
                bD -= ak.topMargin;
            }
            if (bD >= getPaddingTop()) {
                return i;
            }
        }
        return -1;
    }

    public final int l() {
        View o = o();
        if (o == null) {
            return -1;
        }
        return bm(o);
    }

    @Override // defpackage.abs
    public final int n(int i, aca acaVar, aci aciVar) {
        if (aN() == 0) {
            return i;
        }
        if (aJ() <= 1 || i == 0) {
            this.o = true;
            return 0;
        }
        View aK = aK(0);
        if (aK == null) {
            this.o = true;
            return 0;
        }
        int bm = bm(aK);
        int bD = bD(aK) - ak(aK).topMargin;
        View o = o();
        if (o == null) {
            this.o = true;
            return 0;
        }
        int bm2 = bm(o);
        int bD2 = (bD(o) - ak(o).topMargin) - getPaddingTop();
        if (H() && bm2 == this.F && i > bD2 && i > 0) {
            this.o = true;
            i = bD2;
        } else if (i >= 0 || bm != 0 || Math.abs(i) + bD <= getPaddingTop()) {
            this.o = false;
        } else {
            i = bD - getPaddingTop();
            this.o = true;
        }
        if (this.l == 1) {
            this.n += i;
        }
        aP(-i);
        View aK2 = aK(aJ() - 1);
        if (aK2.getTop() < 0) {
            aK2.setTop(0);
        }
        int l = l();
        if (i > 0) {
            int paddingTop = getPaddingTop() - this.E;
            View aM = aM();
            int bm3 = aM != null ? bm(aM) : Integer.MAX_VALUE;
            int aJ = aJ();
            int i2 = 0;
            for (int i3 = 0; i3 < aJ; i3++) {
                View aK3 = aK(i3);
                int bA = bA(aK3);
                int bm4 = bm(aK3);
                if (bA >= paddingTop || bm4 >= bm3 - 2 || bm4 >= l - 1) {
                    break;
                }
                i2++;
            }
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                aH(aK(0), acaVar);
            }
            View aK4 = aK(aJ() - 1);
            while (aK4 != null && X(aciVar, l, aK4, 1)) {
                aK4 = W(acaVar, aK4, 1);
            }
        } else {
            int i4 = this.E;
            View aM2 = aM();
            int bm5 = aM2 != null ? bm(aM2) : Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = 0;
            for (int aJ2 = aJ() - 1; aJ2 >= 0; aJ2--) {
                View aK5 = aK(aJ2);
                int bD3 = bD(aK5);
                int bm6 = bm(aK5);
                if (bD3 <= i4 || bm6 <= bm5 + 2 || bm6 <= l + 1) {
                    break;
                }
                i5++;
                i6 = aJ2;
            }
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                aH(aK(i6), acaVar);
            }
            View aK6 = aK(0);
            while (aK6 != null && X(aciVar, l, aK6, 0)) {
                aK6 = W(acaVar, aK6, 0);
            }
        }
        ab(aL());
        L();
        aJ();
        if (!aL()) {
            af();
        } else {
            int i7 = this.G;
            if (i7 != -1 && l != -1) {
                int i8 = this.H;
                if (l > i8 || i7 <= i8) {
                    int i9 = this.I;
                    if (l >= i9 && i7 < i9) {
                        ae(l);
                    }
                } else {
                    ae(l);
                }
            }
        }
        return i;
    }

    public final View o() {
        int k = k();
        if (k != -1) {
            return aK(k);
        }
        return null;
    }

    public final View p() {
        int k = k();
        if (k < 0 || k >= aJ()) {
            return null;
        }
        while (k < aJ()) {
            View aK = aK(k);
            if (aK.hasFocusable()) {
                return aK;
            }
            k++;
        }
        return null;
    }

    public final View q() {
        int t = t();
        if (t != -1) {
            return aK(t);
        }
        return null;
    }

    public final int t() {
        for (int aJ = aJ() - 1; aJ >= 0; aJ--) {
            View aK = aK(aJ);
            abt ak = ak(aK);
            int bA = bA(aK);
            if (this.O) {
                bA += ak.bottomMargin;
            }
            if (bA <= this.E - getPaddingBottom()) {
                return aJ;
            }
        }
        return -1;
    }

    @Override // defpackage.abs
    public final void w(int i, int i2) {
    }
}

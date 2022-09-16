package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends xw implements abg, yj {
    private wp a;
    private boolean b;
    private final wo c;
    private int d;
    private int[] e;
    public int i;
    xd j;
    public boolean k;
    boolean l;
    public boolean m;
    public boolean n;
    int o;
    int p;
    public boolean q;
    SavedState r;
    final wn s;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new cs(18);
        int a;
        int b;
        boolean c;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
            this.c = savedState.c;
        }

        final void a() {
            this.a = -1;
        }

        final boolean b() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    private final int bA(yl ylVar) {
        if (aq() == 0) {
            return 0;
        }
        V();
        return hx.d(ylVar, this.j, am(!this.n), al(!this.n), this, this.n);
    }

    private final int bB(int i, yd ydVar, yl ylVar, boolean z) {
        int f;
        int f2 = this.j.f() - i;
        if (f2 > 0) {
            int i2 = -N(-f2, ydVar, ylVar);
            int i3 = i + i2;
            if (!z || (f = this.j.f() - i3) <= 0) {
                return i2;
            }
            this.j.n(f);
            return f + i2;
        }
        return 0;
    }

    private final int bC(int i, yd ydVar, yl ylVar, boolean z) {
        int j;
        int j2 = i - this.j.j();
        if (j2 > 0) {
            int i2 = -N(j2, ydVar, ylVar);
            int i3 = i + i2;
            if (!z || (j = i3 - this.j.j()) <= 0) {
                return i2;
            }
            this.j.n(-j);
            return i2 - j;
        }
        return 0;
    }

    private final View bD() {
        return Q(0, aq());
    }

    private final View bE() {
        return Q(aq() - 1, -1);
    }

    private final View bF() {
        return az(this.l ? 0 : aq() - 1);
    }

    private final View bG() {
        return az(this.l ? aq() - 1 : 0);
    }

    private final void bH(yd ydVar, wp wpVar) {
        if (!wpVar.a || wpVar.m) {
            return;
        }
        int i = wpVar.g;
        int i2 = wpVar.i;
        if (wpVar.f == -1) {
            int aq = aq();
            if (i < 0) {
                return;
            }
            int e = (this.j.e() - i) + i2;
            if (this.l) {
                for (int i3 = 0; i3 < aq; i3++) {
                    View az = az(i3);
                    if (this.j.d(az) < e || this.j.m(az) < e) {
                        bI(ydVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = aq - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View az2 = az(i5);
                if (this.j.d(az2) < e || this.j.m(az2) < e) {
                    bI(ydVar, i4, i5);
                    return;
                }
            }
        } else if (i >= 0) {
            int i6 = i - i2;
            int aq2 = aq();
            if (!this.l) {
                for (int i7 = 0; i7 < aq2; i7++) {
                    View az3 = az(i7);
                    if (this.j.a(az3) > i6 || this.j.l(az3) > i6) {
                        bI(ydVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = aq2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View az4 = az(i9);
                if (this.j.a(az4) > i6 || this.j.l(az4) > i6) {
                    bI(ydVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bJ() {
        this.l = (this.i == 1 || !ag()) ? this.k : !this.k;
    }

    private final void bK(int i, int i2, boolean z, yl ylVar) {
        int j;
        this.a.m = ah();
        this.a.f = i;
        int[] iArr = this.e;
        iArr[0] = 0;
        int i3 = 1;
        iArr[1] = 0;
        U(ylVar, iArr);
        int max = Math.max(0, this.e[0]);
        int max2 = Math.max(0, this.e[1]);
        wp wpVar = this.a;
        int i4 = i == 1 ? max2 : max;
        wpVar.h = i4;
        if (i != 1) {
            max = max2;
        }
        wpVar.i = max;
        if (i == 1) {
            wpVar.h = i4 + this.j.g();
            View bF = bF();
            wp wpVar2 = this.a;
            if (true == this.l) {
                i3 = -1;
            }
            wpVar2.e = i3;
            int bm = bm(bF);
            wp wpVar3 = this.a;
            wpVar2.d = bm + wpVar3.e;
            wpVar3.b = this.j.a(bF);
            j = this.j.a(bF) - this.j.f();
        } else {
            View bG = bG();
            this.a.h += this.j.j();
            wp wpVar4 = this.a;
            if (true != this.l) {
                i3 = -1;
            }
            wpVar4.e = i3;
            int bm2 = bm(bG);
            wp wpVar5 = this.a;
            wpVar4.d = bm2 + wpVar5.e;
            wpVar5.b = this.j.d(bG);
            j = (-this.j.d(bG)) + this.j.j();
        }
        wp wpVar6 = this.a;
        wpVar6.c = i2;
        if (z) {
            wpVar6.c = i2 - j;
        }
        wpVar6.g = j;
    }

    private final void bL(wn wnVar) {
        bM(wnVar.b, wnVar.c);
    }

    private final void bM(int i, int i2) {
        this.a.c = this.j.f() - i2;
        wp wpVar = this.a;
        wpVar.e = true != this.l ? 1 : -1;
        wpVar.d = i;
        wpVar.f = 1;
        wpVar.b = i2;
        wpVar.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    private final void bN(wn wnVar) {
        bO(wnVar.b, wnVar.c);
    }

    private final void bO(int i, int i2) {
        this.a.c = i2 - this.j.j();
        wp wpVar = this.a;
        wpVar.d = i;
        int i3 = 1;
        if (true != this.l) {
            i3 = -1;
        }
        wpVar.e = i3;
        wpVar.f = -1;
        wpVar.b = i2;
        wpVar.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    }

    private final int c(yl ylVar) {
        if (aq() == 0) {
            return 0;
        }
        V();
        return hx.b(ylVar, this.j, am(!this.n), al(!this.n), this, this.n);
    }

    private final int q(yl ylVar) {
        if (aq() == 0) {
            return 0;
        }
        V();
        return hx.c(ylVar, this.j, am(!this.n), al(!this.n), this, this.n, this.l);
    }

    @Override // defpackage.xw
    public final int A(yl ylVar) {
        return c(ylVar);
    }

    @Override // defpackage.xw
    public final int B(yl ylVar) {
        return q(ylVar);
    }

    @Override // defpackage.xw
    public final int C(yl ylVar) {
        return bA(ylVar);
    }

    @Override // defpackage.xw
    public final int D(yl ylVar) {
        return c(ylVar);
    }

    @Override // defpackage.xw
    public final int E(yl ylVar) {
        return q(ylVar);
    }

    @Override // defpackage.xw
    public final int F(yl ylVar) {
        return bA(ylVar);
    }

    final int H(yd ydVar, wp wpVar, yl ylVar, boolean z) {
        int i = wpVar.c;
        int i2 = wpVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                wpVar.g = i2 + i;
            }
            bH(ydVar, wpVar);
        }
        int i3 = wpVar.c + wpVar.h;
        wo woVar = this.c;
        while (true) {
            if ((!wpVar.m && i3 <= 0) || !wpVar.d(ylVar)) {
                break;
            }
            woVar.a = 0;
            woVar.b = false;
            woVar.c = false;
            woVar.d = false;
            k(ydVar, ylVar, wpVar, woVar);
            if (!woVar.b) {
                int i4 = wpVar.b;
                int i5 = woVar.a;
                wpVar.b = i4 + (wpVar.f * i5);
                if (!woVar.c || wpVar.l != null || !ylVar.g) {
                    wpVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = wpVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    wpVar.g = i7;
                    int i8 = wpVar.c;
                    if (i8 < 0) {
                        wpVar.g = i7 + i8;
                    }
                    bH(ydVar, wpVar);
                }
                if (z && woVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - wpVar.c;
    }

    public int I() {
        View R = R(0, aq(), true, false);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    public final int J() {
        View R = R(0, aq(), false, true);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    public final int K() {
        View R = R(aq() - 1, -1, true, false);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    public final int L() {
        View R = R(aq() - 1, -1, false, true);
        if (R == null) {
            return -1;
        }
        return bm(R);
    }

    @Deprecated
    protected int M(yl ylVar) {
        if (ylVar.a != -1) {
            return this.j.k();
        }
        return 0;
    }

    final int N(int i, yd ydVar, yl ylVar) {
        if (aq() == 0 || i == 0) {
            return 0;
        }
        V();
        this.a.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        bK(i2, abs, true, ylVar);
        wp wpVar = this.a;
        int H = wpVar.g + H(ydVar, wpVar, ylVar, false);
        if (H < 0) {
            return 0;
        }
        if (abs > H) {
            i = i2 * H;
        }
        this.j.n(-i);
        this.a.k = i;
        return i;
    }

    @Override // defpackage.yj
    public final PointF O(int i) {
        if (aq() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < bm(az(0))) {
            z = true;
        }
        if (z != this.l) {
            i2 = -1;
        }
        if (this.i == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // defpackage.xw
    public final Parcelable P() {
        SavedState savedState = this.r;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (aq() > 0) {
            V();
            boolean z = this.b ^ this.l;
            savedState2.c = z;
            if (z) {
                View bF = bF();
                savedState2.b = this.j.f() - this.j.a(bF);
                savedState2.a = bm(bF);
            } else {
                View bG = bG();
                savedState2.a = bm(bG);
                savedState2.b = this.j.d(bG) - this.j.j();
            }
        } else {
            savedState2.a();
        }
        return savedState2;
    }

    final View Q(int i, int i2) {
        V();
        if (i2 > i || i2 < i) {
            int d = this.j.d(az(i));
            int j = this.j.j();
            int i3 = d < j ? 16388 : 4097;
            int i4 = d < j ? 16644 : 4161;
            if (this.i == 0) {
                return this.v.a(i, i2, i4, i3);
            }
            return this.w.a(i, i2, i4, i3);
        }
        return az(i);
    }

    final View R(int i, int i2, boolean z, boolean z2) {
        V();
        int i3 = 320;
        int i4 = true != z ? 320 : 24579;
        if (true != z2) {
            i3 = 0;
        }
        if (this.i == 0) {
            return this.v.a(i, i2, i4, i3);
        }
        return this.w.a(i, i2, i4, i3);
    }

    @Override // defpackage.xw
    public final View S(int i) {
        int aq = aq();
        if (aq == 0) {
            return null;
        }
        int bm = i - bm(az(0));
        if (bm >= 0 && bm < aq) {
            View az = az(bm);
            if (bm(az) == i) {
                return az;
            }
        }
        return super.S(i);
    }

    @Override // defpackage.xw
    public final void T(String str) {
        if (this.r == null) {
            super.T(str);
        }
    }

    protected final void U(yl ylVar, int[] iArr) {
        int M = M(ylVar);
        int i = this.a.f;
        int i2 = i == -1 ? 0 : M;
        if (i != -1) {
            M = 0;
        }
        iArr[0] = M;
        iArr[1] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V() {
        if (this.a == null) {
            this.a = new wp();
        }
    }

    @Override // defpackage.xw
    public void W(RecyclerView recyclerView, yd ydVar) {
        if (this.q) {
            aQ(ydVar);
            ydVar.e();
        }
    }

    @Override // defpackage.xw
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (aq() > 0) {
            accessibilityEvent.setFromIndex(J());
            accessibilityEvent.setToIndex(L());
        }
    }

    @Override // defpackage.xw
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.r = savedState;
            if (this.o != -1) {
                savedState.a();
            }
            aV();
        }
    }

    @Override // defpackage.xw
    public final void Z(int i) {
        this.o = i;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        SavedState savedState = this.r;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    public final void aa(int i, int i2) {
        this.o = i;
        this.p = i2;
        SavedState savedState = this.r;
        if (savedState != null) {
            savedState.a();
        }
        aV();
    }

    public final void ac(boolean z) {
        T(null);
        if (z == this.k) {
            return;
        }
        this.k = z;
        aV();
    }

    @Override // defpackage.xw
    public boolean ad() {
        return this.i == 0;
    }

    @Override // defpackage.xw
    public boolean ae() {
        return this.i == 1;
    }

    @Override // defpackage.xw
    public final boolean af() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean ag() {
        return au() == 1;
    }

    final boolean ah() {
        return this.j.h() == 0 && this.j.e() == 0;
    }

    @Override // defpackage.xw
    public final boolean ai() {
        if (this.G != 1073741824 && this.F != 1073741824) {
            int aq = aq();
            for (int i = 0; i < aq; i++) {
                ViewGroup.LayoutParams layoutParams = az(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xw
    public final void aj(int i, int i2, yl ylVar, we weVar) {
        if (1 == this.i) {
            i = i2;
        }
        if (aq() == 0 || i == 0) {
            return;
        }
        V();
        bK(i > 0 ? 1 : -1, Math.abs(i), true, ylVar);
        u(ylVar, this.a, weVar);
    }

    final View al(boolean z) {
        if (this.l) {
            return R(0, aq(), z, true);
        }
        return R(aq() - 1, -1, z, true);
    }

    final View am(boolean z) {
        if (this.l) {
            return R(aq() - 1, -1, z, true);
        }
        return R(0, aq(), z, true);
    }

    @Override // defpackage.abg
    public final void an(View view, View view2) {
        T("Cannot drop a view during a scroll or layout calculation");
        V();
        bJ();
        int bm = bm(view);
        int bm2 = bm(view2);
        char c = bm < bm2 ? (char) 1 : (char) 65535;
        if (this.l) {
            if (c == 1) {
                aa(bm2, this.j.f() - (this.j.d(view2) + this.j.b(view)));
            } else {
                aa(bm2, this.j.f() - this.j.a(view2));
            }
        } else if (c == 65535) {
            aa(bm2, this.j.d(view2));
        } else {
            aa(bm2, this.j.a(view2) - this.j.b(view));
        }
    }

    @Override // defpackage.xw
    public void ao(RecyclerView recyclerView, int i) {
        yk ykVar = new yk(recyclerView.getContext());
        ykVar.b = i;
        bd(ykVar);
    }

    @Override // defpackage.xw
    public int d(int i, yd ydVar, yl ylVar) {
        if (this.i == 1) {
            return 0;
        }
        return N(i, ydVar, ylVar);
    }

    @Override // defpackage.xw
    public int e(int i, yd ydVar, yl ylVar) {
        if (this.i == 0) {
            return 0;
        }
        return N(i, ydVar, ylVar);
    }

    @Override // defpackage.xw
    public xx f() {
        return new xx(-2, -2);
    }

    public View i(yd ydVar, yl ylVar, boolean z, boolean z2) {
        int i;
        int i2;
        V();
        int aq = aq();
        int i3 = -1;
        if (z2) {
            i = aq() - 1;
            i2 = -1;
        } else {
            i3 = aq;
            i = 0;
            i2 = 1;
        }
        int a = ylVar.a();
        int j = this.j.j();
        int f = this.j.f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View az = az(i);
            int bm = bm(az);
            int d = this.j.d(az);
            int a2 = this.j.a(az);
            if (bm >= 0 && bm < a) {
                if (!((xx) az.getLayoutParams()).qc()) {
                    boolean z3 = a2 <= j && d < j;
                    boolean z4 = d >= f && a2 > f;
                    if (!z3 && !z4) {
                        return az;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = az;
                        }
                        view2 = az;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = az;
                        }
                        view2 = az;
                    }
                } else if (view3 == null) {
                    view3 = az;
                }
            }
            i += i2;
        }
        return view != null ? view : view2 == null ? view3 : view2;
    }

    public void k(yd ydVar, yl ylVar, wp wpVar, wo woVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View a = wpVar.a(ydVar);
        if (a == null) {
            woVar.b = true;
            return;
        }
        xx xxVar = (xx) a.getLayoutParams();
        if (wpVar.l == null) {
            if (this.l == (wpVar.f == -1)) {
                aD(a);
            } else {
                aE(a, 0);
            }
        } else {
            if (this.l == (wpVar.f == -1)) {
                aB(a);
            } else {
                aC(a, 0);
            }
        }
        br(a);
        woVar.a = this.j.b(a);
        if (this.i == 1) {
            if (ag()) {
                i4 = this.H - getPaddingRight();
                i = i4 - this.j.c(a);
            } else {
                i = getPaddingLeft();
                i4 = this.j.c(a) + i;
            }
            if (wpVar.f == -1) {
                i2 = wpVar.b;
                i3 = i2 - woVar.a;
            } else {
                i3 = wpVar.b;
                i2 = woVar.a + i3;
            }
        } else {
            int paddingTop = getPaddingTop();
            int c = this.j.c(a) + paddingTop;
            if (wpVar.f == -1) {
                int i5 = wpVar.b;
                int i6 = i5 - woVar.a;
                i4 = i5;
                i2 = c;
                i = i6;
                i3 = paddingTop;
            } else {
                int i7 = wpVar.b;
                int i8 = woVar.a + i7;
                i = i7;
                i2 = c;
                i3 = paddingTop;
                i4 = i8;
            }
        }
        bq(a, i, i3, i4, i2);
        if (xxVar.qc() || xxVar.qb()) {
            woVar.c = true;
        }
        woVar.d = a.hasFocusable();
    }

    public void l(yd ydVar, yl ylVar, wn wnVar, int i) {
    }

    @Override // defpackage.xw
    public void n(yd ydVar, yl ylVar) {
        View i;
        int i2;
        int d;
        int i3;
        int i4;
        int i5;
        int bB;
        int i6;
        View S;
        int i7 = -1;
        if ((this.r == null && this.o == -1) || ylVar.a() != 0) {
            SavedState savedState = this.r;
            if (savedState != null && savedState.b()) {
                this.o = this.r.a;
            }
            V();
            this.a.a = false;
            bJ();
            View aA = aA();
            wn wnVar = this.s;
            if (!wnVar.e || this.o != -1 || this.r != null) {
                wnVar.d();
                wn wnVar2 = this.s;
                wnVar2.d = this.l ^ this.m;
                if (!ylVar.g && (i2 = this.o) != -1) {
                    if (i2 < 0 || i2 >= ylVar.a()) {
                        this.o = -1;
                        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                    } else {
                        wnVar2.b = this.o;
                        SavedState savedState2 = this.r;
                        if (savedState2 != null && savedState2.b()) {
                            boolean z = this.r.c;
                            wnVar2.d = z;
                            if (z) {
                                wnVar2.c = this.j.f() - this.r.b;
                            } else {
                                wnVar2.c = this.j.j() + this.r.b;
                            }
                        } else if (this.p == Integer.MIN_VALUE) {
                            View S2 = S(this.o);
                            if (S2 != null) {
                                if (this.j.b(S2) > this.j.k()) {
                                    wnVar2.a();
                                } else if (this.j.d(S2) - this.j.j() < 0) {
                                    wnVar2.c = this.j.j();
                                    wnVar2.d = false;
                                } else if (this.j.f() - this.j.a(S2) < 0) {
                                    wnVar2.c = this.j.f();
                                    wnVar2.d = true;
                                } else {
                                    if (wnVar2.d) {
                                        d = this.j.a(S2) + this.j.o();
                                    } else {
                                        d = this.j.d(S2);
                                    }
                                    wnVar2.c = d;
                                }
                            } else {
                                if (aq() > 0) {
                                    wnVar2.d = (this.o < bm(az(0))) == this.l;
                                }
                                wnVar2.a();
                            }
                        } else {
                            boolean z2 = this.l;
                            wnVar2.d = z2;
                            if (z2) {
                                wnVar2.c = this.j.f() - this.p;
                            } else {
                                wnVar2.c = this.j.j() + this.p;
                            }
                        }
                        this.s.e = true;
                    }
                }
                if (aq() != 0) {
                    View aA2 = aA();
                    if (aA2 != null) {
                        xx xxVar = (xx) aA2.getLayoutParams();
                        if (!xxVar.qc() && xxVar.qa() >= 0 && xxVar.qa() < ylVar.a()) {
                            wnVar2.c(aA2, bm(aA2));
                            this.s.e = true;
                        }
                    }
                    boolean z3 = this.b;
                    boolean z4 = this.m;
                    if (z3 == z4 && (i = i(ydVar, ylVar, wnVar2.d, z4)) != null) {
                        wnVar2.b(i, bm(i));
                        if (!ylVar.g && qh()) {
                            int d2 = this.j.d(i);
                            int a = this.j.a(i);
                            int j = this.j.j();
                            int f = this.j.f();
                            boolean z5 = a <= j && d2 < j;
                            boolean z6 = d2 >= f && a > f;
                            if (z5 || z6) {
                                if (true == wnVar2.d) {
                                    j = f;
                                }
                                wnVar2.c = j;
                            }
                        }
                        this.s.e = true;
                    }
                }
                wnVar2.a();
                wnVar2.b = this.m ? ylVar.a() - 1 : 0;
                this.s.e = true;
            } else if (aA != null && (this.j.d(aA) >= this.j.f() || this.j.a(aA) <= this.j.j())) {
                this.s.c(aA, bm(aA));
            }
            wp wpVar = this.a;
            wpVar.f = wpVar.k >= 0 ? 1 : -1;
            int[] iArr = this.e;
            iArr[0] = 0;
            iArr[1] = 0;
            U(ylVar, iArr);
            int max = Math.max(0, this.e[0]) + this.j.j();
            int max2 = Math.max(0, this.e[1]) + this.j.g();
            if (ylVar.g && (i6 = this.o) != -1 && this.p != Integer.MIN_VALUE && (S = S(i6)) != null) {
                int f2 = this.l ? (this.j.f() - this.j.a(S)) - this.p : this.p - (this.j.d(S) - this.j.j());
                if (f2 > 0) {
                    max += f2;
                } else {
                    max2 -= f2;
                }
            }
            wn wnVar3 = this.s;
            if (!wnVar3.d ? true != this.l : true == this.l) {
                i7 = 1;
            }
            l(ydVar, ylVar, wnVar3, i7);
            aG(ydVar);
            this.a.m = ah();
            wp wpVar2 = this.a;
            wpVar2.j = ylVar.g;
            wpVar2.i = 0;
            wn wnVar4 = this.s;
            if (wnVar4.d) {
                bN(wnVar4);
                wp wpVar3 = this.a;
                wpVar3.h = max;
                H(ydVar, wpVar3, ylVar, false);
                wp wpVar4 = this.a;
                i4 = wpVar4.b;
                int i8 = wpVar4.d;
                int i9 = wpVar4.c;
                if (i9 > 0) {
                    max2 += i9;
                }
                bL(this.s);
                wp wpVar5 = this.a;
                wpVar5.h = max2;
                wpVar5.d += wpVar5.e;
                H(ydVar, wpVar5, ylVar, false);
                wp wpVar6 = this.a;
                i3 = wpVar6.b;
                int i10 = wpVar6.c;
                if (i10 > 0) {
                    bO(i8, i4);
                    wp wpVar7 = this.a;
                    wpVar7.h = i10;
                    H(ydVar, wpVar7, ylVar, false);
                    i4 = this.a.b;
                }
            } else {
                bL(wnVar4);
                wp wpVar8 = this.a;
                wpVar8.h = max2;
                H(ydVar, wpVar8, ylVar, false);
                wp wpVar9 = this.a;
                i3 = wpVar9.b;
                int i11 = wpVar9.d;
                int i12 = wpVar9.c;
                if (i12 > 0) {
                    max += i12;
                }
                bN(this.s);
                wp wpVar10 = this.a;
                wpVar10.h = max;
                wpVar10.d += wpVar10.e;
                H(ydVar, wpVar10, ylVar, false);
                wp wpVar11 = this.a;
                i4 = wpVar11.b;
                int i13 = wpVar11.c;
                if (i13 > 0) {
                    bM(i11, i3);
                    wp wpVar12 = this.a;
                    wpVar12.h = i13;
                    H(ydVar, wpVar12, ylVar, false);
                    i3 = this.a.b;
                }
            }
            if (aq() > 0) {
                if (this.l ^ this.m) {
                    int bB2 = bB(i3, ydVar, ylVar, true);
                    int i14 = i4 + bB2;
                    bB = bC(i14, ydVar, ylVar, false);
                    i4 = i14 + bB;
                    i5 = i3 + bB2;
                } else {
                    int bC = bC(i4, ydVar, ylVar, true);
                    i5 = i3 + bC;
                    bB = bB(i5, ydVar, ylVar, false);
                    i4 = i4 + bC + bB;
                }
                i3 = i5 + bB;
            }
            if (ylVar.k && aq() != 0 && !ylVar.g && qh()) {
                List list = ydVar.d;
                int size = list.size();
                int bm = bm(az(0));
                int i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < size; i17++) {
                    yo yoVar = (yo) list.get(i17);
                    if (!yoVar.v()) {
                        if ((yoVar.c() < bm) != this.l) {
                            i15 += this.j.b(yoVar.a);
                        } else {
                            i16 += this.j.b(yoVar.a);
                        }
                    }
                }
                this.a.l = list;
                if (i15 > 0) {
                    bO(bm(bG()), i4);
                    wp wpVar13 = this.a;
                    wpVar13.h = i15;
                    wpVar13.c = 0;
                    wpVar13.b();
                    H(ydVar, this.a, ylVar, false);
                }
                if (i16 > 0) {
                    bM(bm(bF()), i3);
                    wp wpVar14 = this.a;
                    wpVar14.h = i16;
                    wpVar14.c = 0;
                    wpVar14.b();
                    H(ydVar, this.a, ylVar, false);
                }
                this.a.l = null;
            }
            if (!ylVar.g) {
                xd xdVar = this.j;
                xdVar.b = xdVar.k();
            } else {
                this.s.d();
            }
            this.b = this.m;
            return;
        }
        aQ(ydVar);
    }

    @Override // defpackage.xw
    public void o(yl ylVar) {
        this.r = null;
        this.o = -1;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.s.d();
    }

    @Override // defpackage.xw
    public View qe(View view, int i, yd ydVar, yl ylVar) {
        int G;
        View bE;
        View bF;
        View bD;
        bJ();
        if (aq() == 0 || (G = G(i)) == Integer.MIN_VALUE) {
            return null;
        }
        V();
        bK(G, (int) (this.j.k() * 0.33333334f), false, ylVar);
        wp wpVar = this.a;
        wpVar.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        wpVar.a = false;
        H(ydVar, wpVar, ylVar, true);
        if (G == -1) {
            if (this.l) {
                bD = bE();
            } else {
                bD = bD();
            }
            bE = bD;
            G = -1;
        } else if (this.l) {
            bE = bD();
        } else {
            bE = bE();
        }
        if (G == -1) {
            bF = bG();
        } else {
            bF = bF();
        }
        if (!bF.hasFocusable()) {
            return bE;
        }
        if (bE != null) {
            return bF;
        }
        return null;
    }

    @Override // defpackage.xw
    public boolean qh() {
        return this.r == null && this.b == this.m;
    }

    public void r(boolean z) {
        T(null);
        if (this.m == z) {
            return;
        }
        this.m = z;
        aV();
    }

    public void u(yl ylVar, wp wpVar, we weVar) {
        int i = wpVar.d;
        if (i < 0 || i >= ylVar.a()) {
            return;
        }
        weVar.a(i, Math.max(0, wpVar.g));
    }

    public LinearLayoutManager(int i) {
        this.i = 1;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = -1;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.r = null;
        this.s = new wn();
        this.c = new wo();
        this.d = 2;
        this.e = new int[2];
        ab(i);
        ac(false);
    }

    private final void bI(yd ydVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aT(i, ydVar);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            aT(i2, ydVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G(int i) {
        if (i == 1) {
            return (this.i != 1 && ag()) ? 1 : -1;
        } else if (i == 2) {
            return (this.i != 1 && ag()) ? -1 : 1;
        } else if (i == 17) {
            if (this.i != 0) {
                return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            return -1;
        } else if (i == 33) {
            if (this.i != 1) {
                return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            return -1;
        } else if (i == 66) {
            if (this.i != 0) {
                return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            return 1;
        } else if (i != 130 || this.i != 1) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        } else {
            return 1;
        }
    }

    @Override // defpackage.xw
    public final void ak(int i, we weVar) {
        boolean z;
        int i2;
        SavedState savedState = this.r;
        int i3 = -1;
        if (savedState == null || !savedState.b()) {
            bJ();
            z = this.l;
            i2 = this.o;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.r;
            z = savedState2.c;
            i2 = savedState2.a;
        }
        if (true != z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.d && i2 >= 0 && i2 < i; i4++) {
            weVar.a(i2, 0);
            i2 += i3;
        }
    }

    public final void ab(int i) {
        if (i == 0 || i == 1) {
            T(null);
            if (i == this.i && this.j != null) {
                return;
            }
            xd q = xd.q(this, i);
            this.j = q;
            this.s.a = q;
            this.i = i;
            aV();
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = 1;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = true;
        this.o = -1;
        this.p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.r = null;
        this.s = new wn();
        this.c = new wo();
        this.d = 2;
        this.e = new int[2];
        xv ax = ax(context, attributeSet, i, i2);
        ab(ax.a);
        ac(ax.c);
        r(ax.d);
    }
}

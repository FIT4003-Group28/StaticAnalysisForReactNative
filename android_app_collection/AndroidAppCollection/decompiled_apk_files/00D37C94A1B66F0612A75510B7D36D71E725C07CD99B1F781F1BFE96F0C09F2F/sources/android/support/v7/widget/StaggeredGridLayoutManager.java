package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends xw implements yj {
    private int[] K;
    zu[] a;
    public xd b;
    xd c;
    private int i;
    private int j;
    private int k;
    private final wk l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private SavedState q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
    zt h = new zt();
    private int n = 2;
    private final Rect r = new Rect();
    private final zr s = new zr(this);

    /* renamed from: J  reason: collision with root package name */
    private boolean f67J = true;
    private final Runnable L = new zq(this);

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new cs(20);
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List g;
        boolean h;
        boolean i;
        boolean j;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1 ? true : z;
            this.g = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        final void a() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        final void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        xv ax = ax(context, attributeSet, i, i2);
        int i3 = ax.a;
        if (i3 == 0 || i3 == 1) {
            T(null);
            if (i3 != this.j) {
                this.j = i3;
                xd xdVar = this.b;
                this.b = this.c;
                this.c = xdVar;
                aV();
            }
            int i4 = ax.b;
            T(null);
            if (i4 != this.i) {
                this.h.a();
                aV();
                this.i = i4;
                this.m = new BitSet(i4);
                this.a = new zu[this.i];
                for (int i5 = 0; i5 < this.i; i5++) {
                    this.a[i5] = new zu(this, i5);
                }
                aV();
            }
            G(ax.c);
            this.l = new wk();
            this.b = xd.q(this, this.j);
            this.c = xd.q(this, 1 - this.j);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    private final int K(int i) {
        if (aq() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int L(yl ylVar) {
        if (aq() == 0) {
            return 0;
        }
        return hx.b(ylVar, this.b, q(!this.f67J), l(!this.f67J), this, this.f67J);
    }

    private final int M(yl ylVar) {
        if (aq() == 0) {
            return 0;
        }
        return hx.c(ylVar, this.b, q(!this.f67J), l(!this.f67J), this, this.f67J, this.e);
    }

    private final int N(yl ylVar) {
        if (aq() == 0) {
            return 0;
        }
        return hx.d(ylVar, this.b, q(!this.f67J), l(!this.f67J), this, this.f67J);
    }

    private final int Q(yd ydVar, wk wkVar, yl ylVar) {
        int i;
        int j;
        int R;
        zu zuVar;
        boolean z;
        int f;
        int b;
        int j2;
        int b2;
        int i2;
        int i3;
        int i4;
        this.m.set(0, this.i, true);
        if (this.l.i) {
            i = wkVar.e == 1 ? Integer.MAX_VALUE : CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        } else if (wkVar.e == 1) {
            i = wkVar.g + wkVar.b;
        } else {
            i = wkVar.f - wkVar.b;
        }
        int i5 = wkVar.e;
        for (int i6 = 0; i6 < this.i; i6++) {
            if (!this.a[i6].a.isEmpty()) {
                bB(this.a[i6], i5, i);
            }
        }
        if (this.e) {
            j = this.b.f();
        } else {
            j = this.b.j();
        }
        boolean z2 = false;
        while (wkVar.a(ylVar) && (this.l.i || !this.m.isEmpty())) {
            View c = ydVar.c(wkVar.c);
            wkVar.c += wkVar.d;
            zs zsVar = (zs) c.getLayoutParams();
            int qa = zsVar.qa();
            int[] iArr = this.h.a;
            int i7 = (iArr == null || qa >= iArr.length) ? -1 : iArr[qa];
            if (i7 == -1) {
                boolean z3 = zsVar.b;
                if (bC(wkVar.e)) {
                    i3 = this.i - 1;
                    i2 = -1;
                    i4 = -1;
                } else {
                    i2 = this.i;
                    i3 = 0;
                    i4 = 1;
                }
                zu zuVar2 = null;
                if (wkVar.e == 1) {
                    int j3 = this.b.j();
                    int i8 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        zu zuVar3 = this.a[i3];
                        int d = zuVar3.d(j3);
                        int i9 = d < i8 ? d : i8;
                        if (d < i8) {
                            zuVar2 = zuVar3;
                        }
                        i3 += i4;
                        i8 = i9;
                    }
                } else {
                    int f2 = this.b.f();
                    int i10 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                    while (i3 != i2) {
                        zu zuVar4 = this.a[i3];
                        int f3 = zuVar4.f(f2);
                        int i11 = f3 > i10 ? f3 : i10;
                        if (f3 > i10) {
                            zuVar2 = zuVar4;
                        }
                        i3 += i4;
                        i10 = i11;
                    }
                }
                zuVar = zuVar2;
                zt ztVar = this.h;
                ztVar.b(qa);
                ztVar.a[qa] = zuVar.e;
            } else {
                zuVar = this.a[i7];
            }
            zsVar.a = zuVar;
            if (wkVar.e == 1) {
                aD(c);
                z = false;
            } else {
                z = false;
                aE(c, 0);
            }
            boolean z4 = zsVar.b;
            if (this.j != 1) {
                bD(c, as(this.H, this.F, getPaddingLeft() + getPaddingRight(), zsVar.width, true), as(this.k, this.G, 0, zsVar.height, false));
            } else {
                int i12 = this.k;
                int i13 = this.F;
                int i14 = zsVar.width;
                int i15 = z ? 1 : 0;
                int i16 = z ? 1 : 0;
                bD(c, as(i12, i13, i15, i14, z), as(this.I, this.G, getPaddingTop() + getPaddingBottom(), zsVar.height, true));
            }
            if (wkVar.e == 1) {
                boolean z5 = zsVar.b;
                b = zuVar.d(j);
                f = this.b.b(c) + b;
                if (i7 == -1) {
                    boolean z6 = zsVar.b;
                }
            } else {
                boolean z7 = zsVar.b;
                f = zuVar.f(j);
                b = f - this.b.b(c);
                if (i7 == -1) {
                    boolean z8 = zsVar.b;
                }
            }
            boolean z9 = zsVar.b;
            if (wkVar.e == 1) {
                zu zuVar5 = zsVar.a;
                zs n = zu.n(c);
                n.a = zuVar5;
                zuVar5.a.add(c);
                zuVar5.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                if (zuVar5.a.size() == 1) {
                    zuVar5.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                }
                if (n.qc() || n.qb()) {
                    zuVar5.d += zuVar5.f.b.b(c);
                }
            } else {
                zu zuVar6 = zsVar.a;
                zs n2 = zu.n(c);
                n2.a = zuVar6;
                zuVar6.a.add(0, c);
                zuVar6.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                if (zuVar6.a.size() == 1) {
                    zuVar6.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                }
                if (n2.qc() || n2.qb()) {
                    zuVar6.d += zuVar6.f.b.b(c);
                }
            }
            if (!J() || this.j != 1) {
                boolean z10 = zsVar.b;
                j2 = this.c.j() + (zuVar.e * this.k);
                b2 = this.c.b(c) + j2;
            } else {
                boolean z11 = zsVar.b;
                b2 = this.c.f() - (((this.i - 1) - zuVar.e) * this.k);
                j2 = b2 - this.c.b(c);
            }
            if (this.j == 1) {
                bq(c, j2, b, b2, f);
            } else {
                bq(c, b, j2, f, b2);
            }
            boolean z12 = zsVar.b;
            bB(zuVar, this.l.e, i);
            ag(ydVar, this.l);
            if (this.l.h && c.hasFocusable()) {
                boolean z13 = zsVar.b;
                this.m.set(zuVar.e, false);
            }
            z2 = true;
        }
        if (!z2) {
            ag(ydVar, this.l);
        }
        if (this.l.e == -1) {
            R = this.b.j() - U(this.b.j());
        } else {
            R = R(this.b.f()) - this.b.f();
        }
        if (R > 0) {
            return Math.min(wkVar.b, R);
        }
        return 0;
    }

    private final int R(int i) {
        int d = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int d2 = this.a[i2].d(i);
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private final int U(int i) {
        int f = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int f2 = this.a[i2].f(i);
            if (f2 < f) {
                f = f2;
            }
        }
        return f;
    }

    private final void V(yd ydVar, yl ylVar, boolean z) {
        int f;
        int R = R(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        if (R != Integer.MIN_VALUE && (f = this.b.f() - R) > 0) {
            int i = f - (-k(-f, ydVar, ylVar));
            if (!z || i <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void aa(yd ydVar, yl ylVar, boolean z) {
        int j;
        int U = U(Integer.MAX_VALUE);
        if (U != Integer.MAX_VALUE && (j = U - this.b.j()) > 0) {
            int k = j - k(j, ydVar, ylVar);
            if (!z || k <= 0) {
                return;
            }
            this.b.n(-k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ab(int r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r10.e
            if (r0 == 0) goto L9
            int r0 = r10.i()
            goto Ld
        L9:
            int r0 = r10.c()
        Ld:
            r1 = 8
            if (r13 != r1) goto L1a
            if (r11 >= r12) goto L16
            int r2 = r12 + 1
            goto L1c
        L16:
            int r2 = r11 + 1
            r3 = r12
            goto L1d
        L1a:
            int r2 = r11 + r12
        L1c:
            r3 = r11
        L1d:
            zt r4 = r10.h
            int[] r5 = r4.a
            r6 = 1
            if (r5 != 0) goto L26
            goto L92
        L26:
            int r5 = r5.length
            if (r3 >= r5) goto L92
            java.util.List r5 = r4.b
            r7 = -1
            if (r5 != 0) goto L30
        L2e:
            r5 = -1
            goto L79
        L30:
            int r5 = r5.size()
            int r5 = r5 + r7
        L35:
            if (r5 < 0) goto L47
            java.util.List r8 = r4.b
            java.lang.Object r8 = r8.get(r5)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r8 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r8
            int r9 = r8.a
            if (r9 != r3) goto L44
            goto L48
        L44:
            int r5 = r5 + (-1)
            goto L35
        L47:
            r8 = 0
        L48:
            if (r8 == 0) goto L4f
            java.util.List r5 = r4.b
            r5.remove(r8)
        L4f:
            java.util.List r5 = r4.b
            int r5 = r5.size()
            r8 = 0
        L56:
            if (r8 >= r5) goto L67
            java.util.List r9 = r4.b
            java.lang.Object r9 = r9.get(r8)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r9 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r9
            int r9 = r9.a
            if (r9 >= r3) goto L68
            int r8 = r8 + 1
            goto L56
        L67:
            r8 = -1
        L68:
            if (r8 == r7) goto L2e
            java.util.List r5 = r4.b
            java.lang.Object r5 = r5.get(r8)
            android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = (android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r5
            java.util.List r9 = r4.b
            r9.remove(r8)
            int r5 = r5.a
        L79:
            if (r5 != r7) goto L85
            int[] r5 = r4.a
            int r8 = r5.length
            java.util.Arrays.fill(r5, r3, r8, r7)
            int[] r4 = r4.a
            int r4 = r4.length
            goto L92
        L85:
            int[] r8 = r4.a
            int r8 = r8.length
            int r5 = r5 + r6
            int r5 = java.lang.Math.min(r5, r8)
            int[] r4 = r4.a
            java.util.Arrays.fill(r4, r3, r5, r7)
        L92:
            if (r13 == r6) goto Lab
            r4 = 2
            if (r13 == r4) goto La5
            if (r13 == r1) goto L9a
            goto Lb0
        L9a:
            zt r13 = r10.h
            r13.d(r11, r6)
            zt r11 = r10.h
            r11.c(r12, r6)
            goto Lb0
        La5:
            zt r13 = r10.h
            r13.d(r11, r12)
            goto Lb0
        Lab:
            zt r13 = r10.h
            r13.c(r11, r12)
        Lb0:
            if (r2 > r0) goto Lb3
            return
        Lb3:
            boolean r11 = r10.e
            if (r11 == 0) goto Lbc
            int r11 = r10.c()
            goto Lc0
        Lbc:
            int r11 = r10.i()
        Lc0:
            if (r3 > r11) goto Lc5
            r10.aV()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ab(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x03d7, code lost:
        if (I() != false) goto L246;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ac(defpackage.yd r12, defpackage.yl r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ac(yd, yl, boolean):void");
    }

    private final void ag(yd ydVar, wk wkVar) {
        int min;
        int min2;
        if (!wkVar.a || wkVar.i) {
            return;
        }
        if (wkVar.b == 0) {
            if (wkVar.e == -1) {
                ah(ydVar, wkVar.g);
                return;
            } else {
                al(ydVar, wkVar.f);
                return;
            }
        }
        int i = 1;
        if (wkVar.e == -1) {
            int i2 = wkVar.f;
            int f = this.a[0].f(i2);
            while (i < this.i) {
                int f2 = this.a[i].f(i2);
                if (f2 > f) {
                    f = f2;
                }
                i++;
            }
            int i3 = i2 - f;
            if (i3 < 0) {
                min2 = wkVar.g;
            } else {
                min2 = wkVar.g - Math.min(i3, wkVar.b);
            }
            ah(ydVar, min2);
            return;
        }
        int i4 = wkVar.g;
        int d = this.a[0].d(i4);
        while (i < this.i) {
            int d2 = this.a[i].d(i4);
            if (d2 < d) {
                d = d2;
            }
            i++;
        }
        int i5 = d - wkVar.g;
        if (i5 < 0) {
            min = wkVar.f;
        } else {
            min = Math.min(i5, wkVar.b) + wkVar.f;
        }
        al(ydVar, min);
    }

    private final void ah(yd ydVar, int i) {
        int aq = aq();
        while (true) {
            aq--;
            if (aq >= 0) {
                View az = az(aq);
                if (this.b.d(az) < i || this.b.m(az) < i) {
                    return;
                }
                zs zsVar = (zs) az.getLayoutParams();
                boolean z = zsVar.b;
                if (zsVar.a.a.size() == 1) {
                    return;
                }
                zu zuVar = zsVar.a;
                int size = zuVar.a.size();
                View view = (View) zuVar.a.remove(size - 1);
                zs n = zu.n(view);
                n.a = null;
                if (n.qc() || n.qb()) {
                    zuVar.d -= zuVar.f.b.b(view);
                }
                if (size == 1) {
                    zuVar.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                }
                zuVar.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
                aS(az, ydVar);
            } else {
                return;
            }
        }
    }

    private final void al(yd ydVar, int i) {
        while (aq() > 0) {
            View az = az(0);
            if (this.b.a(az) > i || this.b.l(az) > i) {
                return;
            }
            zs zsVar = (zs) az.getLayoutParams();
            boolean z = zsVar.b;
            if (zsVar.a.a.size() == 1) {
                return;
            }
            zu zuVar = zsVar.a;
            View view = (View) zuVar.a.remove(0);
            zs n = zu.n(view);
            n.a = null;
            if (zuVar.a.size() == 0) {
                zuVar.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            if (n.qc() || n.qb()) {
                zuVar.d -= zuVar.f.b.b(view);
            }
            zuVar.b = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            aS(az, ydVar);
        }
    }

    private final void am() {
        this.e = (this.j == 1 || !J()) ? this.d : !this.d;
    }

    private final void an(int i) {
        wk wkVar = this.l;
        wkVar.e = i;
        int i2 = 1;
        if (this.e != (i == -1)) {
            i2 = -1;
        }
        wkVar.d = i2;
    }

    private final void bA(int i, yl ylVar) {
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        wk wkVar = this.l;
        boolean z = false;
        wkVar.b = 0;
        wkVar.c = i;
        if (!bf() || (i4 = ylVar.a) == -1) {
            i2 = 0;
        } else {
            if (this.e == (i4 < i)) {
                i2 = this.b.k();
            } else {
                i3 = this.b.k();
                i2 = 0;
                recyclerView = this.u;
                if (recyclerView != null || !recyclerView.i) {
                    this.l.g = this.b.e() + i2;
                    this.l.f = -i3;
                } else {
                    this.l.f = this.b.j() - i3;
                    this.l.g = this.b.f() + i2;
                }
                wk wkVar2 = this.l;
                wkVar2.h = false;
                wkVar2.a = true;
                if (this.b.h() == 0 && this.b.e() == 0) {
                    z = true;
                }
                wkVar2.i = z;
            }
        }
        i3 = 0;
        recyclerView = this.u;
        if (recyclerView != null) {
        }
        this.l.g = this.b.e() + i2;
        this.l.f = -i3;
        wk wkVar22 = this.l;
        wkVar22.h = false;
        wkVar22.a = true;
        if (this.b.h() == 0) {
            z = true;
        }
        wkVar22.i = z;
    }

    private final void bB(zu zuVar, int i, int i2) {
        int i3 = zuVar.d;
        if (i == -1) {
            if (zuVar.e() + i3 > i2) {
                return;
            }
            this.m.set(zuVar.e, false);
        } else if (zuVar.c() - i3 < i2) {
        } else {
            this.m.set(zuVar.e, false);
        }
    }

    private final boolean bC(int i) {
        if (this.j == 0) {
            return (i == -1) != this.e;
        }
        return ((i == -1) == this.e) == J();
    }

    private final void bD(View view, int i, int i2) {
        aF(view, this.r);
        zs zsVar = (zs) view.getLayoutParams();
        int bE = bE(i, zsVar.leftMargin + this.r.left, zsVar.rightMargin + this.r.right);
        int bE2 = bE(i2, zsVar.topMargin + this.r.top, zsVar.bottomMargin + this.r.bottom);
        if (bh(view, bE, bE2, zsVar)) {
            view.measure(bE, bE2);
        }
    }

    private static final int bE(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.xw
    public final int A(yl ylVar) {
        return L(ylVar);
    }

    @Override // defpackage.xw
    public final int B(yl ylVar) {
        return M(ylVar);
    }

    @Override // defpackage.xw
    public final int C(yl ylVar) {
        return N(ylVar);
    }

    @Override // defpackage.xw
    public final int D(yl ylVar) {
        return L(ylVar);
    }

    @Override // defpackage.xw
    public final int E(yl ylVar) {
        return M(ylVar);
    }

    @Override // defpackage.xw
    public final int F(yl ylVar) {
        return N(ylVar);
    }

    public final void G(boolean z) {
        T(null);
        SavedState savedState = this.q;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.d = z;
        aV();
    }

    final void H(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean I() {
        int c;
        if (aq() != 0 && this.n != 0 && this.z) {
            if (this.e) {
                c = i();
                c();
            } else {
                c = c();
                i();
            }
            if (c == 0 && r() != null) {
                this.h.a();
                aW();
                aV();
                return true;
            }
        }
        return false;
    }

    final boolean J() {
        return au() == 1;
    }

    @Override // defpackage.yj
    public final PointF O(int i) {
        int K = K(i);
        PointF pointF = new PointF();
        if (K == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = K;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = K;
        }
        return pointF;
    }

    @Override // defpackage.xw
    public final Parcelable P() {
        int c;
        View q;
        int f;
        int j;
        int[] iArr;
        SavedState savedState = this.q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.h = this.d;
        savedState2.i = this.o;
        savedState2.j = this.p;
        zt ztVar = this.h;
        if (ztVar != null && (iArr = ztVar.a) != null) {
            savedState2.f = iArr;
            savedState2.e = savedState2.f.length;
            savedState2.g = ztVar.b;
        } else {
            savedState2.e = 0;
        }
        int i = -1;
        if (aq() > 0) {
            if (this.o) {
                c = i();
            } else {
                c = c();
            }
            savedState2.a = c;
            if (this.e) {
                q = l(true);
            } else {
                q = q(true);
            }
            if (q != null) {
                i = bm(q);
            }
            savedState2.b = i;
            int i2 = this.i;
            savedState2.c = i2;
            savedState2.d = new int[i2];
            for (int i3 = 0; i3 < this.i; i3++) {
                if (this.o) {
                    f = this.a[i3].d(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.f();
                        f -= j;
                        savedState2.d[i3] = f;
                    } else {
                        savedState2.d[i3] = f;
                    }
                } else {
                    f = this.a[i3].f(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
                    if (f != Integer.MIN_VALUE) {
                        j = this.b.j();
                        f -= j;
                        savedState2.d[i3] = f;
                    } else {
                        savedState2.d[i3] = f;
                    }
                }
            }
        } else {
            savedState2.a = -1;
            savedState2.b = -1;
            savedState2.c = 0;
        }
        return savedState2;
    }

    @Override // defpackage.xw
    public final void T(String str) {
        if (this.q == null) {
            super.T(str);
        }
    }

    @Override // defpackage.xw
    public final void W(RecyclerView recyclerView, yd ydVar) {
        bv(this.L);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.xw
    public final void X(AccessibilityEvent accessibilityEvent) {
        super.X(accessibilityEvent);
        if (aq() > 0) {
            View q = q(false);
            View l = l(false);
            if (q == null || l == null) {
                return;
            }
            int bm = bm(q);
            int bm2 = bm(l);
            if (bm < bm2) {
                accessibilityEvent.setFromIndex(bm);
                accessibilityEvent.setToIndex(bm2);
                return;
            }
            accessibilityEvent.setFromIndex(bm2);
            accessibilityEvent.setToIndex(bm);
        }
    }

    @Override // defpackage.xw
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.f != -1) {
                savedState.a();
                this.q.b();
            }
            aV();
        }
    }

    @Override // defpackage.xw
    public final void Z(int i) {
        SavedState savedState = this.q;
        if (savedState != null && savedState.a != i) {
            savedState.a();
        }
        this.f = i;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        aV();
    }

    @Override // defpackage.xw
    public final void aK(int i) {
        super.aK(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.xw
    public final void aL(int i) {
        super.aL(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.xw
    public final void aO(int i) {
        if (i == 0) {
            I();
        }
    }

    @Override // defpackage.xw
    public final boolean ad() {
        return this.j == 0;
    }

    @Override // defpackage.xw
    public final boolean ae() {
        return this.j == 1;
    }

    @Override // defpackage.xw
    public final boolean af() {
        return this.n != 0;
    }

    @Override // defpackage.xw
    public final void aj(int i, int i2, yl ylVar, we weVar) {
        int d;
        int i3;
        if (1 == this.j) {
            i = i2;
        }
        if (aq() == 0 || i == 0) {
            return;
        }
        u(i, ylVar);
        int[] iArr = this.K;
        if (iArr == null || iArr.length < this.i) {
            this.K = new int[this.i];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.i; i5++) {
            wk wkVar = this.l;
            if (wkVar.d == -1) {
                d = wkVar.f;
                i3 = this.a[i5].f(d);
            } else {
                d = this.a[i5].d(wkVar.g);
                i3 = this.l.g;
            }
            int i6 = d - i3;
            if (i6 >= 0) {
                this.K[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.K, 0, i4);
        for (int i7 = 0; i7 < i4 && this.l.a(ylVar); i7++) {
            weVar.a(this.l.c, this.K[i7]);
            wk wkVar2 = this.l;
            wkVar2.c += wkVar2.d;
        }
    }

    @Override // defpackage.xw
    public final void ao(RecyclerView recyclerView, int i) {
        yk ykVar = new yk(recyclerView.getContext());
        ykVar.b = i;
        bd(ykVar);
    }

    @Override // defpackage.xw
    public final void bs() {
        this.h.a();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (aq() == 0) {
            return 0;
        }
        return bm(az(0));
    }

    @Override // defpackage.xw
    public final int d(int i, yd ydVar, yl ylVar) {
        return k(i, ydVar, ylVar);
    }

    @Override // defpackage.xw
    public final int e(int i, yd ydVar, yl ylVar) {
        return k(i, ydVar, ylVar);
    }

    @Override // defpackage.xw
    public final xx f() {
        if (this.j == 0) {
            return new zs(-2, -1);
        }
        return new zs(-1, -2);
    }

    @Override // defpackage.xw
    public final xx h(Context context, AttributeSet attributeSet) {
        return new zs(context, attributeSet);
    }

    final int i() {
        int aq = aq();
        if (aq == 0) {
            return 0;
        }
        return bm(az(aq - 1));
    }

    final int k(int i, yd ydVar, yl ylVar) {
        if (aq() == 0 || i == 0) {
            return 0;
        }
        u(i, ylVar);
        int Q = Q(ydVar, this.l, ylVar);
        if (this.l.b >= Q) {
            i = i < 0 ? -Q : Q;
        }
        this.b.n(-i);
        this.o = this.e;
        wk wkVar = this.l;
        wkVar.b = 0;
        ag(ydVar, wkVar);
        return i;
    }

    final View l(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        View view = null;
        for (int aq = aq() - 1; aq >= 0; aq--) {
            View az = az(aq);
            int d = this.b.d(az);
            int a = this.b.a(az);
            if (a > j && d < f) {
                if (a <= f || !z) {
                    return az;
                }
                if (view == null) {
                    view = az;
                }
            }
        }
        return view;
    }

    @Override // defpackage.xw
    public final void n(yd ydVar, yl ylVar) {
        ac(ydVar, ylVar, true);
    }

    @Override // defpackage.xw
    public final void o(yl ylVar) {
        this.f = -1;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.q = null;
        this.s.a();
    }

    final View q(boolean z) {
        int j = this.b.j();
        int f = this.b.f();
        int aq = aq();
        View view = null;
        for (int i = 0; i < aq; i++) {
            View az = az(i);
            int d = this.b.d(az);
            if (this.b.a(az) > j && d < f) {
                if (d >= j || !z) {
                    return az;
                }
                if (view == null) {
                    view = az;
                }
            }
        }
        return view;
    }

    @Override // defpackage.xw
    public final xx qd(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new zs((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new zs(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
        if (r8.j == 1) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
        if (r8.j == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004c, code lost:
        if (J() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0059, code lost:
        if (J() == false) goto L107;
     */
    @Override // defpackage.xw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View qe(android.view.View r9, int r10, defpackage.yd r11, defpackage.yl r12) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.qe(android.view.View, int, yd, yl):android.view.View");
    }

    @Override // defpackage.xw
    public final void qg(Rect rect, int i, int i2) {
        int ap;
        int ap2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            ap2 = ap(i2, rect.height() + paddingTop, av());
            ap = ap(i, (this.k * this.i) + paddingLeft, aw());
        } else {
            ap = ap(i, rect.width() + paddingLeft, aw());
            ap2 = ap(i2, (this.k * this.i) + paddingTop, av());
        }
        ba(ap, ap2);
    }

    @Override // defpackage.xw
    public final boolean qh() {
        return this.q == null;
    }

    @Override // defpackage.xw
    public final void qi() {
        this.h.a();
        aV();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.view.View r() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.r():android.view.View");
    }

    @Override // defpackage.xw
    public final boolean s(xx xxVar) {
        return xxVar instanceof zs;
    }

    final void u(int i, yl ylVar) {
        int c;
        int i2;
        if (i > 0) {
            c = i();
            i2 = 1;
        } else {
            c = c();
            i2 = -1;
        }
        this.l.a = true;
        bA(c, ylVar);
        an(i2);
        wk wkVar = this.l;
        wkVar.c = c + wkVar.d;
        wkVar.b = Math.abs(i);
    }

    @Override // defpackage.xw
    public final void v(int i, int i2) {
        ab(i, i2, 1);
    }

    @Override // defpackage.xw
    public final void x(int i, int i2) {
        ab(i, i2, 8);
    }

    @Override // defpackage.xw
    public final void y(int i, int i2) {
        ab(i, i2, 2);
    }

    @Override // defpackage.xw
    public final void z(int i, int i2) {
        ab(i, i2, 4);
    }
}

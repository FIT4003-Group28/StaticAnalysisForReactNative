package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: zy  reason: default package */
/* loaded from: classes.dex */
public class zy extends aag {
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public zx g;
    final Rect h;

    public zy(Context context, int i) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new zv();
        this.h = new Rect();
        q(i);
    }

    private final void bF(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    private final void bG() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    private final int bH(aca acaVar, aci aciVar, int i) {
        if (!aciVar.g) {
            return this.g.e(i, this.b);
        }
        int c = acaVar.c(i);
        if (c == -1) {
            String str = "Cannot find span size for pre layout position. " + i;
            return 0;
        }
        return this.g.e(c, this.b);
    }

    private final int bI(aca acaVar, aci aciVar, int i) {
        if (!aciVar.g) {
            return this.g.b(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int c = acaVar.c(i);
        if (c == -1) {
            String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
            return 0;
        }
        return this.g.b(c, this.b);
    }

    private final int bJ(aca acaVar, aci aciVar, int i) {
        if (!aciVar.g) {
            return this.g.a(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int c = acaVar.c(i);
        if (c == -1) {
            String str = "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
            return 1;
        }
        return this.g.a(c);
    }

    private final void bK(View view, int i, boolean z) {
        int i2;
        int i3;
        zw zwVar = (zw) view.getLayoutParams();
        Rect rect = zwVar.d;
        int i4 = rect.top + rect.bottom + zwVar.topMargin + zwVar.bottomMargin;
        int i5 = rect.left + rect.right + zwVar.leftMargin + zwVar.rightMargin;
        int k = k(zwVar.a, zwVar.b);
        if (this.i == 1) {
            i3 = aU(k, i, i5, zwVar.width, false);
            i2 = aU(this.j.k(), this.C, i4, zwVar.height, true);
        } else {
            int aU = aU(k, i, i4, zwVar.height, false);
            int aU2 = aU(this.j.k(), this.B, i5, zwVar.width, true);
            i2 = aU;
            i3 = aU2;
        }
        bL(view, i3, i2, z);
    }

    private final void bL(View view, int i, int i2, boolean z) {
        abt abtVar = (abt) view.getLayoutParams();
        boolean z2 = true;
        if (z) {
            if (this.x && abs.aT(view.getMeasuredWidth(), i, abtVar.width) && abs.aT(view.getMeasuredHeight(), i2, abtVar.height)) {
                z2 = false;
            }
        } else {
            z2 = aS(view, i, i2, abtVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    @Override // defpackage.abs
    public final void RX(Rect rect, int i, int i2) {
        int at;
        int at2;
        if (this.c == null) {
            super.RX(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.i == 1) {
            at2 = at(i2, rect.height() + paddingTop, ba());
            int[] iArr = this.c;
            at = at(i, iArr[iArr.length - 1] + paddingLeft, aZ());
        } else {
            at = at(i, rect.width() + paddingLeft, aZ());
            int[] iArr2 = this.c;
            at2 = at(i2, iArr2[iArr2.length - 1] + paddingTop, ba());
        }
        aY(at, at2);
    }

    @Override // defpackage.aag, defpackage.abs
    public final boolean RZ() {
        return this.n == null && !this.a;
    }

    @Override // defpackage.abs
    public final abt Sa(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new zw((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new zw(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
        if (r13 != (r2 > r15)) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    @Override // defpackage.aag, defpackage.abs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Sb(android.view.View r23, int r24, defpackage.aca r25, defpackage.aci r26) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy.Sb(android.view.View, int, aca, aci):android.view.View");
    }

    @Override // defpackage.abs
    public final void Sd(aca acaVar, aci aciVar, View view, pc pcVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof zw)) {
            super.bf(view, pcVar);
            return;
        }
        zw zwVar = (zw) layoutParams;
        int bH = bH(acaVar, aciVar, zwVar.RW());
        if (this.i != 0) {
            pcVar.I(pa.a(bH, 1, zwVar.a, zwVar.b, false));
        } else {
            pcVar.I(pa.a(zwVar.a, zwVar.b, bH, 1, false));
        }
    }

    @Override // defpackage.abs
    public final int Se(aca acaVar, aci aciVar) {
        if (this.i == 0) {
            return this.b;
        }
        if (aciVar.b() > 0) {
            return bH(acaVar, aciVar, aciVar.b() - 1) + 1;
        }
        return 0;
    }

    @Override // defpackage.abs
    public final int Sf(aca acaVar, aci aciVar) {
        if (this.i == 1) {
            return this.b;
        }
        if (aciVar.b() > 0) {
            return bH(acaVar, aciVar, aciVar.b() - 1) + 1;
        }
        return 0;
    }

    @Override // defpackage.abs
    public final void Sg() {
        this.g.c();
        this.g.d();
    }

    @Override // defpackage.aag, defpackage.abs
    public final void d(aca acaVar, aci aciVar) {
        if (aciVar.g) {
            int aJ = aJ();
            for (int i = 0; i < aJ; i++) {
                zw zwVar = (zw) aK(i).getLayoutParams();
                int RW = zwVar.RW();
                this.e.put(RW, zwVar.b);
                this.f.put(RW, zwVar.a);
            }
        }
        super.d(acaVar, aciVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // defpackage.aag, defpackage.abs
    public final void e(aci aciVar) {
        super.e(aciVar);
        this.a = false;
    }

    @Override // defpackage.aag, defpackage.abs
    public final abt f() {
        if (this.i == 0) {
            return new zw(-2, -1);
        }
        return new zw(-1, -2);
    }

    @Override // defpackage.abs
    public final abt g(Context context, AttributeSet attributeSet) {
        return new zw(context, attributeSet);
    }

    @Override // defpackage.abs
    public final boolean i(abt abtVar) {
        return abtVar instanceof zw;
    }

    final int k(int i, int i2) {
        if (this.i != 1 || !M()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // defpackage.aag
    public final void l(aca acaVar, aci aciVar, aac aacVar, int i) {
        bE();
        if (aciVar.b() > 0 && !aciVar.g) {
            int bI = bI(acaVar, aciVar, aacVar.b);
            if (i == 1) {
                while (bI > 0) {
                    int i2 = aacVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aacVar.b = i3;
                    bI = bI(acaVar, aciVar, i3);
                }
            } else {
                int b = aciVar.b() - 1;
                int i4 = aacVar.b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int bI2 = bI(acaVar, aciVar, i5);
                    if (bI2 <= bI) {
                        break;
                    }
                    i4 = i5;
                    bI = bI2;
                }
                aacVar.b = i4;
            }
        }
        bG();
    }

    @Override // defpackage.aag, defpackage.abs
    public final int m(int i, aca acaVar, aci aciVar) {
        bE();
        bG();
        return super.m(i, acaVar, aciVar);
    }

    @Override // defpackage.aag, defpackage.abs
    public int n(int i, aca acaVar, aci aciVar) {
        bE();
        bG();
        return super.n(i, acaVar, aciVar);
    }

    @Override // defpackage.aag
    public final View o(aca acaVar, aci aciVar, boolean z, boolean z2) {
        int i;
        int i2;
        int aJ = aJ();
        int i3 = -1;
        if (z2) {
            i = aJ() - 1;
            i2 = -1;
        } else {
            i3 = aJ;
            i = 0;
            i2 = 1;
        }
        int b = aciVar.b();
        N();
        int d = this.j.d();
        int a = this.j.a();
        View view = null;
        View view2 = null;
        while (i != i3) {
            View aK = aK(i);
            int bm = bm(aK);
            if (bm >= 0 && bm < b && bI(acaVar, aciVar, bm) == 0) {
                if (((abt) aK.getLayoutParams()).RU()) {
                    if (view2 == null) {
                        view2 = aK;
                    }
                } else if (this.j.h(aK) < a && this.j.g(aK) >= d) {
                    return aK;
                } else {
                    if (view == null) {
                        view = aK;
                    }
                }
            }
            i += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r9 != 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
        r14 = r12;
        r13 = 0;
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
        r13 = r12 - 1;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r13 == r14) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
        r8 = r17.d[r13];
        r7 = (defpackage.zw) r8.getLayoutParams();
        r8 = bJ(r18, r19, bm(r8));
        r7.b = r8;
        r7.a = r10;
        r10 = r10 + r8;
        r13 = r13 + r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        r1 = 0.0f;
        r2 = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
        if (r2 >= r12) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
        r8 = r17.d[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        if (r20.l != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r9 != 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
        aB(r8);
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r10 = false;
        aC(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
        if (r9 != 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
        az(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00db, code lost:
        aA(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
        aV(r8, r17.h);
        bK(r8, r5, r10);
        r10 = r17.j.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
        if (r10 <= r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
        r7 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r8 = r17.j.f(r8) / ((defpackage.zw) r8.getLayoutParams()).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0102, code lost:
        if (r8 <= r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
        r2 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010a, code lost:
        if (r5 == 1073741824) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
        bF(java.lang.Math.max(java.lang.Math.round(r1 * r17.b), r6));
        r7 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
        if (r10 >= r12) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
        r1 = r17.d[r10];
        bK(r1, r2, true);
        r1 = r17.j.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012d, code lost:
        if (r1 <= r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012f, code lost:
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0130, code lost:
        r10 = r10 + 1;
        r2 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0135, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0136, code lost:
        if (r10 >= r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0138, code lost:
        r1 = r17.d[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
        if (r17.j.e(r1) == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
        r2 = (defpackage.zw) r1.getLayoutParams();
        r5 = r2.d;
        r6 = ((r5.top + r5.bottom) + r2.topMargin) + r2.bottomMargin;
        r8 = ((r5.left + r5.right) + r2.leftMargin) + r2.rightMargin;
        r5 = k(r2.a, r2.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016c, code lost:
        if (r17.i != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016e, code lost:
        r2 = aU(r5, 1073741824, r8, r2.width, false);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r6, 1073741824);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r7 - r8, 1073741824);
        r5 = aU(r5, 1073741824, r6, r2.height, false);
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018e, code lost:
        bL(r1, r2, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0195, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
        r21.a = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
        if (r17.i != 1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a2, code lost:
        if (r20.f != (-1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a4, code lost:
        r10 = r20.b;
        r1 = r10 - r7;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01aa, code lost:
        r10 = r20.b;
        r2 = r10 + r7;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
        r3 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b6, code lost:
        if (r20.f != (-1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b8, code lost:
        r10 = r20.b;
        r3 = r10 - r7;
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
        r10 = r20.b;
        r3 = r10;
        r2 = 0;
        r10 = r10 + r7;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c8, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c9, code lost:
        if (r7 >= r12) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cb, code lost:
        r5 = r17.d[r7];
        r6 = (defpackage.zw) r5.getLayoutParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d7, code lost:
        if (r17.i != 1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
        if (M() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01df, code lost:
        r3 = getPaddingLeft() + r17.c[r17.b - r6.a];
        r10 = r3;
        r3 = r3 - r17.j.f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01f8, code lost:
        r3 = getPaddingLeft() + r17.c[r6.a];
        r10 = r17.j.f(r5) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020c, code lost:
        r1 = getPaddingTop() + r17.c[r6.a];
        r2 = r17.j.f(r5) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x021e, code lost:
        bs(r5, r3, r1, r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0225, code lost:
        if (r6.RU() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022b, code lost:
        if (r6.RV() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022d, code lost:
        r21.c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022f, code lost:
        r21.d = r5.hasFocusable() | r21.d;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023b, code lost:
        java.util.Arrays.fill(r17.d, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0241, code lost:
        return;
     */
    @Override // defpackage.aag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.aca r18, defpackage.aci r19, defpackage.aae r20, defpackage.aad r21) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy.p(aca, aci, aae, aad):void");
    }

    public final void q(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i > 0) {
            this.b = i;
            this.g.c();
            as();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    @Override // defpackage.aag
    public final void t(aci aciVar, aae aaeVar, zs zsVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && aaeVar.a(aciVar) && i > 0; i2++) {
            int i3 = aaeVar.d;
            zsVar.b(i3, Math.max(0, aaeVar.g));
            i -= this.g.a(i3);
            aaeVar.d += aaeVar.e;
        }
    }

    @Override // defpackage.abs
    public final void u(int i, int i2) {
        this.g.c();
        this.g.d();
    }

    @Override // defpackage.abs
    public final void w(int i, int i2) {
        this.g.c();
        this.g.d();
    }

    @Override // defpackage.abs
    public final void x(int i, int i2) {
        this.g.c();
        this.g.d();
    }

    @Override // defpackage.abs
    public final void y(int i, int i2) {
        this.g.c();
        this.g.d();
    }

    private final void bE() {
        int paddingBottom;
        int paddingTop;
        if (this.i != 1) {
            paddingBottom = this.E - getPaddingBottom();
            paddingTop = getPaddingTop();
        } else {
            paddingBottom = this.D - getPaddingRight();
            paddingTop = getPaddingLeft();
        }
        bF(paddingBottom - paddingTop);
    }

    public zy(int i) {
        super(1, false);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new zv();
        this.h = new Rect();
        q(i);
    }
}

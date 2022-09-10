package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jik  reason: default package */
/* loaded from: classes7.dex */
public final class jik extends aai {
    private final int c;

    public jik(int i) {
        this.c = i;
    }

    private final int h(abs absVar) {
        return absVar.getPaddingLeft() + this.c;
    }

    private final int i(abs absVar) {
        return (absVar.D - absVar.getPaddingRight()) - this.c;
    }

    private static boolean j(abs absVar) {
        return absVar.ay() == 1;
    }

    @Override // defpackage.aai, defpackage.adz
    public final int[] a(abs absVar, View view) {
        int[] iArr = new int[2];
        if (!absVar.D()) {
            iArr[0] = 0;
        } else if (j(absVar)) {
            iArr[0] = view.getRight() - i(absVar);
        } else {
            iArr[0] = view.getLeft() - h(absVar);
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r6 != r0) goto L24;
     */
    @Override // defpackage.aai, defpackage.adz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.abs r4, int r5, int r6) {
        /*
            r3 = this;
            int r6 = super.b(r4, r5, r6)
            if (r5 == 0) goto L34
            android.view.View r0 = r3.c(r4)
            r1 = -1
            if (r0 != 0) goto Lf
            r0 = -1
            goto L13
        Lf:
            int r0 = defpackage.abs.bm(r0)
        L13:
            if (r0 == r1) goto L34
            if (r0 == r1) goto L1c
            if (r6 == r1) goto L1d
            if (r6 != r0) goto L34
            goto L1d
        L1c:
            r0 = -1
        L1d:
            boolean r6 = j(r4)
            r2 = 1
            if (r2 == r6) goto L25
            r1 = 1
        L25:
            if (r5 >= 0) goto L28
            int r1 = -r1
        L28:
            int r1 = r1 + r0
            if (r1 < 0) goto L33
            int r4 = r4.aN()
            if (r1 < r4) goto L32
            goto L33
        L32:
            return r1
        L33:
            return r0
        L34:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jik.b(abs, int, int):int");
    }

    @Override // defpackage.aai, defpackage.adz
    @dzsi
    public final View c(abs absVar) {
        int abs;
        View aM = absVar.aM();
        if (aM == null) {
            int i = 0;
            View view = null;
            int i2 = Integer.MAX_VALUE;
            if (!j(absVar)) {
                while (i < absVar.aJ()) {
                    View aK = absVar.aK(i);
                    if (aK != null && (abs = Math.abs(aK.getLeft() - h(absVar))) < i2) {
                        view = aK;
                        i2 = abs;
                    }
                    i++;
                }
            } else {
                while (i < absVar.aJ()) {
                    View aK2 = absVar.aK(i);
                    if (aK2 != null) {
                        int abs2 = Math.abs(i(absVar) - aK2.getRight());
                        if (abs2 < i2) {
                            view = aK2;
                            i2 = abs2;
                        }
                    }
                    i++;
                }
            }
            return view;
        }
        return aM;
    }
}

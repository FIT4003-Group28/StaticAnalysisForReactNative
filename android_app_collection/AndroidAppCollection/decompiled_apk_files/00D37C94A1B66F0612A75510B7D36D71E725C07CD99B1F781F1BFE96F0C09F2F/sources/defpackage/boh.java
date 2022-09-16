package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: boh  reason: default package */
/* loaded from: classes2.dex */
public class boh extends bnk {
    private static final String[] q = {"android:visibility:visibility", "android:visibility:parent"};
    public int p = 3;

    public static final void I(bnt bntVar) {
        bntVar.a.put("android:visibility:visibility", Integer.valueOf(bntVar.b.getVisibility()));
        bntVar.a.put("android:visibility:parent", bntVar.b.getParent());
        int[] iArr = new int[2];
        bntVar.b.getLocationOnScreen(iArr);
        bntVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (r8 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r0.e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (r0.c == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.bog J(defpackage.bnt r7, defpackage.bnt r8) {
        /*
            bog r0 = new bog
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L33
            java.util.Map r6 = r7.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r3
        L37:
            if (r8 == 0) goto L5a
            java.util.Map r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r3 = r8.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map r3 = r8.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r7 == 0) goto L83
            if (r8 == 0) goto L83
            int r7 = r0.c
            int r8 = r0.d
            if (r7 != r8) goto L71
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 == r4) goto L70
            goto L71
        L70:
            return r0
        L71:
            if (r7 == r8) goto L79
            if (r7 != 0) goto L76
            goto L94
        L76:
            if (r8 != 0) goto L97
            goto L89
        L79:
            android.view.ViewGroup r7 = r0.f
            if (r7 != 0) goto L7e
            goto L94
        L7e:
            android.view.ViewGroup r7 = r0.e
            if (r7 != 0) goto L97
            goto L89
        L83:
            if (r7 != 0) goto L8e
            int r7 = r0.d
            if (r7 != 0) goto L8e
        L89:
            r0.b = r2
        L8b:
            r0.a = r2
            goto L97
        L8e:
            if (r8 != 0) goto L97
            int r7 = r0.c
            if (r7 != 0) goto L97
        L94:
            r0.b = r1
            goto L8b
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boh.J(bnt, bnt):bog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (J(i(r1, false), j(r1, false)).a == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    @Override // defpackage.bnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.bnt r21, defpackage.bnt r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boh.a(android.view.ViewGroup, bnt, bnt):android.animation.Animator");
    }

    @Override // defpackage.bnk
    public final void b(bnt bntVar) {
        I(bntVar);
    }

    @Override // defpackage.bnk
    public void c(bnt bntVar) {
        I(bntVar);
    }

    @Override // defpackage.bnk
    public final String[] d() {
        return q;
    }

    public Animator e(View view, bnt bntVar) {
        return null;
    }

    public Animator f(View view, bnt bntVar) {
        throw null;
    }

    @Override // defpackage.bnk
    public final boolean v(bnt bntVar, bnt bntVar2) {
        if (bntVar == null && bntVar2 == null) {
            return false;
        }
        if (bntVar != null && bntVar2 != null && bntVar2.a.containsKey("android:visibility:visibility") != bntVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        bog J2 = J(bntVar, bntVar2);
        if (!J2.a) {
            return false;
        }
        return J2.c == 0 || J2.d == 0;
    }
}

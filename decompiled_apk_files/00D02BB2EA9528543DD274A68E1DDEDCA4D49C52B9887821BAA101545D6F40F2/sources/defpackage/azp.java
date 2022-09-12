package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: azp  reason: default package */
/* loaded from: classes3.dex */
public class azp extends ayn {
    private static final String[] q = {"android:visibility:visibility", "android:visibility:parent"};
    public int p = 3;

    public static void J(ayx ayxVar) {
        ayxVar.a.put("android:visibility:visibility", Integer.valueOf(ayxVar.b.getVisibility()));
        ayxVar.a.put("android:visibility:parent", ayxVar.b.getParent());
        int[] iArr = new int[2];
        ayxVar.b.getLocationOnScreen(iArr);
        ayxVar.a.put("android:visibility:screenLocation", iArr);
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
    private static final defpackage.azo K(defpackage.ayx r7, defpackage.ayx r8) {
        /*
            azo r0 = new azo
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r7.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r7.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r7.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r3
        L37:
            if (r8 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azp.K(ayx, ayx):azo");
    }

    @Override // defpackage.ayn
    public final String[] a() {
        return q;
    }

    @Override // defpackage.ayn
    public void b(ayx ayxVar) {
        throw null;
    }

    @Override // defpackage.ayn
    public void c(ayx ayxVar) {
        J(ayxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (K(n(r4, false), m(r4, false)).a == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    @Override // defpackage.ayn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator d(android.view.ViewGroup r20, defpackage.ayx r21, defpackage.ayx r22) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azp.d(android.view.ViewGroup, ayx, ayx):android.animation.Animator");
    }

    public Animator e(ViewGroup viewGroup, View view, ayx ayxVar, ayx ayxVar2) {
        throw null;
    }

    public Animator f(ViewGroup viewGroup, View view, ayx ayxVar) {
        throw null;
    }

    @Override // defpackage.ayn
    public final boolean q(ayx ayxVar, ayx ayxVar2) {
        if (ayxVar == null && ayxVar2 == null) {
            return false;
        }
        if (ayxVar != null && ayxVar2 != null && ayxVar2.a.containsKey("android:visibility:visibility") != ayxVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        azo K = K(ayxVar, ayxVar2);
        if (!K.a) {
            return false;
        }
        return K.c == 0 || K.d == 0;
    }
}

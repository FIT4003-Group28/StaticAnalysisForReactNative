package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: xsv  reason: default package */
/* loaded from: classes4.dex */
final class xsv implements ViewTreeObserver.OnGlobalLayoutListener {
    boolean a;
    final /* synthetic */ xtb b;
    final /* synthetic */ boolean c;
    final /* synthetic */ View d;
    final /* synthetic */ xtc e;

    public xsv(xtc xtcVar, xtb xtbVar, boolean z, View view) {
        this.e = xtcVar;
        this.b = xtbVar;
        this.c = z;
        this.d = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            r13 = this;
            boolean r0 = r13.a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lad
            xtc r0 = r13.e
            xtb r3 = r13.b
            boolean r4 = r13.c
            android.view.ViewGroup r5 = r3.j
            if (r5 == 0) goto Lae
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L18
            goto Lae
        L18:
            android.content.Context r1 = r0.a
            android.content.res.Resources r1 = r1.getResources()
            if (r4 == 0) goto L28
            r5 = 2131165817(0x7f070279, float:1.7945862E38)
            int r5 = r1.getDimensionPixelSize(r5)
            goto L2a
        L28:
            int r5 = r0.e
        L2a:
            if (r2 == r4) goto L30
            r6 = 2131165930(0x7f0702ea, float:1.794609E38)
            goto L33
        L30:
            r6 = 2131165931(0x7f0702eb, float:1.7946093E38)
        L33:
            int r6 = r1.getDimensionPixelSize(r6)
            if (r2 == r4) goto L3d
            r7 = 2131165932(0x7f0702ec, float:1.7946095E38)
            goto L40
        L3d:
            r7 = 2131165933(0x7f0702ed, float:1.7946097E38)
        L40:
            int r7 = r1.getDimensionPixelSize(r7)
            if (r2 == r4) goto L4a
            r8 = 2131165839(0x7f07028f, float:1.7945906E38)
            goto L4d
        L4a:
            r8 = 2131165841(0x7f070291, float:1.794591E38)
        L4d:
            int r8 = r1.getDimensionPixelSize(r8)
            if (r2 == r4) goto L57
            r9 = 2131165842(0x7f070292, float:1.7945913E38)
            goto L5a
        L57:
            r9 = 2131165844(0x7f070294, float:1.7945917E38)
        L5a:
            int r9 = r1.getDimensionPixelSize(r9)
            r10 = 2131165857(0x7f0702a1, float:1.7945943E38)
            int r10 = r1.getDimensionPixelSize(r10)
            r11 = 2131165858(0x7f0702a2, float:1.7945945E38)
            int r11 = r1.getDimensionPixelSize(r11)
            xta r12 = r3.f
            android.view.View r12 = r12.b
            defpackage.yce.f(r12, r6, r5, r7, r5)
            xta r6 = r3.f
            android.view.View r6 = r6.d
            if (r4 == 0) goto L7c
            int r7 = r0.h
            goto L7e
        L7c:
            int r7 = r0.f
        L7e:
            if (r4 == 0) goto L83
            int r4 = r0.i
            goto L85
        L83:
            int r4 = r0.g
        L85:
            defpackage.yce.f(r6, r7, r5, r4, r5)
            xta r4 = r3.f
            android.view.View r4 = r4.i
            defpackage.yce.f(r4, r8, r5, r9, r5)
            xta r4 = r3.f
            android.view.ViewGroup r4 = r4.e
            int r0 = r0.e
            defpackage.yce.f(r4, r10, r0, r11, r0)
            xta r0 = r3.f
            android.view.View r0 = r0.k
            r3 = 2131169213(0x7f070fbd, float:1.795275E38)
            int r3 = r1.getDimensionPixelSize(r3)
            r4 = 2131169214(0x7f070fbe, float:1.7952752E38)
            int r1 = r1.getDimensionPixelSize(r4)
            defpackage.yce.f(r0, r3, r5, r1, r5)
        Lad:
            r1 = 1
        Lae:
            r13.a = r1
            if (r1 == 0) goto Lbb
            android.view.View r0 = r13.d
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r13)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsv.onGlobalLayout():void");
    }
}

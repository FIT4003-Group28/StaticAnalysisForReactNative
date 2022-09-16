package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
/* compiled from: PG */
/* renamed from: abkd  reason: default package */
/* loaded from: classes.dex */
public final class abkd extends ahzj {
    private boolean e;

    public abkd(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r2.b() != 0) goto L21;
     */
    @Override // defpackage.ahzj, defpackage.ahyl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void d(android.content.Context r4, android.view.View r5) {
        /*
            r3 = this;
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            android.view.View r0 = r3.c
            if (r0 == 0) goto L18
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L18
            android.view.ViewGroup r0 = r3.b
            r0.removeAllViews()
            android.view.ViewGroup r0 = r3.b
            android.view.View r1 = r3.c
            r0.addView(r1)
        L18:
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            r1 = 12
            r2 = -1
            r0.addRule(r1, r2)
            r1 = 11
            r0.addRule(r1, r2)
            android.content.res.Resources r4 = r4.getResources()
            r1 = 2131167188(0x7f0707d4, float:1.7948643E38)
            int r4 = r4.getDimensionPixelOffset(r1)
            mb r5 = defpackage.lj.s(r5)
            r1 = 0
            if (r5 == 0) goto L65
            jx r2 = r5.k()
            if (r2 == 0) goto L51
            int r5 = r2.a()
            if (r5 == 0) goto L49
            r5 = 0
            goto L4a
        L49:
            r5 = r4
        L4a:
            int r2 = r2.b()
            if (r2 == 0) goto L66
            goto L61
        L51:
            int r2 = r5.a()
            if (r2 == 0) goto L59
            r2 = 0
            goto L5a
        L59:
            r2 = r4
        L5a:
            int r5 = r5.b()
            if (r5 == 0) goto L63
            r5 = r2
        L61:
            r4 = 0
            goto L66
        L63:
            r5 = r2
            goto L66
        L65:
            r5 = r4
        L66:
            r0.setMargins(r1, r1, r4, r5)
            android.view.ViewGroup r4 = r3.b
            r4.setLayoutParams(r0)
            boolean r4 = r3.d
            if (r4 == 0) goto L7a
            r3.m(r1)
            boolean r4 = r3.e
            r3.g(r4)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abkd.d(android.content.Context, android.view.View):void");
    }

    public final void g(boolean z) {
        this.e = z;
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(true != z ? 1.0f : 0.3f);
        }
    }

    @Override // defpackage.ahyf, defpackage.aizf
    public final /* bridge */ /* synthetic */ View kZ() {
        return this.a;
    }
}

package com.google.android.libraries.youtube.mdx.mediaroute;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import androidx.mediarouter.app.MediaRouteButton;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxMediaRouteButton extends MediaRouteButton implements adfu {
    public final azpq d;
    public azqb e;
    public adoa f;
    public azqb g;
    public acyz h;
    public aczd i;
    public boolean j;
    public adhh k;
    public adfq l;
    public mdv m;

    public MdxMediaRouteButton(Context context) {
        super(context);
        this.d = azpq.e();
        this.j = false;
    }

    private final Activity j() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // defpackage.adfu
    public final ayoi h() {
        return this.d.R();
    }

    @Override // defpackage.adfu
    public final void i() {
        adfq adfqVar = this.l;
        if (adfqVar != null) {
            adfqVar.a.a().n(new acte(acuo.b(126925)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        if (r0.a(r2) == false) goto L34;
     */
    @Override // androidx.mediarouter.app.MediaRouteButton, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performClick() {
        /*
            r5 = this;
            defpackage.ylr.c()
            mdv r0 = r5.m
            if (r0 == 0) goto La
            r0.a()
        La:
            boolean r0 = r5.j
            r1 = 1
            if (r0 != 0) goto L20
            azpq r0 = r5.d
            boolean r0 = r0.aJ()
            if (r0 != 0) goto L18
            goto L20
        L18:
            azpq r0 = r5.d
            zhx r2 = defpackage.zhx.a
            r0.c(r2)
            return r1
        L20:
            adfq r0 = r5.l
            r2 = 0
            if (r0 == 0) goto L3a
            adft r0 = r0.a
            acti r0 = r0.a()
            acte r3 = new acte
            r4 = 11208(0x2bc8, float:1.5706E-41)
            acup r4 = defpackage.acuo.b(r4)
            r3.<init>(r4)
            r4 = 3
            r0.H(r4, r3, r2)
        L3a:
            aczd r0 = r5.i
            boolean r0 = r0.b()
            if (r0 == 0) goto L97
            azqb r0 = r5.e
            java.lang.Object r0 = r0.get()
            bhd r0 = (defpackage.bhd) r0
            bhc r0 = defpackage.bhd.j()
            adoa r3 = r5.f
            adnt r3 = r3.e()
            if (r3 != 0) goto L67
            azqb r3 = r5.g
            java.lang.Object r3 = r3.get()
            adgc r3 = (defpackage.adgc) r3
            boolean r0 = r3.T(r0)
            if (r0 == 0) goto L67
            defpackage.bhd.o(r1)
        L67:
            acyz r0 = r5.h
            if (r0 == 0) goto L76
            boolean r0 = r0.e()
            if (r0 != 0) goto L76
            acyz r0 = r5.h
            r0.b()
        L76:
            adhh r0 = r5.k
            if (r0 == 0) goto L8e
            android.app.Activity r3 = r5.j()
            boolean r4 = r3 instanceof defpackage.dt
            if (r4 == 0) goto L88
            dt r3 = (defpackage.dt) r3
            eo r2 = r3.getSupportFragmentManager()
        L88:
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L94
        L8e:
            boolean r0 = super.performClick()
            if (r0 == 0) goto L95
        L94:
            return r1
        L95:
            r0 = 0
            return r0
        L97:
            aczd r0 = r5.i
            android.app.Activity r2 = r5.j()
            r0.a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.mdx.mediaroute.MdxMediaRouteButton.performClick():boolean");
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = azpq.e();
        this.j = false;
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = azpq.e();
        this.j = false;
    }
}

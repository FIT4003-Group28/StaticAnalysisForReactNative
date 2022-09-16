package com.google.android.libraries.messaging.lighter.richcard.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class RichCardContentView extends FrameLayout implements curm {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public RichCardContentView(Context context) {
        this(context, null);
    }

    @Override // defpackage.curm
    public final void a(cupx cupxVar, cuuc cuucVar, cuwi cuwiVar, cuiv cuivVar, ctyy ctyyVar, cugu cuguVar) {
        cuqd b;
        cupw cupwVar = cupw.STACK_CARD;
        int ordinal = cupxVar.b().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            curv curvVar = new curv(getContext());
            curvVar.setDrawBorder(this.c);
            if (cupxVar.b().equals(cupw.STACK_CARD)) {
                b = cupxVar.c();
            } else {
                b = cupxVar.d().b();
            }
            curvVar.a(b, cuucVar, cuwiVar, cuivVar, ctyyVar, cuguVar);
            if (!cuguVar.k().a().equals(cugt.OVERLAY)) {
                curvVar.setMaxWidth(this.a);
            }
            curvVar.setMaxHeight(this.b);
            curvVar.setClipChildren(true);
            addView(curvVar);
            ((FrameLayout.LayoutParams) curvVar.getLayoutParams()).gravity = this.d;
        } else if (ordinal != 2) {
        } else {
            cuqu cuquVar = new cuqu(getContext());
            cupm a = cupxVar.a();
            int i = this.b;
            boolean z = this.c;
            cuqs cuqsVar = new cuqs(cuucVar, cuwiVar, cuivVar, ctyyVar, cuguVar);
            cuquVar.setAdapter(cuqsVar);
            cuqsVar.a = dcdc.r(a.c());
            cuqsVar.s();
            cuqsVar.e = cuwg.a(cuquVar.getContext(), a.a());
            cuqsVar.s();
            cuqsVar.f = i;
            cuqsVar.s();
            cuqsVar.g = z;
            cuqt cuqtVar = new cuqt(cuquVar.getContext(), cuqsVar);
            cuqtVar.G(0);
            cuquVar.setLayoutManager(cuqtVar);
            addView(cuquVar);
        }
    }

    public void setDrawBorder(boolean z) {
        this.c = z;
    }

    @Override // defpackage.curm
    public void setLayoutGravity(int i) {
        this.d = i;
    }

    @Override // defpackage.cuvv
    public void setPresenter(curl curlVar) {
    }

    public RichCardContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RichCardContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = cuwg.a(getContext(), (float) dxzy.a.a().S());
        this.b = cuwg.a(getContext(), (float) dxzy.a.a().R());
        this.c = true;
        this.d = 8388611;
    }
}

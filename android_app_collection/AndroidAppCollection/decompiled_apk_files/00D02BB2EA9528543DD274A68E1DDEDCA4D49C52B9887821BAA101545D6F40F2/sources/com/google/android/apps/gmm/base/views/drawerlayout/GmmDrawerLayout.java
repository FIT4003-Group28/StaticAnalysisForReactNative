package com.google.android.apps.gmm.base.views.drawerlayout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GmmDrawerLayout extends ank {
    private final Drawable j;
    private boolean k;

    public GmmDrawerLayout(Context context) {
        this(context, null);
    }

    private final View s() {
        return getChildAt(1);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View s = s();
        anf anfVar = (anf) s.getLayoutParams();
        anfVar.a = 8388611;
        s.setLayoutParams(anfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ank, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.k) {
            cjxu.p(s(), 4);
        }
    }

    @Override // defpackage.ank, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (i == 1) {
            setDrawerShadow(new cqlv(this.j), 8388611);
        } else {
            setDrawerShadow(this.j, 8388611);
        }
    }

    public final void q() {
        View h = h(8388611);
        if (h == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + ank.i(8388611));
        }
        o(h);
    }

    public final boolean r() {
        View h = h(8388611);
        if (h != null) {
            return ank.p(h);
        }
        return false;
    }

    public void setTransparent(boolean z) {
        this.k = z;
        int i = 0;
        setScrimColor(true != z ? -1728053248 : 0);
        View s = s();
        if (true == z) {
            i = 4;
        }
        cjxu.p(s, i);
    }

    public GmmDrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GmmDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable = getContext().getResources().getDrawable(2131231111);
        this.j = drawable;
        setDrawerShadow(drawable, 8388611);
        setDrawerTitle(8388611, context.getString(R.string.ACCESSIBILITY_MENU));
        ((jep) bttc.a(jep.class, this)).EY();
    }
}

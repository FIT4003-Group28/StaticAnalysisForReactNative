package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
/* compiled from: PG */
/* renamed from: nsq  reason: default package */
/* loaded from: classes7.dex */
public final class nsq extends PagedScrollBarView {
    private boolean e;
    private boolean f;
    @dzsi
    private nsp g;
    private final FrameLayout h;

    public nsq(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        nsp nspVar;
        if (view != this || (nspVar = this.g) == null) {
            return;
        }
        nspVar.a(i);
    }

    public void setDayMode() {
        this.f = false;
        if (this.e) {
            setLightMode();
        } else {
            setDarkMode();
        }
    }

    @Override // com.google.android.apps.auto.sdk.ui.PagedScrollBarView
    public void setDayNightStyle(int i) {
        super.setDayNightStyle(i);
        FrameLayout frameLayout = this.h;
        if (frameLayout == null) {
            return;
        }
        if (i == 0) {
            frameLayout.setBackgroundColor(nql.aO.b(getContext()));
        } else if (i == 1) {
            frameLayout.setBackgroundColor(nql.aP.b(getContext()));
        } else if (i == 2) {
            frameLayout.setBackgroundColor(536870911);
        } else if (i == 3) {
            frameLayout.setBackgroundColor(520093696);
        } else {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unexpected dayNightStyle: ");
            sb.append(i);
            throw new AssertionError(sb.toString());
        }
    }

    public void setForceNightMode(boolean z) {
        this.e = z;
        if (z) {
            setLightMode();
        } else if (this.f) {
            setNightMode();
        } else {
            setDayMode();
        }
    }

    public void setNightMode() {
        this.f = true;
        setLightMode();
    }

    public void setOnVisibilityChangeListener(nsp nspVar) {
        this.g = nspVar;
    }

    public void setShowDivider(boolean z) {
        if (z) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(4);
        }
    }

    public nsq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        FrameLayout frameLayout = new FrameLayout(context, attributeSet);
        this.h = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(nqo.ax.e(context), -1));
        frameLayout.setBackgroundColor(nql.aO.b(context));
        frameLayout.setVisibility(4);
        addView(frameLayout);
        getChildAt(0).setPadding(0, nqo.R.e(context), 0, nqo.R.e(context));
        super.setAutoDayNightMode();
    }
}

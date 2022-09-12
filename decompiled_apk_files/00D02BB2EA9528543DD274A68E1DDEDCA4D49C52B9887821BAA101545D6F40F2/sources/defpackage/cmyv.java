package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.LinearLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmyv  reason: default package */
/* loaded from: classes5.dex */
public final class cmyv extends LinearLayout {
    final /* synthetic */ cmyy a;
    private final View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmyv(cmyy cmyyVar, Context context, View view) {
        super(context);
        this.a = cmyyVar;
        setOrientation(1);
        View view2 = new View(context);
        this.b = view2;
        view2.setBackgroundColor(-16777216);
        addView(view2, new LinearLayout.LayoutParams(-1, 0));
        addView(view, new LinearLayout.LayoutParams(-1, -1));
    }

    private final boolean a() {
        int i = 0;
        if (!this.a.B) {
            return false;
        }
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = (windowSystemUiVisibility & 4) == 0 && (windowSystemUiVisibility & 1024) == 0;
        View view = this.b;
        if (z) {
            i = this.a.A.top;
        }
        int i2 = -1;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        View view2 = this.b;
        if ((windowSystemUiVisibility & 8192) == 0) {
            i2 = -16777216;
        }
        view2.setBackgroundColor(i2);
        return z;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets consumeStableInsets = super.onApplyWindowInsets(windowInsets).consumeStableInsets();
        if (Build.VERSION.SDK_INT >= 28) {
            consumeStableInsets = consumeStableInsets.consumeDisplayCutout();
        }
        return consumeStableInsets.replaceSystemWindowInsets(this.a.A.left, a() ? 0 : this.a.A.top, this.a.A.right, this.a.A.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a.b) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                ((View) parent).setPadding(0, 0, 0, 0);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        a();
    }
}

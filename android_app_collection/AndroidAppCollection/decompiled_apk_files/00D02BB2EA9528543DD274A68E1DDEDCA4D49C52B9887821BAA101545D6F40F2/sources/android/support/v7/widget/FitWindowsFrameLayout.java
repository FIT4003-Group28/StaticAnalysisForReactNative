package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    private zn a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        zn znVar = this.a;
        if (znVar != null) {
            znVar.a();
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(zn znVar) {
        this.a = znVar;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.w;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements w {

    /* renamed from: a  reason: collision with root package name */
    private w.a f834a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(w.a aVar) {
        this.f834a = aVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f834a != null) {
            this.f834a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}

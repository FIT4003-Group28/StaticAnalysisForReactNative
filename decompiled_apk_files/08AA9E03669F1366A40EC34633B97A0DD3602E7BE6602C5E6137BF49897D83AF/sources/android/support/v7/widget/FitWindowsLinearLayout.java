package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.w;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements w {

    /* renamed from: a  reason: collision with root package name */
    private w.a f835a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(w.a aVar) {
        this.f835a = aVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f835a != null) {
            this.f835a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}

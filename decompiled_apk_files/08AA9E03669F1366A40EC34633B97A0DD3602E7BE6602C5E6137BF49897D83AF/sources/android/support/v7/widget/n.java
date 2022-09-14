package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* compiled from: AppCompatPopupWindow.java */
/* loaded from: classes.dex */
class n extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f984a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f985b;

    static {
        f984a = Build.VERSION.SDK_INT < 21;
    }

    public n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        am a2 = am.a(context, attributeSet, a.j.PopupWindow, i, i2);
        if (a2.f(a.j.PopupWindow_overlapAnchor)) {
            a(a2.a(a.j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a2.a(a.j.PopupWindow_android_popupBackground));
        a2.a();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f984a && this.f985b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f984a && this.f985b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f984a && this.f985b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    private void a(boolean z) {
        if (f984a) {
            this.f985b = z;
        } else {
            android.support.v4.widget.l.a(this, z);
        }
    }
}

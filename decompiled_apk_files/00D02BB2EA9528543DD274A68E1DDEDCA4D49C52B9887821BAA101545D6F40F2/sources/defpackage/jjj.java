package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: jjj  reason: default package */
/* loaded from: classes7.dex */
public final class jjj extends FrameLayout implements glg {
    public jjj(Context context) {
        super(context);
    }

    @Override // defpackage.glg
    public final int a() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getChildAt(0).getMeasuredWidth();
    }

    @Override // defpackage.glg
    public final void b(glf glfVar) {
    }

    @Override // defpackage.glg
    public final void c(glf glfVar) {
    }

    @Override // defpackage.glg
    public final View d() {
        return this;
    }

    @Override // defpackage.glg
    public final boolean e() {
        return false;
    }

    public jjj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public jjj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

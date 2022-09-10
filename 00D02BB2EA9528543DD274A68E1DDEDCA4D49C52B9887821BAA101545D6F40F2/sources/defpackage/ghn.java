package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: ghn  reason: default package */
/* loaded from: classes6.dex */
public final class ghn extends jnq {
    public static final cqkv n = new gho();
    private boolean A;
    private int B;
    private boolean C;

    public ghn(Context context) {
        super(context);
        this.A = false;
        this.B = 0;
        this.C = false;
    }

    @Override // defpackage.jnq, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A = motionEvent.getY() < ((float) this.B);
        }
        if (this.A) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p(e(), 0.0f, 0);
    }

    @Override // defpackage.jnq, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setDisableChildViewScrolling(boolean z) {
        this.C = z;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        super.onSizeChanged(width, height, 0, height);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        super.onSizeChanged(width, height, 0, height);
    }

    public void setTopTouchFilterHeight(int i) {
        this.B = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public final boolean u(View view, boolean z, int i, int i2, int i3) {
        if (this.C) {
            return false;
        }
        return super.u(view, z, i, i2, i3);
    }

    public ghn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = false;
        this.B = 0;
        this.C = false;
    }
}

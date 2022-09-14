package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: nsy  reason: default package */
/* loaded from: classes7.dex */
public final class nsy extends FrameLayout {
    private boolean a;
    private View.OnTouchListener b;

    public nsy(Context context) {
        super(context);
        this.a = false;
        this.b = nsv.a;
        setRestrictInteraction(this.a);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            this.b.onTouch(this, motionEvent);
        }
        return this.a;
    }

    public void setOnRestrictedTouchListener(View.OnTouchListener onTouchListener) {
        this.b = onTouchListener;
    }

    public void setRestrictInteraction(boolean z) {
        this.a = z;
        if (z) {
            setDescendantFocusability(ImageMetadata.HOT_PIXEL_MODE);
            setAlpha(0.4f);
            return;
        }
        setDescendantFocusability(262144);
        setAlpha(1.0f);
    }

    public nsy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = nsw.a;
        setRestrictInteraction(this.a);
    }

    public nsy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = nsx.a;
        setRestrictInteraction(this.a);
    }
}

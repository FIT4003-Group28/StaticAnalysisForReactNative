package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: jei  reason: default package */
/* loaded from: classes7.dex */
public final class jei extends ImageView {
    private boolean a;

    public jei(Context context) {
        super(context);
        this.a = true;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.a) {
            return false;
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setPresentation(boolean z) {
        this.a = z;
    }

    public jei(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
    }

    public jei(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = true;
    }
}

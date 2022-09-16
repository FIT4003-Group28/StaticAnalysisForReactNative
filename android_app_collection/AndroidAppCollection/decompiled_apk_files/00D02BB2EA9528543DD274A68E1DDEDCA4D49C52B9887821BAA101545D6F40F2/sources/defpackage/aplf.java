package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aplf  reason: default package */
/* loaded from: classes2.dex */
public final class aplf extends zuc {
    private float r;

    public aplf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = getContext().getResources().getDimension(R.dimen.timeline_segment_schematic_line_break_at_y);
    }

    @Override // defpackage.zuc, android.view.View
    protected final void onDraw(Canvas canvas) {
        q(canvas, Math.min(this.r, getHeight()));
    }

    public void setBreakLineAtY(float f) {
        this.r = f;
    }
}

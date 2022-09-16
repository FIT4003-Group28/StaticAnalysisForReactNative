package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: cdyw  reason: default package */
/* loaded from: classes4.dex */
public class cdyw extends RecyclerView {
    private dzut<dztc> S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdyw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dzvx.c(context, "context");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dzut<dztc> dzutVar;
        if (motionEvent != null && motionEvent.getActionMasked() == 1 && motionEvent.getY() < 0.0f && (dzutVar = this.S) != null) {
            dzutVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setScrollOutsideCallback(dzut<dztc> dzutVar) {
        this.S = dzutVar;
    }
}

package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cguw  reason: default package */
/* loaded from: classes4.dex */
public final class cguw extends jnq {
    private float A;
    private float n;

    public cguw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.jnq, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        cgwd cgwdVar;
        if (!this.p) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.n = motionEvent.getX();
                this.A = motionEvent.getY();
            } else if (action == 1) {
                float x = motionEvent.getX();
                if (Math.abs(x - this.n) > Math.abs(motionEvent.getY() - this.A) && Math.abs(x - this.n) > 20.0f && (cgwdVar = (cgwd) cqkx.i((View) getParent())) != null && !cgwdVar.g().booleanValue()) {
                    Toast.makeText(getContext(), (int) R.string.UGC_TASK_CARD_PENDING_CONTRIBUTIONS_NOTICE, 0).show();
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}

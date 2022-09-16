package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: acjo  reason: default package */
/* loaded from: classes.dex */
final class acjo implements View.OnTouchListener {
    final /* synthetic */ ScaleGestureDetector a;
    final /* synthetic */ acjs b;

    public acjo(acjs acjsVar, ScaleGestureDetector scaleGestureDetector) {
        this.b = acjsVar;
        this.a = scaleGestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 5) {
            if (motionEvent.getPointerCount() >= 2) {
                this.b.aq = true;
            }
            action = 5;
        }
        if (action == 0) {
            this.b.ar = true;
        }
        if (action == 2) {
            if ((motionEvent.getHistorySize() == 0 ? 0.0f : (float) Math.hypot(motionEvent.getX() - motionEvent.getHistoricalX(0), motionEvent.getY() - motionEvent.getHistoricalY(0))) > 20.0f) {
                this.b.ar = false;
            }
        }
        if (action == 1) {
            acjs acjsVar = this.b;
            if (acjsVar.aq || !acjsVar.ar) {
                if (motionEvent.getPointerCount() < 2) {
                    this.b.aq = false;
                }
                view.performClick();
            } else {
                acjsVar.ar = false;
                acjp acjpVar = acjsVar.ak;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                acke ackeVar = (acke) acjpVar;
                if (ackeVar.af.c().B) {
                    ackeVar.e.aK(x, y, new acjx(ackeVar));
                }
                return true;
            }
        }
        if (!this.b.aq || action != 2) {
            return false;
        }
        return this.a.onTouchEvent(motionEvent);
    }
}

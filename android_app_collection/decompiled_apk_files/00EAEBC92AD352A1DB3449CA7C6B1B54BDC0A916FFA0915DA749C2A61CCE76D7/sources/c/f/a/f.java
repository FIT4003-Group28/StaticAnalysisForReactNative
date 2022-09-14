package c.f.a;

import android.view.MotionEvent;
/* loaded from: classes.dex */
public class f {
    public static float a(MotionEvent motionEvent, boolean z) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount() - 1;
            if (pointerCount == actionIndex) {
                pointerCount--;
            }
            return motionEvent.getX(pointerCount) + rawX;
        }
        float f2 = 0.0f;
        int pointerCount2 = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            if (i2 != actionIndex) {
                f2 += motionEvent.getX(i2) + rawX;
                i++;
            }
        }
        return f2 / i;
    }

    public static float b(MotionEvent motionEvent, boolean z) {
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount() - 1;
            if (pointerCount == actionIndex) {
                pointerCount--;
            }
            return motionEvent.getY(pointerCount) + rawY;
        }
        float f2 = 0.0f;
        int pointerCount2 = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount2; i2++) {
            if (i2 != actionIndex) {
                f2 += motionEvent.getY(i2) + rawY;
                i++;
            }
        }
        return f2 / i;
    }
}

package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: blww  reason: default package */
/* loaded from: classes3.dex */
public final class blww implements View.OnTouchListener {
    public boolean a;
    private final Activity b;
    private final blwv c;
    private final GestureDetector d;
    private int e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;

    public blww(Activity activity, blwv blwvVar) {
        this.b = activity;
        this.c = blwvVar;
        this.d = new GestureDetector(activity, new blwu(this, activity), new Handler(Looper.getMainLooper()));
    }

    private final float a(float f, float f2) {
        float e = cqsz.c().e(this.b);
        float f3 = bvox.b(this.b) ? f - f2 : f2 - f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return f3 / e;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.e == 0) {
            this.e = ViewConfiguration.get(this.b).getScaledTouchSlop();
        }
        this.c.a();
        this.d.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.a = false;
            this.f = motionEvent.getRawX();
            this.g = motionEvent.getRawX();
            this.h = false;
        } else if (action == 1) {
            this.h = false;
            if (this.a || a(motionEvent.getRawX(), this.f) > 0.4f) {
                this.c.e();
            } else {
                this.c.d();
            }
        } else if (action == 2) {
            float rawX = motionEvent.getRawX();
            if (!this.h) {
                float f = this.f;
                int i = this.e;
                if (!bvox.b(this.b) ? f - rawX > i : rawX - f > i) {
                    this.h = true;
                    this.i = rawX < this.f;
                    this.c.b();
                }
            }
            if (this.h) {
                float f2 = this.g;
                int i2 = this.e;
                if (!this.i ? rawX > f2 || f2 - rawX > i2 : rawX < f2 || rawX - f2 > i2) {
                    if (rawX < f2) {
                        z = true;
                    }
                    this.i = z;
                    float f3 = this.f;
                    float f4 = rawX - f3;
                    float a = (a(rawX, f3) * 10.0f) / 0.4f;
                    if (!bvox.b(this.b)) {
                        a = -a;
                    }
                    this.g = rawX;
                    this.c.c(f4, a);
                }
            }
        }
        return true;
    }
}

package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: PG */
/* renamed from: zbt  reason: default package */
/* loaded from: classes4.dex */
public class zbt extends zbm {
    private final ViewConfiguration a;
    private boolean b;
    public zbs d;
    protected boolean e;
    private float f;
    private float g;

    public zbt(ViewConfiguration viewConfiguration) {
        viewConfiguration.getClass();
        this.a = viewConfiguration;
    }

    @Override // defpackage.zbr
    public void c() {
        this.b = false;
        this.e = false;
    }

    @Override // defpackage.zbr
    public boolean d(View view, MotionEvent motionEvent) {
        zbs zbsVar;
        boolean e = e(motionEvent);
        if (!e || (zbsVar = this.d) == null) {
            return e;
        }
        zbsVar.b(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 3) {
            c();
        } else {
            boolean z = true;
            if (!this.b || motionEvent.getActionMasked() != 1) {
                if (motionEvent.getActionMasked() == 0) {
                    this.b = true;
                    this.f = motionEvent.getRawX();
                    this.g = motionEvent.getRawY();
                } else if (!this.b || motionEvent.getActionMasked() != 2) {
                    if (this.b && motionEvent.getActionMasked() == 6) {
                        if (motionEvent.getPointerCount() <= 1) {
                            z = false;
                        }
                        this.e = z;
                    }
                } else {
                    float scaledTouchSlop = this.a.getScaledTouchSlop();
                    if (Math.abs(motionEvent.getRawX() - this.f) > scaledTouchSlop || Math.abs(motionEvent.getRawY() - this.g) > scaledTouchSlop) {
                        this.b = false;
                    }
                }
            } else {
                this.b = false;
                return true;
            }
        }
        return false;
    }
}

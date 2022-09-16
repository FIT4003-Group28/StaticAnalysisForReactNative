package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* renamed from: hor  reason: default package */
/* loaded from: classes3.dex */
public final class hor extends zmz implements View.OnTouchListener {
    final zmy a;
    private final hoq b;
    private final View c;
    private final boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private float h;
    private float i;
    private final Rect j = new Rect();

    public hor(hoq hoqVar, View view, boolean z, boolean z2) {
        this.b = hoqVar;
        this.c = view;
        this.d = z2;
        this.a = z ? new zmy(view.getContext(), this) : null;
    }

    public final boolean f(int i, KeyEvent keyEvent) {
        if (i == 24 || i == 25) {
            keyEvent.startTracking();
            if (!this.f && !this.e) {
                this.f = true;
                this.b.mf();
            }
            return true;
        }
        return false;
    }

    public final boolean g(int i) {
        return (i == 24 || i == 25) && !this.e;
    }

    public final boolean h(int i) {
        if (i == 24 || i == 25) {
            if (this.f && !this.e) {
                this.b.mh();
            }
            this.f = false;
            return true;
        }
        return false;
    }

    @Override // defpackage.zmz, defpackage.zmv
    public final void me(int i) {
        if (i == 4) {
            this.g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Rect rect;
        zmy zmyVar = this.a;
        if (zmyVar != null) {
            this.g = false;
            zmyVar.onTouch(view, motionEvent);
            if (this.g) {
                this.b.mg();
                return true;
            }
        }
        if (motionEvent.getAction() == 1) {
            if (this.e && !this.f) {
                this.b.mh();
            }
            this.e = false;
            view.performClick();
        } else if ((!this.e && !this.f) || motionEvent.getAction() != 2 || motionEvent.getPointerCount() != 1) {
            if (motionEvent.getAction() == 0) {
                if (!this.f) {
                    this.e = true;
                    this.b.mf();
                }
                this.h = motionEvent.getRawX();
                this.i = motionEvent.getRawY();
            }
        } else {
            if (this.d) {
                this.b.mk(motionEvent.getRawX() - this.h, motionEvent.getRawY() - this.i);
            }
            this.c.getGlobalVisibleRect(this.j);
            float max = Math.max(0.0f, (this.j.exactCenterY() - motionEvent.getRawY()) - (rect.height() / 2));
            if (max > 0.0f) {
                float top = this.c.getTop() - this.j.height();
                if (top >= 1.0f) {
                    this.b.ml(max / top);
                }
            }
            return true;
        }
        return true;
    }
}

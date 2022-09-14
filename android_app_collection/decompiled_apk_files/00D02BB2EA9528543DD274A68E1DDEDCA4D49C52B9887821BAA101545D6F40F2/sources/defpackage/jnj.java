package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jnj  reason: default package */
/* loaded from: classes7.dex */
public final class jnj {
    private final View a;
    private boolean b;
    private float c;
    private float d;
    private final int e;

    public jnj(jnk jnkVar, View view) {
        this.a = view;
        this.e = ViewConfiguration.get(jnkVar.getContext()).getScaledPagingTouchSlop();
    }

    private final boolean b(float f, float f2, float f3, float f4) {
        return Math.abs(f - f3) < ((float) this.e) && Math.abs(f2 - f4) < ((float) this.e);
    }

    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || this.a.getVisibility() != 0 || motionEvent.getX() < this.a.getLeft() || motionEvent.getX() > this.a.getRight() || motionEvent.getY() < this.a.getTop() || motionEvent.getY() > this.a.getBottom()) {
            if (motionEvent.getAction() != 2 || !this.b) {
                if (motionEvent.getAction() != 1 || !this.b) {
                    this.b = false;
                    this.a.setPressed(false);
                    return false;
                }
                this.b = false;
                this.a.setPressed(false);
                return b(this.c, this.d, motionEvent.getX(), motionEvent.getY());
            }
            if (!b(this.c, this.d, motionEvent.getX(), motionEvent.getY())) {
                this.b = false;
                this.a.setPressed(false);
            }
            return false;
        }
        this.b = true;
        this.a.setPressed(true);
        this.c = motionEvent.getX();
        this.d = motionEvent.getY();
        return false;
    }
}

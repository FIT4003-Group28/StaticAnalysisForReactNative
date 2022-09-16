package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: hpd  reason: default package */
/* loaded from: classes3.dex */
public final class hpd extends zmy {
    private final Context a;
    private final zmv c;
    private final zld d;
    private ScaleGestureDetector e;
    private final zmb f;
    private boolean g;
    private boolean h;

    public hpd(Context context, zmv zmvVar, zmb zmbVar) {
        super(context, zmvVar);
        context.getClass();
        this.a = context;
        zmvVar.getClass();
        this.c = zmvVar;
        this.d = new zld(context, new zmx(this, zmvVar));
        this.f = zmbVar;
    }

    @Override // defpackage.zmy
    public final boolean a() {
        return !this.f.H();
    }

    @Override // defpackage.zmy, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.d.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        boolean b = b(this.g, view, action, motionEvent);
        this.g = b;
        if (b) {
            this.h = true;
        }
        if (action == 1) {
            this.e = null;
            if (!b && !this.h && this.f.H()) {
                this.c.e(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 0) {
            this.h = false;
        }
        if (!this.g || action != 2) {
            return true;
        }
        if (this.e == null) {
            this.e = new ScaleGestureDetector(this.a, new zmw(this.c));
        }
        return this.e.onTouchEvent(motionEvent);
    }
}

package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: zmy  reason: default package */
/* loaded from: classes4.dex */
public class zmy implements View.OnTouchListener {
    private final Context a;
    final GestureDetector b;
    private final zmv c;
    private ScaleGestureDetector d;
    private boolean e;

    public zmy(Context context, zmv zmvVar) {
        context.getClass();
        this.a = context;
        zmvVar.getClass();
        this.c = zmvVar;
        this.b = new GestureDetector(context, new zmx(this, zmvVar));
    }

    public static boolean b(boolean z, View view, int i, MotionEvent motionEvent) {
        if (i == 1) {
            view.performClick();
            return false;
        } else if (i == 5) {
            return true;
        } else {
            if (i != 6 || motionEvent.getPointerCount() >= 2) {
                return z;
            }
            return false;
        }
    }

    public boolean a() {
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.b.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        boolean b = b(this.e, view, action, motionEvent);
        this.e = b;
        if (action == 1) {
            this.d = null;
            action = 1;
        }
        if (!b || action != 2) {
            return true;
        }
        if (this.d == null) {
            this.d = new ScaleGestureDetector(this.a, new zmw(this.c));
        }
        return this.d.onTouchEvent(motionEvent);
    }
}

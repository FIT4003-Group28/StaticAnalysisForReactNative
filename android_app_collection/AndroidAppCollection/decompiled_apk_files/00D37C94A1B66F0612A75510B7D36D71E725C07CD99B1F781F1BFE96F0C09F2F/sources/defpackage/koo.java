package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
/* compiled from: PG */
/* renamed from: koo  reason: default package */
/* loaded from: classes3.dex */
public final class koo extends zbm implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean b;
    private final ScaleGestureDetector d;
    private final GestureDetector e;
    private final afy f = new afy();
    public boolean a = false;

    public koo(Context context) {
        this.d = new ScaleGestureDetector(context, this);
        this.e = new GestureDetector(context, new kom(this));
    }

    @Override // defpackage.zbr
    public final void c() {
        this.a = false;
    }

    @Override // defpackage.zbr
    public final boolean d(View view, MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
        this.d.onTouchEvent(motionEvent);
        if (this.a && motionEvent.getPointerCount() == 1 && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            int i = 0;
            while (true) {
                afy afyVar = this.f;
                if (i >= afyVar.b) {
                    break;
                }
                ((kon) afyVar.b(i)).t(this.b);
                i++;
            }
            this.a = false;
            this.b = false;
        }
        return this.a;
    }

    public final void e(kon konVar) {
        this.f.add(konVar);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        int i = 0;
        while (true) {
            afy afyVar = this.f;
            if (i < afyVar.b) {
                ((kon) afyVar.b(i)).u(scaleFactor);
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.a = true;
        int i = 0;
        while (true) {
            afy afyVar = this.f;
            if (i < afyVar.b) {
                ((kon) afyVar.b(i)).s();
                i++;
            } else {
                return true;
            }
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}

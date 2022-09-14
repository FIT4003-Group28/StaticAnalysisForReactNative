package c.f.a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class h extends b<h> {
    private boolean A;
    private boolean z;

    public h() {
        b(true);
    }

    private static boolean a(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    @Override // c.f.a.b
    public boolean b(b bVar) {
        return !this.A;
    }

    public h c(boolean z) {
        this.A = z;
        return this;
    }

    @Override // c.f.a.b
    protected void c(MotionEvent motionEvent) {
        View m = m();
        int k = k();
        if (motionEvent.getActionMasked() == 1) {
            m.onTouchEvent(motionEvent);
            if ((k == 0 || k == 2) && m.isPressed()) {
                a();
            }
            d();
        } else if (k != 0 && k != 2) {
            if (k != 4) {
                return;
            }
            m.onTouchEvent(motionEvent);
        } else {
            if (this.z) {
                a(m, motionEvent);
            } else if (!a(m, motionEvent)) {
                if (k == 2) {
                    return;
                }
                b();
                return;
            }
            m.onTouchEvent(motionEvent);
            a();
        }
    }

    @Override // c.f.a.b
    public boolean c(b bVar) {
        if (bVar instanceof h) {
            h hVar = (h) bVar;
            if (hVar.k() == 4 && hVar.A) {
                return false;
            }
        }
        boolean z = !this.A;
        int k = k();
        return !(k == 4 && bVar.k() == 4 && z) && k == 4 && z;
    }

    public h d(boolean z) {
        this.z = z;
        return this;
    }

    @Override // c.f.a.b
    public boolean d(b bVar) {
        return super.d(bVar);
    }

    @Override // c.f.a.b
    protected void p() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        m().onTouchEvent(obtain);
    }
}

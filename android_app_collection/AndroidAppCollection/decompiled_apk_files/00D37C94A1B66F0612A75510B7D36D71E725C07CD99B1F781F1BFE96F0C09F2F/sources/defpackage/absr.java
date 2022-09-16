package defpackage;

import android.opengl.EGL14;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: absr  reason: default package */
/* loaded from: classes.dex */
public final class absr {
    public boolean a;
    public abry b;
    public Handler c;
    public Runnable d;
    public absw e;
    private final Looper i;
    public final List f = new ArrayList();
    public absz h = null;
    public final Runnable g = new absq(this);

    public absr(Looper looper) {
        looper.getClass();
        this.i = looper;
    }

    public final void a(Throwable th) {
        zep.d("RenderScheduler error", th);
        synchronized (this) {
            Runnable runnable = this.d;
            if (runnable != null) {
                Handler handler = this.c;
                if (handler != null) {
                    handler.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }
    }

    public final void b() {
        aqxo.y(c());
        synchronized (this) {
            if (this.e == null) {
                return;
            }
            if (this.b == null) {
                return;
            }
            try {
                boolean z = true;
                for (absu absuVar : this.f) {
                    z &= !absuVar.e(z, this.e, this.b);
                }
                absz abszVar = this.h;
                if (abszVar != null) {
                    abszVar.a = EGL14.eglGetCurrentContext();
                }
            } catch (Exception e) {
                a(e);
            }
        }
    }

    public final boolean c() {
        return Looper.myLooper() == this.i;
    }
}

package defpackage;

import android.os.Looper;
import android.os.Message;
/* compiled from: PG */
/* renamed from: cjwy  reason: default package */
/* loaded from: classes.dex */
public final class cjwy {
    public volatile boolean a;
    public boolean b;
    private boolean c;
    private final cjwx d;

    public cjwy() {
        b();
        this.d = new cjwx(Looper.myQueue());
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Not in application's main thread ");
    }

    public final void a() {
        b();
        b();
        if (!this.a) {
            return;
        }
        if (!this.b) {
            this.b = true;
            this.c = this.d.a();
        }
        if (!this.c) {
            return;
        }
        try {
            cjwx cjwxVar = this.d;
            if (!cjwxVar.c) {
                return;
            }
            boolean isAccessible = cjwxVar.d.isAccessible();
            boolean isAccessible2 = cjwxVar.e.isAccessible();
            boolean isAccessible3 = cjwxVar.f.isAccessible();
            cjwxVar.d.setAccessible(true);
            cjwxVar.e.setAccessible(true);
            cjwxVar.f.setAccessible(true);
            try {
                for (Message message = (Message) cjwxVar.d.get(cjwxVar.b); message != null; message = (Message) cjwxVar.e.get(message)) {
                    Runnable callback = message.getCallback();
                    if (callback != null && "android.app.LoadedApk$ServiceDispatcher$RunConnection".equals(callback.getClass().getName())) {
                        callback.run();
                        cjwxVar.f.set(message, cjwx.a);
                    }
                }
            } catch (IllegalAccessException unused) {
            } finally {
                cjwxVar.d.setAccessible(isAccessible);
                cjwxVar.e.setAccessible(isAccessible2);
                cjwxVar.f.setAccessible(isAccessible3);
            }
        } catch (Exception e) {
            bvoo.j(e);
        }
    }
}

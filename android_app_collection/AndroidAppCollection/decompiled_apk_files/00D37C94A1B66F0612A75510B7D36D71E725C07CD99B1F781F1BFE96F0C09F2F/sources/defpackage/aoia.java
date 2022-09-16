package defpackage;

import android.util.Log;
import java.lang.Thread;
import javax.microedition.khronos.egl.EGLContext;
/* compiled from: PG */
/* renamed from: aoia  reason: default package */
/* loaded from: classes.dex */
public final class aoia implements aoid {
    public aohz a;
    public Throwable b = null;

    public aoia(EGLContext eGLContext) {
        aohz aohzVar = new aohz(eGLContext);
        this.a = aohzVar;
        aohzVar.setName("ExternalTextureConverter");
        final Object obj = new Object();
        this.a.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: aohv
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                aoia aoiaVar = aoia.this;
                Object obj2 = obj;
                synchronized (obj2) {
                    aoiaVar.b = th;
                    obj2.notify();
                }
            }
        });
        this.a.start();
        try {
            aohz aohzVar2 = this.a;
            synchronized (aohzVar2.h) {
                while (!aohzVar2.f) {
                    aohzVar2.h.wait();
                }
            }
            if (!aohzVar2.g) {
                synchronized (obj) {
                    while (this.b == null) {
                        obj.wait();
                    }
                }
            }
            this.a.setUncaughtExceptionHandler(null);
            if (this.b == null) {
                return;
            }
            this.a.i();
            throw new RuntimeException(this.b);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            String valueOf = String.valueOf(e.getMessage());
            Log.e("ExternalTextureConv", valueOf.length() != 0 ? "thread was unexpectedly interrupted: ".concat(valueOf) : new String("thread was unexpectedly interrupted: "));
            throw new RuntimeException(e);
        }
    }

    public final void a(int i) {
        this.a.c.j = i;
    }

    @Override // defpackage.aoid
    public final void c(aoic aoicVar) {
        aohz aohzVar = this.a;
        synchronized (aohzVar.b) {
            aohzVar.b.clear();
            aohzVar.b.add(aoicVar);
        }
    }
}

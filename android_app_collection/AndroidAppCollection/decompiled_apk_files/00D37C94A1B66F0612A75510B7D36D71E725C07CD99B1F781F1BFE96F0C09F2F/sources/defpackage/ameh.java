package defpackage;

import android.app.Application;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ameh  reason: default package */
/* loaded from: classes.dex */
public final class ameh {
    public int b;
    public boolean c;
    public final Object a = new Object();
    private final Set e = new HashSet();
    public final Application.ActivityLifecycleCallbacks d = new ameg(this);

    public final void a(boolean z) {
        uwp.f();
        synchronized (this.a) {
            this.c = z;
            for (Runnable runnable : this.e) {
                runnable.run();
            }
        }
    }
}

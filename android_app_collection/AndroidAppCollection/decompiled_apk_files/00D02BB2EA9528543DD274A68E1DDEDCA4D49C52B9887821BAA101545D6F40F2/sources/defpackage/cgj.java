package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cgj  reason: default package */
/* loaded from: classes4.dex */
final class cgj implements ComponentCallbacks2, cgn {
    public boolean a;
    private final Set<Activity> b = Collections.newSetFromMap(new WeakHashMap());
    private boolean c;

    @Override // defpackage.cgn
    public final void a(Activity activity) {
        if (this.b.add(activity)) {
            if (!this.c) {
                activity.getApplication().registerComponentCallbacks(this);
                this.c = true;
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(new cgi(this));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            this.a = false;
            cdr.a().b();
        }
    }
}

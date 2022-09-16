package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cry  reason: default package */
/* loaded from: classes3.dex */
public final class cry implements ComponentCallbacks2, csc {
    public boolean a;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());
    private boolean c;

    @Override // defpackage.csc
    public final void a(Activity activity) {
        if (this.b.add(activity)) {
            cvd.i();
            if (!this.c) {
                activity.getApplication().registerComponentCallbacks(this);
                this.c = true;
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(new crx(this, cpq.a()));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(20);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 20) {
            this.a = false;
            cpq a = cpq.a();
            cvd.i();
            a.d.set(false);
        }
    }
}

package com.google.android.apps.gmm.locationsharing.settings;

import android.arch.lifecycle.OnLifecycleEvent;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class StopThenStartLifecycleObserver implements aou {
    private boolean a;
    private final rb b;
    private final dzut<dztc> c;

    public StopThenStartLifecycleObserver(rb rbVar, dzut<dztc> dzutVar) {
        dzvx.c(rbVar, "activity");
        this.b = rbVar;
        this.c = dzutVar;
    }

    @OnLifecycleEvent(a = i.ON_START)
    public final void onStart() {
        if (!this.a) {
            return;
        }
        this.c.a();
        this.b.g.b(this);
    }

    @OnLifecycleEvent(a = i.ON_STOP)
    public final void onStop() {
        this.a = true;
    }
}

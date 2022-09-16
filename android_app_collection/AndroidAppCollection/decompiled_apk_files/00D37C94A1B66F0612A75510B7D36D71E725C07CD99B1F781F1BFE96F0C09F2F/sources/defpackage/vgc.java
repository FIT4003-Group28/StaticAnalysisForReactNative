package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: vgc  reason: default package */
/* loaded from: classes4.dex */
final class vgc implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        vgb.b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        vgb.c(i);
    }
}

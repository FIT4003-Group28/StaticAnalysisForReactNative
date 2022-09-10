package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: cvux  reason: default package */
/* loaded from: classes5.dex */
final class cvux implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (cvvg.a) {
            cvvg.a.clear();
        }
        synchronized (cvvg.b) {
            cvvg.b.clear();
        }
    }
}

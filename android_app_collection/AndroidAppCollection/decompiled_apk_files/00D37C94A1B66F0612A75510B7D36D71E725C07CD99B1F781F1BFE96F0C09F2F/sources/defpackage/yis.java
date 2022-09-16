package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: yis  reason: default package */
/* loaded from: classes4.dex */
final class yis implements ComponentCallbacks {
    final /* synthetic */ azeh a;

    public yis(azeh azehVar) {
        this.a = azehVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (!this.a.e()) {
            this.a.a(configuration);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}

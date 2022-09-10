package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btmn  reason: default package */
/* loaded from: classes.dex */
public final class btmn implements ComponentCallbacks2 {
    final /* synthetic */ btmv a;

    public btmn(btmv btmvVar) {
        this.a = btmvVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 80) {
            this.a.e(btmu.COMPLETE, this.a.d.a().floatValue());
        } else if (i >= 60) {
            this.a.e(btmu.MODERATE, this.a.d.a().floatValue());
        } else if (i >= 40) {
            this.a.e(btmu.BACKGROUND, this.a.d.a().floatValue());
        } else if (i >= 20) {
            this.a.e(btmu.UI_HIDDEN, this.a.d.a().floatValue());
        } else if (i >= 15) {
            this.a.e(btmu.RUNNING_CRITICAL, -1.0f);
        } else if (i >= 10) {
            this.a.e(btmu.RUNNING_LOW, -1.0f);
        } else if (i < 5) {
        } else {
            this.a.e(btmu.RUNNING_MODERATE, -1.0f);
        }
    }
}

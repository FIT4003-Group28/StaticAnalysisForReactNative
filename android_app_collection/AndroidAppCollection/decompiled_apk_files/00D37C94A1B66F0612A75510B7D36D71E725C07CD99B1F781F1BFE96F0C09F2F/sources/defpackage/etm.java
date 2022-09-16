package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: etm  reason: default package */
/* loaded from: classes3.dex */
final class etm extends frg {
    final /* synthetic */ etn a;

    public etm(etn etnVar) {
        this.a = etnVar;
    }

    @Override // defpackage.frg, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        etn etnVar = this.a;
        if (etnVar.b == -1) {
            etnVar.a();
        }
    }
}

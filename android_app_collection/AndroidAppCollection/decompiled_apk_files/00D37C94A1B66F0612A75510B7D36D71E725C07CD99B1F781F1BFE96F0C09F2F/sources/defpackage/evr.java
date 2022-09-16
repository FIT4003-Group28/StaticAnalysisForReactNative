package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: evr  reason: default package */
/* loaded from: classes3.dex */
public final class evr extends frg {
    final /* synthetic */ azqb a;
    final /* synthetic */ evt b;

    public evr(evt evtVar, azqb azqbVar) {
        this.b = evtVar;
        this.a = azqbVar;
    }

    @Override // defpackage.frg, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ((acux) this.a.get()).e();
    }

    @Override // defpackage.frg, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.b.a.j(evj.class)) {
            this.b.b.d(new evk(activity.getIntent()));
        }
    }
}

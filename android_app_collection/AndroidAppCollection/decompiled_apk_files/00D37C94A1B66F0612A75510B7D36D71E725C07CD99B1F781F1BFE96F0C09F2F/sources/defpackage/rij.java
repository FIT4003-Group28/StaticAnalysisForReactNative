package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rij  reason: default package */
/* loaded from: classes4.dex */
final class rij extends rii {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ riq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rij(riq riqVar, Bundle bundle, Activity activity) {
        super(riqVar.a);
        this.c = riqVar;
        this.a = bundle;
        this.b = activity;
    }

    @Override // defpackage.rii
    public final void a() {
        Bundle bundle;
        if (this.a != null) {
            bundle = new Bundle();
            if (this.a.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.a.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        rhg rhgVar = this.c.a.f;
        qnm.b(rhgVar);
        rhgVar.onActivityCreated(rac.a(this.b), bundle, this.g);
    }
}

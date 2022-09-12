package defpackage;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cosm  reason: default package */
/* loaded from: classes5.dex */
final class cosm extends cosl {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ cost c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cosm(cost costVar, Bundle bundle, Activity activity) {
        super(costVar.a);
        this.c = costVar;
        this.a = bundle;
        this.b = activity;
    }

    @Override // defpackage.cosl
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
        this.c.a.f.i(cobb.b(this.b), bundle, this.g);
    }
}

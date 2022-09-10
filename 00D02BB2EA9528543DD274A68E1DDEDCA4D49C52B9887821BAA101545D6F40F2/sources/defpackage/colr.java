package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
/* compiled from: PG */
/* renamed from: colr  reason: default package */
/* loaded from: classes5.dex */
public final class colr extends cnof<cnnv> {
    public colr(Activity activity) {
        super(activity, (Api<cnnx>) LocationServices.API, (cnnx) null, cnoe.a);
    }

    public final cpcq<coli> a(final LocationSettingsRequest locationSettingsRequest) {
        cntc builder = cntd.builder();
        builder.a = new cnsr(locationSettingsRequest) { // from class: colp
            private final LocationSettingsRequest a;

            {
                this.a = locationSettingsRequest;
            }

            @Override // defpackage.cnsr
            public final void a(Object obj, Object obj2) {
                ((conr) obj).Z(this.a, new colq((cpct) obj2));
            }
        };
        builder.c = 2426;
        return c(builder.a());
    }

    public colr(Context context) {
        super(context, LocationServices.API, (cnnx) null, cnoe.a);
    }
}

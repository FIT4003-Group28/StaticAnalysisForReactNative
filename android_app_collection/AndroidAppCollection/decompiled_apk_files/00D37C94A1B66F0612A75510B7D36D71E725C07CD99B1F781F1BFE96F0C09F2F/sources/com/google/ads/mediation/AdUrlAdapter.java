package com.google.ads.mediation;

import android.os.Bundle;
/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class AdUrlAdapter extends dpb implements qgj, qgl, qgn {
    private static final String AD_URL_AD_UNIT_ID = "adurl";

    @Override // defpackage.dpb
    public String getAdUnitId(Bundle bundle) {
        return AD_URL_AD_UNIT_ID;
    }

    @Override // defpackage.dpb
    protected Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("sdk_less_server_data", bundle2);
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}

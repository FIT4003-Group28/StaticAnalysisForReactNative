package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.udc.CheckConsentRequest;
import com.google.android.gms.udc.UdcCacheRequest;
/* compiled from: PG */
/* renamed from: cpeq  reason: default package */
/* loaded from: classes5.dex */
public final class cpeq {
    public static final cnoh<cpdp> a(GoogleApiClient googleApiClient, CheckConsentRequest checkConsentRequest) {
        return googleApiClient.enqueue(new cpec(googleApiClient, checkConsentRequest));
    }

    public static final cnoh<cper> b(GoogleApiClient googleApiClient, UdcCacheRequest udcCacheRequest) {
        return googleApiClient.enqueue(new cpef(googleApiClient, udcCacheRequest));
    }
}

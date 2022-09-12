package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: ckuw  reason: default package */
/* loaded from: classes4.dex */
public final class ckuw {
    public static void a(ckuu ckuuVar, String str, String str2, byte[] bArr) {
        GoogleApiClient googleApiClient = ckuuVar.a;
        if (googleApiClient == null) {
            return;
        }
        Api<cpgq> api = cpgr.a;
        googleApiClient.enqueue(new cpjb(googleApiClient, str, str2, bArr));
    }
}

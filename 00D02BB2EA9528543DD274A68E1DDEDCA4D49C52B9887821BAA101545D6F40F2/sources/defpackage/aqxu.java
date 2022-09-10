package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: aqxu  reason: default package */
/* loaded from: classes2.dex */
final class aqxu implements Runnable {
    final /* synthetic */ aqxv a;

    public aqxu(aqxv aqxvVar) {
        this.a = aqxvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqxv aqxvVar = this.a;
        GoogleApiClient googleApiClient = aqxvVar.e;
        if (googleApiClient != null) {
            try {
                googleApiClient.execute(new colu(googleApiClient, aqxvVar.d)).i(aqxvVar);
            } catch (SecurityException unused) {
                aqxvVar.d();
            }
            aqxvVar.c.b(new ardk());
        }
        GoogleApiClient googleApiClient2 = aqxvVar.e;
        if (googleApiClient2 != null) {
            googleApiClient2.disconnect();
        }
        aqxvVar.f();
    }
}

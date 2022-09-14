package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: aqxt  reason: default package */
/* loaded from: classes.dex */
final class aqxt implements Runnable {
    final /* synthetic */ aqxv a;

    public aqxt(aqxv aqxvVar) {
        this.a = aqxvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqxv aqxvVar = this.a;
        aqxvVar.e();
        GoogleApiClient googleApiClient = aqxvVar.e;
        if (googleApiClient != null) {
            try {
                googleApiClient.execute(new colt(googleApiClient, aqxvVar.d)).i(aqxvVar);
                aqxvVar.c.b(new ardk());
            } catch (SecurityException unused) {
                aqxvVar.c.b(new ardk());
            }
        }
    }
}

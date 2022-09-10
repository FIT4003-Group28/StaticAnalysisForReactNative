package defpackage;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnqu  reason: default package */
/* loaded from: classes5.dex */
public final class cnqu implements cnon<Status> {
    final /* synthetic */ cnsx a;
    final /* synthetic */ boolean b;
    final /* synthetic */ GoogleApiClient c;
    final /* synthetic */ cnqx d;

    public cnqu(cnqx cnqxVar, cnsx cnsxVar, boolean z, GoogleApiClient googleApiClient) {
        this.d = cnqxVar;
        this.a = cnsxVar;
        this.b = z;
        this.c = googleApiClient;
    }

    @Override // defpackage.cnon
    public final /* bridge */ /* synthetic */ void Om(Status status) {
        Status status2 = status;
        cmuh a = cmuh.a(this.d.b);
        String e = a.e("defaultGoogleSignInAccount");
        a.f("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e)) {
            a.f(a.g("googleSignInAccount", e));
            a.f(a.g("googleSignInOptions", e));
        }
        if (status2.d() && this.d.isConnected()) {
            cnqx cnqxVar = this.d;
            cnqxVar.disconnect();
            cnqxVar.connect();
        }
        this.a.p(status2);
        if (this.b) {
            this.c.disconnect();
        }
    }
}

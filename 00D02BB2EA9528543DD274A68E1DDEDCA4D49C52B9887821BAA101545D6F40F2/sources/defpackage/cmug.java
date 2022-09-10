package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cmug  reason: default package */
/* loaded from: classes5.dex */
public final class cmug implements apc<Void> {
    final /* synthetic */ SignInHubActivity a;

    public cmug(SignInHubActivity signInHubActivity) {
        this.a = signInHubActivity;
    }

    @Override // defpackage.apc
    public final apl<Void> a(Bundle bundle) {
        return new cmto(this.a, GoogleApiClient.getAllClients());
    }

    @Override // defpackage.apc
    public final /* bridge */ /* synthetic */ void b(Void r3) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.k, signInHubActivity.l);
        this.a.finish();
    }

    @Override // defpackage.apc
    public final void c() {
    }
}

package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationResponse;
import com.spotify.sdk.android.authentication.LoginActivity;
/* compiled from: PG */
/* renamed from: arvt  reason: default package */
/* loaded from: classes2.dex */
public final class arvt extends ges {
    public arrf a;
    public dxio<afha> b;

    @Override // defpackage.fd
    public final void Z(int i, int i2, Intent intent) {
        AuthenticationResponse a;
        super.Z(i, i2, intent);
        if (i == 0) {
            if (i2 == -1) {
                if (LoginActivity.a(intent) != null) {
                    a = LoginActivity.a(intent);
                } else {
                    dxhy dxhyVar = new dxhy();
                    dxhyVar.a = dxhz.EMPTY;
                    a = dxhyVar.a();
                }
                if (a.a != null) {
                    this.a.i();
                    J().finish();
                    return;
                }
            }
            this.a.j();
            J().finish();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        ff J = J();
        dxhw dxhwVar = new dxhw(dxhz.TOKEN);
        dxhwVar.b = new String[]{"app-remote-control"};
        AuthenticationRequest authenticationRequest = new AuthenticationRequest(dxhwVar.a, dxhwVar.b, dxhwVar.c);
        if (J == null) {
            throw new IllegalArgumentException("Context activity or request can't be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("request", authenticationRequest);
        Intent intent = new Intent(J, LoginActivity.class);
        intent.putExtra("EXTRA_AUTH_REQUEST", bundle2);
        intent.addFlags(67108864);
        this.b.a().p(this, intent, 0, 2);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.ak;
    }
}

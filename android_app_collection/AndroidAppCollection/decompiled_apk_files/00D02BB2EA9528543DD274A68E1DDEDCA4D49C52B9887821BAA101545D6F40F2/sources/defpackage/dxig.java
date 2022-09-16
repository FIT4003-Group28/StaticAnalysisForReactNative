package defpackage;

import android.app.Activity;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxig  reason: default package */
/* loaded from: classes6.dex */
public final class dxig implements dxhu {
    private dxid a;
    private dxhs b;

    @Override // defpackage.dxhu
    public final boolean a(Activity activity, AuthenticationRequest authenticationRequest) {
        dxid dxidVar = new dxid(activity, authenticationRequest);
        this.a = dxidVar;
        dxidVar.d = this.b;
        dxidVar.show();
        return true;
    }

    @Override // defpackage.dxhu
    public final void b() {
        dxid dxidVar = this.a;
        if (dxidVar != null) {
            dxidVar.a();
            this.a = null;
        }
    }

    @Override // defpackage.dxhu
    public final void c(dxhs dxhsVar) {
        this.b = dxhsVar;
        dxid dxidVar = this.a;
        if (dxidVar != null) {
            dxidVar.d = dxhsVar;
        }
    }
}

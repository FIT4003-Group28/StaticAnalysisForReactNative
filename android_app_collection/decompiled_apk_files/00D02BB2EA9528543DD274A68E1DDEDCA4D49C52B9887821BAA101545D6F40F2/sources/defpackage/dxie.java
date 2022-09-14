package defpackage;

import android.app.Activity;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxie  reason: default package */
/* loaded from: classes6.dex */
public final class dxie implements dxhu {
    private dxif a;

    @Override // defpackage.dxhu
    public final boolean a(Activity activity, AuthenticationRequest authenticationRequest) {
        dxif dxifVar = new dxif(activity, authenticationRequest);
        this.a = dxifVar;
        return dxifVar.a();
    }

    @Override // defpackage.dxhu
    public final void b() {
        dxif dxifVar = this.a;
        if (dxifVar != null) {
            dxifVar.a.finishActivity(1138);
        }
    }

    @Override // defpackage.dxhu
    public final void c(dxhs dxhsVar) {
    }
}

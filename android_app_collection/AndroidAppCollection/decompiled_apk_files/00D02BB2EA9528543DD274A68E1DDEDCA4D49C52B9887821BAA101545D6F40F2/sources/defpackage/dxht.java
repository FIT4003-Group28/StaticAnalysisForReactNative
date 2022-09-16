package defpackage;

import android.app.Activity;
import com.spotify.sdk.android.authentication.AuthenticationResponse;
import com.spotify.sdk.android.authentication.LoginActivity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxht  reason: default package */
/* loaded from: classes6.dex */
public final class dxht {
    public final Activity a;
    public boolean b;
    public dxhu c;
    public final List<dxhu> d;
    public LoginActivity e;

    public dxht(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = activity;
        arrayList.add(new dxie());
        arrayList.add(new dxia());
        arrayList.add(new dxig());
    }

    public static final void c(dxhu dxhuVar) {
        if (dxhuVar != null) {
            dxhuVar.c(null);
            dxhuVar.b();
        }
    }

    public final void a(AuthenticationResponse authenticationResponse) {
        b(this.c, authenticationResponse);
    }

    public final void b(dxhu dxhuVar, AuthenticationResponse authenticationResponse) {
        this.b = false;
        c(dxhuVar);
        LoginActivity loginActivity = this.e;
        if (loginActivity != null) {
            loginActivity.b(authenticationResponse);
            this.e = null;
        }
    }
}

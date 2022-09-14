package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: PG */
/* renamed from: cmue  reason: default package */
/* loaded from: classes5.dex */
public final class cmue extends cmtz {
    private final Context a;

    public cmue(Context context) {
        this.a = context;
    }

    private final void d() {
        if (cnxv.a(this.a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // defpackage.cmua
    public final void b() {
        BasePendingResult cmtrVar;
        cnoh cmttVar;
        d();
        cmuh a = cmuh.a(this.a);
        GoogleSignInAccount c = a.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.e;
        if (c != null) {
            googleSignInOptions = a.d();
        }
        Context context = this.a;
        cnwc.a(googleSignInOptions);
        cmth cmthVar = new cmth(context, googleSignInOptions);
        if (c != null) {
            GoogleApiClient googleApiClient = cmthVar.i;
            Context context2 = cmthVar.b;
            int a2 = cmthVar.a();
            int i = cmtv.a;
            String e = cmuh.a(context2).e("refreshToken");
            cmtv.a(context2);
            if (a2 == 3) {
                cmttVar = cmtn.a(e);
            } else {
                cmttVar = new cmtt(googleApiClient);
                googleApiClient.execute(cmttVar);
            }
            cnwb.c(cmttVar);
            return;
        }
        GoogleApiClient googleApiClient2 = cmthVar.i;
        Context context3 = cmthVar.b;
        int a3 = cmthVar.a();
        cmtv.a(context3);
        if (a3 == 3) {
            Status status = Status.a;
            cnwc.n(status, "Result must not be null");
            cmtrVar = new cnsx(googleApiClient2);
            cmtrVar.p(status);
        } else {
            cmtrVar = new cmtr(googleApiClient2);
            googleApiClient2.execute(cmtrVar);
        }
        cnwb.c(cmtrVar);
    }

    @Override // defpackage.cmua
    public final void c() {
        d();
        cmtx.a(this.a).b();
    }
}

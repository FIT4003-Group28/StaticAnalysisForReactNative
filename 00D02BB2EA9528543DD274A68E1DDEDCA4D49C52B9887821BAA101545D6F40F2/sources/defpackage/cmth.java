package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
/* compiled from: PG */
/* renamed from: cmth  reason: default package */
/* loaded from: classes5.dex */
public final class cmth extends cnof<GoogleSignInOptions> {
    static int a = 1;

    public cmth(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, cmso.d, googleSignInOptions, new cnoz());
    }

    public final synchronized int a() {
        if (a == 1) {
            Context context = this.b;
            cnmq cnmqVar = cnmq.a;
            int j = cnmqVar.j(context, 12451000);
            if (j == 0) {
                a = 4;
            } else if (cnmqVar.k(context, j, null) != null || cobp.b(context, "com.google.android.gms.auth.api.fallback") == 0) {
                a = 2;
            } else {
                a = 3;
            }
        }
        return a;
    }
}

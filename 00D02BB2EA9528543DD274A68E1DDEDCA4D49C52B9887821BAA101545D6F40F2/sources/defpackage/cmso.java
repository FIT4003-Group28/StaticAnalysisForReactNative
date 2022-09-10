package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cmso  reason: default package */
/* loaded from: classes5.dex */
public final class cmso {
    public static final cnoa<cmss> a;
    public static final cnoa<cmtp> b;
    @Deprecated
    public static final Api<cmsr> c;
    public static final Api<GoogleSignInOptions> d;
    private static final cnnp<cmss, cmsn> e;
    private static final cnnp<cmtp, GoogleSignInOptions> f;

    static {
        cnoa<cmss> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cnoa<cmtp> cnoaVar2 = new cnoa<>();
        b = cnoaVar2;
        cmsk cmskVar = new cmsk();
        e = cmskVar;
        cmsl cmslVar = new cmsl();
        f = cmslVar;
        c = cmsq.b;
        new Api("Auth.CREDENTIALS_API", cmskVar, cnoaVar);
        d = new Api<>("Auth.GOOGLE_SIGN_IN_API", cmslVar, cnoaVar2);
    }
}

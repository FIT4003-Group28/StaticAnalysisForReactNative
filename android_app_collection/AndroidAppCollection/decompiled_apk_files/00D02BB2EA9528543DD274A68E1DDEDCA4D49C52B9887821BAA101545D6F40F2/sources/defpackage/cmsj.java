package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cmsj  reason: default package */
/* loaded from: classes5.dex */
public final class cmsj extends cnof<cnnv> implements cmrq {
    private static final cnoa<cmrs> a;
    private static final cnnp<cmrs, cnnv> k;
    private static final Api<cnnv> l;

    static {
        cnoa<cmrs> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cmse cmseVar = new cmse();
        k = cmseVar;
        l = new Api<>("GoogleAuthService.API", cmseVar, cnoaVar);
        cmqw.a("GoogleAuthServiceClient");
    }

    public cmsj(Context context) {
        super(context, l, (cnnx) null, cnoe.a);
    }
}

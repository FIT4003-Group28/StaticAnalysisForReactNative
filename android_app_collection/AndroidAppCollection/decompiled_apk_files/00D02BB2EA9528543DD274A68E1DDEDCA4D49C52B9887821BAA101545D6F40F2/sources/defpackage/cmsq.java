package defpackage;

import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cmsq  reason: default package */
/* loaded from: classes5.dex */
public final class cmsq {
    public static final cnoa<cmsv> a;
    public static final Api<cmsr> b;
    public static final cmtd c;
    private static final cnnp<cmsv, cmsr> d;

    static {
        cnoa<cmsv> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cmsp cmspVar = new cmsp();
        d = cmspVar;
        b = new Api<>("Auth.PROXY_API", cmspVar, cnoaVar);
        c = new cmtd();
    }
}

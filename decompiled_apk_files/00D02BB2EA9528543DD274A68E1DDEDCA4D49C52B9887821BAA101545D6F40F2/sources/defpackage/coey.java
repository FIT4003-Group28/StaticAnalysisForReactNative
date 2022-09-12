package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: coey  reason: default package */
/* loaded from: classes.dex */
public final class coey extends cnof<cnnv> {
    public static final /* synthetic */ int a = 0;
    private static final cnoa<cofb> k;
    private static final cnnp<cofb, cnnv> l;
    private static final Api<cnnv> m;

    static {
        cnoa<cofb> cnoaVar = new cnoa<>();
        k = cnoaVar;
        coex coexVar = new coex();
        l = coexVar;
        m = new Api<>("LightweightNetworkQuality.API", coexVar, cnoaVar);
    }

    public coey(Context context) {
        super(context, m, (cnnx) null, cnoe.a);
    }
}

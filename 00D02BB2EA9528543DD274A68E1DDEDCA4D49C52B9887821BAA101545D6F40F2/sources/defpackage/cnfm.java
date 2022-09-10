package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cnfm  reason: default package */
/* loaded from: classes5.dex */
public final class cnfm extends cnof<cnnv> implements cnfe {
    public static final cnfk a;
    private static final cnoa<cnff> k;
    private static final cnnp<cnff, cnnv> l;
    private static final Api<cnnv> m;

    static {
        cnoa<cnff> cnoaVar = new cnoa<>();
        k = cnoaVar;
        a = new cnfk();
        cnfl cnflVar = new cnfl();
        l = cnflVar;
        m = new Api<>("Car.API", cnflVar, cnoaVar);
    }

    public cnfm(Context context) {
        super(context, m, cnnx.q, cnoe.a);
    }
}

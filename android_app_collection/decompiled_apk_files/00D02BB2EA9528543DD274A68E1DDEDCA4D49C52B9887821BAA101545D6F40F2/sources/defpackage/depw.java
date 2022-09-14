package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: depw  reason: default package */
/* loaded from: classes6.dex */
public final class depw extends cnof<cnnv> {
    static final Api<cnnv> a;
    private static final cnoa<depx> k;
    private static final cnnp<depx, cnnv> l;

    static {
        cnoa<depx> cnoaVar = new cnoa<>();
        k = cnoaVar;
        depv depvVar = new depv();
        l = depvVar;
        a = new Api<>("DynamicLinks.API", depvVar, cnoaVar);
    }

    public depw(Context context) {
        super(context, a, (cnnx) null, cnoe.a);
    }
}

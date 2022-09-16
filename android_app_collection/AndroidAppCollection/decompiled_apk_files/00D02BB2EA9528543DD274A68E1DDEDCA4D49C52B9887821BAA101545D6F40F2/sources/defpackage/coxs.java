package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: coxs  reason: default package */
/* loaded from: classes.dex */
public final class coxs {
    @Deprecated
    public static final Api<cnnv> a;
    private static final cnoa<coyj> b;
    private static final cnnp<coyj, cnnv> c;

    static {
        cnoa<coyj> cnoaVar = new cnoa<>();
        b = cnoaVar;
        coxr coxrVar = new coxr();
        c = coxrVar;
        a = new Api<>("Phenotype.API", coxrVar, cnoaVar);
    }

    public static coxz a(Context context) {
        return new coxz(context);
    }

    public static Uri b() {
        return cxjd.a("com.google.android.gms.clearcut.public");
    }
}

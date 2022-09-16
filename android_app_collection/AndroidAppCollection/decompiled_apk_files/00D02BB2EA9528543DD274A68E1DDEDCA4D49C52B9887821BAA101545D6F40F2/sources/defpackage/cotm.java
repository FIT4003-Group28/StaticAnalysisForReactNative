package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cotm  reason: default package */
/* loaded from: classes5.dex */
public final class cotm {
    static final Api<cnnv> a;
    private static final cnoa<coty> b;
    private static final cnnp<coty, cnnv> c;

    static {
        cnoa<coty> cnoaVar = new cnoa<>();
        b = cnoaVar;
        cotl cotlVar = new cotl();
        c = cotlVar;
        a = new Api<>("MobStoreFile.API", cotlVar, cnoaVar);
    }

    public static cotu a(Context context) {
        return new cotu(context);
    }
}

package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: coje  reason: default package */
/* loaded from: classes.dex */
public final class coje {
    public static final Api<cnnv> a;
    @Deprecated
    public static final colw b;
    private static final cnoa<conr> c;
    private static final cnnp<conr, cnnv> d;

    static {
        cnoa<conr> cnoaVar = new cnoa<>();
        c = cnoaVar;
        cojc cojcVar = new cojc();
        d = cojcVar;
        a = new Api<>("ActivityRecognition.API", cojcVar, cnoaVar);
        b = new colw();
    }

    public static cojh a(Context context) {
        return new cojh(context);
    }
}

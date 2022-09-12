package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: codv  reason: default package */
/* loaded from: classes5.dex */
public final class codv {
    public static final cnoa<coek> a;
    public static final cnnp<coek, cnnv> b;
    public static final Api<cnnv> c;

    static {
        cnoa<coek> cnoaVar = new cnoa<>();
        a = cnoaVar;
        codu coduVar = new codu();
        b = coduVar;
        c = new Api<>("Help.API", coduVar, cnoaVar);
    }

    public static coej a(Activity activity) {
        return new coej(activity);
    }

    public static coej b(Context context) {
        return new coej(context);
    }
}

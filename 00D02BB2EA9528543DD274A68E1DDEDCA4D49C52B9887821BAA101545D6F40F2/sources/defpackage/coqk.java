package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: coqk  reason: default package */
/* loaded from: classes.dex */
public final class coqk {
    public static final Api<cnnv> a;
    public static final corc b;
    private static final cnoa<coqt> c;
    private static final cnnp<coqt, cnnv> d;

    static {
        cnoa<coqt> cnoaVar = new cnoa<>();
        c = cnoaVar;
        coqi coqiVar = new coqi();
        d = coqiVar;
        a = new Api<>("ReportingServices.API", coqiVar, cnoaVar);
        b = new corc();
    }

    public static coqh a(Activity activity) {
        return new coqh(activity);
    }

    public static coqh b(Context context) {
        return new coqh(context);
    }
}

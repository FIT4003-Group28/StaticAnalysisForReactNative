package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: couw  reason: default package */
/* loaded from: classes.dex */
public final class couw {
    public static final cnoa<cowh> a;
    static final cnnp<cowh, couv> b;
    public static final Api<couv> c;
    @Deprecated
    public static final cowm d;
    @Deprecated
    public static final cowr e;

    static {
        cnoa<cowh> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cour courVar = new cour();
        b = courVar;
        c = new Api<>("People.API_1P", courVar, cnoaVar);
        d = new cowm();
        e = new cowr();
    }

    @Deprecated
    public static coum a(Context context, couv couvVar) {
        return new coum(context, couvVar);
    }

    @Deprecated
    public static couk b(Context context, couv couvVar) {
        return new couk(context, couvVar);
    }

    @Deprecated
    public static couq c(Context context, couv couvVar) {
        return new couq(context, couvVar);
    }
}

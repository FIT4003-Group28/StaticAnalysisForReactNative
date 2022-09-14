package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: corv  reason: default package */
/* loaded from: classes5.dex */
public final class corv extends cnof<corl> implements cork {
    private static final cnoa<corw> a;
    private static final cnnp<corw, corl> k;
    private static final Api<corl> l;

    static {
        cnoa<corw> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cort cortVar = new cort();
        k = cortVar;
        l = new Api<>("MdiSync.API", cortVar, cnoaVar);
    }

    public corv(Context context, corl corlVar) {
        super(context, l, corlVar, cnoe.a);
    }
}

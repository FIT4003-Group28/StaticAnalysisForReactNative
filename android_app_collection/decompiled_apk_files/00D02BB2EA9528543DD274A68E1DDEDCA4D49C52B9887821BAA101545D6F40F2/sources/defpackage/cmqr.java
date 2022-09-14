package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cmqr  reason: default package */
/* loaded from: classes5.dex */
public final class cmqr extends cnof<cnnv> {
    private static final cnoa<cmqu> a;
    private static final cnnp<cmqu, cnnv> k;
    private static final Api<cnnv> l;

    static {
        cnoa<cmqu> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cmqp cmqpVar = new cmqp();
        k = cmqpVar;
        l = new Api<>("Audit.API", cmqpVar, cnoaVar);
    }

    public cmqr(Context context) {
        super(context, l, (cnnx) null, cnoe.a);
    }
}

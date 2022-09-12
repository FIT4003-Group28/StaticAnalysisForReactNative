package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cnjq  reason: default package */
/* loaded from: classes.dex */
public final class cnjq extends cnof<cnnv> {
    private static final cnoa<cnkt> a;
    private static final cnnp<cnkt, cnnv> k;
    private static final Api<cnnv> l;

    static {
        cnoa<cnkt> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cnjn cnjnVar = new cnjn();
        k = cnjnVar;
        l = new Api<>("BootCount.API", cnjnVar, cnoaVar);
    }

    public cnjq(Context context) {
        super(context, l, (cnnx) null, cnoe.a);
    }
}

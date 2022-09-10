package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cocd  reason: default package */
/* loaded from: classes5.dex */
public final class cocd extends cnof<cobt> {
    private static final cnoa<coci> a;
    private static final cnnp<coci, cobt> k;
    private static final Api<cobt> l;

    static {
        cnoa<coci> cnoaVar = new cnoa<>();
        a = cnoaVar;
        coby cobyVar = new coby();
        k = cobyVar;
        l = new Api<>("FacsCache.API", cobyVar, cnoaVar);
    }

    public cocd(Context context, cobt cobtVar) {
        super(context, l, cobtVar, cnoe.a);
    }
}

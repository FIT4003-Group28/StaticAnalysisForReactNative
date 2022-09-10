package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: coym  reason: default package */
/* loaded from: classes.dex */
public final class coym {
    public static final cnoa<coyu> a;
    public static final cnnp<coyu, cnnv> b;
    public static final Api<cnnv> c;

    static {
        cnoa<coyu> cnoaVar = new cnoa<>();
        a = cnoaVar;
        coyl coylVar = new coyl();
        b = coylVar;
        c = new Api<>("PseudonymousId.API", coylVar, cnoaVar);
    }

    public static coyp a(Context context) {
        return new coyp(context);
    }
}

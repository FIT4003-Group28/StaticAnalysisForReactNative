package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: coev  reason: default package */
/* loaded from: classes.dex */
public final class coev {
    public static final cnoa<cofb> a;
    public static final cnnp<cofb, cnnv> b;

    static {
        cnoa<cofb> cnoaVar = new cnoa<>();
        a = cnoaVar;
        coeu coeuVar = new coeu();
        b = coeuVar;
        new Api("LightweightNetworkQuality.API", coeuVar, cnoaVar);
    }

    public static coey a(Context context) {
        return new coey(context);
    }
}

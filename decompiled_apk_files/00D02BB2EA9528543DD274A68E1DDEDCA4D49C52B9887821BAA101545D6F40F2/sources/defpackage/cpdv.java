package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: cpdv  reason: default package */
/* loaded from: classes5.dex */
public final class cpdv extends cnof<cpdn> {
    public final cpeq a;

    public cpdv(Activity activity, cpdn cpdnVar) {
        super(activity, cpdo.c, cpdnVar, cnoe.a);
        this.a = new cpeq();
    }

    @Deprecated
    public final cpcq<UdcCacheResponse> a(UdcCacheRequest udcCacheRequest) {
        return cnwb.a(cpeq.b(this.i, udcCacheRequest), new cpdu());
    }

    public cpdv(Context context, cpdn cpdnVar) {
        super(context, cpdo.c, cpdnVar, cnoe.a);
        this.a = new cpeq();
    }
}

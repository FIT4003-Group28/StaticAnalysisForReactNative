package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: cper  reason: default package */
/* loaded from: classes5.dex */
public final class cper implements cnom {
    public final Status a;
    public final UdcCacheResponse b;

    public cper(Status status, UdcCacheResponse udcCacheResponse) {
        this.a = status;
        this.b = udcCacheResponse;
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.a;
    }
}

package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: cpee  reason: default package */
/* loaded from: classes5.dex */
final class cpee extends cpei {
    final /* synthetic */ cpef a;

    public cpee(cpef cpefVar) {
        this.a = cpefVar;
    }

    @Override // defpackage.cpei, defpackage.cpea
    public final void c(Status status, UdcCacheResponse udcCacheResponse) {
        this.a.p(new cper(status, udcCacheResponse));
    }
}

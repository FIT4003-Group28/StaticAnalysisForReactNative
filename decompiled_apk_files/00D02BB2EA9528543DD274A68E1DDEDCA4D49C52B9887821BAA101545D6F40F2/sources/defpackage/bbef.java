package defpackage;

import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbef  reason: default package */
/* loaded from: classes3.dex */
public final class bbef implements degu<UdcCacheResponse> {
    final /* synthetic */ bvqg a;
    final /* synthetic */ bbek b;

    public bbef(bbek bbekVar, bvqg bvqgVar) {
        this.b = bbekVar;
        this.a = bvqgVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.e(R.string.UNKNOWN_ERROR);
        this.b.c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(UdcCacheResponse udcCacheResponse) {
        this.a.NU(udcCacheResponse);
    }
}

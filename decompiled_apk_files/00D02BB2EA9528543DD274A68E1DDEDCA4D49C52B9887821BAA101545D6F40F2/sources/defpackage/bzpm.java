package defpackage;

import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: bzpm  reason: default package */
/* loaded from: classes4.dex */
final class bzpm implements degu<UdcCacheResponse> {
    final /* synthetic */ bzqb a;
    final /* synthetic */ dbsz b;

    public bzpm(bzqb bzqbVar, dbsz dbszVar) {
        this.a = bzqbVar;
        this.b = dbszVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcqe dcqeVar = bzpn.a;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi UdcCacheResponse udcCacheResponse) {
        UdcCacheResponse udcCacheResponse2 = udcCacheResponse;
        if (udcCacheResponse2 == null || !udcCacheResponse2.a() || udcCacheResponse2.a.isEmpty()) {
            return;
        }
        if (udcCacheResponse2.a.size() != 1) {
            dcqe dcqeVar = bzpn.a;
            bvoo.h("Unexpected # of settings", new Object[0]);
            return;
        }
        UdcCacheResponse.UdcSetting udcSetting = udcCacheResponse2.a.get(0);
        if (udcSetting.a == this.a.d) {
            this.b.NU(udcSetting);
            return;
        }
        dcqe dcqeVar2 = bzpn.a;
        bvoo.h("Unexpected setting ID", new Object[0]);
    }
}

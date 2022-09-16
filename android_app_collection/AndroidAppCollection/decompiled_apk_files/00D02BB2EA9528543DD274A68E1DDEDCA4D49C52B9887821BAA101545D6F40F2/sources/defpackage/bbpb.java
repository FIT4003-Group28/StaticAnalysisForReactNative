package defpackage;

import com.google.android.gms.udc.UdcCacheResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbpb  reason: default package */
/* loaded from: classes3.dex */
public final class bbpb implements degu<UdcCacheResponse> {
    final /* synthetic */ dxio a;
    final /* synthetic */ bwrs b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ bbpd d;

    public bbpb(bbpd bbpdVar, dxio dxioVar, bwrs bwrsVar, Runnable runnable) {
        this.d = bbpdVar;
        this.a = dxioVar;
        this.b = bwrsVar;
        this.c = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.run();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(UdcCacheResponse udcCacheResponse) {
        bbpd bbpdVar = this.d;
        bbpdVar.b = true;
        ilo iloVar = (ilo) this.b.c();
        dbsk.s(iloVar);
        bbpdVar.a = ((bbdv) this.a.a()).D(iloVar);
        cqkx.p(this.d);
    }
}

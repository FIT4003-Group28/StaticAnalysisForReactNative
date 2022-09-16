package defpackage;

import com.google.android.gms.udc.UdcCacheResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbdj  reason: default package */
/* loaded from: classes3.dex */
public final class bbdj implements degu<UdcCacheResponse> {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bbdo b;

    public bbdj(bbdo bbdoVar, bwrs bwrsVar) {
        this.b = bbdoVar;
        this.a = bwrsVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.f.dismiss();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(UdcCacheResponse udcCacheResponse) {
        this.b.f.dismiss();
        bbdo bbdoVar = this.b;
        if (!bbdoVar.j) {
            bbdoVar.k = true;
            bbdoVar.e(this.a);
        }
    }
}

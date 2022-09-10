package defpackage;

import com.google.android.gms.udc.UdcCacheResponse;
/* compiled from: PG */
/* renamed from: bbdi  reason: default package */
/* loaded from: classes3.dex */
final class bbdi implements degu<UdcCacheResponse> {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bbdo b;

    public bbdi(bbdo bbdoVar, bwrs bwrsVar) {
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
            bbdoVar.e(this.a);
        }
    }
}

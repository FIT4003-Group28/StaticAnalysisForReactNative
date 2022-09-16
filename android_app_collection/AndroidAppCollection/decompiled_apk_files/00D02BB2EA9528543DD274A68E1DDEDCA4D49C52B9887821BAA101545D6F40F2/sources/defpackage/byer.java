package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: byer  reason: default package */
/* loaded from: classes4.dex */
public final class byer implements bykn {
    final /* synthetic */ byet a;

    public byer(byet byetVar) {
        this.a = byetVar;
    }

    @Override // defpackage.bykn
    public final void a() {
        byet byetVar = this.a;
        if (byetVar.aD) {
            byjy byjyVar = byetVar.al;
            if (byjyVar.c() == byjw.ERROR_LOCATION_DISABLED || byjyVar.c() == byjw.ERROR_OFFLINE) {
                byjyVar.c.n = byjw.WAITING_TO_REQUEST;
                byjyVar.b.d = byjw.WAITING_TO_REQUEST;
                byjyVar.b();
            }
            byjyVar.a();
        }
    }
}

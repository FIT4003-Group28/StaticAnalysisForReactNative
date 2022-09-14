package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgeb  reason: default package */
/* loaded from: classes3.dex */
public final class bgeb implements btzi<dvzj, dvzl> {
    final /* synthetic */ bgef a;

    public bgeb(bgef bgefVar) {
        this.a = bgefVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvzj> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bgef bgefVar = this.a;
            if (!bgefVar.k) {
                bgefVar.c.e(ckmk.PLACESHEET_DETAILS_REQUEST);
                bgef bgefVar2 = this.a;
                bgefVar2.g = btzyVar;
                if (bgefVar2.i != null || bgefVar2.j != null) {
                    bgefVar2.e();
                }
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvzj> btzrVar, dvzl dvzlVar) {
        dvzl dvzlVar2 = dvzlVar;
        synchronized (this.a) {
            this.a.g();
            bgef bgefVar = this.a;
            if (bgefVar.k) {
                return;
            }
            bgefVar.f = dvzlVar2;
            bgefVar.h = btzrVar.f;
            bgefVar.e();
        }
    }
}

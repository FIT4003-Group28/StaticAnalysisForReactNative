package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bged  reason: default package */
/* loaded from: classes3.dex */
public final class bged implements btzi<dvzj, dvzl> {
    final /* synthetic */ bgef a;

    public bged(bgef bgefVar) {
        this.a = bgefVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvzj> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bgef bgefVar = this.a;
            if (!bgefVar.k) {
                bgefVar.j = btzyVar;
                if (bgefVar.f != null || bgefVar.g != null) {
                    bgefVar.e();
                }
            }
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvzj> btzrVar, dvzl dvzlVar) {
        dvzl dvzlVar2 = dvzlVar;
        synchronized (this.a) {
            if (!bgef.f(dvzlVar2)) {
                this.a.h();
            }
            bgef bgefVar = this.a;
            if (bgefVar.k) {
                return;
            }
            bgefVar.i = dvzlVar2;
            if (bgefVar.f == null && bgefVar.g == null) {
                if (!bgef.f(bgefVar.i)) {
                    bgef bgefVar2 = this.a;
                    this.a.b.a(new bgec(this), this.a.l, Math.max(bgefVar2.e - bgefVar2.a.e(), 0L));
                }
                return;
            }
            bgefVar.e();
        }
    }
}

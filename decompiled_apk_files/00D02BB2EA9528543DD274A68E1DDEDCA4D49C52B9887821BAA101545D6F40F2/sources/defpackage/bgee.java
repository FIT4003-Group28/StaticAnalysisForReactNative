package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgee  reason: default package */
/* loaded from: classes3.dex */
public final class bgee implements btzi<dvzj, dvzl> {
    final /* synthetic */ bgef a;

    public bgee(bgef bgefVar) {
        this.a = bgefVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvzj> btzrVar, btzy btzyVar) {
        synchronized (this.a) {
            bgef bgefVar = this.a;
            if (!bgefVar.k) {
                bgefVar.k = true;
                this.a.d.a(btzyVar.p);
                this.a.m.a(null, btzyVar.p, false, false);
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
            bgefVar.k = true;
            this.a.m.a(dvzlVar2, null, false, false);
        }
    }
}

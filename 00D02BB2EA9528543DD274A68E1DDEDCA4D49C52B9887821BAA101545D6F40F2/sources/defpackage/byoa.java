package defpackage;
/* compiled from: PG */
/* renamed from: byoa  reason: default package */
/* loaded from: classes4.dex */
final class byoa implements btzi<dkfn, dkfp> {
    final /* synthetic */ deig a;

    public byoa(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dkfn> btzrVar, btzy btzyVar) {
        byqf byqfVar;
        bttq bttqVar = btzyVar.p;
        deig deigVar = this.a;
        if (bttqVar.s) {
            byqfVar = byqf.ERROR_NO_RETRY;
        } else {
            byqfVar = byqf.ERROR_RETRY_ALLOWED;
        }
        deigVar.j(byqfVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dkfn> btzrVar, dkfp dkfpVar) {
        this.a.j(byqf.SUCCESS);
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btrf  reason: default package */
/* loaded from: classes4.dex */
public final class btrf implements btzi {
    final /* synthetic */ dbrn a;
    final /* synthetic */ deig b;
    final /* synthetic */ bvqg c;
    final /* synthetic */ btrg d;

    public btrf(btrg btrgVar, dbrn dbrnVar, deig deigVar, bvqg bvqgVar) {
        this.d = btrgVar;
        this.a = dbrnVar;
        this.b = deigVar;
        this.c = bvqgVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr btzrVar, btzy btzyVar) {
        this.d.a.decrementAndGet();
        this.c.NU(btzyVar);
        this.b.k(new btzz(btzyVar));
    }

    @Override // defpackage.btzi
    public final void QZ(btzr btzrVar, Object obj) {
        this.d.a.decrementAndGet();
        dpql dpqlVar = (dpql) this.a.a(obj);
        if (!dpqlVar.equals(dpql.c)) {
            dqhy b = dqhy.b(dpqlVar.a);
            if (b == null) {
                b = dqhy.UNKNOWN_STATUS_CODE;
            }
            if (b != dqhy.OK) {
                this.c.NU(btzy.j);
                this.b.k(new btpk(dpqlVar));
                return;
            }
        }
        this.b.j(obj);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: pbs  reason: default package */
/* loaded from: classes7.dex */
final class pbs implements btzi {
    final /* synthetic */ deig a;

    public pbs(deig deigVar) {
        this.a = deigVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr btzrVar, btzy btzyVar) {
        Throwable th = btzyVar.r;
        deig deigVar = this.a;
        cvtv d = cvty.d();
        if (th == null) {
            th = new RuntimeException(btzyVar.p.name());
        }
        d.b = th;
        d.b(false);
        deigVar.j(d.a());
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        T t = (T) obj;
        t.getClass();
        deig deigVar = this.a;
        cvtv d = cvty.d();
        d.a = t;
        deigVar.j(d.a());
    }
}

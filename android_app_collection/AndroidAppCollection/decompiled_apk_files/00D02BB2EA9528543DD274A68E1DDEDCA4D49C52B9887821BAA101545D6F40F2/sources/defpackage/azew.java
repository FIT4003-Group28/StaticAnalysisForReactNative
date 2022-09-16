package defpackage;
/* compiled from: PG */
/* renamed from: azew  reason: default package */
/* loaded from: classes3.dex */
final class azew implements btzi {
    final /* synthetic */ deig a;

    public azew(deig deigVar) {
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
        deig deigVar = this.a;
        cvtv d = cvty.d();
        d.a = (T) obj;
        deigVar.j(d.a());
    }
}

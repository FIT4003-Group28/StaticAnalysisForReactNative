package defpackage;
/* compiled from: PG */
/* renamed from: tht  reason: default package */
/* loaded from: classes7.dex */
final class tht implements degu<udj> {
    final /* synthetic */ btlu a;
    final /* synthetic */ deig b;
    final /* synthetic */ thu c;

    public tht(thu thuVar, btlu btluVar, deig deigVar) {
        this.c = thuVar;
        this.a = btluVar;
        this.b = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.b.c(this.a, false);
        this.b.j(tgk.ERROR_RESPONSE_PROCESSING);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(udj udjVar) {
        deig deigVar;
        tgk tgkVar;
        udj udjVar2 = udjVar;
        int c = udjVar2.c();
        if (c != 0) {
            if (c == 1) {
                this.c.b.c(this.a, false);
                deigVar = this.b;
                tgkVar = tgk.ERROR_RESPONSE_PROCESSING;
            } else {
                if (c == 2) {
                    this.c.a.e(udjVar2.b().b(), udjVar2.a().b().intValue());
                }
                deigVar = this.b;
                tgkVar = tgk.COMPLETED;
            }
            deigVar.j(tgkVar);
            return;
        }
        throw null;
    }
}

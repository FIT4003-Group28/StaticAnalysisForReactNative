package defpackage;
/* compiled from: PG */
/* renamed from: cvts  reason: default package */
/* loaded from: classes5.dex */
public final class cvts implements cvnq {
    private final cvkf a;
    private final dbsg<cvtl> b;

    public cvts(cvkf cvkfVar, dbsg<cvtl> dbsgVar) {
        this.a = cvkfVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.cvnq
    public final void a(String str, dssj dssjVar, dssj dssjVar2) {
        cvlw.a("RemoveTargetCallback", "Unregistration finished for account: %s (SUCCESS).", str);
        try {
            cvju j = this.a.b(str).j();
            j.d(cviv.UNREGISTERED);
            j.f = 0L;
            j.e = 0L;
            j.c(0);
            this.a.e(j.a());
            if (!this.b.a()) {
                return;
            }
            this.b.b().d();
        } catch (cvke unused) {
        }
    }

    @Override // defpackage.cvnq
    public final void b(String str, @dzsi dssj dssjVar) {
        cvlw.f("RemoveTargetCallback", "Unregistration finished for account: %s (FAILURE).", str);
        try {
            cvju j = this.a.b(str).j();
            j.d(cviv.FAILED_UNREGISTRATION);
            this.a.e(j.a());
            if (!this.b.a()) {
                return;
            }
            this.b.b().c();
        } catch (cvke unused) {
        }
    }
}

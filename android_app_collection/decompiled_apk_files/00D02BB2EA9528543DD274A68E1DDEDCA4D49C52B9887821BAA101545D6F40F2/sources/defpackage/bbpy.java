package defpackage;
/* compiled from: PG */
/* renamed from: bbpy  reason: default package */
/* loaded from: classes3.dex */
final class bbpy extends bbqp {
    private final bbtn b;

    public bbpy(bbtn bbtnVar, bbvh bbvhVar, dbsg<String> dbsgVar) {
        super(bbvhVar, dbsgVar, bbtnVar.c(), "com.google.android.apps.photos.contentprovider", dbpy.a, true);
        this.b = bbtnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbqp
    public final void a(cruz cruzVar, bbqa bbqaVar) {
        String str = cruzVar.b;
        cruf b = cruf.b(cruzVar.c);
        if (b == null) {
            b = cruf.PRECHECK_STATUS_UNKNOWN;
        }
        cruf crufVar = b;
        boolean d = dbsj.d(this.a);
        bbqaVar.e.f(bbqaVar.a(ddcu.au, str, crufVar, !d, dbpy.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bbqp
    public final void b(cruz cruzVar, bbqe bbqeVar, bbqd bbqdVar) {
        bbqeVar.a(cruzVar.b);
    }

    @Override // defpackage.bbqp
    protected final void c(crtl crtlVar, bbvh bbvhVar) {
        String g = decu.g(this.b.a().a, 16);
        if (crtlVar.c) {
            crtlVar.bF();
            crtlVar.c = false;
        }
        crts crtsVar = (crts) crtlVar.b;
        crts crtsVar2 = crts.r;
        g.getClass();
        crtsVar.a |= 2;
        crtsVar.c = g;
    }
}

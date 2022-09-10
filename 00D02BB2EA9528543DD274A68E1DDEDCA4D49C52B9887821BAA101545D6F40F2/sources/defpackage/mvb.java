package defpackage;
/* renamed from: mvb  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class mvb implements mw {
    static final mw a = new mvb();

    private mvb() {
    }

    @Override // defpackage.mw
    public final void a(Object obj) {
        kep kepVar = (kep) obj;
        kepVar.d.a();
        kepVar.a.Nr().clearFlags(128);
        final kdw kdwVar = kepVar.o;
        bvrj.UI_THREAD.c();
        bvor.a(kdwVar.h, new mw(kdwVar) { // from class: kdu
            private final kdw a;

            {
                this.a = kdwVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                kdw kdwVar2 = this.a;
                kdwVar2.b.a().c((crzp) obj2);
                kdwVar2.h = dbpy.a;
            }
        });
        crzp<dcep<ktr>> crzpVar = kdwVar.e;
        if (crzpVar != null) {
            kdwVar.c.c(crzpVar);
        }
        kdwVar.a.removeView(kdwVar.f);
        kdwVar.e = null;
        kepVar.p.d();
        final kef kefVar = kepVar.l;
        bvrj.UI_THREAD.c();
        bvor.a(kefVar.c, new mw(kefVar) { // from class: ked
            private final kef a;

            {
                this.a = kefVar;
            }

            @Override // defpackage.mw
            public final void a(Object obj2) {
                this.a.b.a().c((crzp) obj2);
            }
        });
        keg kegVar = kefVar.a;
        bvrj.UI_THREAD.c();
        kegVar.b.removeAllViews();
        kegVar.f.f();
        kepVar.n.c();
    }
}

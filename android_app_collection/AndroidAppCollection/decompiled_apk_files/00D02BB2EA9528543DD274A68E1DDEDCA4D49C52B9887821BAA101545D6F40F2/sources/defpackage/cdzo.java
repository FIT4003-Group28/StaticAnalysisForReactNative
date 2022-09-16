package defpackage;
/* compiled from: PG */
/* renamed from: cdzo  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdzo extends dzvw implements dzve<cdvi, dztc> {
    public cdzo(ceae ceaeVar) {
        super(1, ceaeVar, ceae.class, "handleGalleryAction", "handleGalleryAction(Lcom/google/android/apps/gmm/ugc/post/photo/GalleryAction;)V");
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ dztc a(cdvi cdviVar) {
        cdvi cdviVar2 = cdviVar;
        dzvx.c(cdviVar2, "p1");
        ceae ceaeVar = (ceae) this.b;
        ceap ceapVar = ceap.EDITING;
        cdvi cdviVar3 = cdvi.MEDIA_CAPTURE;
        int ordinal = cdviVar2.ordinal();
        if (ordinal == 0) {
            cdys cdysVar = ceaeVar.e;
            if (cdysVar == null) {
                dzvx.a("mediaPickerManager");
            }
            bdmb bdmbVar = cdysVar.f;
            dbsk.s(bdmbVar);
            if (bdmbVar.b()) {
                bbut bbutVar = cdysVar.d;
                dbpy<Object> dbpyVar = dbpy.a;
                ges gesVar = cdysVar.i;
                dbsk.s(gesVar);
                bbutVar.s(false, dbpyVar, null, gesVar, dwyd.PLACE_PAGE_PHOTO_UPDATES);
            }
        } else if (ordinal == 1) {
            cdys cdysVar2 = ceaeVar.e;
            if (cdysVar2 == null) {
                dzvx.a("mediaPickerManager");
            }
            bdpk bdpkVar = cdysVar2.h;
            dbsk.s(bdpkVar);
            bdpkVar.e(false, 1);
        }
        return dztc.a;
    }
}

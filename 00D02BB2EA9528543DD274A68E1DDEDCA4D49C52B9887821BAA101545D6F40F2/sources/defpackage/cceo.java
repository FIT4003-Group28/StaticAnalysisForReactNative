package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: cceo  reason: default package */
/* loaded from: classes4.dex */
public final class cceo extends afhx {
    private final gga c;
    private static final dcqe b = dcqe.c("cceo");
    public static final dbsl<afga> a = ccen.a;

    public cceo(Intent intent, @dzsi String str, gga ggaVar) {
        super(intent, str, afid.DIDNT_GO_HERE);
        this.c = ggaVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        dlif dlifVar = null;
        try {
            byte[] byteArrayExtra = this.f.getByteArrayExtra("place_visit_metadata");
            if (byteArrayExtra != null) {
                dlifVar = (dlif) dsqw.cr(dlif.d, byteArrayExtra, dsqa.c());
            }
        } catch (dsrm unused) {
        }
        dbsg j = dbsg.j(dlifVar);
        if (!j.a()) {
            bvoo.h("PlaceVisitMetadata is not present in intent: %s", this);
            return;
        }
        gga ggaVar = this.c;
        dlif dlifVar2 = (dlif) j.b();
        boolean booleanExtra = this.f.getBooleanExtra("update_timeline", true);
        cjdx cjdxVar = cjdx.OPEN_REVIEW_EDITOR;
        cjdy bZ = cjdz.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cjdz cjdzVar = (cjdz) bZ.b;
        int i = 1 | cjdzVar.a;
        cjdzVar.a = i;
        cjdzVar.b = booleanExtra;
        cjdzVar.c = cjdxVar.d;
        cjdzVar.a = i | 2;
        ggaVar.D(cjdi.aR(dlifVar2, bZ.bK()));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_DIDNT_GO_HERE;
    }
}

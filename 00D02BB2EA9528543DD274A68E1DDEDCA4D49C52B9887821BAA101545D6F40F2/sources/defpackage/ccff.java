package defpackage;

import android.content.Intent;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ccff  reason: default package */
/* loaded from: classes4.dex */
public final class ccff extends afhx {
    public static final dbsl<afga> a = ccfe.a;
    private final dxio<cdjj> b;

    public ccff(Intent intent, @dzsi String str, dxio<cdjj> dxioVar) {
        super(intent, str, afid.PHOTO_UPDATES);
        this.b = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("feature_id");
        dbsk.s(stringExtra);
        String stringExtra2 = this.f.getStringExtra("place_name");
        dbsk.s(stringExtra2);
        boolean booleanExtra = this.f.getBooleanExtra("visit_date_required", false);
        ily ilyVar = new ily();
        ilyVar.k(stringExtra);
        ilyVar.F(stringExtra2);
        ilyVar.H(booleanExtra);
        ilo d = ilyVar.d();
        cdjj a2 = this.b.a();
        bwrs<ilo> a3 = bwrs.a(d);
        cdje e = cdjf.e();
        dnqg bZ = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        e.b(bZ.bK());
        a2.c(a3, e.a());
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_PHOTO_UPDATES_NOTIFICATION;
    }
}

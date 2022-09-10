package defpackage;

import android.graphics.Bitmap;
import android.graphics.Picture;
/* compiled from: PG */
/* renamed from: dsc  reason: default package */
/* loaded from: classes6.dex */
final class dsc implements degu<Picture> {
    final /* synthetic */ dsza a;
    final /* synthetic */ dfmf b;
    final /* synthetic */ dmv c;
    final /* synthetic */ dsf d;

    public dsc(dsf dsfVar, dsza dszaVar, dfmf dfmfVar, dmv dmvVar) {
        this.d = dsfVar;
        this.a = dszaVar;
        this.b = dfmfVar;
        this.c = dmvVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dbsl<dmpn> dbslVar = dsf.a;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Picture picture) {
        Picture picture2 = picture;
        dsf dsfVar = this.d;
        dsza dszaVar = this.a;
        akqq akqqVar = new akqq(dszaVar.b, dszaVar.c);
        Bitmap a = bvlf.a(picture2, picture2.getWidth(), picture2.getHeight(), Bitmap.Config.ARGB_8888);
        String b = this.d.d.b(this.b);
        dbsk.s(a);
        dsfVar.d(new dsu(akqqVar, akps.CUSTOM_ICON, 0L, false, dsm.LEVEL_CHANGE, a, Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), Integer.valueOf(dmqc.LEGEND_STYLE_UNDEFINED.oE), dcdc.e(), b), this.c);
        this.d.e(this.c);
    }
}

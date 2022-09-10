package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cdzk  reason: default package */
/* loaded from: classes4.dex */
final class cdzk extends dzvy implements dzve<Uri, dztc> {
    final /* synthetic */ ceae a;

    public cdzk(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ dztc a(Uri uri) {
        Uri uri2 = uri;
        dzvx.c(uri2, "it");
        cdys cdysVar = this.a.e;
        if (cdysVar == null) {
            dzvx.a("mediaPickerManager");
        }
        bdpk bdpkVar = cdysVar.h;
        dbsk.s(bdpkVar);
        bdpkVar.c(uri2);
        return dztc.a;
    }
}

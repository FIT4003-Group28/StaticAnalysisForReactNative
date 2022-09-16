package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cdzp  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cdzp extends dzvw implements dzve<Uri, dztc> {
    public cdzp(ceaj ceajVar) {
        super(1, ceajVar, ceaj.class, "selectMedia", "selectMedia(Landroid/net/Uri;)V");
    }

    @Override // defpackage.dzve
    public final /* bridge */ /* synthetic */ dztc a(Uri uri) {
        Uri uri2 = uri;
        dzvx.c(uri2, "p1");
        dzvx.c(uri2, "uri");
        ((ceaj) this.b).d(dzti.a(uri2));
        return dztc.a;
    }
}

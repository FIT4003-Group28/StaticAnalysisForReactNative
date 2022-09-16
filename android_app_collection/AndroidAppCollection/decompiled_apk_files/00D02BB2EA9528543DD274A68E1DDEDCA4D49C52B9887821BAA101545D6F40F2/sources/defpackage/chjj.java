package defpackage;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chjj  reason: default package */
/* loaded from: classes4.dex */
final class chjj extends dbpg<Void, Uri> {
    final /* synthetic */ chjk a;

    public chjj(chjk chjkVar) {
        this.a = chjkVar;
    }

    @Override // defpackage.dbpg
    public final /* bridge */ /* synthetic */ void a(Void r3, @dzsi Uri uri) {
        Uri uri2 = uri;
        if (uri2 == null || uri2.equals(Uri.EMPTY)) {
            return;
        }
        MediaScannerConnection.scanFile(this.a.b, new String[]{uri2.toString()}, null, null);
        chjk chjkVar = this.a;
        beym.g(chjkVar.d, chjkVar.f, bfby.THANKS_PAGE).aJ(this.a.b);
    }

    @Override // defpackage.dbpg
    public final /* bridge */ /* synthetic */ void b(Void r2) {
        gga ggaVar = this.a.b;
        cjxu.i(ggaVar, ggaVar.getString(R.string.WELCOME_OFFER_SAVE_FAILURE_MESSAGE));
    }
}

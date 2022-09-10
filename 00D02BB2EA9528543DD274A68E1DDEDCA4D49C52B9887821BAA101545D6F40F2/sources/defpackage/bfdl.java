package defpackage;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfdl  reason: default package */
/* loaded from: classes3.dex */
final class bfdl extends dbpg<Void, Uri> {
    final /* synthetic */ bfdm a;

    public bfdl(bfdm bfdmVar) {
        this.a = bfdmVar;
    }

    @Override // defpackage.dbpg
    public final /* bridge */ /* synthetic */ void a(Void r3, @dzsi Uri uri) {
        Uri uri2 = uri;
        if (uri2 == null || uri2.equals(Uri.EMPTY)) {
            return;
        }
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        MediaScannerConnection.scanFile(ggaVar, new String[]{uri2.toString()}, null, null);
        bfdm bfdmVar = this.a;
        bwqv bwqvVar = bfdmVar.c;
        bwrs<ilo> bwrsVar = bfdmVar.ae;
        dbsk.s(bwrsVar);
        beym.g(bwqvVar, bwrsVar, bfby.PLACESHEET_HEADER).aJ(ggaVar);
    }

    @Override // defpackage.dbpg
    public final /* bridge */ /* synthetic */ void b(Void r2) {
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        cjxu.i(ggaVar, ggaVar.getString(R.string.WELCOME_OFFER_SAVE_FAILURE_MESSAGE));
    }
}

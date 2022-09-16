package defpackage;

import android.net.Uri;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apss  reason: default package */
/* loaded from: classes2.dex */
final class apss implements begr {
    final /* synthetic */ apst a;

    public apss(apst apstVar) {
        this.a = apstVar;
    }

    @Override // defpackage.begr
    public final void a(bttu bttuVar, ilo iloVar) {
        bwrs<ilo> a = bwrs.a(iloVar);
        apst apstVar = this.a;
        begj begjVar = new begj();
        begjVar.i = a;
        begjVar.c = jjn.FULLY_EXPANDED;
        apstVar.e.a().o(begjVar, false, null);
        apstVar.e.a().k(bege.REVIEWS);
        apst apstVar2 = this.a;
        Uri uri = apstVar2.j;
        dbsk.s(uri);
        apstVar2.i.a().e(a, uri.toString(), apstVar2.a.getString(R.string.REPLY_TO_REVIEW_PAGE_TITLE), true);
        gga ggaVar = this.a.a;
        Integer valueOf = Integer.valueOf(dpyv.NEW_BUSINESS_REVIEW.dm);
        apst apstVar3 = this.a;
        avac.bp(ggaVar, valueOf, apstVar3.b, apstVar3.c, apstVar3.d);
    }

    @Override // defpackage.begr
    public final void b(bttu bttuVar, ilo iloVar, bttq bttqVar) {
        bttqVar.toString();
    }
}

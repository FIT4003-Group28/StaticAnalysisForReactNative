package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ccvt  reason: default package */
/* loaded from: classes4.dex */
public class ccvt implements ccvr {
    private final btvo a;
    private final Resources b;
    private final dgfb c;
    private final dwfl d;
    private final int e;
    private final ccvv f;

    public ccvt(btvo btvoVar, gga ggaVar, ccrh ccrhVar, dgfb dgfbVar, dwfl dwflVar, int i, ccvv ccvvVar) {
        this.a = btvoVar;
        this.b = ggaVar.getResources();
        this.c = dgfbVar;
        this.d = dwflVar;
        this.e = i;
        this.f = ccvvVar;
    }

    @Override // defpackage.ccvr
    public String a() {
        return this.d.h;
    }

    @Override // defpackage.ccvr
    public cqkl b() {
        ccvv ccvvVar = this.f;
        int i = this.e;
        cczu cczuVar = ((cczo) ccvvVar).a;
        cczuVar.N(true);
        jmw.d(cczuVar.a, null);
        cczuVar.K(cczuVar.b().toString());
        ccza cczaVar = cczuVar.c;
        dcdc r = dcdc.r(cczuVar.h);
        int i2 = ccql.d;
        fd H = cczaVar.b.H("OFFERING_MENU_PHOTO_LIGHTBOX_FRAGMENT_LIGHTBOX_FRAGMENT_TAG");
        if (H == null) {
            bbut bbutVar = cczaVar.a;
            ckne ckneVar = new ckne(dcdc.r(r));
            bbtv v = bbty.v();
            v.k(false);
            v.r(2);
            v.t(true);
            H = bbutVar.D(ckneVar, i, v.a());
        }
        cczaVar.c = H;
        gz b = cczaVar.b.b();
        b.C(i2, H, "OFFERING_MENU_PHOTO_LIGHTBOX_FRAGMENT_LIGHTBOX_FRAGMENT_TAG");
        b.g();
        View L = cczuVar.L(ccql.e, FrameLayout.class);
        if (L != null) {
            cczuVar.d.f(L, cczuVar.a.getResources().getString(R.string.OFFERING_SUGGESTION_OPEN_PHOTO_VIEWER_ACCESSIBILITY_ANNOUNCEMENT));
        }
        return cqkl.a;
    }

    @Override // defpackage.ccvr
    public cjtd c() {
        dgfb dgfbVar = this.c;
        if (ccrh.g.containsKey(dgfbVar)) {
            return ccrh.g.get(dgfbVar);
        }
        return cjtd.b;
    }

    @Override // defpackage.ccvr
    public String d() {
        int i = this.e + 1;
        return this.b.getQuantityString(R.plurals.OFFERING_MENU_PHOTO_CAROUSEL_CARD_CONTENT_DESCRIPTION, i, Integer.valueOf(i));
    }

    @Override // defpackage.ccvr
    public Boolean e() {
        return Boolean.valueOf(this.a.getUgcOfferingsParameters().l());
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdow  reason: default package */
/* loaded from: classes3.dex */
class bdow implements bdoi {
    private final ges a;
    private final bwrs<bcan> b;
    private final bcoz c;
    private final String d;

    public bdow(ges gesVar, bwrs<bcan> bwrsVar, bcoz bcozVar) {
        this.a = gesVar;
        this.b = bwrsVar;
        this.d = gesVar.Rp(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_GALLERY_TAKE_PHOTOS);
        this.c = bcozVar;
    }

    @Override // defpackage.bdoh
    public String a() {
        return this.d;
    }

    @Override // defpackage.bdok
    public cqkl b() {
        bcoz bcozVar = this.c;
        ges gesVar = this.a;
        bwrs<bcan> bwrsVar = this.b;
        bbtr k = bbts.k();
        k.c();
        bcozVar.a(gesVar, bwrsVar, true, k.a());
        return cqkl.a;
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdpb  reason: default package */
/* loaded from: classes3.dex */
class bdpb implements bdoo {
    private final ges a;
    private final bwrs<bcan> b;
    private final bwqv c;
    private final String d;

    public bdpb(ges gesVar, bwrs<bcan> bwrsVar, bwqv bwqvVar) {
        this.a = gesVar;
        this.b = bwrsVar;
        this.c = bwqvVar;
        this.d = gesVar.Rp(R.string.UNIFIED_PHOTO_UPLOAD_FLOW_GALLERY_PICK_PHOTOS);
    }

    @Override // defpackage.bdoh
    public String a() {
        return this.d;
    }

    @Override // defpackage.bdok
    public cqkl b() {
        ges gesVar = this.a;
        if (gesVar.aD) {
            gesVar.aZ(bdpy.g(this.c, bcpa.PICK_FROM_GALLERY, this.b));
        }
        return cqkl.a;
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdes  reason: default package */
/* loaded from: classes4.dex */
public class cdes implements cdeh {
    final /* synthetic */ gga a;
    final /* synthetic */ cklf b;
    final /* synthetic */ cdex c;

    public cdes(cdex cdexVar, gga ggaVar, cklf cklfVar) {
        this.c = cdexVar;
        this.a = ggaVar;
        this.b = cklfVar;
    }

    @Override // defpackage.cdeh
    public CharSequence a() {
        return this.a.getResources().getString(true != this.c.e ? R.string.TODO_PHOTO_FROM_GOOGLE_PHOTOS : R.string.TODO_PHOTO_FROM_GOOGLE_PHOTOS_NOT_DEVICE);
    }

    @Override // defpackage.cdeh
    public cqkl b() {
        this.b.a("maps_android_add_photos_contribute");
        return cqkl.a;
    }

    @Override // defpackage.cdeh
    public cjtd c() {
        cjta b = cjtd.b();
        b.b = this.c.w();
        b.d = dtxy.oR;
        return b.a();
    }
}

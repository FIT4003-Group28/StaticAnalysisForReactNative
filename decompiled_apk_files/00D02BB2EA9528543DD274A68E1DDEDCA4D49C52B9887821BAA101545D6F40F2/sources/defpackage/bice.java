package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bice  reason: default package */
/* loaded from: classes3.dex */
public class bice implements bibp {
    private final gga a;
    private final dxio<axwo> b;

    public bice(gga ggaVar, dxio<axwo> dxioVar) {
        this.a = ggaVar;
        this.b = dxioVar;
    }

    @Override // defpackage.bibp
    public jic a() {
        return new jic((String) null, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, cqrt.g(2131231730, baam.c(baab.STARRED_PLACES)), 0);
    }

    @Override // defpackage.bibp
    public CharSequence b() {
        return this.a.getString(R.string.SAVED_IN_LIST, new Object[]{g()});
    }

    @Override // defpackage.bibp
    public CharSequence c() {
        return this.a.getString(R.string.YOUR_PRIVATE_LIST);
    }

    @Override // defpackage.bibp
    public CharSequence d() {
        return "";
    }

    @Override // defpackage.bibp
    @dzsi
    public cjtd e() {
        return null;
    }

    @Override // defpackage.bibp
    public cjtd f() {
        return cjtd.a(dtxy.jp);
    }

    @Override // defpackage.bibp
    public String g() {
        return this.a.getString(R.string.DEFAULT_LIST_STARRED_PLACES);
    }

    @Override // defpackage.bibp
    public cqkl h() {
        return cqkl.a;
    }

    @Override // defpackage.bibp
    public cqkl i() {
        this.b.a().k(baab.STARRED_PLACES);
        return cqkl.a;
    }

    @Override // defpackage.bibp
    public Boolean j() {
        return false;
    }
}

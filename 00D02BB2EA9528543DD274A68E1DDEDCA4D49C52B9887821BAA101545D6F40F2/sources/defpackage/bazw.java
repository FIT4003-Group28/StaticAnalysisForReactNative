package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bazw  reason: default package */
/* loaded from: classes3.dex */
public class bazw extends bbal {
    public final axwq a;
    public final bazv c;
    public final bvrb d;
    public azvo e;
    private final dzsj<bvsl> f;
    @dzsi
    private final Integer g;

    public bazw(gga ggaVar, axwq axwqVar, bwqv bwqvVar, ania aniaVar, dzsj<bvsl> dzsjVar, bvrb bvrbVar, batz batzVar, azvo azvoVar, bazv bazvVar, @dzsi Integer num) {
        super(ggaVar, bwqvVar, aniaVar, batzVar);
        this.a = axwqVar;
        this.f = dzsjVar;
        this.e = azvoVar;
        this.c = bazvVar;
        this.g = num;
        this.d = bvrbVar;
    }

    @Override // defpackage.bayj
    public String a() {
        return dbsj.e(axxz.a(this.t, null, null, dcdc.f(this.e), null));
    }

    @Override // defpackage.bayj
    public jic c() {
        return new jic(this.e.n(), ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }

    @Override // defpackage.bayj
    public String d() {
        return this.t.getString(R.string.YOUR_PLACES_NICKNAMED_PLACES);
    }

    @Override // defpackage.bayj
    @dzsi
    public ilo f() {
        return batz.a(this.e.c(), this.e.b(), this.e.d());
    }

    @Override // defpackage.bayj
    public cjtd g() {
        return cjtd.a(dtyd.cA);
    }

    @Override // defpackage.bayj
    public jht h() {
        jhu h = jhv.h();
        ((jhi) h).e = this.t.getString(R.string.YOUR_PLACES_CONTACT_ITEM_OVERFLOW_MENU_CONTENT_DESCRIPTION_FORMAT, new Object[]{a()});
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.HIDE_CONTACT_TEXT;
        jhmVar.a = this.t.getString(R.string.HIDE_CONTACT_TEXT);
        jhmVar.d(new bazo(this));
        h.d(jhmVar.c());
        jhm jhmVar2 = new jhm();
        jhmVar2.l = R.string.REMOVE_CONTACT_MENU_TEXT;
        jhmVar2.a = this.t.getString(R.string.REMOVE_CONTACT_MENU_TEXT);
        jhmVar2.d(new bazp(this));
        h.d(jhmVar2.c());
        return h.b();
    }

    public long i() {
        return this.e.g();
    }

    @Override // defpackage.bbal, defpackage.bayj
    public String k() {
        return batx.b(this.g, this.f.a());
    }

    @Override // defpackage.bbal, defpackage.bayj
    @dzsi
    public akqq q() {
        return this.e.d();
    }

    @Override // defpackage.bayj
    /* renamed from: u */
    public String b() {
        return this.e.c();
    }
}

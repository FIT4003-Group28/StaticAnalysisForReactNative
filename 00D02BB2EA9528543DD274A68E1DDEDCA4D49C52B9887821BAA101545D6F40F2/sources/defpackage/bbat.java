package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbat  reason: default package */
/* loaded from: classes3.dex */
public class bbat extends bbal implements bayk {
    public final bvrb a;
    public final axwq c;
    public long d;
    public int e;
    private final aymh f;
    private final ayak g;
    private final jic h;

    public bbat(gga ggaVar, bvrb bvrbVar, axwq axwqVar, bwqv bwqvVar, ania aniaVar, aymh aymhVar, ayak ayakVar, batz batzVar, axwg axwgVar) {
        super(ggaVar, bwqvVar, aniaVar, batzVar);
        jic e;
        this.a = bvrbVar;
        this.c = axwqVar;
        this.f = aymhVar;
        this.g = ayakVar;
        u(bbaq.a);
        if (axwgVar.f()) {
            e = bael.d(baab.STARRED_PLACES);
        } else {
            e = baam.e(baab.STARRED_PLACES);
        }
        this.h = e;
    }

    @Override // defpackage.bayj
    public String a() {
        return this.t.getString(R.string.STARRED_PLACES_BUILT_IN_LIST_TITLE);
    }

    @Override // defpackage.bayj
    public CharSequence b() {
        return this.f.d(drcs.PRIVATE, this.e);
    }

    @Override // defpackage.bayj
    public jic c() {
        return this.h;
    }

    @Override // defpackage.bayj
    public String d() {
        throw new UnsupportedOperationException("Page title is not supported for 'Lists'");
    }

    @Override // defpackage.bbal, defpackage.bayj
    public cqkl e() {
        this.t.D(ayen.g());
        return cqkl.a;
    }

    @Override // defpackage.bayj
    public ilo f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bayj
    public cjtd g() {
        return cjtd.a(dtyg.M);
    }

    @Override // defpackage.bayj
    public jht h() {
        jhu h = jhv.h();
        h.e(this.g.a());
        ((jhi) h).e = this.t.getString(R.string.YOUR_PLACES_PLACE_ITEM_OVERFLOW_MENU_CONTENT_DESCRIPTION_FORMAT, new Object[]{a()});
        return h.b();
    }

    @Override // defpackage.bayk
    public long i() {
        return this.d;
    }

    @Override // defpackage.bbal, defpackage.bayj
    public baab s() {
        return baab.STARRED_PLACES;
    }

    public void u(Runnable runnable) {
        this.a.b(new bbas(this, runnable), bvrj.BACKGROUND_THREADPOOL);
    }
}

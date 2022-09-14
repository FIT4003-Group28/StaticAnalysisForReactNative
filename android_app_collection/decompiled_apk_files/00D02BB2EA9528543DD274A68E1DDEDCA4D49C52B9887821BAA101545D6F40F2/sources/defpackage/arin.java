package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arin  reason: default package */
/* loaded from: classes2.dex */
public class arin implements jbk {
    private final jhz a;

    public arin(ff ffVar, jkf jkfVar, dxio<brba> dxioVar, cjqy cjqyVar) {
        jhz jhzVar = new jhz();
        jhzVar.q = cqta.f();
        jhzVar.d = irn.Q();
        jhzVar.j = cqrt.m(R.string.BACK_TO, ffVar.getString(R.string.MY_MAPS_FEATURE_DETAILS_PAGE));
        jhzVar.f(new aril(jkfVar, ffVar));
        jhzVar.o = cjtd.a(dtxv.eB);
        jhm jhmVar = new jhm();
        jhmVar.a = ffVar.getString(R.string.SEARCH);
        jhmVar.c = cqrt.f(2131231736);
        jhmVar.h = 2;
        jhmVar.b = ffVar.getString(R.string.SEARCH);
        jhmVar.d(new arim(dxioVar, cjqyVar));
        jhzVar.c(jhmVar.c());
        this.a = jhzVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.a.b();
    }

    public void b(String str) {
        this.a.a = str;
        cqkx.p(this);
    }
}

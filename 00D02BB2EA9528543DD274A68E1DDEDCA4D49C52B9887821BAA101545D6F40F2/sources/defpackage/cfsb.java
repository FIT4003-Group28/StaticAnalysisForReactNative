package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfsb  reason: default package */
/* loaded from: classes4.dex */
public class cfsb extends cftb<Integer> {
    private final dxio<bbut> a;
    private final Resources b;
    private final akzh c;
    private final CharSequence d;
    private final CharSequence e;
    private final Boolean f;

    @Deprecated
    public cfsb(dxio<bbut> dxioVar, akzh akzhVar, Resources resources) {
        this.a = dxioVar;
        this.c = akzhVar;
        this.b = resources;
        this.d = "";
        this.e = "";
        this.f = false;
    }

    @Override // defpackage.cfta
    public cqkl a() {
        akqq S = this.c.g().S();
        bbuz m = bbve.m();
        m.e(dwyd.HOME_SCREEN_CONTRIBUTE_TAB);
        m.b(bbuy.POP_OUT_OF_PHOTO_UPLOAD_FLOW);
        ((bbsu) m).a = bbvd.f(S);
        this.a.a().j(m.a());
        return cqkl.a;
    }

    @Override // defpackage.cftb
    protected final int b() {
        return R.raw.ic_mod_add_photo;
    }

    @Override // defpackage.cfta
    public Integer c() {
        return Integer.valueOf((int) R.string.ADD_A_PHOTO);
    }

    @Override // defpackage.cftb, defpackage.cfta
    public CharSequence d() {
        return this.d;
    }

    @Override // defpackage.cftb, defpackage.cfta
    public CharSequence e() {
        return g().booleanValue() ? this.e : this.b.getString(R.string.ADD_A_PHOTO_ONBOARDING_DESCRIPTION);
    }

    @Override // defpackage.cfta
    public ddho f(cfsz cfszVar) {
        cfsz cfszVar2 = cfsz.DEFAULT;
        return cfszVar.ordinal() != 1 ? dtxl.dY : dtxl.em;
    }

    @Override // defpackage.cftb, defpackage.cfta
    public Boolean g() {
        return this.f;
    }

    public cfsb(dxio<bbut> dxioVar, akzh akzhVar, Resources resources, CharSequence charSequence, CharSequence charSequence2) {
        this.a = dxioVar;
        this.c = akzhVar;
        this.b = resources;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = true;
    }
}

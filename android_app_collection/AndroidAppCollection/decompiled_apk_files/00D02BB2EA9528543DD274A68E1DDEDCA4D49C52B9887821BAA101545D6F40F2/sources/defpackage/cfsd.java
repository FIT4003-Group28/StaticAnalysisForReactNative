package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfsd  reason: default package */
/* loaded from: classes4.dex */
public class cfsd extends cftb<Integer> {
    private final dxio<cqg> a;
    private final Resources b;
    private final CharSequence c;
    private final CharSequence d;
    private final Boolean e;

    @Deprecated
    public cfsd(dxio<cqg> dxioVar, Resources resources) {
        this.a = dxioVar;
        this.b = resources;
        this.c = "";
        this.d = "";
        this.e = false;
    }

    @Override // defpackage.cfta
    public cqkl a() {
        this.a.a().b(cqf.a(dnqb.HOME_SCREEN_CONTRIBUTE_TAB), true);
        return cqkl.a;
    }

    @Override // defpackage.cftb
    protected final int b() {
        return R.raw.ic_add_location_alt;
    }

    @Override // defpackage.cfta
    public Integer c() {
        return Integer.valueOf((int) R.string.ADD_PLACE);
    }

    @Override // defpackage.cftb, defpackage.cfta
    public CharSequence d() {
        return this.c;
    }

    @Override // defpackage.cftb, defpackage.cfta
    public CharSequence e() {
        return g().booleanValue() ? this.d : this.b.getString(R.string.ADD_PLACE_ONBOARDING_DESCRIPTION);
    }

    @Override // defpackage.cfta
    public ddho f(cfsz cfszVar) {
        cfsz cfszVar2 = cfsz.DEFAULT;
        return cfszVar.ordinal() != 1 ? dtxl.dZ : dtxl.en;
    }

    @Override // defpackage.cftb, defpackage.cfta
    public Boolean g() {
        return this.e;
    }

    public cfsd(dxio<cqg> dxioVar, Resources resources, CharSequence charSequence, CharSequence charSequence2) {
        this.a = dxioVar;
        this.b = resources;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = true;
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bshl  reason: default package */
/* loaded from: classes4.dex */
class bshl implements jae {
    final /* synthetic */ bsho a;
    private final djkt b;
    private final int c;

    public bshl(bsho bshoVar, djkt djktVar, int i) {
        this.a = bshoVar;
        this.b = djktVar;
        this.c = i;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jae
    public Boolean b() {
        return Boolean.valueOf(this.a.d(this.c));
    }

    @Override // defpackage.jae
    @dzsi
    public cqtd c() {
        return null;
    }

    @Override // defpackage.jae
    public CharSequence d() {
        return this.b.b;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.a.c(cjqmVar, this.c);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jae
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.jae
    public jic h() {
        return null;
    }

    @Override // defpackage.jae
    public String i() {
        String string;
        if (b().booleanValue()) {
            string = this.a.a.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.a.a.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.a.a.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, new Object[]{d(), string});
    }
}

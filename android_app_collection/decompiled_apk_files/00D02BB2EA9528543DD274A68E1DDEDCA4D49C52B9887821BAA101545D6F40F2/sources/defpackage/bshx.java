package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bshx  reason: default package */
/* loaded from: classes4.dex */
class bshx implements jae {
    final /* synthetic */ bshy a;
    private final djkt b;

    public bshx(bshy bshyVar, djkt djktVar) {
        this.a = bshyVar;
        this.b = djktVar;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jae
    public Boolean b() {
        return Boolean.valueOf(this.a.c(this.b));
    }

    @Override // defpackage.jae
    @dzsi
    public cqtd c() {
        dspd dspdVar = this.b.c;
        if (bshy.b.containsKey(dspdVar)) {
            return cqrt.f(bshy.b.get(dspdVar).intValue());
        }
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
        bshy bshyVar = this.a;
        djkt djktVar = this.b;
        if (bshyVar.c(djktVar)) {
            bshyVar.c.remove(djktVar);
        } else {
            bshyVar.c.add(djktVar);
        }
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jae
    @dzsi
    public cjtd g() {
        return cjtd.a(dtxp.o);
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
        return this.a.a.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, d(), string);
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bshu  reason: default package */
/* loaded from: classes4.dex */
public class bshu implements jae {
    final /* synthetic */ bshw a;
    private final djkt b;
    private final int c;

    public bshu(bshw bshwVar, djkt djktVar, int i) {
        this.a = bshwVar;
        this.b = djktVar;
        this.c = i;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jae
    public Boolean b() {
        return Boolean.valueOf(this.a.g(this.c));
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
        this.a.i(this.c, cjqmVar);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.jae
    @dzsi
    public cjtd g() {
        bshw bshwVar = this.a;
        if (bshwVar.b.equals(bshwVar.a)) {
            return cjtd.a(this.a.e());
        }
        return cjtd.a(this.a.f());
    }

    @Override // defpackage.jae
    @dzsi
    public jic h() {
        cqtd cqtdVar = null;
        if (d().toString().equals(this.a.a.b)) {
            return null;
        }
        String str = this.b.d;
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        if (this.b.d.isEmpty()) {
            cqtdVar = cqrt.f(this.a.d());
        }
        return new jic(str, ckqcVar, cqtdVar, 0);
    }

    @Override // defpackage.jae
    public String i() {
        String string;
        if (b().booleanValue()) {
            string = this.a.c.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.a.c.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.a.c.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, new Object[]{d(), string});
    }
}

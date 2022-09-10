package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cauw  reason: default package */
/* loaded from: classes4.dex */
public class cauw implements jax {
    static final cqtd a = cqrt.h(2131231716, cqrt.c(R.color.qu_blue_grey_400));
    private final Resources b;
    @dzsi
    private final jay c;
    private final dvyw d;
    private final String e;

    public cauw(Resources resources, @dzsi jay jayVar, String str, dvyw dvywVar) {
        this.b = resources;
        this.c = jayVar;
        this.d = dvywVar;
        this.e = str;
    }

    @Override // defpackage.jax
    public CharSequence b() {
        return this.d.i.isEmpty() ? this.b.getString(R.string.PLACE_QA_INACTIVE_PLACE_TITLE) : this.d.i;
    }

    @Override // defpackage.jax
    public CharSequence c() {
        return null;
    }

    @Override // defpackage.jax
    public cqss d() {
        return irg.H();
    }

    @Override // defpackage.jax
    public cqtv e() {
        return jaw.a();
    }

    @Override // defpackage.jax
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jax
    @dzsi
    public CharSequence g() {
        return this.d.p.isEmpty() ? this.b.getString(R.string.PLACE_QA_INACTIVE_PLACE_SUBTITLE) : this.d.p;
    }

    @Override // defpackage.jax
    @dzsi
    public jht h() {
        jay jayVar = this.c;
        if (jayVar == null) {
            return null;
        }
        return jayVar.b();
    }

    @Override // defpackage.jax
    @dzsi
    public CharSequence i() {
        return this.e;
    }

    @Override // defpackage.jax
    public Boolean j() {
        return Boolean.TRUE;
    }

    @Override // defpackage.jax
    @dzsi
    public jic k() {
        dwfl dwflVar = this.d.G;
        if (dwflVar == null) {
            dwflVar = dwfl.w;
        }
        return owy.g(dwflVar, a);
    }

    @Override // defpackage.jax
    public Boolean l() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl m(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public Boolean n() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl o(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public Boolean p() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jax
    public cqkl q(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.jax
    public cjtd r() {
        return null;
    }

    @Override // defpackage.jax
    public cjtd s() {
        return null;
    }

    @Override // defpackage.jax
    public jic t() {
        throw null;
    }

    @Override // defpackage.jax
    public cqss u() {
        throw null;
    }

    @Override // defpackage.jax
    public jic v() {
        return null;
    }

    @Override // defpackage.jax
    public String w() {
        return null;
    }
}

package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajfj  reason: default package */
/* loaded from: classes2.dex */
class ajfj implements jax {
    private final cjtd a = cjtd.a(dtxu.ep);
    private final ahwl b;
    private final Resources c;
    private final cqat d;
    private final ajsc e;
    @dzsi
    private ajfi f;

    public ajfj(ahwl ahwlVar, Resources resources, cqat cqatVar, ajsc ajscVar) {
        this.b = ahwlVar;
        this.c = resources;
        this.d = cqatVar;
        this.e = ajscVar;
    }

    public void a(ajfi ajfiVar) {
        this.f = ajfiVar;
    }

    @Override // defpackage.jax
    public CharSequence b() {
        return this.b.t();
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
        Resources resources = this.c;
        cqat cqatVar = this.d;
        ajsc ajscVar = this.e;
        ahwl ahwlVar = this.b;
        if (ahwlVar.y() <= 0) {
            return resources.getString(R.string.PERSON_SHEET_LOADING_DETAILS);
        }
        String valueOf = String.valueOf(ajscVar.a(ahwlVar.A(cqatVar.b())));
        String x = ahwlVar.x();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 5 + String.valueOf(x).length());
        sb.append(valueOf);
        sb.append("  •  ");
        sb.append(x);
        return sb.toString();
    }

    @Override // defpackage.jax
    public CharSequence g() {
        return null;
    }

    @Override // defpackage.jax
    @dzsi
    public jht h() {
        return null;
    }

    @Override // defpackage.jax
    public CharSequence i() {
        return null;
    }

    @Override // defpackage.jax
    public Boolean j() {
        return Boolean.TRUE;
    }

    @Override // defpackage.jax
    public jic k() {
        return new jic(this.b.u(), ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }

    @Override // defpackage.jax
    public Boolean l() {
        return true;
    }

    @Override // defpackage.jax
    public cqkl m(cjqm cjqmVar) {
        ajfi ajfiVar = this.f;
        if (ajfiVar != null) {
            PersonId q = this.b.q();
            ahuo ahuoVar = (ahuo) ajfiVar;
            if (!ahuoVar.b.a.b.isFinishing() && !ahuoVar.b.a.b.isDestroyed()) {
                ahuoVar.a.dismiss();
            }
            ahuoVar.b.a.s(dbsg.i(q), ahwe.MAP_TAP, false);
        }
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
    @dzsi
    public cjtd s() {
        return this.a;
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

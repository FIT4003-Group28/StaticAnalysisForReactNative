package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahbt  reason: default package */
/* loaded from: classes2.dex */
class ahbt implements agzi {
    final /* synthetic */ ahbw a;

    public ahbt(ahbw ahbwVar) {
        this.a = ahbwVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        boolean z = false;
        if (!this.a.j().booleanValue() && !this.a.e().booleanValue() && !this.a.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agzi
    public CharSequence b() {
        return e();
    }

    @Override // defpackage.jad
    public cqkl c() {
        if (this.a.g.isEmpty()) {
            return cqkl.a;
        }
        ahbw ahbwVar = this.a;
        ahbwVar.h = true;
        deha.q(ahbwVar.a.g(ahbwVar.g, ahbwVar.d), new ahbu(this.a), this.a.c.h());
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxu.bo);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.b.getString(R.string.LOCALSTREAM_FOLLOW_MANAGEMENT_AREA_PICKER_SELECT_BUTTON_TEXT);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.agzi, defpackage.jad
    public cqtd i() {
        return agxk.b;
    }
}

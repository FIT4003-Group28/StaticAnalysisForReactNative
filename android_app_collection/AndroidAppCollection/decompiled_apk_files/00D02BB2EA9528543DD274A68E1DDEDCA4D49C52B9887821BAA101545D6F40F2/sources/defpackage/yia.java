package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yia  reason: default package */
/* loaded from: classes7.dex */
public class yia implements jad {
    final /* synthetic */ yib a;
    private CharSequence b = null;

    public yia(yib yibVar) {
        this.a = yibVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    public cqkl c() {
        yib yibVar = this.a;
        yibVar.s();
        yibVar.p(true);
        yibVar.g = null;
        yibVar.d.d();
        yibVar.j = null;
        yth ythVar = yibVar.f;
        if (ythVar != null) {
            ythVar.a(false);
        }
        cqkx.p(yibVar);
        yibVar.u();
        yth ythVar2 = this.a.f;
        if (ythVar2 != null) {
            ythVar2.e();
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtyc.dI);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        yvq f = this.a.f();
        Integer q = f != null ? f.q() : null;
        if (q == null) {
            CharSequence charSequence = this.b;
            return charSequence != null ? charSequence : this.a.b.getString(R.string.TRANSIT_LINE_SPACE_STATIONS_SEARCH_BUTTON_TEXT);
        }
        if (bzlx.a(2, q.intValue())) {
            this.b = this.a.b.getString(R.string.TRANSIT_LINE_SPACE_STOPS_SEARCH_BUTTON_TEXT);
        } else {
            this.b = this.a.b.getString(R.string.TRANSIT_LINE_SPACE_STATIONS_SEARCH_BUTTON_TEXT);
        }
        return this.b;
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

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}

package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ywg  reason: default package */
/* loaded from: classes7.dex */
public class ywg implements jad {
    final /* synthetic */ ywh a;

    public ywg(ywh ywhVar) {
        this.a = ywhVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.a.G() != null);
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.a.S();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        yvx C = this.a.C();
        if (C == null) {
            return cjtd.b;
        }
        return cjtd.a(C.o());
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.b.getString(R.string.TRANSIT_SEEKER_SEE_MORE_DEPARTURES_TEXT);
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

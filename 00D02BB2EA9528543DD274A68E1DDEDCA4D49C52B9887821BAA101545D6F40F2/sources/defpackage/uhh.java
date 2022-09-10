package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uhh  reason: default package */
/* loaded from: classes7.dex */
class uhh implements jam {
    private final CharSequence a;
    @dzsi
    private final CharSequence b;
    private final cqtd c;
    private final boolean d;

    public uhh(Activity activity, uhg uhgVar) {
        this.a = activity.getString(uhgVar.d);
        Integer num = uhgVar.e;
        this.b = num != null ? activity.getString(num.intValue()) : null;
        this.c = uhgVar.f;
        this.d = uhgVar.g;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence b() {
        return this.a;
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jam
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.jam
    public CharSequence j() {
        return null;
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        return this.b;
    }

    @Override // defpackage.jam
    @dzsi
    public cqtd o() {
        return this.c;
    }
}

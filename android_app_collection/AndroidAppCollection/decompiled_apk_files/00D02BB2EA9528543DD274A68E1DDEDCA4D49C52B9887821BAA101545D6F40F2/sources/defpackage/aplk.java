package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aplk  reason: default package */
/* loaded from: classes2.dex */
class aplk implements jam {
    private final gga a;
    private final Runnable b;

    public aplk(gga ggaVar, Runnable runnable) {
        this.a = ggaVar;
        this.b = runnable;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.a.getString(R.string.DATA_REQUEST_ERROR);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return true;
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        this.b.run();
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
        return null;
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }
}

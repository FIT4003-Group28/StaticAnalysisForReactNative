package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anfh  reason: default package */
/* loaded from: classes2.dex */
class anfh implements jam {
    final /* synthetic */ Activity a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ anfi c;

    public anfh(anfi anfiVar, Activity activity, Runnable runnable) {
        this.c = anfiVar;
        this.a = activity;
        this.b = runnable;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return Boolean.valueOf(this.c.a == anfb.FAILURE);
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence b() {
        return this.a.getString(R.string.CANNOT_CONNECT);
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

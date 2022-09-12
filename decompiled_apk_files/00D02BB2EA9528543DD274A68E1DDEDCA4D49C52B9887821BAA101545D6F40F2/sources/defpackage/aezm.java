package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aezm  reason: default package */
/* loaded from: classes2.dex */
class aezm implements jam {
    private final Resources a;
    private final aezl b;
    private final Runnable c;
    private final Runnable d;

    public aezm(Resources resources, aezl aezlVar, Runnable runnable, Runnable runnable2) {
        this.a = resources;
        this.b = aezlVar;
        this.c = runnable;
        this.d = runnable2;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.a.getText(this.b.d);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.a(this.b.f);
    }

    @Override // defpackage.jam
    public Boolean d() {
        boolean z = true;
        if (this.b != aezl.OFFLINE_ERROR && this.b != aezl.GENERIC_ERROR) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.a(dtxs.m);
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.valueOf(this.b == aezl.SIGNED_OUT_ERROR);
    }

    @Override // defpackage.jam
    public cqkl i() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.jam
    public CharSequence j() {
        return this.a.getText(R.string.INAPP_SURVEY_DONE_LINK);
    }

    @Override // defpackage.jam
    public Boolean k() {
        return false;
    }

    @Override // defpackage.jam
    public cjtd l() {
        return cjtd.a(dtxs.l);
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    public CharSequence n() {
        return this.a.getText(this.b.e);
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }
}

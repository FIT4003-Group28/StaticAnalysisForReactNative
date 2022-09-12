package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdin  reason: default package */
/* loaded from: classes3.dex */
public class bdin implements jam {
    private final Context a;
    private boolean b = false;

    public bdin(Application application) {
        this.a = application;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.a.getResources().getString(R.string.DATA_REQUEST_ERROR_TITLE);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return false;
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
    public CharSequence n() {
        return this.a.getResources().getString(R.string.DATA_REQUEST_ERROR_SUBTITLE);
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }

    public void p(boolean z) {
        this.b = z;
    }
}

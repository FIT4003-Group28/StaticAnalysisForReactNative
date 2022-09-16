package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brqd  reason: default package */
/* loaded from: classes4.dex */
public class brqd implements jam {
    private final Context a;
    private Boolean b = false;

    public brqd(Context context) {
        this.a = context;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return this.b;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.a.getResources().getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_TITLE);
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
        return this.a.getResources().getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_SUBTITLE);
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }

    public void p(Boolean bool) {
        this.b = bool;
    }
}

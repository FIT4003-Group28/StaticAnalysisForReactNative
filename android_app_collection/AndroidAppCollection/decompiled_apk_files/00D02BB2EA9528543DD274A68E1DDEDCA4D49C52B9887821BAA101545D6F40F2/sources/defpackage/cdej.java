package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdej  reason: default package */
/* loaded from: classes4.dex */
public class cdej implements jam {
    final /* synthetic */ cdel a;

    public cdej(cdel cdelVar) {
        this.a = cdelVar;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return Boolean.valueOf(this.a.c == cdek.ERROR);
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.a.a.getResources().getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_TITLE);
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
        this.a.b.q();
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
        return this.a.a.getResources().getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY_SUBTITLE);
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }
}

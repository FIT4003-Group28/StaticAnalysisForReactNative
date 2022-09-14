package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ucp  reason: default package */
/* loaded from: classes7.dex */
public class ucp implements jam {
    private final tgg a;
    private final CharSequence b;
    @dzsi
    private final CharSequence c;
    private final cqtd d;
    private final boolean e;

    public ucp(Activity activity, tgg tggVar, uco ucoVar) {
        this.a = tggVar;
        this.b = activity.getString(ucoVar.d);
        Integer num = ucoVar.e;
        this.c = num != null ? activity.getString(num.intValue()) : null;
        this.d = ucoVar.f;
        this.e = ucoVar.g;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.jam
    public cjtd c() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        this.a.a();
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
        return this.c;
    }

    @Override // defpackage.jam
    @dzsi
    public cqtd o() {
        return this.d;
    }
}

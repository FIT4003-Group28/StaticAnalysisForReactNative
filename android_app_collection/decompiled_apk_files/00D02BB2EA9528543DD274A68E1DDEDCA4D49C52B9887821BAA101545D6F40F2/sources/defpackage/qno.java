package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: qno  reason: default package */
/* loaded from: classes7.dex */
public class qno implements jam {
    public static final cqrp a = cqrp.d(96.0d);
    private final Context b;
    private final qnn c;
    private final cjtd d;
    private final cjtd e;

    public qno(Context context, qnn qnnVar) {
        this.b = context;
        this.c = qnnVar;
        this.d = cjtd.a(qnnVar.j);
        ddho ddhoVar = qnnVar.k;
        this.e = ddhoVar == null ? cjtd.b : cjtd.a(ddhoVar);
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence b() {
        return this.b.getString(this.c.h);
    }

    @Override // defpackage.jam
    public cjtd c() {
        return this.d;
    }

    @Override // defpackage.jam
    public Boolean d() {
        return Boolean.valueOf(this.c.f);
    }

    @Override // defpackage.jam
    public cqfc e() {
        return jal.a;
    }

    @Override // defpackage.jam
    public cqkl f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jam
    public cjtd g() {
        return this.e;
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
    @dzsi
    public CharSequence j() {
        return this.b.getString(this.c.l);
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return this.c.n;
    }

    @Override // defpackage.jam
    @dzsi
    public cqtd m() {
        return this.c.m;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        qnn qnnVar = this.c;
        Context context = this.b;
        int i = qnnVar.i;
        if (i == -1) {
            return null;
        }
        return context.getString(i);
    }

    @Override // defpackage.jam
    @dzsi
    public cqtd o() {
        return this.c.g;
    }
}

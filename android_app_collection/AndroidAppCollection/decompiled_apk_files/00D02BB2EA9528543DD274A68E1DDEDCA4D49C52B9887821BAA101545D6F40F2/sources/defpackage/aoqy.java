package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aoqy  reason: default package */
/* loaded from: classes2.dex */
public class aoqy implements aoqx {
    private final anrr a;
    private final String b;

    public aoqy(Context context, anrr anrrVar) {
        this.a = anrrVar;
        this.b = anpx.b(context, anrrVar.A(), anrrVar.M()).toString();
    }

    @Override // defpackage.aoqx
    public String a() {
        return this.a.f();
    }

    @Override // defpackage.aoqx
    public String b() {
        return this.a.g();
    }

    @Override // defpackage.aoqx
    public String c() {
        return this.b;
    }

    @Override // defpackage.aoqx
    public cjtd d() {
        return this.a.R(dtyi.aR);
    }

    @Override // defpackage.aoqx
    public cqkl e() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.aoqx
    public jic f() {
        return this.a.K();
    }

    @Override // defpackage.aoqx
    public cqsn g() {
        return this.a.j();
    }

    @Override // defpackage.aoqx
    public Boolean h() {
        return Boolean.valueOf(this.a.j);
    }

    @Override // defpackage.aoqx
    public cqss i() {
        return this.a.M().b();
    }

    @Override // defpackage.aoqx
    public cqss j() {
        return this.a.M().c();
    }
}

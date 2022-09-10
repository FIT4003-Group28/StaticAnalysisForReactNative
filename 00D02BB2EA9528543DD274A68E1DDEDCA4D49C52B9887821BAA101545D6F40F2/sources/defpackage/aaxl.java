package defpackage;
/* compiled from: PG */
/* renamed from: aaxl  reason: default package */
/* loaded from: classes2.dex */
public class aaxl implements aawq {
    private final aahe a;

    public aaxl(aahe aaheVar) {
        this.a = aaheVar;
    }

    @Override // defpackage.aawq
    public Boolean a() {
        return Boolean.valueOf(this.a.b);
    }

    @Override // defpackage.aawq
    public Boolean b() {
        return Boolean.valueOf(this.a.c);
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return this.a.a();
    }

    @Override // defpackage.aawq
    public cqkl d() {
        aahe aaheVar = this.a;
        aaheVar.a = this;
        aaheVar.b();
        return cqkl.a;
    }

    public void e(diwb diwbVar) {
        aahe aaheVar = this.a;
        aaheVar.b = false;
        aaheVar.c = false;
    }

    public void f() {
        aahe aaheVar = this.a;
        aaheVar.b = false;
        aaheVar.c = true;
    }
}

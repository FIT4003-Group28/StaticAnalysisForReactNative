package defpackage;
/* compiled from: PG */
/* renamed from: andq  reason: default package */
/* loaded from: classes2.dex */
public class andq extends anct {
    final /* synthetic */ andr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public andq(andr andrVar, anee aneeVar) {
        super(andrVar, aneeVar);
        this.g = andrVar;
    }

    @Override // defpackage.anct, defpackage.jap
    public cjtd A() {
        return cjtd.a(dtya.ao);
    }

    @Override // defpackage.anct, defpackage.jap
    public cjtd B() {
        return cjtd.a(dtya.ap);
    }

    public void G() {
        this.e = "";
        cqkx.p(this);
    }

    public void H(boolean z) {
        this.a = true;
        cqkx.p(this);
    }

    @Override // defpackage.anct, defpackage.jap
    public Boolean h() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.anct, defpackage.jap
    public cqkl j(cjqm cjqmVar) {
        this.g.q();
        return cqkl.a;
    }

    @Override // defpackage.anct, defpackage.jap
    public Boolean w() {
        boolean z = true;
        if (!this.a && dbsj.d(x())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.anct, defpackage.jap
    public String x() {
        return this.e;
    }
}

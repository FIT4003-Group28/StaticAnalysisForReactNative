package defpackage;
/* compiled from: PG */
/* renamed from: cjuw  reason: default package */
/* loaded from: classes.dex */
public abstract class cjuw implements cjqp {
    public static final cjqo a = cjuv.a;
    public final cjqq b;
    protected cjqo c = a;

    /* JADX INFO: Access modifiers changed from: protected */
    public cjuw(cjqq cjqqVar) {
        this.b = cjqqVar;
    }

    @Override // defpackage.cjqp
    public final cjqq a() {
        return this.b;
    }

    @Override // defpackage.cjqp
    public final void g(cjqo cjqoVar) {
        this.c = cjqoVar;
    }

    @Override // defpackage.cjqp
    public final void h() {
        this.c = a;
    }

    @Override // defpackage.cjqp
    public void i() {
        throw null;
    }

    @Override // defpackage.cjqp
    public void j() {
        throw null;
    }
}

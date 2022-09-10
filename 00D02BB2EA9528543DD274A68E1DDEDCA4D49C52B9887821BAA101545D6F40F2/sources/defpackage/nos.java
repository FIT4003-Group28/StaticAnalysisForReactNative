package defpackage;
/* compiled from: PG */
/* renamed from: nos  reason: default package */
/* loaded from: classes7.dex */
public abstract class nos extends nor implements m {
    private o a;

    /* JADX INFO: Access modifiers changed from: protected */
    public nos(cjqy cjqyVar, cjqq cjqqVar) {
        super(cjqyVar, cjqqVar);
    }

    @Override // defpackage.m
    public final k Nh() {
        o oVar = this.a;
        dbsk.s(oVar);
        return oVar;
    }

    @Override // defpackage.nor, defpackage.non
    public final void a() {
        o oVar = new o(this);
        this.a = oVar;
        oVar.d(j.RESUMED);
        k();
    }

    @Override // defpackage.nor, defpackage.non
    public final void f() {
        dbsk.s(this.a);
        this.a.d(j.DESTROYED);
        l();
    }

    public abstract void k();

    public abstract void l();
}

package defpackage;
/* compiled from: PG */
/* renamed from: fyo  reason: default package */
/* loaded from: classes3.dex */
public abstract class fyo implements fzf {
    public int a;
    protected fyp b;
    public fyz c;

    @Override // defpackage.fzf
    public void h(fyp fypVar) {
        fyp fypVar2 = this.b;
        if (fypVar2 == null || fypVar2.b != fypVar.b) {
            return;
        }
        i();
    }

    public final void i() {
        fyz fyzVar = this.c;
        if (fyzVar != null) {
            fyzVar.a();
            this.c = null;
            this.b = null;
        }
    }

    protected abstract boolean j(fyp fypVar, int i);

    @Override // defpackage.fzf
    public final boolean k(fyp fypVar, int i, fyz fyzVar) {
        if (!j(fypVar, i)) {
            this.c = fyzVar;
            this.a = i;
            this.b = fypVar;
            return false;
        }
        return true;
    }
}

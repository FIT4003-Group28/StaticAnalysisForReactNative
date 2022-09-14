package defpackage;
/* compiled from: PG */
/* renamed from: cjto  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjto extends cjtk {
    public cjto(cqat cqatVar) {
        super(cqatVar.e());
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dnop a = a();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        a.getClass();
        dwunVar.t = a;
        dwunVar.a |= 16384;
    }

    protected abstract dnop a();

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}

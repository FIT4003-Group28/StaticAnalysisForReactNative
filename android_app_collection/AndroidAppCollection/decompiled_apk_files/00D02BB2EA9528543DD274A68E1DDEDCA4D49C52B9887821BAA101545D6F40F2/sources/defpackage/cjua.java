package defpackage;
/* compiled from: PG */
/* renamed from: cjua  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjua extends cjtk {
    public cjua(cqat cqatVar) {
        super(cqatVar.e());
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dvra a = a();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        a.getClass();
        dwunVar.u = a;
        dwunVar.a |= 32768;
    }

    protected abstract dvra a();
}

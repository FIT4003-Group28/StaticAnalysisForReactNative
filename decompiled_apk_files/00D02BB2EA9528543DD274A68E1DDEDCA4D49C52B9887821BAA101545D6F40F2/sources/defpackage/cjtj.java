package defpackage;
/* compiled from: PG */
/* renamed from: cjtj  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjtj extends cjtk {
    public cjtj(cqat cqatVar) {
        super(cqatVar.e());
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        boolean c = c();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        dwunVar.a |= 8;
        dwunVar.h = c;
        dnqg k = k();
        ddgg a = a();
        if (k.c) {
            k.bF();
            k.c = false;
        }
        dnqh dnqhVar = (dnqh) k.b;
        dnqh dnqhVar2 = dnqh.p;
        a.getClass();
        dnqhVar.k = a;
        dnqhVar.a |= 32768;
        dbsg<String> a2 = b().a();
        if (a2.a()) {
            String b = a2.b();
            if (k.c) {
                k.bF();
                k.c = false;
            }
            dnqh dnqhVar3 = (dnqh) k.b;
            b.getClass();
            dnqhVar3.a |= 2;
            dnqhVar3.c = b;
        }
        dnqh bK = k.bK();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar3 = (dwun) dwumVar.b;
        bK.getClass();
        dwunVar3.e = bK;
        dwunVar3.a |= 4;
    }

    protected abstract ddgg a();

    protected abstract cjqm b();

    protected abstract boolean c();

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}

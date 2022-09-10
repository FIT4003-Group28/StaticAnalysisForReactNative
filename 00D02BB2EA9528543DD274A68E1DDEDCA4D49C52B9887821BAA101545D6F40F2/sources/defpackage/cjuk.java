package defpackage;
/* compiled from: PG */
/* renamed from: cjuk  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjuk extends cjtk {
    /* JADX INFO: Access modifiers changed from: protected */
    public cjuk(cqat cqatVar) {
        super(cqatVar.e());
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dwwv b = b();
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        b.getClass();
        dwunVar.p = b;
        dwunVar.a |= 2048;
        dnqg k = k();
        if (k.c) {
            k.bF();
            k.c = false;
        }
        dnqh dnqhVar = dnqh.p;
        ((dnqh) k.b).i = dnqh.ck();
        k.a(c());
        ddxw bZ = ddxx.j.bZ();
        int b2 = d().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ.b;
        ddxxVar.a |= 8;
        ddxxVar.d = b2;
        if (k.c) {
            k.bF();
            k.c = false;
        }
        dnqh dnqhVar2 = (dnqh) k.b;
        ddxx bK = bZ.bK();
        bK.getClass();
        dnqhVar2.f = bK;
        dnqhVar2.a |= 16;
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar3 = (dwun) dwumVar.b;
        dnqh bK2 = k.bK();
        bK2.getClass();
        dwunVar3.e = bK2;
        dwunVar3.a |= 4;
    }

    protected abstract dwwv b();

    protected abstract dcdc<ddhk> c();

    protected abstract ddhn d();

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: cjty  reason: default package */
/* loaded from: classes4.dex */
public final class cjty extends cjtk {
    private final dvnp a;
    private final String b;

    public cjty(dvnp dvnpVar, String str, cqat cqatVar) {
        super(cqatVar.e());
        dbsk.s(dvnpVar);
        dbsk.s(str);
        this.a = dvnpVar;
        this.b = str;
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dvnn bZ = dvnq.d.bZ();
        dvnp dvnpVar = this.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvnq dvnqVar = (dvnq) bZ.b;
        dvnqVar.b = dvnpVar.j;
        int i = dvnqVar.a | 1;
        dvnqVar.a = i;
        String str = this.b;
        str.getClass();
        dvnqVar.a = i | 2;
        dvnqVar.c = str;
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dvnq bK = bZ.bK();
        dwun dwunVar2 = dwun.w;
        bK.getClass();
        dwunVar.n = bK;
        dwunVar.a |= 256;
    }

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}

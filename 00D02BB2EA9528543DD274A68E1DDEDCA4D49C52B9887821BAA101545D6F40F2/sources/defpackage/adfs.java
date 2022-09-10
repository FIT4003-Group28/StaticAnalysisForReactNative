package defpackage;
/* compiled from: PG */
/* renamed from: adfs  reason: default package */
/* loaded from: classes2.dex */
public class adfs implements adfr {
    protected String a;
    protected jic b;
    final String c;
    private final dxio<brba> d;
    private final cjtd e;

    public adfs(dxio<brba> dxioVar, dxio<bwjz> dxioVar2, acwt acwtVar, String str, String str2, String str3, cjtd cjtdVar) {
        this.d = dxioVar;
        this.a = str;
        this.b = j(str2);
        this.c = str3;
        this.e = cjtdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static jic j(String str) {
        return new jic(str, ckqc.FIFE, cqrt.g(2131231620, ire.d()), 250, true, null, null);
    }

    @Override // defpackage.adfr
    public String f() {
        return this.a;
    }

    @Override // defpackage.adfr
    public jic g() {
        return this.b;
    }

    @Override // defpackage.adfr
    public cqkl h(cjqm cjqmVar) {
        dnqg bZ = dnqh.p.bZ();
        if (cjqmVar.a().a()) {
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            b.getClass();
            dnqhVar.a |= 2;
            dnqhVar.c = b;
            doeh bZ2 = doei.d.bZ();
            String b2 = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b2.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b2;
            doei bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            bK.getClass();
            dnqhVar2.m = bK;
            dnqhVar2.a |= 262144;
        }
        int i = ddda.aA.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar3 = (dnqh) bZ.b;
        dnqhVar3.a |= 64;
        dnqhVar3.g = i;
        this.d.a().j(this.c, bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.adfr
    public cjtd i() {
        return this.e;
    }
}

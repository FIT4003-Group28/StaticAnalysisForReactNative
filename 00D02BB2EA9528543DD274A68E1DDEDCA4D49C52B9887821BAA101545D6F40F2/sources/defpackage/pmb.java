package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: pmb  reason: default package */
/* loaded from: classes7.dex */
public class pmb implements plo {
    private final String a;
    private final dqso b;
    private final gga c;
    private final dxio<afha> d;
    private final brba e;

    public pmb(gga ggaVar, dxio<afha> dxioVar, brba brbaVar, String str, dqso dqsoVar) {
        this.c = ggaVar;
        this.d = dxioVar;
        this.e = brbaVar;
        this.a = str;
        this.b = dqsoVar;
    }

    @Override // defpackage.plo
    public CharSequence a() {
        return this.b.c;
    }

    @Override // defpackage.plo
    public cqkl b(cjqm cjqmVar) {
        dqso dqsoVar = this.b;
        if (dqsoVar.a == 3) {
            String str = ((dgbo) dqsoVar.b).c;
            if (!str.isEmpty()) {
                this.d.a().l(this.c, Uri.parse(str), 4);
            }
        }
        if (this.b.a == 4) {
            dnqg bZ = dnqh.p.bZ();
            int i = ddda.aA.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
            if (cjqmVar.a().a()) {
                String b = cjqmVar.a().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                b.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = b;
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
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar3 = (dnqh) bZ.b;
                doei bK = bZ2.bK();
                bK.getClass();
                dnqhVar3.m = bK;
                dnqhVar3.a |= 262144;
            }
            brba brbaVar = this.e;
            dqso dqsoVar2 = this.b;
            brbaVar.j(dqsoVar2.a == 4 ? (String) dqsoVar2.b : "", bZ.bK());
        }
        return cqkl.a;
    }

    @Override // defpackage.plo
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxl.im;
        b.g(this.a);
        return b.a();
    }
}

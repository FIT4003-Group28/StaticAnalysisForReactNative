package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aprz  reason: default package */
/* loaded from: classes2.dex */
public final class aprz {
    private static final dhjx c;
    private final broq a;
    private final ckhe b;

    static {
        dhjw bZ = dhjx.f.bZ();
        dhjy bZ2 = dhjz.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ2.b;
        int i = dhjzVar.a | 2;
        dhjzVar.a = i;
        dhjzVar.c = dcyn.a;
        int i2 = i | 1;
        dhjzVar.a = i2;
        dhjzVar.b = dcyn.a;
        dhjzVar.a = i2 | 4;
        dhjzVar.d = dcyn.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ.b;
        dhjz bK = bZ2.bK();
        bK.getClass();
        dhjxVar.b = bK;
        dhjxVar.a |= 1;
        dhkc bZ3 = dhkd.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ3.b;
        int i3 = dhkdVar.a | 1;
        dhkdVar.a = i3;
        dhkdVar.b = 1;
        dhkdVar.a = i3 | 2;
        dhkdVar.c = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar2 = (dhjx) bZ.b;
        dhkd bK2 = bZ3.bK();
        bK2.getClass();
        dhjxVar2.d = bK2;
        dhjxVar2.a |= 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjx dhjxVar3 = (dhjx) bZ.b;
        dhjxVar3.a |= 8;
        dhjxVar3.e = 30.0f;
        c = bZ.bK();
    }

    public aprz(broq broqVar, ckcw ckcwVar) {
        this.a = broqVar;
        this.b = (ckhe) ckcwVar.a(ckgp.f);
    }

    public final void a(List<akqi> list, aprx aprxVar) {
        dbsk.s(aprxVar);
        dwim bZ = dwir.R.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        dwirVar.a |= 1;
        dwirVar.c = "*";
        dhjx dhjxVar = c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        dhjxVar.getClass();
        dwirVar2.d = dhjxVar;
        dwirVar2.a |= 2;
        int size = list.size();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar3 = (dwir) bZ.b;
        dwirVar3.a |= 16;
        dwirVar3.g = size;
        for (akqi akqiVar : list) {
            if (akqi.d(akqiVar)) {
                dwik bZ2 = dwil.c.bZ();
                String o = akqiVar.o();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dwil dwilVar = (dwil) bZ2.b;
                o.getClass();
                dwilVar.a |= 1;
                dwilVar.b = o;
                bZ.a(bZ2);
            }
        }
        brln brlnVar = new brln(bZ.bK(), new iqy());
        this.b.a();
        brlnVar.f = new apry(aprxVar, this.b);
        this.a.a(brlnVar);
    }
}

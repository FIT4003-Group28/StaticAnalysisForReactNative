package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqgm  reason: default package */
/* loaded from: classes4.dex */
public class bqgm extends dbrh<bqhg, bqif> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ bqhg b(bqif bqifVar) {
        bqif bqifVar2 = bqifVar;
        bqgx e = bqhg.e();
        dccx G = dcdc.G(bqifVar2.b.size());
        for (bqhv bqhvVar : bqifVar2.b) {
            G.g(bqha.a.k().NV(bqhvVar));
        }
        e.a(G.f());
        int i = 1;
        if ((bqifVar2.a & 1) != 0) {
            bqhr bqhrVar = bqifVar2.c;
            if (bqhrVar == null) {
                bqhrVar = bqhr.c;
            }
            e.b(bqhrVar);
        }
        if ((bqifVar2.a & 2) != 0) {
            dbrh<bqie, bqhf> k = bqha.b.k();
            bqie bqieVar = bqifVar2.d;
            if (bqieVar == null) {
                bqieVar = bqie.e;
            }
            e.c(k.NV(bqieVar));
        }
        if ((bqifVar2.a & 4) != 0) {
            int a = bqia.a(bqifVar2.e);
            if (a != 0) {
                i = a;
            }
            e.d(i);
        }
        bqgp bqgpVar = (bqgp) e;
        String str = bqgpVar.d == 0 ? " mode" : "";
        if (bqgpVar.a == null) {
            str = str.concat(" constructedModel");
        }
        if (bqgpVar.b == null) {
            str = String.valueOf(str).concat(" roadUnderConstructionState");
        }
        if (bqgpVar.c == null) {
            str = String.valueOf(str).concat(" nextRoadId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bqgq(bqgpVar.d, bqgpVar.a, bqgpVar.b, bqgpVar.c);
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ bqif c(bqhg bqhgVar) {
        bqhg bqhgVar2 = bqhgVar;
        bqhy bZ = bqif.f.bZ();
        int d = bqhgVar2.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqif bqifVar = (bqif) bZ.b;
        int i = d - 1;
        if (d != 0) {
            bqifVar.e = i;
            bqifVar.a |= 4;
            dcdc<bqgw> a = bqhgVar2.a();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                bqhv NV = bqha.a.NV(a.get(i2));
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bqif bqifVar2 = (bqif) bZ.b;
                NV.getClass();
                bqifVar2.b();
                bqifVar2.b.add(NV);
            }
            bqie NV2 = bqha.b.NV(bqhgVar2.b());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqif bqifVar3 = (bqif) bZ.b;
            NV2.getClass();
            bqifVar3.d = NV2;
            bqifVar3.a |= 2;
            bqhr c = bqhgVar2.c();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqif bqifVar4 = (bqif) bZ.b;
            c.getClass();
            bqifVar4.c = c;
            bqifVar4.a |= 1;
            return bZ.bK();
        }
        throw null;
    }
}

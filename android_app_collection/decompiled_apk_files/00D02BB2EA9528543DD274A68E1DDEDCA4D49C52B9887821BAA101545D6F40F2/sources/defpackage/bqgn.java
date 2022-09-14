package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqgn  reason: default package */
/* loaded from: classes4.dex */
public class bqgn extends dbrh<bqhf, bqie> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ bqhf b(bqie bqieVar) {
        bqie bqieVar2 = bqieVar;
        bqhe d = bqhf.d();
        int i = 1;
        if ((bqieVar2.a & 1) != 0) {
            dbrh<bqhv, bqgw> k = bqhd.a.k();
            bqhv bqhvVar = bqieVar2.b;
            if (bqhvVar == null) {
                bqhvVar = bqhv.i;
            }
            d.b(k.NV(bqhvVar));
        }
        if ((bqieVar2.a & 2) != 0) {
            d.c(bqieVar2.c);
        }
        if ((bqieVar2.a & 4) != 0) {
            int a = bqid.a(bqieVar2.d);
            if (a != 0) {
                i = a;
            }
            d.d(i);
        }
        return d.a();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ bqie c(bqhf bqhfVar) {
        bqhf bqhfVar2 = bqhfVar;
        bqib bZ = bqie.e.bZ();
        int a = bqhfVar2.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqie bqieVar = (bqie) bZ.b;
        bqieVar.a |= 2;
        bqieVar.c = a;
        int c = bqhfVar2.c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bqie bqieVar2 = (bqie) bZ.b;
        int i = c - 1;
        if (c != 0) {
            bqieVar2.d = i;
            bqieVar2.a |= 4;
            bqhv NV = bqhd.a.NV(bqhfVar2.b());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bqie bqieVar3 = (bqie) bZ.b;
            NV.getClass();
            bqieVar3.b = NV;
            bqieVar3.a |= 1;
            return bZ.bK();
        }
        throw null;
    }
}

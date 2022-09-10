package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpbs  reason: default package */
/* loaded from: classes3.dex */
public final class bpbs implements bopb {
    final /* synthetic */ bpbt a;

    public bpbs(bpbt bpbtVar) {
        this.a = bpbtVar;
    }

    @Override // defpackage.bopb
    public final void a() {
        bpbt bpbtVar = this.a;
        if (bpbtVar.aD) {
            bpbtVar.aT();
        }
    }

    @Override // defpackage.bopb
    public final void b(String str, dqgh dqghVar, dosq dosqVar) {
        this.a.ad.o(true);
        bpbt bpbtVar = this.a;
        bnyq bnyqVar = bpbtVar.ag;
        dwju bZ = dwjv.e.bZ();
        dosj bZ2 = dosk.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dosk doskVar = (dosk) bZ2.b;
        str.getClass();
        int i = doskVar.a | 1;
        doskVar.a = i;
        doskVar.b = str;
        doskVar.c = dqghVar.af;
        int i2 = i | 2;
        doskVar.a = i2;
        doskVar.d = dosqVar.e;
        doskVar.a = i2 | 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjv dwjvVar = (dwjv) bZ.b;
        dosk bK = bZ2.bK();
        bK.getClass();
        dwjvVar.c();
        dwjvVar.b.add(bK);
        dnpr bZ3 = dnqf.c.bZ();
        dnps bZ4 = dnqe.i.bZ();
        dnqb dnqbVar = dnqb.PLACE_CARD;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnqe dnqeVar = (dnqe) bZ4.b;
        dnqeVar.b = dnqbVar.ah;
        dnqeVar.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnqf dnqfVar = (dnqf) bZ3.b;
        dnqe bK2 = bZ4.bK();
        bK2.getClass();
        dnqfVar.b = bK2;
        dnqfVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjv dwjvVar2 = (dwjv) bZ.b;
        dnqf bK3 = bZ3.bK();
        bK3.getClass();
        dwjvVar2.c = bK3;
        dwjvVar2.a |= 1;
        djgw a = chiw.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjv dwjvVar3 = (dwjv) bZ.b;
        a.getClass();
        dwjvVar3.d = a;
        dwjvVar3.a |= 4;
        bnyqVar.a();
        bnyqVar.a = bnyqVar.b.b(bZ.bK(), bpbtVar);
    }
}

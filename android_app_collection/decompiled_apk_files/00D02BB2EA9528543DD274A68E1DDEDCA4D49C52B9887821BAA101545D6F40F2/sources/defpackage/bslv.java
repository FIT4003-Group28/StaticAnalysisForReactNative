package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bslv  reason: default package */
/* loaded from: classes4.dex */
public final class bslv extends bskz {
    static final dbrn<djmq, dfpj> a = new bslu();

    @Override // defpackage.bskz
    public final void b(djmr djmrVar, dfpf dfpfVar) {
        int intValue = djmrVar.a == 2 ? ((Integer) djmrVar.b).intValue() : 0;
        dfpg bZ = dfph.f.bZ();
        int i = intValue & 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfph dfphVar = (dfph) bZ.b;
        boolean z = true;
        int i2 = dfphVar.a | 1;
        dfphVar.a = i2;
        dfphVar.b = 1 == i;
        boolean z2 = (intValue & 2) > 0;
        int i3 = i2 | 2;
        dfphVar.a = i3;
        dfphVar.c = z2;
        boolean z3 = (intValue & 4) > 0;
        int i4 = i3 | 4;
        dfphVar.a = i4;
        dfphVar.d = z3;
        if ((intValue & 8) <= 0) {
            z = false;
        }
        dfphVar.a = i4 | 8;
        dfphVar.e = z;
        dfph bK = bZ.bK();
        if (dfpfVar.c) {
            dfpfVar.bF();
            dfpfVar.c = false;
        }
        dfpk dfpkVar = (dfpk) dfpfVar.b;
        dfpk dfpkVar2 = dfpk.c;
        bK.getClass();
        dfpkVar.b = bK;
        dfpkVar.a = 2;
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xkf  reason: default package */
/* loaded from: classes7.dex */
public final class xkf implements dbrn<dooa, dood> {
    public static final xkf a = new xkf(null);
    @dzsi
    private final String b;

    public xkf(@dzsi String str) {
        this.b = str;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ dood a(@dzsi dooa dooaVar) {
        dooa dooaVar2 = dooaVar;
        if (dooaVar2 == null) {
            return dood.n;
        }
        if ((dooaVar2.a & 16) == 0 && this.b != null) {
            donx ca = dooa.m.ca(dooaVar2);
            String str = this.b;
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dooa dooaVar3 = (dooa) ca.b;
            str.getClass();
            dooaVar3.a |= 16;
            dooaVar3.f = str;
            dooaVar2 = ca.bK();
        }
        dooc bZ = dood.n.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dood doodVar = (dood) bZ.b;
        dooaVar2.getClass();
        doodVar.c = dooaVar2;
        doodVar.b = 1;
        return bZ.bK();
    }
}

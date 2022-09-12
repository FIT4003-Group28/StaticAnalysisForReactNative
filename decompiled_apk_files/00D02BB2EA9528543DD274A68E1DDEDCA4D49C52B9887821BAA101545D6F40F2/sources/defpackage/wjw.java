package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wjw  reason: default package */
/* loaded from: classes7.dex */
public class wjw implements dbrn<doou, djyo> {
    public static djyo b(doou doouVar) {
        djyn bZ = djyo.h.bZ();
        if ((doouVar.a & 1) != 0) {
            String str = doouVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djyo djyoVar = (djyo) bZ.b;
            str.getClass();
            djyoVar.a |= 1;
            djyoVar.b = str;
        }
        if ((doouVar.a & 2) != 0) {
            String str2 = doouVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djyo djyoVar2 = (djyo) bZ.b;
            str2.getClass();
            djyoVar2.a |= 2;
            djyoVar2.c = str2;
        }
        dsrj<dpce> dsrjVar = doouVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djyo djyoVar3 = (djyo) bZ.b;
        djyoVar3.b();
        dsod.bv(dsrjVar, djyoVar3.d);
        if ((doouVar.a & 4) != 0) {
            String str3 = doouVar.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djyo djyoVar4 = (djyo) bZ.b;
            str3.getClass();
            djyoVar4.a |= 4;
            djyoVar4.e = str3;
        }
        if ((doouVar.a & 8) != 0) {
            douj doujVar = doouVar.f;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djyo djyoVar5 = (djyo) bZ.b;
            doujVar.getClass();
            djyoVar5.f = doujVar;
            djyoVar5.a |= 8;
        }
        for (dooq dooqVar : doouVar.g) {
            djym a = new wkc().a(dooqVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djyo djyoVar6 = (djyo) bZ.b;
            a.getClass();
            djyoVar6.c();
            djyoVar6.g.add(a);
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ djyo a(doou doouVar) {
        throw null;
    }
}

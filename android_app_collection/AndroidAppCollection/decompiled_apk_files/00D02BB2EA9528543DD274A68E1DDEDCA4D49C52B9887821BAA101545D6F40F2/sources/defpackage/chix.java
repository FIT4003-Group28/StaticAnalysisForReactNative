package defpackage;
/* compiled from: PG */
/* renamed from: chix  reason: default package */
/* loaded from: classes4.dex */
public final class chix {
    public static final void a(chis chisVar, djgl djglVar) {
        djhu djhuVar;
        int i;
        if (djglVar.b == 7) {
            djhuVar = (djhu) djglVar.c;
        } else {
            djhuVar = djhu.f;
        }
        if (chisVar.c) {
            chisVar.bF();
            chisVar.c = false;
        }
        chit chitVar = chit.i;
        ((chit) chisVar.b).b = chit.ck();
        if ((djhuVar.a & 1) != 0) {
            djdm djdmVar = djhuVar.b;
            if (djdmVar == null) {
                djdmVar = djdm.c;
            }
            chhv bZ = chhy.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chhy chhyVar = (chhy) bZ.b;
            djdmVar.getClass();
            chhyVar.b = djdmVar;
            chhyVar.a |= 1;
            if ((djhuVar.a & 4) != 0) {
                djgh djghVar = djhuVar.d;
                if (djghVar == null) {
                    djghVar = djgh.b;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                chhy chhyVar2 = (chhy) bZ.b;
                djghVar.getClass();
                chhyVar2.d = djghVar;
                chhyVar2.a |= 4;
            }
            chij bZ2 = chik.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chik chikVar = (chik) bZ2.b;
            chhy bK = bZ.bK();
            bK.getClass();
            chikVar.b = bK;
            chikVar.a = 1;
            chisVar.a(bZ2);
            int i2 = ((chit) chisVar.b).g;
            int i3 = djdmVar.a;
            if (i3 == 1) {
                i = ((djdh) djdmVar.b).b;
            } else if (i3 == 3) {
                i = ((djdl) djdmVar.b).c;
            } else {
                i = i3 == 4 ? ((djdj) djdmVar.b).c : 0;
            }
            int i4 = i2 + i;
            if (chisVar.c) {
                chisVar.bF();
                chisVar.c = false;
            }
            chit chitVar2 = (chit) chisVar.b;
            chitVar2.a |= 16;
            chitVar2.g = i4;
        }
        if ((djhuVar.a & 2) != 0) {
            chhz bZ3 = chig.f.bZ();
            djfl djflVar = djhuVar.c;
            if (djflVar == null) {
                djflVar = djfl.e;
            }
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            chig chigVar = (chig) bZ3.b;
            djflVar.getClass();
            chigVar.b = djflVar;
            chigVar.a |= 1;
            djfl djflVar2 = djhuVar.c;
            if (djflVar2 == null) {
                djflVar2 = djfl.e;
            }
            if ((djflVar2.a & 1) != 0) {
                chic bZ4 = chid.c.bZ();
                djfl djflVar3 = djhuVar.c;
                if (djflVar3 == null) {
                    djflVar3 = djfl.e;
                }
                djft djftVar = djflVar3.d;
                if (djftVar == null) {
                    djftVar = djft.c;
                }
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                chid chidVar = (chid) bZ4.b;
                djftVar.getClass();
                chidVar.b = djftVar;
                chidVar.a |= 1;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                chig chigVar2 = (chig) bZ3.b;
                chid bK2 = bZ4.bK();
                bK2.getClass();
                chigVar2.c = bK2;
                chigVar2.a |= 2;
            }
            chij bZ5 = chik.c.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            chik chikVar2 = (chik) bZ5.b;
            chig bK3 = bZ3.bK();
            bK3.getClass();
            chikVar2.b = bK3;
            chikVar2.a = 2;
            chisVar.a(bZ5);
        }
        boolean z = djhuVar.e;
        if (chisVar.c) {
            chisVar.bF();
            chisVar.c = false;
        }
        chit chitVar3 = (chit) chisVar.b;
        int i5 = chitVar3.a | 1;
        chitVar3.a = i5;
        chitVar3.c = z;
        if ((djglVar.a & 32) != 0) {
            String str = djglVar.e;
            str.getClass();
            chitVar3.a = i5 | 4;
            chitVar3.e = str;
        }
    }

    public static final dbsg<chit> b(djgl djglVar) {
        if (djglVar.b == 7) {
            chis bZ = chit.i.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chit chitVar = (chit) bZ.b;
            chitVar.h = 1;
            chitVar.a |= 32;
            a(bZ, djglVar);
            return dbsg.i(bZ.bK());
        }
        return dbpy.a;
    }
}

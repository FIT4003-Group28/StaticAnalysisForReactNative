package defpackage;
/* compiled from: PG */
/* renamed from: bjlk  reason: default package */
/* loaded from: classes3.dex */
public final class bjlk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static bjfo a(djam djamVar, ilo iloVar) {
        bjfn bZ = bjfo.k.bZ();
        bjfl bZ2 = bjfm.c.bZ();
        String str = djamVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bjfm bjfmVar = (bjfm) bZ2.b;
        str.getClass();
        bjfmVar.a |= 1;
        bjfmVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjfo bjfoVar = (bjfo) bZ.b;
        bjfm bK = bZ2.bK();
        bK.getClass();
        bjfoVar.b = bK;
        bjfoVar.a |= 1;
        String str2 = djamVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjfo bjfoVar2 = (bjfo) bZ.b;
        str2.getClass();
        bjfoVar2.a |= 4;
        bjfoVar2.d = str2;
        djag djagVar = djamVar.c;
        if (djagVar == null) {
            djagVar = djag.d;
        }
        bjfq b = b(djagVar, iloVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjfo bjfoVar3 = (bjfo) bZ.b;
        b.getClass();
        bjfoVar3.c = b;
        int i = bjfoVar3.a | 2;
        bjfoVar3.a = i;
        int i2 = djamVar.e;
        bjfoVar3.a = i | 8;
        bjfoVar3.e = i2;
        dqjh b2 = dqjh.b(djamVar.f);
        if (b2 == null) {
            b2 = dqjh.UNKNOWN_VOTE_TYPE;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjfo bjfoVar4 = (bjfo) bZ.b;
        bjfoVar4.f = b2.e;
        int i3 = bjfoVar4.a | 16;
        bjfoVar4.a = i3;
        String str3 = djamVar.h;
        str3.getClass();
        int i4 = i3 | 64;
        bjfoVar4.a = i4;
        bjfoVar4.h = str3;
        String str4 = djamVar.k;
        str4.getClass();
        int i5 = i4 | 32;
        bjfoVar4.a = i5;
        bjfoVar4.g = str4;
        String str5 = djamVar.i;
        str5.getClass();
        bjfoVar4.a = i5 | 128;
        bjfoVar4.i = str5;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bjfq b(djag djagVar, ilo iloVar) {
        bjfp bZ = bjfq.g.bZ();
        dhze dhzeVar = djagVar.a;
        if (dhzeVar == null) {
            dhzeVar = dhze.m;
        }
        String str = dhzeVar.f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjfq bjfqVar = (bjfq) bZ.b;
        str.getClass();
        bjfqVar.a |= 1;
        bjfqVar.b = str;
        dhze dhzeVar2 = djagVar.a;
        if (dhzeVar2 == null) {
            dhzeVar2 = dhze.m;
        }
        String str2 = dhzeVar2.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjfq bjfqVar2 = (bjfq) bZ.b;
        str2.getClass();
        bjfqVar2.a |= 8;
        bjfqVar2.e = str2;
        dhze dhzeVar3 = djagVar.a;
        if (dhzeVar3 == null) {
            dhzeVar3 = dhze.m;
        }
        String str3 = dhzeVar3.i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bjfq bjfqVar3 = (bjfq) bZ.b;
        str3.getClass();
        int i = bjfqVar3.a | 16;
        bjfqVar3.a = i;
        bjfqVar3.f = str3;
        boolean z = djagVar.b;
        int i2 = i | 2;
        bjfqVar3.a = i2;
        bjfqVar3.c = z;
        boolean z2 = djagVar.c;
        bjfqVar3.a = i2 | 4;
        bjfqVar3.d = z2;
        bjfq bK = bZ.bK();
        if (bK.d) {
            dsqp dsqpVar = (dsqp) bK.cu(5);
            dsqpVar.bC(bK);
            bjfp bjfpVar = (bjfp) dsqpVar;
            String n = iloVar.n();
            if (bjfpVar.c) {
                bjfpVar.bF();
                bjfpVar.c = false;
            }
            bjfq bjfqVar4 = (bjfq) bjfpVar.b;
            n.getClass();
            bjfqVar4.a |= 1;
            bjfqVar4.b = n;
            String cP = iloVar.cP();
            if (bjfpVar.c) {
                bjfpVar.bF();
                bjfpVar.c = false;
            }
            bjfq bjfqVar5 = (bjfq) bjfpVar.b;
            cP.getClass();
            int i3 = bjfqVar5.a | 8;
            bjfqVar5.a = i3;
            bjfqVar5.e = cP;
            bjfqVar5.a = i3 & (-17);
            bjfqVar5.f = bjfq.g.f;
            return bjfpVar.bK();
        }
        return bK;
    }
}

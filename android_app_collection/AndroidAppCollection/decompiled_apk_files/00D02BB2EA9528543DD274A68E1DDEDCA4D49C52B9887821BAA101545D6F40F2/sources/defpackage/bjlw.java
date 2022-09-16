package defpackage;
/* compiled from: PG */
/* renamed from: bjlw  reason: default package */
/* loaded from: classes3.dex */
final class bjlw implements degu<btzx<djbb, djbf>> {
    final /* synthetic */ bjmi a;

    public bjlw(bjmi bjmiVar) {
        this.a = bjmiVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.q = dbpy.a;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(btzx<djbb, djbf> btzxVar) {
        btzx<djbb, djbf> btzxVar2 = btzxVar;
        this.a.q = dbpy.a;
        int a = djbe.a(btzxVar2.b().b);
        if (a != 0 && a == 2) {
            djai djaiVar = btzxVar2.b().a;
            if (djaiVar == null) {
                djaiVar = djai.g;
            }
            if (djaiVar.b.size() == 0 || (djaiVar.b.get(0).a & 1) == 0) {
                this.a.f();
                return;
            }
            bjmi bjmiVar = this.a;
            djao djaoVar = djaiVar.b.get(0);
            final ilo iloVar = this.a.p;
            bjfr bZ = bjfs.e.bZ();
            djam djamVar = djaoVar.b;
            if (djamVar == null) {
                djamVar = djam.m;
            }
            bjfv bZ2 = bjfw.l.bZ();
            bjft bZ3 = bjfu.c.bZ();
            String str = djamVar.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bjfu bjfuVar = (bjfu) bZ3.b;
            str.getClass();
            bjfuVar.a |= 1;
            bjfuVar.b = str;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bjfw bjfwVar = (bjfw) bZ2.b;
            bjfu bK = bZ3.bK();
            bK.getClass();
            bjfwVar.b = bK;
            bjfwVar.a |= 1;
            String str2 = djamVar.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bjfw bjfwVar2 = (bjfw) bZ2.b;
            str2.getClass();
            bjfwVar2.a |= 4;
            bjfwVar2.d = str2;
            djag djagVar = djamVar.c;
            if (djagVar == null) {
                djagVar = djag.d;
            }
            bjfq b = bjlk.b(djagVar, iloVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bjfw bjfwVar3 = (bjfw) bZ2.b;
            b.getClass();
            bjfwVar3.c = b;
            int i = bjfwVar3.a | 2;
            bjfwVar3.a = i;
            int i2 = djamVar.e;
            bjfwVar3.a = i | 8;
            bjfwVar3.e = i2;
            dqjh b2 = dqjh.b(djamVar.f);
            if (b2 == null) {
                b2 = dqjh.UNKNOWN_VOTE_TYPE;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            bjfw bjfwVar4 = (bjfw) bZ2.b;
            bjfwVar4.f = b2.e;
            int i3 = bjfwVar4.a | 16;
            bjfwVar4.a = i3;
            String str3 = djamVar.h;
            str3.getClass();
            int i4 = i3 | 64;
            bjfwVar4.a = i4;
            bjfwVar4.h = str3;
            String str4 = djamVar.k;
            str4.getClass();
            int i5 = i4 | 32;
            bjfwVar4.a = i5;
            bjfwVar4.g = str4;
            String str5 = djamVar.i;
            str5.getClass();
            int i6 = i5 | 256;
            bjfwVar4.a = i6;
            bjfwVar4.j = str5;
            boolean z = djamVar.l;
            bjfwVar4.a = i6 | 512;
            bjfwVar4.k = z;
            bjfw bK2 = bZ2.bK();
            dsqp dsqpVar = (dsqp) bK2.cu(5);
            dsqpVar.bC(bK2);
            bjfv bjfvVar = (bjfv) dsqpVar;
            boolean z2 = (djaoVar.a & 8) != 0;
            if (bjfvVar.c) {
                bjfvVar.bF();
                bjfvVar.c = false;
            }
            bjfw bjfwVar5 = (bjfw) bjfvVar.b;
            bjfwVar5.a |= 128;
            bjfwVar5.i = z2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bjfs bjfsVar = (bjfs) bZ.b;
            bjfw bK3 = bjfvVar.bK();
            bK3.getClass();
            bjfsVar.b = bK3;
            bjfsVar.a = 1 | bjfsVar.a;
            if ((djaoVar.a & 8) != 0) {
                djam djamVar2 = djaoVar.f;
                if (djamVar2 == null) {
                    djamVar2 = djam.m;
                }
                bZ.b(bjlk.a(djamVar2, iloVar));
            }
            if ((djaoVar.a & 16) != 0) {
                djam djamVar3 = djaoVar.g;
                if (djamVar3 == null) {
                    djamVar3 = djam.m;
                }
                bZ.b(bjlk.a(djamVar3, iloVar));
            }
            bZ.a(dcbg.b(djaoVar.c).s(new dbrn(iloVar) { // from class: bjlj
                private final ilo a;

                {
                    this.a = iloVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return bjlk.a((djam) obj, this.a);
                }
            }));
            if ((djaoVar.a & 4) != 0) {
                String str6 = djaoVar.e;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bjfs bjfsVar2 = (bjfs) bZ.b;
                str6.getClass();
                bjfsVar2.a = 2 | bjfsVar2.a;
                bjfsVar2.d = str6;
            }
            bjmiVar.o = bZ.bK();
            this.a.n();
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: azif  reason: default package */
/* loaded from: classes3.dex */
public final class azif {
    private final azof a;
    private final ckcw b;

    public azif(azof azofVar, ckcw ckcwVar) {
        this.a = azofVar;
        this.b = ckcwVar;
    }

    public final dohn a() {
        dogy bZ = dohn.g.bZ();
        doks doksVar = doks.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dohn dohnVar = (dohn) bZ.b;
        doksVar.getClass();
        dohnVar.c = doksVar;
        dohnVar.b = 9;
        try {
            azoh l = this.a.l(azxm.g);
            if (!dbsj.d(l.a())) {
                String a = l.a();
                dbsk.s(a);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dohn dohnVar2 = (dohn) bZ.b;
                a.getClass();
                dohnVar2.a |= 1;
                dohnVar2.d = a;
            }
        } catch (axxc unused) {
        }
        try {
            dcdc s = azof.s(azxm.g);
            int size = s.size();
            for (int i = 0; i < size; i++) {
                azkt azktVar = (azkt) s.get(i);
                azwc azwcVar = (azwc) azktVar.a;
                int ordinal = azktVar.b.ordinal();
                int i2 = 3;
                if (ordinal == 1 || ordinal == 2) {
                    i2 = 2;
                } else if (ordinal != 3) {
                    i2 = 1;
                }
                ckco ckcoVar = (ckco) this.b.a(ckeo.f);
                int i3 = -1;
                int i4 = i2 - 1;
                if (i4 == 1) {
                    i3 = ckek.a(1);
                } else if (i4 == 2) {
                    i3 = ckek.a(2);
                }
                ckcoVar.a(i3);
                dojc bZ2 = dojt.f.bZ();
                long j = azwcVar.k;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dojt dojtVar = (dojt) bZ2.b;
                dojtVar.a |= 1;
                dojtVar.d = j;
                long q = azwcVar.q();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dojt dojtVar2 = (dojt) bZ2.b;
                dojtVar2.a |= 131072;
                dojtVar2.e = q;
                doko bZ3 = dokq.d.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dokq dokqVar = (dokq) bZ3.b;
                dokqVar.b = i4;
                dokqVar.a |= 1;
                dokh j2 = azwcVar.j();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dokq dokqVar2 = (dokq) bZ3.b;
                j2.getClass();
                dokqVar2.c = j2;
                dokqVar2.a |= 2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dojt dojtVar3 = (dojt) bZ2.b;
                dokq bK = bZ3.bK();
                bK.getClass();
                dojtVar3.c = bK;
                dojtVar3.b = 10;
                bZ.a(bZ2);
            }
        } catch (axxc unused2) {
        }
        return bZ.bK();
    }
}

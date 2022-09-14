package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: zry  reason: default package */
/* loaded from: classes7.dex */
public class zry implements zdn {
    public cqtd a;
    @dzsi
    public final zrx b;
    private final boolean c;
    private final vtk d;

    private zry(vtn vtnVar, dovn dovnVar, @dzsi zrx zrxVar, boolean z) {
        zrw zrwVar = new zrw(this);
        this.d = zrwVar;
        this.b = zrxVar;
        this.c = z;
        String str = dovnVar.c;
        String str2 = null;
        if ((dovnVar.a & 1) != 0) {
            douj doujVar = dovnVar.b;
            dbsi<String, String> n = alca.n(doujVar == null ? douj.h : doujVar);
            String str3 = n.a;
            if (str3 != null) {
                str = str3;
                str2 = n.b;
            }
        }
        cqtd a = yzw.a(str, str2, vtnVar, zrwVar);
        this.a = a == null ? cqtt.c() : a;
    }

    public static dovn b(dowz dowzVar) {
        dovk bZ = dovn.e.bZ();
        if ((dowzVar.a & 4) != 0) {
            douj doujVar = dowzVar.d;
            if (doujVar == null) {
                doujVar = douj.h;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dovn dovnVar = (dovn) bZ.b;
            doujVar.getClass();
            dovnVar.b = doujVar;
            dovnVar.a |= 1;
        }
        if ((dowzVar.a & 1) != 0) {
            String str = dowzVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dovn dovnVar2 = (dovn) bZ.b;
            str.getClass();
            dovnVar2.a |= 2;
            dovnVar2.c = str;
        }
        if ((dowzVar.a & 2) != 0) {
            int a = dowy.a(dowzVar.c);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dovn dovnVar3 = (dovn) bZ.b;
                dovnVar3.d = 1;
                dovnVar3.a |= 4;
            } else if (i != 2) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dovn dovnVar4 = (dovn) bZ.b;
                dovnVar4.d = 0;
                dovnVar4.a |= 4;
            } else {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dovn dovnVar5 = (dovn) bZ.b;
                dovnVar5.d = 2;
                dovnVar5.a |= 4;
            }
        }
        return bZ.bK();
    }

    public static dcdc<zdn> c(vtn vtnVar, List<dovn> list, @dzsi zrx zrxVar) {
        return d(vtnVar, list, zrxVar, false);
    }

    public static dcdc<zdn> d(vtn vtnVar, List<dovn> list, @dzsi zrx zrxVar, boolean z) {
        dccx dccxVar = new dccx();
        for (dovn dovnVar : list) {
            dccxVar.g(new zry(vtnVar, dovnVar, zrxVar, z));
        }
        return dccxVar.f();
    }

    @Override // defpackage.zdn
    public cqtd a() {
        return this.c ? cqrt.i(this.a, ibm.j()) : this.a;
    }
}

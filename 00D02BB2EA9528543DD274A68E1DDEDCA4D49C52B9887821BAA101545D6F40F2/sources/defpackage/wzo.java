package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: wzo  reason: default package */
/* loaded from: classes7.dex */
public class wzo implements wyp {
    private final djws a;
    private dcdc<wzl> b;

    public wzo(wzm wzmVar, drhn drhnVar, djws djwsVar) {
        djwr djwrVar;
        djwr djwrVar2;
        drhw drhwVar;
        drhw drhwVar2;
        this.a = djwsVar;
        this.b = dcdc.e();
        drhu drhuVar = null;
        if (drhnVar != null) {
            drhx drhxVar = drhnVar.e;
            drhxVar = drhxVar == null ? drhx.c : drhxVar;
            if (drhxVar.a == 1) {
                drhwVar = (drhw) drhxVar.b;
            } else {
                drhwVar = drhw.b;
            }
            if (!drhwVar.a.isEmpty()) {
                drhx drhxVar2 = drhnVar.e;
                drhxVar2 = drhxVar2 == null ? drhx.c : drhxVar2;
                if (drhxVar2.a == 1) {
                    drhwVar2 = (drhw) drhxVar2.b;
                } else {
                    drhwVar2 = drhw.b;
                }
                drhuVar = drhwVar2.a.get(0);
            }
        }
        int i = 5;
        if (djwsVar.a == 5) {
            djwrVar = (djwr) djwsVar.b;
        } else {
            djwrVar = djwr.b;
        }
        wzk d = d(djwrVar.a);
        dccx F = dcdc.F();
        if (djwsVar.a == 5) {
            djwrVar2 = (djwr) djwsVar.b;
        } else {
            djwrVar2 = djwr.b;
        }
        for (djwq djwqVar : djwrVar2.a) {
            wzn wznVar = new wzn(this);
            cqhn a = wzmVar.a.a();
            wzm.a(a, 1);
            vtn a2 = wzmVar.b.a();
            wzm.a(a2, 2);
            gce a3 = wzmVar.c.a();
            wzm.a(a3, 3);
            wzm.a(wznVar, 4);
            wzm.a(djwqVar, i);
            wzm.a(d, 6);
            wzl wzlVar = new wzl(a, a2, a3, wznVar, djwqVar, d);
            if (drhuVar != null && drhuVar.b.equals(djwqVar.a)) {
                wzlVar.g(true);
            }
            F.g(wzlVar);
            i = 5;
        }
        this.b = F.f();
    }

    public static wzk d(List<djwq> list) {
        for (djwq djwqVar : list) {
            drhh drhhVar = djwqVar.b;
            if (drhhVar == null) {
                drhhVar = drhh.k;
            }
            if ((drhhVar.a & 16) != 0) {
                drhh drhhVar2 = djwqVar.b;
                if (drhhVar2 == null) {
                    drhhVar2 = drhh.k;
                }
                if ((drhhVar2.a & 256) == 0) {
                }
            }
            return wzk.HIDE_ICON;
        }
        return wzk.SHOW_ICON;
    }

    @Override // defpackage.wyp
    public String a() {
        return this.a.f;
    }

    @Override // defpackage.wyp
    public List<wyo> b() {
        return dcdc.r(this.b);
    }

    @Override // defpackage.wyp
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtyc.et;
        ddes bZ = ddet.D.bZ();
        ddgs bZ2 = ddgt.c.bZ();
        drhj drhjVar = this.a.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        String str = drhjVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddgt ddgtVar = (ddgt) bZ2.b;
        str.getClass();
        ddgtVar.a |= 1;
        ddgtVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddgt bK = bZ2.bK();
        bK.getClass();
        ddetVar.z = bK;
        ddetVar.b |= 2;
        b.s(bZ.bK());
        return b.a();
    }

    public void e(djwq djwqVar) {
        if (djwqVar == null) {
            dcdc<wzl> dcdcVar = this.b;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                dcdcVar.get(i).g(false);
            }
            return;
        }
        dcdc<wzl> dcdcVar2 = this.b;
        int size2 = dcdcVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            wzl wzlVar = dcdcVar2.get(i2);
            wzlVar.g(wzlVar.h().equals(djwqVar.a));
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wzo)) {
            return false;
        }
        wzo wzoVar = (wzo) obj;
        return dbsd.a(this.a, wzoVar.a) && dchl.m(this.b, wzoVar.b);
    }

    @Override // defpackage.wys
    public wvy f() {
        wvx c = wvy.c();
        drhj drhjVar = this.a.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        wvm wvmVar = (wvm) c;
        wvmVar.a = drhjVar;
        drho bZ = drhx.c.bZ();
        dcdc<wzl> dcdcVar = this.b;
        int size = dcdcVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            wzl wzlVar = dcdcVar.get(i);
            i++;
            if (wzlVar.f().booleanValue()) {
                drht bZ2 = drhu.d.bZ();
                String h = wzlVar.h();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drhu drhuVar = (drhu) bZ2.b;
                h.getClass();
                drhuVar.a |= 1;
                drhuVar.b = h;
                drhv bZ3 = drhw.b.bZ();
                bZ3.a(bZ2);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drhx drhxVar = (drhx) bZ.b;
                drhw bK = bZ3.bK();
                bK.getClass();
                drhxVar.b = bK;
                drhxVar.a = 1;
            }
        }
        drhm bZ4 = drhn.g.bZ();
        drhj drhjVar2 = this.a.c;
        if (drhjVar2 == null) {
            drhjVar2 = drhj.c;
        }
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drhn drhnVar = (drhn) bZ4.b;
        drhjVar2.getClass();
        drhnVar.b = drhjVar2;
        drhnVar.a |= 1;
        drhx bK2 = bZ.bK();
        bK2.getClass();
        drhnVar.e = bK2;
        drhnVar.a |= 8;
        wvmVar.b = bZ4.bK();
        return c.a();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

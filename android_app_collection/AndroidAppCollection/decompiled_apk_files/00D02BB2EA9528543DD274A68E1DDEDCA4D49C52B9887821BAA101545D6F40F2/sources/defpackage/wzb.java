package defpackage;

import android.app.Activity;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: wzb  reason: default package */
/* loaded from: classes7.dex */
public class wzb implements wyl {
    private final djws a;
    private dcdc<wyz> b;

    public wzb(wza wzaVar, drhn drhnVar, djws djwsVar) {
        djwr djwrVar;
        drhw drhwVar;
        this.a = djwsVar;
        this.b = dcdc.e();
        HashMap hashMap = new HashMap();
        if (drhnVar != null) {
            drhx drhxVar = drhnVar.e;
            drhxVar = drhxVar == null ? drhx.c : drhxVar;
            if (drhxVar.a == 1) {
                drhwVar = (drhw) drhxVar.b;
            } else {
                drhwVar = drhw.b;
            }
            for (drhu drhuVar : drhwVar.a) {
                hashMap.put(drhuVar.b, Boolean.valueOf(drhuVar.c));
            }
        }
        dccx F = dcdc.F();
        if (djwsVar.a == 5) {
            djwrVar = (djwr) djwsVar.b;
        } else {
            djwrVar = djwr.b;
        }
        for (djwq djwqVar : djwrVar.a) {
            cqhn a = wzaVar.a.a();
            wza.a(a, 1);
            Activity activity = (Activity) ((dxjd) wzaVar.b).a;
            wza.a(activity, 2);
            wza.a(djwqVar, 3);
            wyz wyzVar = new wyz(a, activity, djwqVar);
            Boolean bool = (Boolean) hashMap.get(djwqVar.a);
            if (bool != null) {
                wyzVar.g(bool.booleanValue() ? drhg.NEUTRAL : drhg.NEGATIVE);
            }
            F.g(wyzVar);
        }
        this.b = F.f();
    }

    @Override // defpackage.wyl
    public String a() {
        return this.a.f;
    }

    @Override // defpackage.wyl
    public List<wyk> b() {
        return dcdc.r(this.b);
    }

    @Override // defpackage.wyl
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

    @Override // defpackage.wys
    public wvy f() {
        wvx c = wvy.c();
        drhj drhjVar = this.a.c;
        if (drhjVar == null) {
            drhjVar = drhj.c;
        }
        wvm wvmVar = (wvm) c;
        wvmVar.a = drhjVar;
        drhv bZ = drhw.b.bZ();
        dcdc<wyz> dcdcVar = this.b;
        int size = dcdcVar.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            wyz wyzVar = dcdcVar.get(i);
            if (wyzVar.c() == drhg.NEUTRAL) {
                drht bZ2 = drhu.d.bZ();
                String str = wyzVar.h().a;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                drhu drhuVar = (drhu) bZ2.b;
                str.getClass();
                int i2 = drhuVar.a | 1;
                drhuVar.a = i2;
                drhuVar.b = str;
                drhuVar.a = i2 | 2;
                drhuVar.c = true;
                bZ.a(bZ2);
            } else if (wyzVar.c() == drhg.NEGATIVE) {
                drht bZ3 = drhu.d.bZ();
                String str2 = wyzVar.h().a;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                drhu drhuVar2 = (drhu) bZ3.b;
                str2.getClass();
                int i3 = drhuVar2.a | 1;
                drhuVar2.a = i3;
                drhuVar2.b = str2;
                drhuVar2.a = i3 | 2;
                drhuVar2.c = false;
                bZ.a(bZ3);
            }
            z = true;
        }
        drho bZ4 = drhx.c.bZ();
        if (z) {
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drhx drhxVar = (drhx) bZ4.b;
            drhw bK = bZ.bK();
            bK.getClass();
            drhxVar.b = bK;
            drhxVar.a = 1;
        }
        drhm bZ5 = drhn.g.bZ();
        drhj drhjVar2 = this.a.c;
        if (drhjVar2 == null) {
            drhjVar2 = drhj.c;
        }
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drhn drhnVar = (drhn) bZ5.b;
        drhjVar2.getClass();
        drhnVar.b = drhjVar2;
        drhnVar.a |= 1;
        drhx bK2 = bZ4.bK();
        bK2.getClass();
        drhnVar.e = bK2;
        drhnVar.a |= 8;
        wvmVar.b = bZ5.bK();
        return c.a();
    }
}

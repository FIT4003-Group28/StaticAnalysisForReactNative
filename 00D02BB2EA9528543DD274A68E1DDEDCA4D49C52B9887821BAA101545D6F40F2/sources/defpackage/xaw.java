package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: xaw  reason: default package */
/* loaded from: classes7.dex */
public class xaw implements xas {
    private final Context a;
    private final dcdc<xar> b;
    private final boolean c;

    public xaw(Application application, xav xavVar, wvi wviVar, wvp wvpVar, wvj wvjVar, wvw wvwVar) {
        djpk bK;
        this.a = application;
        digv digvVar = wviVar.a;
        List<djws> e = digvVar != null ? digvVar.a : dcdc.e();
        dccx F = dcdc.F();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        for (djws djwsVar : e) {
            drhj drhjVar = djwsVar.c;
            if (drhjVar == null) {
                drhjVar = drhj.c;
            }
            hashMap.put(drhjVar.b, djwsVar);
        }
        String j = wvwVar.j();
        if (j == null) {
            djpj bZ = djpk.e.bZ();
            String e2 = wvwVar.e();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpk djpkVar = (djpk) bZ.b;
            e2.getClass();
            djpkVar.a |= 1;
            djpkVar.b = e2;
            long h = wvwVar.h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpk djpkVar2 = (djpk) bZ.b;
            djpkVar2.a |= 2;
            djpkVar2.c = h;
            bK = bZ.bK();
        } else {
            djpj bZ2 = djpk.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djpk djpkVar3 = (djpk) bZ2.b;
            j.getClass();
            djpkVar3.a |= 8;
            djpkVar3.d = j;
            bK = bZ2.bK();
        }
        HashMap<drhj, drhn> a = wvpVar.a(bK);
        this.c = wvjVar.a();
        if (a != null) {
            for (drhn drhnVar : a.values()) {
                drhj drhjVar2 = drhnVar.b;
                djws djwsVar2 = (djws) hashMap.get((drhjVar2 == null ? drhj.c : drhjVar2).b);
                if (djwsVar2 == null) {
                    drhj drhjVar3 = drhnVar.b;
                    String str = (drhjVar3 == null ? drhj.c : drhjVar3).b;
                } else if ((drhnVar.a & 8) != 0 || this.c) {
                    F.g(xavVar.a(wvwVar, djwsVar2, drhnVar, true));
                    drhj drhjVar4 = drhnVar.b;
                    hashSet.add((drhjVar4 == null ? drhj.c : drhjVar4).b);
                }
            }
        }
        for (drhn drhnVar2 : wvwVar.a().d) {
            drhj drhjVar5 = drhnVar2.b;
            djws djwsVar3 = (djws) hashMap.get((drhjVar5 == null ? drhj.c : drhjVar5).b);
            if (djwsVar3 == null) {
                drhj drhjVar6 = drhnVar2.b;
                String str2 = (drhjVar6 == null ? drhj.c : drhjVar6).b;
            } else {
                drhj drhjVar7 = djwsVar3.c;
                if (!hashSet.contains((drhjVar7 == null ? drhj.c : drhjVar7).b) && ((drhnVar2.a & 8) != 0 || this.c)) {
                    F.g(xavVar.a(wvwVar, djwsVar3, drhnVar2, false));
                    drhj drhjVar8 = drhnVar2.b;
                    hashSet.add((drhjVar8 == null ? drhj.c : drhjVar8).b);
                }
            }
        }
        if (this.c && !hashSet.isEmpty()) {
            Application a2 = xavVar.a.a();
            xav.b(a2, 1);
            qbt a3 = xavVar.b.a();
            xav.b(a3, 2);
            wvj a4 = xavVar.c.a();
            xav.b(a4, 3);
            btvo a5 = xavVar.d.a();
            xav.b(a5, 4);
            xav.b(wvwVar, 5);
            F.g(new xau(a2, a3, a4, a5, wvwVar));
        }
        this.b = F.f();
    }

    @Override // defpackage.xas
    public List<xar> a() {
        return this.b;
    }

    @Override // defpackage.xas
    @dzsi
    public String b() {
        if (!this.c || this.b.isEmpty()) {
            return null;
        }
        return this.a.getString(R.string.TRANSIT_REALTIME_CALL_TO_ACTION);
    }
}

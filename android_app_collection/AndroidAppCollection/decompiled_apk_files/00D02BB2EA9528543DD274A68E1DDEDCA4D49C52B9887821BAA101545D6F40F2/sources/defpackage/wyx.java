package defpackage;

import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: wyx  reason: default package */
/* loaded from: classes7.dex */
public class wyx implements wyj {
    private final gga a;
    private final dcdc<wyi> b;
    private final dcdc<wyi> c;

    public wyx(gga ggaVar, wyw wywVar, wvi wviVar, wvp wvpVar, wyu wyuVar, wvw wvwVar) {
        djpk bK;
        this.a = ggaVar;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        HashSet hashSet = new HashSet();
        String j = wvwVar.j();
        if (j == null) {
            djpj bZ = djpk.e.bZ();
            String e = wvwVar.e();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djpk djpkVar = (djpk) bZ.b;
            e.getClass();
            djpkVar.a |= 1;
            djpkVar.b = e;
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
        if (a != null) {
            for (drhn drhnVar : a.values()) {
                drhj drhjVar = drhnVar.b;
                wyv a2 = wywVar.a(wyuVar, wviVar.a(drhjVar == null ? drhj.c : drhjVar), drhnVar);
                if ((drhnVar.a & 8) == 0) {
                    F2.g(a2);
                } else {
                    F.g(a2);
                }
                drhj drhjVar2 = drhnVar.b;
                if (drhjVar2 == null) {
                    drhjVar2 = drhj.c;
                }
                hashSet.add(drhjVar2);
            }
        }
        for (drhn drhnVar2 : wvwVar.a().d) {
            drhj drhjVar3 = drhnVar2.b;
            djws a3 = wviVar.a(drhjVar3 == null ? drhj.c : drhjVar3);
            drhj drhjVar4 = a3.c;
            if (!hashSet.contains(drhjVar4 == null ? drhj.c : drhjVar4)) {
                wyv a4 = wywVar.a(wyuVar, a3, drhnVar2);
                if ((drhnVar2.a & 8) == 0) {
                    F2.g(a4);
                } else {
                    F.g(a4);
                }
                drhj drhjVar5 = drhnVar2.b;
                hashSet.add(drhjVar5 == null ? drhj.c : drhjVar5);
            }
        }
        this.b = F.f();
        this.c = F2.f();
    }

    @Override // defpackage.wyj
    public String a() {
        return this.a.getString(R.string.TRANSIT_TRIP_ATTRIBUTES_BANNER_LINK_TEXT);
    }

    @Override // defpackage.wyj
    public List<wyi> b() {
        return this.b;
    }

    @Override // defpackage.wyj
    public List<wyi> c() {
        return this.c;
    }

    @Override // defpackage.wyj
    public cqkl d() {
        this.a.D(wvt.w());
        return cqkl.a;
    }

    @Override // defpackage.wyj
    public cjtd e() {
        return cjtd.a(dtyc.es);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wyx)) {
            return false;
        }
        wyx wyxVar = (wyx) obj;
        return dchl.m(this.b, wyxVar.b) && dchl.m(this.c, wyxVar.c);
    }

    @Override // defpackage.wyj
    public cjtd f() {
        return cjtd.a(dtyc.er);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }
}

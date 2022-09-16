package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mxc  reason: default package */
/* loaded from: classes3.dex */
public final class mxc implements nch {
    public final mxb a;
    public mxt b;
    public apzg c;
    public List d;
    public List e;
    public List f;
    private final enm g;
    private String h;

    public mxc(enm enmVar, mxb mxbVar) {
        this.g = enmVar;
        this.a = mxbVar;
    }

    public final mxm a() {
        return (mxm) this.g.b(this.h, mxm.class, "PSP15CState", mwv.c);
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ ncf b(Object obj) {
        ncf ncfVar = new ncf();
        auhz auhzVar = auhz.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        int ordinal = ((auhz) obj).ordinal();
        if (ordinal == 1) {
            ncfVar.c = new mxa(this, 1);
            ncfVar.a = true;
            ncfVar.b = true;
        } else if (ordinal == 2) {
            ncfVar.c = new mxa(this);
            ncfVar.a = true;
        } else if (ordinal == 3) {
            ncfVar.c = new mxa(this, 2);
            ncfVar.a = true;
        }
        return ncfVar;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Integer c(Object obj) {
        auie auieVar = (auie) obj;
        if (auieVar == null || (auieVar.b & 2) == 0) {
            return null;
        }
        return Integer.valueOf(auieVar.d);
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        auie auieVar = (auie) obj;
        auhz auhzVar = auhz.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        if (auieVar != null) {
            if (l()) {
                if ((auieVar.b & 8) == 0) {
                    return auhzVar;
                }
                auhz b = auhz.b(auieVar.f);
                if (b != null) {
                    return b;
                }
            } else if ((auieVar.b & 4) == 0) {
                return auhzVar;
            } else {
                auhz b2 = auhz.b(auieVar.e);
                if (b2 != null) {
                    return b2;
                }
            }
            return auhz.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        return auhzVar;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object e() {
        return auhz.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object f() {
        return auhz.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_OPEN_AD;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object g() {
        return auhz.PROMOTED_SPARKLES15_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ void h(Map map, Object[] objArr) {
        auie[] auieVarArr;
        for (auie auieVar : (auie[]) objArr) {
            auib b = auib.b(auieVar.c);
            if (b == null) {
                b = auib.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(b, auieVar);
        }
    }

    @Override // defpackage.nch
    public final void i() {
        this.b.q(this.c);
    }

    @Override // defpackage.nch
    public final void j(mxt mxtVar) {
        this.b = mxtVar;
    }

    public final void k(String str, apzg apzgVar, List list, List list2, List list3) {
        this.h = str;
        this.c = apzgVar;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    public final boolean l() {
        return a().a;
    }
}

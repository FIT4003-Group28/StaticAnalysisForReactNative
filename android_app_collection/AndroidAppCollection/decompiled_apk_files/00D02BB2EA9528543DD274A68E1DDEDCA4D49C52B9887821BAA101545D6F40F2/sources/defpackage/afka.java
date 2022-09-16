package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: afka  reason: default package */
/* loaded from: classes2.dex */
public final class afka {
    public static final dcep<duqi> a;
    public static final dcep<duqi> b;
    public static final dcep<duqi> c;
    public final akox d;
    public final dxio<ahjq> e;
    public final bvjj f;
    public final dxio<vxa> g;
    public final dxio<qbt> h;
    private final bvsf i;
    private final cjqy j;

    static {
        dcep.D(dqvj.DRIVE, dqvj.BICYCLE, dqvj.WALK);
        a = dcep.E(duqi.DIRECTIONS_DEFAULT, duqi.DIRECTIONS_TRIP_DETAILS, duqi.DIRECTIONS_TWO_WHEELER, duqi.DIRECTIONS_TRANSIT_NAVIGATION);
        b = dcep.C(duqi.DIRECTIONS_NAVIGATION, duqi.DIRECTIONS_NAVIGATION_NAVGO);
        c = dcep.B(duqi.DIRECTIONS_COMMUTE_IMMERSIVE);
    }

    public afka(akox akoxVar, bvsf bvsfVar, dxio<ahjq> dxioVar, bvjj bvjjVar, dxio<vxa> dxioVar2, dxio<qbt> dxioVar3, cjqy cjqyVar) {
        this.d = akoxVar;
        this.i = bvsfVar;
        this.e = dxioVar;
        this.f = bvjjVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
        this.j = cjqyVar;
    }

    public static duqg a(dqvj dqvjVar, dwao dwaoVar, Set<duqi> set) {
        duqf bZ = duqg.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duqg duqgVar = (duqg) bZ.b;
        duqgVar.b = dqvjVar.k;
        int i = duqgVar.a | 1;
        duqgVar.a = i;
        dwaoVar.getClass();
        duqgVar.c = dwaoVar;
        duqgVar.a = i | 2;
        duqg duqgVar2 = (duqg) bZ.b;
        dsrf dsrfVar = duqgVar2.d;
        if (!dsrfVar.a()) {
            duqgVar2.d = dsqw.cg(dsrfVar);
        }
        dcpd it = ((dcne) set).iterator();
        while (it.hasNext()) {
            duqgVar2.d.h(((duqi) it.next()).M);
        }
        return bZ.bK();
    }

    public final dnqh b() {
        dnqg bZ = dnqh.p.bZ();
        cjqg.b(this.j);
        int i = ddda.c.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        return bZ.bK();
    }

    public final dwaw c(vun vunVar) {
        return vnw.a(vunVar, null, albv.a(), this.i.a(), null);
    }
}

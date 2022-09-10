package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
/* compiled from: PG */
/* renamed from: anpx  reason: default package */
/* loaded from: classes2.dex */
public final class anpx {
    public static aogh a(aoge aogeVar, anqx anqxVar) {
        aogh i = aogm.i();
        i.g(true);
        ((aofq) i).d = anqxVar.a(aogeVar.e(), dbpy.a, aogeVar.d);
        i.f(aogeVar.f());
        return i;
    }

    public static Spannable b(Context context, anrp anrpVar, anro anroVar) {
        int b = anroVar.b().b(context);
        int b2 = anroVar.c().b(context);
        bvsw bvswVar = new bvsw();
        bvswVar.e(b);
        bvswVar.c();
        bvsw bvswVar2 = new bvsw();
        bvswVar2.e(b2);
        Resources resources = context.getResources();
        bvsx bvsxVar = new bvsx(resources);
        dccx F = dcdc.F();
        dcdc<Object> dcdcVar = anrpVar.b;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            bvsv a = bvsxVar.a(dcdcVar.get(i));
            a.e(bvswVar);
            F.g(a.c());
        }
        bvsu b3 = bvsxVar.b(resources.getString(anrpVar.a));
        b3.b(bvswVar2);
        b3.a(F.f().toArray());
        return b3.c();
    }

    public static boolean c(aogb aogbVar, cqat cqatVar) {
        eapg j = aogc.j(cqatVar);
        return aogbVar.k(j) || aogbVar.k(j.q(1));
    }

    public static dbsg<String> d(dvyw dvywVar) {
        if (dvywVar.g.isEmpty()) {
            dndn dndnVar = dvywVar.ah;
            if (dndnVar == null) {
                dndnVar = dndn.c;
            }
            if ((dndnVar.a & 1) != 0) {
                dhjz dhjzVar = dvywVar.e;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                if (dhjzVar.c != dcyn.a && dhjzVar.b != dcyn.a) {
                    dhjz dhjzVar2 = dvywVar.e;
                    if (dhjzVar2 == null) {
                        dhjzVar2 = dhjz.e;
                    }
                    dcuy e = dcuy.e(dhjzVar2.c);
                    dhjz dhjzVar3 = dvywVar.e;
                    if (dhjzVar3 == null) {
                        dhjzVar3 = dhjz.e;
                    }
                    String g = decu.g(dcvf.c(dcvs.c(e.c(), dcuy.e(dhjzVar3.b).c())).b, 16);
                    StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 6);
                    sb.append("0x");
                    sb.append(g);
                    sb.append(":0x0");
                    return dbsg.i(sb.toString());
                }
            }
            return dbpy.a;
        }
        return dbsg.i(dvywVar.g);
    }
}

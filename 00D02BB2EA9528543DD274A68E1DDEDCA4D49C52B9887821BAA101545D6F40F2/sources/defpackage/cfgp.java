package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cfgp  reason: default package */
/* loaded from: classes4.dex */
public final class cfgp {
    public static dbsg<dlnm> a(List<dlnm> list, List<cfgf> list2) {
        for (dlnm dlnmVar : list) {
            Iterator<cfgf> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    dlnm dlnmVar2 = it.next().b;
                    if (dlnmVar2 == null) {
                        dlnmVar2 = dlnm.l;
                    }
                    if (dlnmVar.equals(dlnmVar2)) {
                        break;
                    }
                } else if (b(dlnmVar.h, list2)) {
                    return dbsg.i(dlnmVar);
                }
            }
        }
        return dbpy.a;
    }

    public static boolean b(List<dlkz> list, List<cfgf> list2) {
        if (list.isEmpty()) {
            return true;
        }
        for (dlkz dlkzVar : list) {
            dspd dspdVar = dlkzVar.a;
            dspd dspdVar2 = dlkzVar.b;
            dcdc z = dcbg.b(dlkzVar.d).s(cfgo.a).z();
            for (cfgf cfgfVar : list2) {
                dlnm dlnmVar = cfgfVar.b;
                if (dlnmVar == null) {
                    dlnmVar = dlnm.l;
                }
                if (dlnmVar.g.equals(dspdVar)) {
                    cfgd cfgdVar = cfgfVar.c;
                    if (cfgdVar == null) {
                        cfgdVar = cfgd.h;
                    }
                    if (!cfgdVar.c) {
                        cfgd cfgdVar2 = cfgfVar.c;
                        if (cfgdVar2 == null) {
                            cfgdVar2 = cfgd.h;
                        }
                        if (cfgdVar2.b.equals(dspdVar2)) {
                            if (!z.isEmpty()) {
                                cfgd cfgdVar3 = cfgfVar.c;
                                if (cfgdVar3 == null) {
                                    cfgdVar3 = cfgd.h;
                                }
                                if (cfgdVar3.d.containsAll(z)) {
                                }
                            }
                            return true;
                        }
                        continue;
                    } else if (dlkzVar.c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: avkt  reason: default package */
/* loaded from: classes3.dex */
public final class avkt {
    public static avks a(@dzsi avkr avkrVar, avkr avkrVar2) {
        Map map;
        avkr avkrVar3;
        dlug dlugVar;
        dlug dlugVar2;
        boolean z;
        avkr avkrVar4;
        boolean z2 = avkrVar != null;
        dcdg p = dcdn.p();
        dcdg p2 = dcdn.p();
        dcen N = dcep.N();
        if (avkrVar != null) {
            map = avkrVar.b();
            avkrVar3 = avkrVar;
        } else {
            map = dcmn.a;
            avkrVar3 = null;
        }
        dcdn<dspd, avlg> b = avkrVar2.b();
        dcpd<avlg> it = b.values().iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            avlg next = it.next();
            dltm dltmVar = next.c;
            if (dltmVar == null) {
                dltmVar = dltm.t;
            }
            dspd dspdVar = dltmVar.b;
            avlg avlgVar = map.get(dspdVar);
            if (avlgVar == null) {
                p.f(dspdVar, dltmVar);
                avkrVar4 = avkrVar3;
            } else {
                avkrVar4 = avkrVar3;
                if (avlgVar.b != next.b) {
                    p2.f(dspdVar, dltmVar);
                    dltm dltmVar2 = avlgVar.c;
                    if (dltmVar2 == null) {
                        dltmVar2 = dltm.t;
                    }
                    if (dltmVar2.r != dltmVar.r) {
                        z3 = true;
                    }
                }
            }
            avkrVar3 = avkrVar4;
        }
        avkr avkrVar5 = avkrVar3;
        dcpd<avlg> it2 = map.values().iterator();
        while (it2.hasNext()) {
            dltm dltmVar3 = it2.next().c;
            if (dltmVar3 == null) {
                dltmVar3 = dltm.t;
            }
            dspd dspdVar2 = dltmVar3.b;
            if (!b.containsKey(dspdVar2)) {
                N.b(dspdVar2);
            }
        }
        avle d = avkrVar5 != null ? avkrVar5.d() : null;
        avle d2 = avkrVar2.d();
        if (d != null) {
            if (d2 == null) {
                dlugVar = null;
                dlugVar2 = null;
                z = true;
                return new avkn(p.b(), p2.b(), N.f(), z3, dlugVar, dlugVar2, z, z2);
            } else if (d.b != d2.b) {
                dlug dlugVar3 = d2.c;
                if (dlugVar3 == null) {
                    dlugVar3 = dlug.c;
                }
                dlugVar2 = dlugVar3;
                dlugVar = null;
                z = false;
                return new avkn(p.b(), p2.b(), N.f(), z3, dlugVar, dlugVar2, z, z2);
            }
        } else if (d2 != null) {
            dlug dlugVar4 = d2.c;
            if (dlugVar4 == null) {
                dlugVar4 = dlug.c;
            }
            dlugVar = dlugVar4;
            dlugVar2 = null;
            z = false;
            return new avkn(p.b(), p2.b(), N.f(), z3, dlugVar, dlugVar2, z, z2);
        }
        dlugVar = null;
        dlugVar2 = null;
        z = false;
        return new avkn(p.b(), p2.b(), N.f(), z3, dlugVar, dlugVar2, z, z2);
    }
}

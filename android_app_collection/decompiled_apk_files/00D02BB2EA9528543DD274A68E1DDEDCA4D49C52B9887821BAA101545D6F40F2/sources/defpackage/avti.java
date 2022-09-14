package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: avti  reason: default package */
/* loaded from: classes3.dex */
public final class avti {
    public static final void a(List<dlpk> list, dlpc dlpcVar) {
        dcha a = dckm.c(dluy.class).b().a();
        for (dlpk dlpkVar : list) {
            dluy b = dluy.b(dlpkVar.c);
            if (b == null) {
                b = dluy.UNKNOWN_RESOURCE_TYPE;
            }
            a.n(b, dlpkVar.b);
        }
        for (K k : a.J()) {
            dlpf bZ = dlpg.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlpg dlpgVar = (dlpg) bZ.b;
            dlpgVar.b = k.f;
            dlpgVar.a |= 1;
            for (dspd dspdVar : a.c(k)) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlpg dlpgVar2 = (dlpg) bZ.b;
                dspdVar.getClass();
                dsrj<dspd> dsrjVar = dlpgVar2.c;
                if (!dsrjVar.a()) {
                    dlpgVar2.c = dsqw.cl(dsrjVar);
                }
                dlpgVar2.c.add(dspdVar);
            }
            if (dlpcVar.c) {
                dlpcVar.bF();
                dlpcVar.c = false;
            }
            dlpd dlpdVar = (dlpd) dlpcVar.b;
            dlpg bK = bZ.bK();
            dlpd dlpdVar2 = dlpd.e;
            bK.getClass();
            dsrj<dlpg> dsrjVar2 = dlpdVar.b;
            if (!dsrjVar2.a()) {
                dlpdVar.b = dsqw.cl(dsrjVar2);
            }
            dlpdVar.b.add(bK);
        }
    }

    public static boolean b(int i) {
        return i == 1 || i == 7 || i == 8 || i == 9 || i == 12 || i == 13;
    }
}

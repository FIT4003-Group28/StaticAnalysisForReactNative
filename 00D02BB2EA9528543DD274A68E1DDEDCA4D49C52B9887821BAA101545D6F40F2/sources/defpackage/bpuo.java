package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bpuo  reason: default package */
/* loaded from: classes4.dex */
public final class bpuo {
    public static ilo a(List<String> list, @dzsi dhjz dhjzVar) {
        dvya bZ = dvyw.bv.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        dvywVar.b |= 32;
        dvywVar.S = true;
        doaw bZ2 = doaz.k.bZ();
        doay doayVar = doay.TYPE_GEOCODED_ADDRESS;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doaz doazVar = (doaz) bZ2.b;
        doazVar.b = doayVar.j;
        doazVar.a |= 1;
        dnnb bZ3 = dnnc.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dnnc dnncVar = (dnnc) bZ3.b;
        dsrj<String> dsrjVar = dnncVar.b;
        if (!dsrjVar.a()) {
            dnncVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dnncVar.b);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        doaz doazVar2 = (doaz) bZ2.b;
        dnnc bK = bZ3.bK();
        bK.getClass();
        doazVar2.i = bK;
        doazVar2.a |= 512;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar2 = (dvyw) bZ.b;
        doaz bK2 = bZ2.bK();
        bK2.getClass();
        dvywVar2.Z = bK2;
        dvywVar2.b |= 4096;
        if (!list.isEmpty()) {
            String str = list.get(0);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar3 = (dvyw) bZ.b;
            str.getClass();
            dvywVar3.a |= 16;
            dvywVar3.i = str;
        }
        if (dhjzVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvyw dvywVar4 = (dvyw) bZ.b;
            dhjzVar.getClass();
            dvywVar4.e = dhjzVar;
            dvywVar4.a |= 1;
        }
        ily ilyVar = new ily();
        ilyVar.E(bZ.bK());
        return ilyVar.d();
    }

    public static boolean b(ilo iloVar) {
        doaz cd = iloVar.cd();
        doay b = doay.b(cd.b);
        if (b == null) {
            b = doay.UNSUPPORTED;
        }
        return b == doay.TYPE_GEOCODED_ADDRESS && (cd.a & 2) == 0;
    }
}

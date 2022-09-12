package defpackage;

import com.google.android.apps.gmm.location.model.DeviceLocation;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: avnk  reason: default package */
/* loaded from: classes3.dex */
public final class avnk {
    public final bttf a;
    public final cjqy b;
    public final dxio<ahjq> c;

    public avnk(dxio<ahjq> dxioVar, bttf bttfVar, cjqy cjqyVar) {
        this.c = dxioVar;
        this.a = bttfVar;
        this.b = cjqyVar;
    }

    public static dlvc a(bttf bttfVar, @dzsi DeviceLocation deviceLocation, @dzsi ahnc ahncVar, @dzsi String str) {
        dtaq dtaqVar = null;
        dtaq a = deviceLocation != null ? deviceLocation.a() : null;
        if (ahncVar != null) {
            dtaqVar = ahncVar.a();
        }
        return b(bttfVar, a, dtaqVar, str);
    }

    public static dlvc b(bttf bttfVar, @dzsi dtaq dtaqVar, @dzsi dtaq dtaqVar2, @dzsi String str) {
        dlvb bZ = dlvc.j.bZ();
        String locale = Locale.getDefault().toString();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlvc dlvcVar = (dlvc) bZ.b;
        locale.getClass();
        dlvcVar.a |= 1;
        dlvcVar.b = locale;
        String a = bttfVar.a();
        if (!dbsj.d(a)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlvc dlvcVar2 = (dlvc) bZ.b;
            a.getClass();
            dlvcVar2.a |= 2;
            dlvcVar2.c = a;
        }
        if (bttfVar.b() && dtaqVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlvc dlvcVar3 = (dlvc) bZ.b;
            dtaqVar.getClass();
            dlvcVar3.d = dtaqVar;
            dlvcVar3.a |= 4;
        }
        if (dtaqVar2 != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlvc dlvcVar4 = (dlvc) bZ.b;
            dtaqVar2.getClass();
            dlvcVar4.e = dtaqVar2;
            dlvcVar4.a |= 8;
        }
        if (str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlvc dlvcVar5 = (dlvc) bZ.b;
            str.getClass();
            dlvcVar5.a |= 64;
            dlvcVar5.g = str;
        }
        dspd dspdVar = dspd.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlvc dlvcVar6 = (dlvc) bZ.b;
        dspdVar.getClass();
        int i = dlvcVar6.a | 16;
        dlvcVar6.a = i;
        dlvcVar6.f = dspdVar;
        dlvcVar6.a = i | 128;
        dlvcVar6.h = true;
        return bZ.bK();
    }
}

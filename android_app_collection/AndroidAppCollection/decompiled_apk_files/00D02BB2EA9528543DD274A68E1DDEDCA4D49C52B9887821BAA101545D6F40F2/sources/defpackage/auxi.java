package defpackage;

import android.app.Application;
import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: auxi  reason: default package */
/* loaded from: classes.dex */
public final class auxi extends auje {
    private final dxio<ckcw> c;
    private final Application d;
    private final dxio<bzui> e;
    private final dxio<bztp> f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auxi(defpackage.dxio<defpackage.ckcw> r3, android.app.Application r4, defpackage.dxio<defpackage.bzui> r5, defpackage.dxio<defpackage.bztp> r6) {
        /*
            r2 = this;
            dpyv r0 = defpackage.dpyv.PHOTO_TAKEN
            int r0 = r0.dm
            aujc r0 = defpackage.aujd.d(r0)
            r1 = 3
            r0.c(r1)
            r1 = 1
            r0.b(r1)
            aujd r0 = r0.a()
            r2.<init>(r0)
            r2.c = r3
            r2.d = r4
            r2.e = r5
            r2.f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auxi.<init>(dxio, android.app.Application, dxio, dxio):void");
    }

    @Override // defpackage.auje, defpackage.aujb
    public final boolean g(btvo btvoVar) {
        return !this.e.a().a().isEmpty();
    }

    @Override // defpackage.aujb
    public final auil j() {
        return auil.c(ddda.bO, ddcu.aF);
    }

    @Override // defpackage.auje, defpackage.aujb
    public final boolean n(btvo btvoVar) {
        return btvoVar.getPhotoTakenNotificationParameters().c;
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, @dzsi btlu btluVar) {
        if (this.e.a().a().contains(dvll.SERVER_TRIGGERED_SLF)) {
            dlgn dlgnVar = dlfvVar.g;
            if (dlgnVar == null) {
                dlgnVar = dlgn.G;
            }
            dlhz dlhzVar = null;
            if (((dlgnVar.a & 536870912) != 0 ? akqi.b(dlgnVar.B) : null) == null) {
                ((ckco) this.c.a().a(ckdz.L)).a(ckdp.a(3));
                return true;
            }
            if (dlgnVar.c == 28) {
                dlhzVar = (dlhz) dlgnVar.d;
            }
            if (dlhzVar == null) {
                ((ckco) this.c.a().a(ckdz.L)).a(ckdp.a(4));
                return true;
            }
            dlhu dlhuVar = dlhzVar.b;
            if (dlhuVar == null) {
                dlhuVar = dlhu.c;
            }
            if (bzul.a(this.e.a(), this.f.a(), this.d, dlhuVar).isEmpty()) {
                ((ckco) this.c.a().a(ckdz.L)).a(ckdp.a(5));
                return true;
            }
            EnumSet noneOf = EnumSet.noneOf(dvll.class);
            for (dvlb dvlbVar : this.e.a().a.a().getPhotoTakenNotificationParameters().b) {
                if (dvlbVar.b) {
                    dvll b = dvll.b(dvlbVar.a);
                    if (b == null) {
                        b = dvll.UNKNOWN_NOTIFICATION_TYPE;
                    }
                    if (!dvll.UNKNOWN_NOTIFICATION_TYPE.equals(b)) {
                        noneOf.add(b);
                    }
                }
            }
            if (noneOf.contains(dvll.SERVER_TRIGGERED_SLF)) {
                ((ckco) this.c.a().a(ckdz.L)).a(ckdp.a(7));
                return true;
            }
            ((ckco) this.c.a().a(ckdz.L)).a(ckdp.a(6));
            return false;
        }
        ((ckco) this.c.a().a(ckdz.L)).a(ckdp.a(2));
        return true;
    }

    @Override // defpackage.auje
    @dzsi
    public final dkhd y(btvo btvoVar) {
        dkhd dkhdVar = btvoVar.getPhotoTakenNotificationParameters().a;
        return dkhdVar == null ? dkhd.h : dkhdVar;
    }

    @Override // defpackage.auje
    public final auik z(dkpm dkpmVar) {
        ddos ddosVar = ddos.PHOTO_TAKEN;
        dkpi dkpiVar = dkpmVar.b;
        if (dkpiVar == null) {
            dkpiVar = dkpi.i;
        }
        return auik.c(ddosVar, dkpiVar);
    }
}

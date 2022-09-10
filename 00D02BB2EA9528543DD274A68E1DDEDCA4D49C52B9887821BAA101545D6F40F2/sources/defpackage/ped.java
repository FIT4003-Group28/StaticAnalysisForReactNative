package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: ped  reason: default package */
/* loaded from: classes7.dex */
public final class ped {
    public final dxio<auhi> a;
    public final dxio<auhq> b;
    public final dxio<auom> c;
    public final dxio<ausy> d;
    private final dxio<byqc> e;
    private final dxio<pak> f;

    public ped(dxio<byqc> dxioVar, dxio<auhi> dxioVar2, dxio<pak> dxioVar3, dxio<auhq> dxioVar4, dxio<auom> dxioVar5, dxio<ausy> dxioVar6) {
        this.e = dxioVar;
        this.a = dxioVar2;
        this.f = dxioVar3;
        this.b = dxioVar4;
        this.c = dxioVar5;
        this.d = dxioVar6;
    }

    public final dlgp a() {
        dlgo bZ = dlgp.b.bZ();
        for (Integer num : dcbg.b(this.d.a().h(new dbsl(this) { // from class: peb
            private final ped a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                ped pedVar = this.a;
                int intValue = ((Integer) obj).intValue();
                aujb h = pedVar.a.a().h(intValue);
                return (h == null || Build.VERSION.SDK_INT < 28 || ((pedVar.c.a().b && pedVar.d.a().a(h.a)) || (pedVar.b.a().a() && pedVar.b.a().b(h) && pedVar.b.a().c(h)))) && pedVar.a.a().t(intValue) != aufs.DISABLED;
            }
        })).o(new dbsl(this) { // from class: pec
            private final ped a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.b(((Integer) obj).intValue());
            }
        }).z()) {
            int intValue = num.intValue();
            dlfs bZ2 = dlft.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dlft dlftVar = (dlft) bZ2.b;
            dlftVar.a |= 1;
            dlftVar.b = intValue;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlgp dlgpVar = (dlgp) bZ.b;
            dlft bK = bZ2.bK();
            bK.getClass();
            dsrj<dlft> dsrjVar = dlgpVar.a;
            if (!dsrjVar.a()) {
                dlgpVar.a = dsqw.cl(dsrjVar);
            }
            dlgpVar.a.add(bK);
        }
        return bZ.bK();
    }

    public final boolean b(int i) {
        if (i == auiy.JOURNEY_SHARING_ARRIVAL_NOTIFICATION.a().intValue()) {
            return false;
        }
        if (i == auiy.REVIEW_AT_A_PLACE_NOTIFICATION_DIDNT_GO_HERE_ACTION.a().intValue()) {
            return true;
        }
        if (i == auiy.CHIME_BASIC_NOTIFICATION.a().intValue()) {
            this.f.a();
            return true;
        } else if (i == auiy.SMARTSPACE_CHIME.a().intValue()) {
            return this.e.a().a();
        } else {
            return (i == -1 || i == auiy.PHOTO_UPDATE.a().intValue()) ? false : true;
        }
    }
}

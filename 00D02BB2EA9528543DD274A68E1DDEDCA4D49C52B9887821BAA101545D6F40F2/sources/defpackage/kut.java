package defpackage;

import com.google.android.apps.auto.sdk.nav.ClientMode;
/* compiled from: PG */
/* renamed from: kut  reason: default package */
/* loaded from: classes.dex */
final class kut implements kus {
    private static final dcqe a = dcqe.c("kut");
    private static final kur b = new kur();
    private final ktw c;
    private final ktx d;
    private final dbty<ddlj> e;
    private final ktz f;

    public kut(ktw ktwVar, ktx ktxVar, ktz ktzVar, dbty dbtyVar) {
        this.c = ktwVar;
        this.d = ktxVar;
        this.f = ktzVar;
        this.e = dbtyVar;
    }

    @Override // defpackage.kus
    public final dbsg<ddlj> a() {
        ddlg ddlgVar;
        ddkx bK;
        ddlg ddlgVar2 = ddlg.UNKNOWN;
        ClientMode clientMode = this.c.a;
        if (clientMode == null) {
            return dbpy.a;
        }
        int i = clientMode.a;
        if (i == 1) {
            ddlgVar = ddlg.ANDROID_AUTO_PROJECTED;
            ddkw bZ = ddkx.e.bZ();
            boolean z = this.c.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddkx ddkxVar = (ddkx) bZ.b;
            ddkxVar.a = 2 | ddkxVar.a;
            ddkxVar.d = z;
            bZ.a(this.d.b);
            bK = bZ.bK();
        } else if (i == 2) {
            ddlgVar = ddlg.ANDROID_AUTO_PHONE_SCREEN;
            bK = null;
        } else {
            bvoo.h("unknown client mode %d", Integer.valueOf(clientMode.a));
            return dbpy.a;
        }
        ddlj a2 = this.e.a();
        dsqp dsqpVar = (dsqp) a2.cu(5);
        dsqpVar.bC(a2);
        ddky ddkyVar = (ddky) dsqpVar;
        if (ddkyVar.c) {
            ddkyVar.bF();
            ddkyVar.c = false;
        }
        ddlj ddljVar = (ddlj) ddkyVar.b;
        ddlj ddljVar2 = ddlj.i;
        ddljVar.b = ddlgVar.f;
        ddljVar.a |= 1;
        dcdc r = dcdc.r(this.f.a);
        if (ddkyVar.c) {
            ddkyVar.bF();
            ddkyVar.c = false;
        }
        ddlj ddljVar3 = (ddlj) ddkyVar.b;
        ddljVar3.b();
        dsod.bv(r, ddljVar3.h);
        if (bK != null) {
            if (ddkyVar.c) {
                ddkyVar.bF();
                ddkyVar.c = false;
            }
            ddlj ddljVar4 = (ddlj) ddkyVar.b;
            bK.getClass();
            ddljVar4.g = bK;
            ddljVar4.a |= 32;
        }
        return dbsg.i(ddkyVar.bK());
    }

    @Override // defpackage.kus
    public final dbsg<dhmr> b() {
        dbsg<ddlj> a2 = a();
        return a2.a() ? dbsg.i(b.NV(a2.b())) : dbpy.a;
    }
}

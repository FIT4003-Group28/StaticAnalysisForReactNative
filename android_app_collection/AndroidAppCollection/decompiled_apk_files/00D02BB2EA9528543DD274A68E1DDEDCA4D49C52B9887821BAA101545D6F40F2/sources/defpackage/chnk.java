package defpackage;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chnk  reason: default package */
/* loaded from: classes4.dex */
public final class chnk implements aket {
    private static final byte[] a = new byte[0];
    private final byte[] b;
    @dzsi
    private final byte[] c;
    private final boolean d;
    @dzsi
    private final dpyv e;
    private final dwyd f;
    private final boolean g;

    public chnk(@dzsi drry drryVar, @dzsi byte[] bArr, boolean z, @dzsi dpyv dpyvVar, @dzsi dwyd dwydVar, boolean z2) {
        this.b = drryVar == null ? a : drryVar.bS();
        this.c = bArr;
        this.d = z;
        this.e = dpyvVar;
        this.g = z2;
        this.f = dwydVar == null ? dwyd.UNKNOWN_ENTRY_POINT : dwydVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        fd J;
        drry drryVar = null;
        try {
            byte[] bArr = this.b;
            if (bArr != a) {
                drryVar = (drry) dsqw.cq(drry.d, bArr);
            }
        } catch (dsrm unused) {
        }
        fd J2 = ggaVar.J(gfu.ACTIVITY_FRAGMENT);
        if (J2 instanceof chng) {
            if (this.g && ((J = ggaVar.J(gfu.DIALOG_FRAGMENT)) == null || (J instanceof bvvt))) {
                ggaVar.z(chng.class);
            }
            chng chngVar = (chng) J2;
            byte[] bArr2 = this.c;
            boolean z = this.d;
            chud i = chng.i(drryVar, bArr2, this.e, this.f);
            chxs bZ = chxt.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxt chxtVar = (chxt) bZ.b;
            chuu bK = i.bK();
            bK.getClass();
            chxtVar.b = bK;
            chxtVar.a |= 1;
            chxt bK2 = bZ.bK();
            Bundle bundle = chngVar.o;
            if (bundle != null) {
                bvrs.l(bundle, bK2);
                chngVar.o.putBoolean("S", z);
            }
            chof chofVar = chngVar.af;
            if (chofVar == null) {
                return;
            }
            chofVar.b(i.bK());
            return;
        }
        byte[] bArr3 = this.c;
        boolean z2 = this.d;
        dpyv dpyvVar = this.e;
        dwyd dwydVar = this.f;
        chng chngVar2 = new chng();
        Bundle bundle2 = new Bundle();
        chud i2 = chng.i(drryVar, bArr3, dpyvVar, dwydVar);
        chxs bZ2 = chxt.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        chxt chxtVar2 = (chxt) bZ2.b;
        chuu bK3 = i2.bK();
        bK3.getClass();
        chxtVar2.b = bK3;
        chxtVar2.a |= 1;
        bvrs.l(bundle2, bZ2.bK());
        bundle2.putBoolean("S", z2);
        chngVar2.B(bundle2);
        ggaVar.D(chngVar2);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}

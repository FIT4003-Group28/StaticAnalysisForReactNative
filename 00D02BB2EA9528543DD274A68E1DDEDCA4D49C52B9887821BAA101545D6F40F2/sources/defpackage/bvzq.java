package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: bvzq  reason: default package */
/* loaded from: classes4.dex */
public final class bvzq extends bvwl<dmeo, dmeq> {
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvzq() {
        super(dmeo.b, dmeq.d);
        String str = Build.FINGERPRINT;
        this.c = str;
    }

    @Override // defpackage.bvwl
    public final /* bridge */ /* synthetic */ dmeq g(dmeo dmeoVar) {
        dmep bZ = dmeq.c.bZ();
        dmdw bZ2 = dmdx.c.bZ();
        dmdu bZ3 = dmdv.c.bZ();
        String str = this.c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmdv dmdvVar = (dmdv) bZ3.b;
        str.getClass();
        dmdvVar.a |= 1;
        dmdvVar.b = str;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmdx dmdxVar = (dmdx) bZ2.b;
        dmdv bK = bZ3.bK();
        bK.getClass();
        dmdxVar.b = bK;
        dmdxVar.a = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmeq dmeqVar = (dmeq) bZ.b;
        dmdx bK2 = bZ2.bK();
        bK2.getClass();
        dmeqVar.b = bK2;
        dmeqVar.a |= 1;
        return bZ.bK();
    }
}

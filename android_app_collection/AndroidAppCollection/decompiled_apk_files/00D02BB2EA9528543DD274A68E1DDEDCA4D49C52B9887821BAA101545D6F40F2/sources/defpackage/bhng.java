package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bhng  reason: default package */
/* loaded from: classes3.dex */
public final class bhng {
    private final gga a;
    private final bwqv b;

    public bhng(gga ggaVar, bwqv bwqvVar) {
        this.a = ggaVar;
        this.b = bwqvVar;
    }

    public final void a(ccln cclnVar, bwrs<ilo> bwrsVar) {
        bwqv bwqvVar = this.b;
        Bundle bundle = new Bundle();
        bhrv bZ = bhrw.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bhrw bhrwVar = (bhrw) bZ.b;
        cclnVar.getClass();
        bhrwVar.b = cclnVar;
        bhrwVar.a |= 1;
        bvrs.l(bundle, bZ.bK());
        cctq.a(bundle, bwqvVar, bwrsVar);
        bhnf bhnfVar = new bhnf();
        bhnfVar.B(bundle);
        this.a.D(bhnfVar);
    }
}

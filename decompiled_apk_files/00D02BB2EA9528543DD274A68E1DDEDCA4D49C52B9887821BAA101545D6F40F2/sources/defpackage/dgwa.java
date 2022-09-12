package defpackage;

import java.math.BigDecimal;
/* compiled from: PG */
/* renamed from: dgwa  reason: default package */
/* loaded from: classes6.dex */
final class dgwa extends dgtl<BigDecimal> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ BigDecimal a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            return new BigDecimal(dgxeVar.h());
        } catch (NumberFormatException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, BigDecimal bigDecimal) {
        dgxgVar.i(bigDecimal);
    }
}

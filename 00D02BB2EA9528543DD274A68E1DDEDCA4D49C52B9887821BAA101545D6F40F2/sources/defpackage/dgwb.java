package defpackage;

import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: dgwb  reason: default package */
/* loaded from: classes6.dex */
final class dgwb extends dgtl<BigInteger> {
    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ BigInteger a(dgxe dgxeVar) {
        if (dgxeVar.q() == 9) {
            dgxeVar.j();
            return null;
        }
        try {
            return new BigInteger(dgxeVar.h());
        } catch (NumberFormatException e) {
            throw new dgtj(e);
        }
    }

    @Override // defpackage.dgtl
    public final /* bridge */ /* synthetic */ void b(dgxg dgxgVar, BigInteger bigInteger) {
        dgxgVar.i(bigInteger);
    }
}

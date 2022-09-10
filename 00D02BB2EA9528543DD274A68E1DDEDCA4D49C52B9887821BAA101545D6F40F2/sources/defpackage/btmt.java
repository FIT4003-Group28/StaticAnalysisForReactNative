package defpackage;
/* compiled from: PG */
/* renamed from: btmt  reason: default package */
/* loaded from: classes.dex */
public final class btmt implements ckcx {
    @Override // defpackage.ckcx
    public final void a(ddyf ddyfVar) {
        int b = decl.b(Runtime.getRuntime().maxMemory() / 1048576);
        if (b >= 0) {
            int pow = (int) Math.pow(2.0d, b == 0 ? dcyn.a : 32 - Integer.numberOfLeadingZeros(b - 1));
            if (ddyfVar.c) {
                ddyfVar.bF();
                ddyfVar.c = false;
            }
            ddyq ddyqVar = (ddyq) ddyfVar.b;
            ddyq ddyqVar2 = ddyq.K;
            ddyqVar.a |= 128;
            ddyqVar.g = pow;
            return;
        }
        throw new IllegalArgumentException("Value should be greater than zero.");
    }
}

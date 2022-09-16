package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: aytg  reason: default package */
/* loaded from: classes2.dex */
public final class aytg extends aynr {
    final aynu[] a;

    public aytg(aynu[] aynuVarArr) {
        this.a = aynuVarArr;
    }

    @Override // defpackage.aynr
    public final void V(ayns aynsVar) {
        aypf aypfVar = new aypf();
        aytf aytfVar = new aytf(aynsVar, new AtomicBoolean(), aypfVar);
        aynsVar.sj(aypfVar);
        aynu[] aynuVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            aynu aynuVar = aynuVarArr[i];
            if (aypfVar.b) {
                return;
            }
            if (aynuVar != null) {
                aynuVar.U(aytfVar);
            } else {
                aypfVar.qr();
                aytfVar.b(new NullPointerException("A completable source is null"));
                return;
            }
        }
        aytfVar.sm();
    }
}

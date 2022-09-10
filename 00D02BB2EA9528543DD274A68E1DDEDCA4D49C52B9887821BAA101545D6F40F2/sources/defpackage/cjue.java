package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cjue  reason: default package */
/* loaded from: classes4.dex */
public final class cjue extends cjtk {
    private final eacd a;

    public cjue(eacd eacdVar, cqat cqatVar) {
        super(cqatVar.e());
        this.a = eacdVar;
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        eacd eacdVar = this.a;
        if (dwumVar.c) {
            dwumVar.bF();
            dwumVar.c = false;
        }
        dwun dwunVar = (dwun) dwumVar.b;
        dwun dwunVar2 = dwun.w;
        eacdVar.getClass();
        dwunVar.v = eacdVar;
        dwunVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
    }

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}

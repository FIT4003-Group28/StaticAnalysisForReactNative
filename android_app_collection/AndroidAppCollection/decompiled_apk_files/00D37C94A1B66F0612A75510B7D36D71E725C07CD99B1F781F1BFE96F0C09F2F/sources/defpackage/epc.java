package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: epc  reason: default package */
/* loaded from: classes3.dex */
public final class epc implements aafl {
    private final adoa a;

    public epc(adoa adoaVar) {
        adoaVar.getClass();
        this.a = adoaVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        adnt e = this.a.e();
        if (e == null || e.a() != 1) {
            return;
        }
        e.B();
    }
}

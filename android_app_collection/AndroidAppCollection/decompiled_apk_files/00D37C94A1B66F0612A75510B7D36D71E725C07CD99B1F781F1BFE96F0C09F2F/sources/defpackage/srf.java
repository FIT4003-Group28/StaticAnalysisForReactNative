package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: srf  reason: default package */
/* loaded from: classes4.dex */
public final class srf extends cyp {
    srg a;
    private final String[] e = {"componentElementSubscription", "delegate", "elementConverterFlat", "templateLoggerFactory"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(srf srfVar, cyv cyvVar, srg srgVar) {
        super.w(cyvVar, srgVar);
        srfVar.a = srgVar;
        srfVar.d.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (srg) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final srg a() {
        o(4, this.d, this.e);
        return this.a;
    }
}

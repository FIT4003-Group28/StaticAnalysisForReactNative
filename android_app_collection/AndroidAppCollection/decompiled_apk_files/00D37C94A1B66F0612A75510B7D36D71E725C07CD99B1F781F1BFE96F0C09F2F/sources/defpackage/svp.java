package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: svp  reason: default package */
/* loaded from: classes4.dex */
public final class svp extends cyp {
    svr a;
    private final String[] e = {"child"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(svp svpVar, cyv cyvVar, svr svrVar) {
        super.w(cyvVar, svrVar);
        svpVar.a = svrVar;
        svpVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (svr) cyrVar;
    }
}

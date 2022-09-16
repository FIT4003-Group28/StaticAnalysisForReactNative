package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: fik  reason: default package */
/* loaded from: classes3.dex */
public final class fik extends cyp {
    fil a;
    private final String[] e = {"viewPositionTrackerProvider"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(fik fikVar, cyv cyvVar, fil filVar) {
        super.w(cyvVar, filVar);
        fikVar.a = filVar;
        fikVar.d.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (fil) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final fil a() {
        o(1, this.d, this.e);
        return this.a;
    }
}

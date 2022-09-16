package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: dmj  reason: default package */
/* loaded from: classes3.dex */
public final class dmj extends cyp {
    public dml a;
    private final String[] e = {"childComponent"};
    public final BitSet d = new BitSet(1);

    public static /* bridge */ /* synthetic */ void c(dmj dmjVar, cyv cyvVar, dml dmlVar) {
        super.w(cyvVar, dmlVar);
        dmjVar.a = dmlVar;
        dmjVar.d.clear();
    }

    @Override // defpackage.cyp
    public final /* bridge */ /* synthetic */ cyr a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (dml) cyrVar;
    }
}

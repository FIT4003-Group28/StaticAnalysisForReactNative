package defpackage;

import java.util.BitSet;
/* compiled from: PG */
/* renamed from: akct  reason: default package */
/* loaded from: classes.dex */
public final class akct extends cyp {
    akcv a;
    private final String[] e = {"componentCallable"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(akct akctVar, cyv cyvVar, akcv akcvVar) {
        super.w(cyvVar, akcvVar);
        akctVar.a = akcvVar;
        akctVar.d.clear();
    }

    @Override // defpackage.cyp
    protected final void b(cyr cyrVar) {
        this.a = (akcv) cyrVar;
    }

    @Override // defpackage.cyp
    /* renamed from: c */
    public final akcv a() {
        o(1, this.d, this.e);
        return this.a;
    }
}

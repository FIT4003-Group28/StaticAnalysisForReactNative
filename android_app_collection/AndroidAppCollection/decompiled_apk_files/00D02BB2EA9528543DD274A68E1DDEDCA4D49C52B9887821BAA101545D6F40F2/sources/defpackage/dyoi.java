package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyoi  reason: default package */
/* loaded from: classes6.dex */
public final class dyoi implements dylv {
    final dyjb a;
    private final dylt b;

    public dyoi(dyjb dyjbVar, dylt dyltVar) {
        dbsk.b(!dyjbVar.i(), "error must not be OK");
        this.a = dyjbVar;
        this.b = dyltVar;
    }

    @Override // defpackage.dylv
    public final dyls d(dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        return new dyoh(this.a, this.b);
    }

    @Override // defpackage.dygs
    public final dygo k() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}

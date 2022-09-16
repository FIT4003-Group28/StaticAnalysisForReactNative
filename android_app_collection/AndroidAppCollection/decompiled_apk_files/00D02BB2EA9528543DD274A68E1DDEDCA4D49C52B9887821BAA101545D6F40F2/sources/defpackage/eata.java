package defpackage;
/* compiled from: PG */
/* renamed from: eata  reason: default package */
/* loaded from: classes6.dex */
public abstract class eata extends eass {
    private final eaox a;
    final long b;

    public eata(eaop eaopVar, long j) {
        super(eaopVar);
        this.b = j;
        this.a = new easz(this, ((eaoo) eaopVar).a);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int n(long j, long j2) {
        return easy.d(o(j, j2));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox s() {
        return this.a;
    }
}

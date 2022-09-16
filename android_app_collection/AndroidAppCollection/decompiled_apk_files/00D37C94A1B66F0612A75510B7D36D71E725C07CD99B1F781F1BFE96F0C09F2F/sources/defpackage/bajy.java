package defpackage;
/* compiled from: PG */
/* renamed from: bajy  reason: default package */
/* loaded from: classes2.dex */
public abstract class bajy extends bajr {
    private final bahv a;
    final long b;

    public bajy(bahp bahpVar, long j) {
        super(bahpVar);
        this.b = j;
        this.a = new bajx(this, ((baho) bahpVar).a);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv p() {
        return this.a;
    }

    public abstract long v(long j, long j2);

    public long w(long j, long j2) {
        throw null;
    }

    public final int x(long j, long j2) {
        return bajw.a(w(j, j2));
    }
}

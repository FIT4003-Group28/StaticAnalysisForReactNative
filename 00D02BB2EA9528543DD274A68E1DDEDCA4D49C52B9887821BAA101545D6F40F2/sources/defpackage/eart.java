package defpackage;
/* compiled from: PG */
/* renamed from: eart  reason: default package */
/* loaded from: classes6.dex */
final class eart extends easv {
    private static final long serialVersionUID = 8049297699408782284L;
    final /* synthetic */ earv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eart(earv earvVar, eaox eaoxVar) {
        super(eaoxVar, eaoxVar.a());
        this.a = earvVar;
    }

    @Override // defpackage.easv, defpackage.eaox
    public final long e(long j, int i) {
        this.a.X(j, null);
        long e = this.b.e(j, i);
        this.a.X(e, "resulting");
        return e;
    }

    @Override // defpackage.easv, defpackage.eaox
    public final long f(long j, long j2) {
        this.a.X(j, null);
        long f = this.b.f(j, j2);
        this.a.X(f, "resulting");
        return f;
    }

    @Override // defpackage.east, defpackage.eaox
    public final int h(long j, long j2) {
        this.a.X(j, "minuend");
        this.a.X(j2, "subtrahend");
        return this.b.h(j, j2);
    }

    @Override // defpackage.easv, defpackage.eaox
    public final long i(long j, long j2) {
        this.a.X(j, "minuend");
        this.a.X(j2, "subtrahend");
        return this.b.i(j, j2);
    }
}

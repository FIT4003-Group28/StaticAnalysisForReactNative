package defpackage;
/* compiled from: PG */
/* renamed from: anlx  reason: default package */
/* loaded from: classes2.dex */
abstract class anlx implements anlp {
    protected final eaou a;
    protected final eaou b;
    protected final boolean c;
    protected final long d;
    protected final long e;
    private final long f;

    /* JADX INFO: Access modifiers changed from: protected */
    public anlx(long j, long j2, eaou eaouVar, eaou eaouVar2, boolean z, long j3) {
        this.a = eaouVar;
        this.b = eaouVar2;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    @Override // defpackage.anlp
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.anlp
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.dmkh
    public final long g() {
        return this.d;
    }

    @Override // defpackage.dmkh
    public final long h() {
        return this.e;
    }

    @Override // defpackage.dmkh
    public final long i() {
        return this.f;
    }
}

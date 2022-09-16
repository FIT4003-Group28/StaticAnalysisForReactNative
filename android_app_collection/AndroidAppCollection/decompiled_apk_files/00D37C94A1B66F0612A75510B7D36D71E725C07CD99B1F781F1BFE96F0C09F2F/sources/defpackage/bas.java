package defpackage;
/* compiled from: PG */
/* renamed from: bas  reason: default package */
/* loaded from: classes2.dex */
final class bas extends azo {
    private final long a;

    public bas(azf azfVar, long j) {
        super(azfVar);
        ptx.c(((aza) azfVar).c >= j);
        this.a = j;
    }

    @Override // defpackage.azo, defpackage.azf
    public final long c() {
        return super.c() - this.a;
    }

    @Override // defpackage.azo, defpackage.azf
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.azo, defpackage.azf
    public final long e() {
        return super.e() - this.a;
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: owb  reason: default package */
/* loaded from: classes4.dex */
final class owb implements ovy {
    private final oxm a;

    public owb(oxm oxmVar) {
        this.a = oxmVar;
    }

    @Override // defpackage.ovy
    public final int a() {
        return 0;
    }

    @Override // defpackage.ovy
    public final int b(long j) {
        return this.a.a - 1;
    }

    @Override // defpackage.ovy
    public final int c(long j, long j2) {
        return this.a.a(j);
    }

    @Override // defpackage.ovy
    public final long d(int i, long j) {
        return this.a.d[i];
    }

    @Override // defpackage.ovy
    public final long e(int i) {
        return this.a.e[i];
    }

    @Override // defpackage.ovy
    public final owj f(int i) {
        oxm oxmVar = this.a;
        return new owj(null, oxmVar.c[i], oxmVar.b[i]);
    }

    @Override // defpackage.ovy
    public final boolean g() {
        return true;
    }
}

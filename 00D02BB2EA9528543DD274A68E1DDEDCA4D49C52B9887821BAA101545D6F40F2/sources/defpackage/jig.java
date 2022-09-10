package defpackage;
/* compiled from: PG */
/* renamed from: jig  reason: default package */
/* loaded from: classes7.dex */
final class jig extends tp {
    private final cqrj a;
    private final cqiv b;

    public jig(cqrj cqrjVar, cqiv cqivVar) {
        this.a = cqrjVar;
        this.b = cqivVar;
    }

    @Override // defpackage.tp
    public final int a() {
        return this.a.c();
    }

    @Override // defpackage.tp
    public final int b() {
        return this.b.i();
    }

    @Override // defpackage.tp
    public final boolean c(int i, int i2) {
        cqix<?> cqixVar = this.b.a.get(i2);
        return this.a.a.b.get(i).a().equals(cqixVar.a()) && this.a.k(i) == ((long) cqixVar.b().hashCode());
    }

    @Override // defpackage.tp
    public final boolean d(int i, int i2) {
        return this.b.a.get(i2).b().equals(this.a.z(i));
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: atlx  reason: default package */
/* loaded from: classes2.dex */
final class atlx implements degu<Boolean> {
    final /* synthetic */ atly a;

    public atlx(atly atlyVar) {
        this.a = atlyVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        if (this.a.b != bool2.booleanValue()) {
            this.a.b = bool2.booleanValue();
            cqkx.p(this.a);
        }
    }
}

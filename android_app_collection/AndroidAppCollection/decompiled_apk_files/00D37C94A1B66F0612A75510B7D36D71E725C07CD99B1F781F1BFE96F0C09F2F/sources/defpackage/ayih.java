package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayih  reason: default package */
/* loaded from: classes2.dex */
final class ayih extends ayah {
    final /* synthetic */ Throwable a;
    private final ayac b;

    public ayih(Throwable th) {
        this.a = th;
        this.b = ayac.a(Status.n.withDescription("Panic! This is a bug!").c(th));
    }

    @Override // defpackage.ayah
    public final ayac a() {
        return this.b;
    }

    public final String toString() {
        ampp b = akzj.b(ayih.class);
        b.b("panicPickResult", this.b);
        return b.toString();
    }
}

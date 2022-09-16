package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayhr  reason: default package */
/* loaded from: classes2.dex */
final class ayhr extends aygw {
    final /* synthetic */ ayeq a;
    final /* synthetic */ ayhs b;

    public ayhr(ayhs ayhsVar, ayeq ayeqVar) {
        this.b = ayhsVar;
        this.a = ayeqVar;
    }

    @Override // defpackage.aygw, defpackage.ayeq
    public final void a(Status status, ayep ayepVar, ayat ayatVar) {
        this.b.b.a.a(status.f());
        this.a.a(status, ayepVar, ayatVar);
    }

    @Override // defpackage.aygw
    protected final ayeq b() {
        return this.a;
    }
}

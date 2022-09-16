package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ayej  reason: default package */
/* loaded from: classes2.dex */
final class ayej extends ayfb {
    final /* synthetic */ Status a;
    final /* synthetic */ ayat b;
    final /* synthetic */ ayel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayej(ayel ayelVar, Status status, ayat ayatVar) {
        super(ayelVar.b.d);
        this.c = ayelVar;
        this.a = status;
        this.b = ayatVar;
    }

    @Override // defpackage.ayfb
    public final void a() {
        int i = aynn.a;
        Status status = this.a;
        ayat ayatVar = this.b;
        Status status2 = this.c.a;
        if (status2 != null) {
            ayatVar = new ayat();
            status = status2;
        }
        this.c.b.f = true;
        this.c.c.a(status, ayatVar);
        this.c.b.g();
        this.c.b.c.a(status.f());
    }
}

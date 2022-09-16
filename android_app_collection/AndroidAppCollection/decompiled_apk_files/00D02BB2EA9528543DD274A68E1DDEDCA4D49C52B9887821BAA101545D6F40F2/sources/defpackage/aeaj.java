package defpackage;
/* compiled from: PG */
/* renamed from: aeaj  reason: default package */
/* loaded from: classes2.dex */
final class aeaj implements degu<Boolean> {
    final /* synthetic */ aeav a;
    final /* synthetic */ deig b;
    final /* synthetic */ aean c;
    final /* synthetic */ aeal d;

    public aeaj(aean aeanVar, aeav aeavVar, deig deigVar, aeal aealVar) {
        this.c = aeanVar;
        this.a = aeavVar;
        this.b = deigVar;
        this.d = aealVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.cancel(true);
        this.d.a();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null && bool2.booleanValue()) {
            this.c.h(this.a);
            return;
        }
        this.b.cancel(true);
        this.d.a();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aiyy  reason: default package */
/* loaded from: classes2.dex */
final class aiyy implements degu<Boolean> {
    final /* synthetic */ dehn a;
    final /* synthetic */ dbsg b;
    final /* synthetic */ dbsg c;
    final /* synthetic */ aiza d;

    public aiyy(aiza aizaVar, dehn dehnVar, dbsg dbsgVar, dbsg dbsgVar2) {
        this.d = aizaVar;
        this.a = dehnVar;
        this.b = dbsgVar;
        this.c = dbsgVar2;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            return;
        }
        this.d.b(this.b, this.c);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (this.a.isCancelled()) {
            return;
        }
        this.d.b(this.b, this.c);
    }
}

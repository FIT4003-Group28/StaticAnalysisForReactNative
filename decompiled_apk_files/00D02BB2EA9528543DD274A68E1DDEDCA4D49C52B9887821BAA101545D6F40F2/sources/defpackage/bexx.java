package defpackage;
/* compiled from: PG */
/* renamed from: bexx  reason: default package */
/* loaded from: classes3.dex */
final class bexx implements degu<baad> {
    final /* synthetic */ bexy a;
    final /* synthetic */ bexz b;
    final /* synthetic */ bexz c;

    public bexx(bexz bexzVar, bexy bexyVar, bexz bexzVar2) {
        this.c = bexzVar;
        this.a = bexyVar;
        this.b = bexzVar2;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        c(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi baad baadVar) {
        bexz bexzVar = this.c;
        bexzVar.a = (azzu) baadVar;
        c(bexzVar.a != null);
    }

    final void c(boolean z) {
        this.c.b = z ? 2 : 3;
        bexy bexyVar = this.a;
        if (bexyVar != null) {
            bexyVar.a(this.b, z);
        }
    }
}

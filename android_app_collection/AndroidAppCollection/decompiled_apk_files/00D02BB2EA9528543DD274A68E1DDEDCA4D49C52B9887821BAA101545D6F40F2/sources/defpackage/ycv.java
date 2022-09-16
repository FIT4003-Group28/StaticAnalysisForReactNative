package defpackage;
/* compiled from: PG */
/* renamed from: ycv  reason: default package */
/* loaded from: classes7.dex */
final class ycv implements degu<Boolean> {
    final /* synthetic */ dccr a;
    final /* synthetic */ ycw b;

    public ycv(ycw ycwVar, dccr dccrVar) {
        this.b = ycwVar;
        this.a = dccrVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.c(3);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        dccr dccrVar = this.a;
        ycw ycwVar = this.b;
        if (dccrVar != ycwVar.a) {
            return;
        }
        ycwVar.c(true != bool2.booleanValue() ? 3 : 4);
    }
}

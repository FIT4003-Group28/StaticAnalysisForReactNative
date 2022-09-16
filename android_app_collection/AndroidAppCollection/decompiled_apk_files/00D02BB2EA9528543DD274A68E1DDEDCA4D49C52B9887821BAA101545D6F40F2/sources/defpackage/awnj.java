package defpackage;
/* compiled from: PG */
/* renamed from: awnj  reason: default package */
/* loaded from: classes3.dex */
final class awnj implements degu<Boolean> {
    final /* synthetic */ int a;
    final /* synthetic */ awnk b;

    public awnj(awnk awnkVar, int i) {
        this.b = awnkVar;
        this.a = i;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        th.getMessage();
        this.b.a.remove(Integer.valueOf(this.a));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (!bool.booleanValue()) {
            this.b.a.remove(Integer.valueOf(this.a));
        }
    }
}

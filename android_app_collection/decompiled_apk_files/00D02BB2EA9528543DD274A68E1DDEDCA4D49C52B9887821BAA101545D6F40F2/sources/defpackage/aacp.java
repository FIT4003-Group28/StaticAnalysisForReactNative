package defpackage;
/* compiled from: PG */
/* renamed from: aacp  reason: default package */
/* loaded from: classes2.dex */
public final class aacp implements degu<aaco> {
    final /* synthetic */ aacs a;
    final /* synthetic */ aact b;
    final /* synthetic */ aacu c;

    public aacp(aacu aacuVar, aacs aacsVar, aact aactVar) {
        this.c = aacuVar;
        this.a = aacsVar;
        this.b = aactVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.c.a(this.b);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(aaco aacoVar) {
        dbsg<dilu> b = aacoVar.b();
        if (b.a()) {
            this.c.a.a(this.a, b.b());
        }
        this.c.a(this.b);
    }
}

package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azrj  reason: default package */
/* loaded from: classes3.dex */
public final class azrj implements degu<baad> {
    final /* synthetic */ baal a;
    final /* synthetic */ ilo b;
    final /* synthetic */ azrm c;

    public azrj(azrm azrmVar, baal baalVar, ilo iloVar) {
        this.c = azrmVar;
        this.a = baalVar;
        this.b = iloVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi baad baadVar) {
        baal d;
        baad baadVar2 = baadVar;
        if (baadVar2 != null && (d = baadVar2.d(this.a.a())) != null) {
            this.c.Nw(new azrn(this.b, d));
        }
        this.c.aU();
    }
}

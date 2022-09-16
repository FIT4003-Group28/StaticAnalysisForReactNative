package defpackage;
/* compiled from: PG */
/* renamed from: anva  reason: default package */
/* loaded from: classes2.dex */
public final class anva implements anvi {
    private final angz a;
    private final anqs b;
    private final arbu c;
    @dzsi
    private final apgq d;

    public anva(angz angzVar, anqs anqsVar, arbu arbuVar, @dzsi apgq apgqVar) {
        this.a = angzVar;
        this.b = anqsVar;
        this.c = arbuVar;
        this.d = apgqVar;
    }

    @Override // defpackage.anvi
    public final void a(anvj anvjVar) {
        this.a.a(anvjVar.b());
        this.c.f().k(this.b.a());
        apgq apgqVar = this.d;
        if (apgqVar != null) {
            apgqVar.h(anvjVar.m().t());
        }
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: slb  reason: default package */
/* loaded from: classes4.dex */
final class slb implements ankb {
    final /* synthetic */ ankt a;
    final /* synthetic */ sld b;

    public slb(sld sldVar, ankt anktVar) {
        this.b = sldVar;
        this.a = anktVar;
    }

    private final void c() {
        synchronized (this.b) {
            this.b.a.remove(this.a);
        }
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        c();
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        c();
    }
}

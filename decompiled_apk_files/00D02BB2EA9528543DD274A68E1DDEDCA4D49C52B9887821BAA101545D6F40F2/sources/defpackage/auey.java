package defpackage;
/* compiled from: PG */
/* renamed from: auey  reason: default package */
/* loaded from: classes.dex */
public final class auey implements auff {
    public final auew a;
    @dzsi
    public aufc b;
    public boolean c;
    public boolean d;
    private final btrm e;
    private boolean f;
    private final auex g;

    public auey(btrm btrmVar) {
        auew auewVar = new auew();
        this.g = new auex(this);
        this.e = btrmVar;
        this.a = auewVar;
    }

    @Override // defpackage.auff
    public final void a(aufc aufcVar) {
        bvrj.UI_THREAD.c();
        this.b = aufcVar;
        btrm btrmVar = this.e;
        auex auexVar = this.g;
        dceq a = dcet.a();
        a.b(amqo.class, new auez(amqo.class, auexVar, bvrj.UI_THREAD));
        btrmVar.g(auexVar, a.a());
    }

    @Override // defpackage.auff
    public final void b() {
        bvrj.UI_THREAD.c();
        this.b = null;
        this.e.a(this.g);
    }

    public final void c(boolean z) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        aufc aufcVar = this.b;
        if (aufcVar == null) {
            return;
        }
        aufcVar.g();
    }

    @Override // defpackage.auff
    public final boolean d() {
        return this.d || this.c;
    }

    @Override // defpackage.auff
    public final boolean e() {
        return this.f;
    }
}

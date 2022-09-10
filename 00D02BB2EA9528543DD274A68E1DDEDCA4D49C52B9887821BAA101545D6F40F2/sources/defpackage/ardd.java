package defpackage;
/* compiled from: PG */
/* renamed from: ardd  reason: default package */
/* loaded from: classes.dex */
public final class ardd implements arcb {
    private final aksp a;
    private final dbty<akta> b;
    private boolean c = false;

    public ardd(aksp akspVar, dbty<akta> dbtyVar) {
        this.a = akspVar;
        this.b = dbtyVar;
    }

    @Override // defpackage.arcb
    public final void a(boolean z) {
        if (z == this.c) {
            return;
        }
        this.c = z;
        if (z) {
            this.a.c(this.b.a());
        } else {
            this.a.d(this.b.a());
        }
    }

    @Override // defpackage.arcb
    public final void b() {
        this.a.d(this.b.a());
        this.a.a(this.b.a());
    }

    public final void c(akra akraVar, float f) {
        aksz d = this.b.a().d();
        d.b(akraVar);
        d.c(f, aksy.WORLD);
        this.b.a().c(d);
    }
}

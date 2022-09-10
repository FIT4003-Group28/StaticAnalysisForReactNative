package defpackage;
/* compiled from: PG */
/* renamed from: bquw  reason: default package */
/* loaded from: classes4.dex */
public final class bquw {
    private final gga a;
    private final gfq b;
    private final ff c;

    public bquw(ff ffVar, gga ggaVar, gfq gfqVar) {
        this.a = ggaVar;
        this.b = gfqVar;
        this.c = ffVar;
    }

    public final void a(@dzsi Class<? extends bqld> cls, bqlf bqlfVar, Class<?> cls2) {
        if (this.a.z(cls2) == null) {
            return;
        }
        if (cls == null || this.b.f(cls) < 0) {
            this.c.g().e();
            return;
        }
        gfq gfqVar = this.b;
        this.c.g().h(gfqVar.h(gfqVar.f(cls)), 0);
        fd d = this.b.d();
        if (!(d instanceof bqld)) {
            return;
        }
        ((bqld) d).aS(bqlfVar);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: evn  reason: default package */
/* loaded from: classes3.dex */
public final class evn {
    public final yni a;
    private final acvp b;
    private final asxj c;

    public evn(yni yniVar, acvp acvpVar, aacz aaczVar) {
        this.a = yniVar;
        this.b = acvpVar;
        asxj asxjVar = aaczVar.b().e;
        this.c = asxjVar == null ? asxj.a : asxjVar;
    }

    public final void a() {
        if (this.c.E) {
            if (!this.b.j(evd.class)) {
                return;
            }
            this.a.d(new evy());
            return;
        }
        b();
    }

    public final void b() {
        if (this.b.j(evd.class)) {
            this.a.d(new evw());
        }
    }

    public final void c() {
        this.a.d(new exi());
    }

    public final void d() {
        this.a.d(new exj());
    }
}

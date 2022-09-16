package defpackage;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: akvm  reason: default package */
/* loaded from: classes.dex */
public final class akvm {
    public final vpl a;
    public final vpj b;
    public final amqo c;
    public final amqo d;
    public final amqo e;
    public final amqo f;
    public final amqo g;
    public final amqo h;
    public final amqo i;
    public final amqo j;
    public final amqo k;
    public final amqo l;
    public final amqo m;
    public final amqo n;
    public final amqo o;
    public final amqo p;
    public final amqo q;
    private final amqo r;
    private final amqo s;
    private final amqo t;
    private final amqo u;
    private final amqo v;

    public akvm(ScheduledExecutorService scheduledExecutorService, vpm vpmVar) {
        aqxo.i(new akvk(this, 1));
        this.c = aqxo.i(new akvk(this, 11));
        this.d = aqxo.i(new akvk(this, 3));
        this.e = aqxo.i(new akvk(this, 10));
        this.f = aqxo.i(new akvk(this, 12));
        aqxo.i(new akvk(this, 13));
        aqxo.i(new akvk(this, 14));
        this.r = aqxo.i(new akvk(this, 15));
        this.s = aqxo.i(new akvk(this, 16));
        aqxo.i(new akvk(this, 17));
        this.g = aqxo.i(new akvk(this, 18));
        aqxo.i(new akvk(this, 19));
        aqxo.i(new akvk(this, 20));
        this.t = aqxo.i(new akvl(this, 1));
        this.h = aqxo.i(new akvl(this));
        this.i = aqxo.i(new akvl(this, 2));
        this.j = aqxo.i(new akvl(this, 3));
        this.k = aqxo.i(new akvl(this, 4));
        this.l = aqxo.i(new akvk(this));
        this.m = aqxo.i(new akvk(this, 2));
        this.n = aqxo.i(new akvk(this, 4));
        this.o = aqxo.i(new akvk(this, 5));
        this.p = aqxo.i(new akvk(this, 6));
        this.u = aqxo.i(new akvk(this, 7));
        this.v = aqxo.i(new akvk(this, 8));
        this.q = aqxo.i(new akvk(this, 9));
        vpl c = vpl.c("youtube_android");
        this.a = c;
        vpj vpjVar = c.a;
        if (vpjVar == null) {
            this.b = vpq.a(vpmVar, scheduledExecutorService, c, null);
            return;
        }
        this.b = vpjVar;
        ((vpq) vpjVar).b = vpmVar;
    }

    public final void a(boolean z, String str) {
        ((vpg) this.s.get()).b(Boolean.valueOf(z), str);
    }

    public final void b(String str, String str2, boolean z) {
        ((vpg) this.r.get()).b(str, str2, Boolean.valueOf(z));
    }

    public final void c(String str, String str2) {
        ((vpg) this.t.get()).b(str, str2);
    }

    public final void d(String str) {
        ((vpg) this.u.get()).b(str);
    }

    public final void e(String str) {
        ((vpg) this.v.get()).b(str);
    }

    public final void f(boolean z) {
        vpq vpqVar = (vpq) this.b;
        vpqVar.e = z;
        if (!z) {
            vpqVar.b();
        }
    }
}

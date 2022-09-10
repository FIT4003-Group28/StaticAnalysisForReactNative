package defpackage;
/* compiled from: PG */
/* renamed from: avph  reason: default package */
/* loaded from: classes3.dex */
public final class avph {
    public static final eaow a = eaow.a(1);
    static final eaow b = eaow.c(5);
    public final dehq c;
    public final awar d;
    public final akfa e;
    public final awfh f;
    public final bvjj g;
    public final cqat h;
    public long i;
    @dzsi
    avoy j;
    private final avpe k;

    public avph(avpe avpeVar, dehq dehqVar, awar awarVar, akfa akfaVar, awfh awfhVar, bvjj bvjjVar, cqat cqatVar) {
        this.k = avpeVar;
        this.c = dehqVar;
        this.d = awarVar;
        this.e = akfaVar;
        this.f = awfhVar;
        this.g = bvjjVar;
        this.h = cqatVar;
    }

    public final synchronized void a() {
        if (this.j != null) {
            return;
        }
        avpg avpgVar = new avpg(this);
        this.j = avpgVar;
        avpe avpeVar = this.k;
        avpeVar.g.a(avpgVar, this.c);
        this.i = this.h.b();
    }

    public final synchronized void b() {
        avoy avoyVar = this.j;
        if (avoyVar == null) {
            return;
        }
        this.k.e(avoyVar);
        this.j = null;
    }
}

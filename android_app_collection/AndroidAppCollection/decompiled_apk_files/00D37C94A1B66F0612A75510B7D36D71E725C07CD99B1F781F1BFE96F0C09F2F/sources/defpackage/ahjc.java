package defpackage;
/* compiled from: PG */
/* renamed from: ahjc  reason: default package */
/* loaded from: classes.dex */
public final class ahjc {
    private final snc a;
    private final acvh b;
    private final zfq c;
    private final aadd d;
    private boolean e;
    private long f;
    private ampq g = amon.a;

    public ahjc(snc sncVar, acvh acvhVar, zfq zfqVar, aadd aaddVar) {
        sncVar.getClass();
        this.a = sncVar;
        acvhVar.getClass();
        this.b = acvhVar;
        zfqVar.getClass();
        this.c = zfqVar;
        aaddVar.getClass();
        this.d = aaddVar;
    }

    public final synchronized void a() {
        this.f = this.a.c();
        this.e = true;
    }

    public final void b(ahgm ahgmVar) {
        if (this.e) {
            synchronized (this) {
                zfq zfqVar = this.c;
                aadd aaddVar = this.d;
                double a = zfqVar.a(0.0d, 1.0d);
                arhd a2 = aaddVar.a();
                float f = 0.1f;
                if (a2 != null && (a2.b & 32768) != 0) {
                    auaf auafVar = a2.j;
                    if (auafVar == null) {
                        auafVar = auaf.a;
                    }
                    if ((auafVar.c & 16) != 0) {
                        f = auafVar.R;
                    }
                }
                if (a < f) {
                    acvh acvhVar = this.b;
                    long j = this.f;
                    ampq ampqVar = this.g;
                    if (ampqVar.h()) {
                        ahgs ahgsVar = (ahgs) ampqVar.c();
                        acvg c = acvhVar.c(asny.LATENCY_ACTION_PLAYER_SEEK);
                        c.f(j);
                        ((acvb) c).b(ahgsVar.f(), ahgsVar.a());
                        ((acvb) c).b(ahgmVar.f(), ahgmVar.a());
                    }
                }
            }
            d();
        }
    }

    public final synchronized void c(ahgs ahgsVar) {
        if (this.e) {
            this.g = ampq.j(ahgsVar);
        }
    }

    public final synchronized void d() {
        this.e = false;
        this.g = amon.a;
    }
}

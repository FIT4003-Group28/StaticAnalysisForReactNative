package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crsc  reason: default package */
/* loaded from: classes5.dex */
public final class crsc implements crgy {
    private static final long c = TimeUnit.SECONDS.toMillis(30);
    public final btrm a;
    public boolean b;
    private final crrz d;
    private final crsb e;

    public crsc(btrm btrmVar, cqat cqatVar) {
        crsb crsbVar = new crsb(this);
        this.e = crsbVar;
        this.a = btrmVar;
        this.d = new crrz(btrmVar, cqatVar, c, crsbVar);
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        this.b = false;
        crrz crrzVar = this.d;
        synchronized (crrzVar.c) {
            crrzVar.c.clear();
            crrzVar.f = 0.0f;
            crrzVar.e = false;
        }
        btrm btrmVar = crrzVar.a;
        dceq a = dcet.a();
        a.b(amqo.class, new crsa(amqo.class, crrzVar));
        btrmVar.g(crrzVar, a.a());
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        crrz crrzVar = this.d;
        crrzVar.a.a(crrzVar);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: szx  reason: default package */
/* loaded from: classes4.dex */
public final class szx implements tct {
    private final axnm a;
    private final boolean b;
    private final ayor c;

    public szx(axnm axnmVar, ampq ampqVar, ayor ayorVar) {
        this.a = axnmVar;
        this.b = ((Boolean) ampqVar.e(false)).booleanValue();
        this.c = ayorVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return awog.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        awog awogVar = (awog) obj;
        tcu tcuVar = (tcu) this.a.get();
        if (awogVar.c.size() <= 0) {
            return aynr.f();
        }
        if (!this.b) {
            return aynr.z(aynx.y(awogVar.c).C(new szw(tcuVar, tcsVar)));
        }
        aynx y = aynx.y(awogVar.c);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int i = aynx.a;
        ayrd.c(availableProcessors, "parallelism");
        ayrd.c(i, "prefetch");
        azka azkaVar = new azka(y, availableProcessors, i);
        azqc.h();
        ayor ayorVar = this.c;
        int i2 = aynx.a;
        ayrd.c(i2, "prefetch");
        azkj azkjVar = new azkj(azkaVar, ayorVar, i2);
        azqc.h();
        szw szwVar = new szw(tcuVar, tcsVar, 1);
        int i3 = aynx.a;
        ayrd.c(Integer.MAX_VALUE, "maxConcurrency");
        ayrd.c(i3, "prefetch");
        azjx azjxVar = new azjx(azkjVar, szwVar, i3);
        azqc.h();
        int i4 = aynx.a;
        ayrd.c(i4, "prefetch");
        azke azkeVar = new azke(azjxVar, i4);
        azqc.j();
        ayxh ayxhVar = new ayxh(azkeVar);
        azqc.g();
        return ayxhVar;
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}

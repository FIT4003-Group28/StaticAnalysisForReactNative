package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ifn  reason: default package */
/* loaded from: classes3.dex */
public final class ifn {
    public final ailf a;
    public final Executor b;
    public final afmt c;
    private final amqo d;
    private final ifk e;

    public ifn(airw airwVar, amqo amqoVar, ifk ifkVar, Executor executor, afmt afmtVar) {
        this.a = airwVar.x();
        this.d = amqoVar;
        this.e = ifkVar;
        this.b = executor;
        this.c = afmtVar;
    }

    public final aijp a(String str, afmv afmvVar) {
        acvg acvgVar;
        boolean f = ifu.f((aull) this.d.get());
        ifk ifkVar = this.e;
        str.getClass();
        synchronized (ifkVar.b) {
            acvgVar = (acvg) ifkVar.b.get(str);
            if (acvgVar == null) {
                acvgVar = ifkVar.a.c(asny.LATENCY_ACTION_REEL_WATCH);
            }
            ifkVar.b.put(str, acvgVar);
        }
        return ifu.a(acvgVar, f, false, afmvVar);
    }
}

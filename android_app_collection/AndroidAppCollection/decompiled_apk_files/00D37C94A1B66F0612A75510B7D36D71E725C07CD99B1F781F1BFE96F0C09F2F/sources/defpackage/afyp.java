package defpackage;

import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: afyp  reason: default package */
/* loaded from: classes.dex */
final class afyp implements afyo {
    private final awvn a;
    private final ankx b;
    private final afym c;
    private final AtomicInteger d;
    private final snc e;

    public afyp(ankx ankxVar, afyn afynVar, snc sncVar, awvn awvnVar) {
        this.a = awvnVar;
        this.b = ankxVar;
        aqxk aqxkVar = afym.a;
        axnm axnmVar = ((axoz) afynVar.a).get();
        axnmVar.getClass();
        aqxkVar.getClass();
        this.c = new afym(axnmVar, aqxkVar);
        this.d = new AtomicInteger(0);
        this.e = sncVar;
    }

    @Override // defpackage.afyo
    public final ankt a() {
        aqxk aqxkVar;
        if (!this.a.c) {
            return anlz.q(awvm.ACTION_TYPE_GIVE_UP);
        }
        afym afymVar = this.c;
        int andIncrement = this.d.getAndIncrement();
        double d = afymVar.b.c;
        double pow = Math.pow(aqxkVar.d, Math.max(0, andIncrement - 1));
        Double.isNaN(d);
        double min = Math.min(aqxkVar.e, d * pow);
        float nextFloat = afymVar.b.f * (((SecureRandom) afymVar.c.get()).nextFloat() - 0.5f);
        double d2 = nextFloat + nextFloat;
        Double.isNaN(d2);
        long round = Math.round(d2 * min);
        int i = afymVar.b.e;
        double d3 = round;
        Double.isNaN(d3);
        long min2 = Math.min(i, (int) (min + d3));
        aorw aorwVar = this.a.d;
        if (aorwVar == null) {
            aorwVar = aorw.a;
        }
        if (this.e.c() + min2 > aosw.b(aorwVar)) {
            return anlz.q(awvm.ACTION_TYPE_GIVE_UP);
        }
        return this.b.c(gbb.t, min2, TimeUnit.MILLISECONDS);
    }
}

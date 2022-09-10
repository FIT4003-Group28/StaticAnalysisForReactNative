package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aiff  reason: default package */
/* loaded from: classes2.dex */
final class aiff extends aifn {
    public aiff(long j, TimeInterpolator timeInterpolator) {
        super(j, timeInterpolator);
    }

    @Override // defpackage.aifn
    public final void a(aifp aifpVar, aifq aifqVar, aifq aifqVar2, float f) {
        double c = aifqVar.a().c();
        double d = f;
        double c2 = aifqVar2.a().c();
        double c3 = aifqVar.a().c();
        double d2 = aifqVar.a().d();
        double d3 = aifqVar2.a().d();
        double d4 = aifqVar.a().d();
        akra h = aifpVar.h();
        Double.isNaN(d);
        Double.isNaN(d);
        h.u(c + ((c2 - c3) * d), d2 + (d * (d3 - d4)));
    }
}

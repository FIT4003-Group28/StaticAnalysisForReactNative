package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aieh  reason: default package */
/* loaded from: classes2.dex */
final class aieh extends aifn {
    public aieh(long j, TimeInterpolator timeInterpolator) {
        super(j, timeInterpolator);
    }

    @Override // defpackage.aifn
    public final void a(aifp aifpVar, aifq aifqVar, aifq aifqVar2, float f) {
        aiek aiekVar = (aiek) aifqVar.g(aiek.class);
        aiek aiekVar2 = (aiek) ((aifx) aiek.class.cast(aifpVar.f.get(aiek.class)));
        dbsk.s(aiekVar2);
        aiej b = aiekVar2.b();
        double a = aiekVar.a();
        double d = f;
        Double.isNaN(d);
        b.b(a + (d * (((aiek) aifqVar2.g(aiek.class)).a() - aiekVar.a())));
        aifpVar.j(aiek.class, b.a());
    }
}

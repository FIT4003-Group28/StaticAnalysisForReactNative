package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aifg  reason: default package */
/* loaded from: classes2.dex */
final class aifg extends aifn {
    public aifg(long j, TimeInterpolator timeInterpolator) {
        super(j, timeInterpolator);
    }

    @Override // defpackage.aifn
    public final void a(aifp aifpVar, aifq aifqVar, aifq aifqVar2, float f) {
        aifpVar.f(aifqVar.b() + (f * (aifqVar2.b() - aifqVar.b())));
    }
}

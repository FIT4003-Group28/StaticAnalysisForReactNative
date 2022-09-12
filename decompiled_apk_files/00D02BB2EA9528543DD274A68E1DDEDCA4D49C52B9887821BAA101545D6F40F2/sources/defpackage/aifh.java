package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aifh  reason: default package */
/* loaded from: classes2.dex */
final class aifh extends aifn {
    public aifh(long j, TimeInterpolator timeInterpolator) {
        super(j, timeInterpolator);
    }

    @Override // defpackage.aifn
    public final void a(aifp aifpVar, aifq aifqVar, aifq aifqVar2, float f) {
        aifpVar.b(aifqVar.c() + (f * (aifqVar2.c() - aifqVar.c())));
    }
}

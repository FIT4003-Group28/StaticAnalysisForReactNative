package defpackage;

import android.animation.TimeInterpolator;
/* compiled from: PG */
/* renamed from: aifr  reason: default package */
/* loaded from: classes2.dex */
final class aifr extends aifn {
    public aifr(TimeInterpolator timeInterpolator) {
        super(0L, timeInterpolator);
    }

    @Override // defpackage.aifn
    public final void a(aifp aifpVar, aifq aifqVar, aifq aifqVar2, float f) {
        aifw aifwVar;
        if (f > 0.0f) {
            aifwVar = (aifw) aifqVar2.h(aifw.class);
        } else {
            aifwVar = (aifw) aifqVar.h(aifw.class);
        }
        aifpVar.j(aifw.class, aifwVar);
    }
}

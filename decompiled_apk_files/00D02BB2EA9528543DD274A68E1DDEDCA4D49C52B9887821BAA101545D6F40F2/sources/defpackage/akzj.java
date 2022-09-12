package defpackage;

import android.animation.TypeEvaluator;
/* compiled from: PG */
/* renamed from: akzj  reason: default package */
/* loaded from: classes.dex */
final class akzj implements TypeEvaluator<akra> {
    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ akra evaluate(float f, akra akraVar, akra akraVar2) {
        akra akraVar3 = akraVar2;
        return f == 1.0f ? akraVar3 : akraVar.I(akraVar3, f);
    }
}

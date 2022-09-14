package defpackage;

import android.graphics.Matrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czzs  reason: default package */
/* loaded from: classes5.dex */
public final class czzs extends czuq {
    final /* synthetic */ daaa a;

    public czzs(daaa daaaVar) {
        this.a = daaaVar;
    }

    @Override // defpackage.czuq
    public final Matrix a(float f, Matrix matrix, Matrix matrix2) {
        this.a.s = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.czuq, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        return evaluate(f, matrix, matrix2);
    }
}

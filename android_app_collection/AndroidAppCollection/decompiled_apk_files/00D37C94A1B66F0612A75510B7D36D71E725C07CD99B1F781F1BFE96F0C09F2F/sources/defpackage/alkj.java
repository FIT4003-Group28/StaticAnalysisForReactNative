package defpackage;

import android.graphics.Matrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alkj  reason: default package */
/* loaded from: classes.dex */
public final class alkj extends alhx {
    final /* synthetic */ alkr a;

    public alkj(alkr alkrVar) {
        this.a = alkrVar;
    }

    @Override // defpackage.alhx
    public final Matrix a(float f, Matrix matrix, Matrix matrix2) {
        this.a.u = f;
        return super.evaluate(f, matrix, matrix2);
    }

    @Override // defpackage.alhx, android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}

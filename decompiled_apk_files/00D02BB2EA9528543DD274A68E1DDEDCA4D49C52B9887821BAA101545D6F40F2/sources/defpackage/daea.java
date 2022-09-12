package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
/* compiled from: PG */
/* renamed from: daea  reason: default package */
/* loaded from: classes.dex */
final class daea extends daeg {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public daea(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.daeg
    public final void a(Matrix matrix, dadh dadhVar, int i, Canvas canvas) {
        for (daeg daegVar : this.a) {
            daegVar.a(this.b, dadhVar, i, canvas);
        }
    }
}

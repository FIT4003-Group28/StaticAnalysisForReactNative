package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
/* compiled from: PG */
/* renamed from: alnf  reason: default package */
/* loaded from: classes.dex */
final class alnf extends alnl {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public alnf(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.alnl
    public final void a(Matrix matrix, almp almpVar, int i, Canvas canvas) {
        for (alnl alnlVar : this.a) {
            alnlVar.a(this.b, almpVar, i, canvas);
        }
    }
}

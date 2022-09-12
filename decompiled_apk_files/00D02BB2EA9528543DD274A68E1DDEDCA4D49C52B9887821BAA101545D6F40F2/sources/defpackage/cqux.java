package defpackage;

import android.content.Context;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
/* compiled from: PG */
/* renamed from: cqux  reason: default package */
/* loaded from: classes5.dex */
final class cqux extends cquv {
    final /* synthetic */ cqtv a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqux(Object[] objArr, cqtv cqtvVar, boolean z, boolean z2, boolean z3, boolean z4) {
        super(objArr);
        this.a = cqtvVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // defpackage.cquv
    public final Shape a(Context context) {
        float e = this.a.e(context);
        float[] fArr = new float[8];
        float f = true != this.b ? 0.0f : e;
        fArr[0] = f;
        fArr[1] = f;
        float f2 = true != this.c ? 0.0f : e;
        fArr[2] = f2;
        fArr[3] = f2;
        float f3 = true != this.d ? 0.0f : e;
        fArr[4] = f3;
        fArr[5] = f3;
        if (true != this.e) {
            e = 0.0f;
        }
        fArr[6] = e;
        fArr[7] = e;
        return new RoundRectShape(fArr, null, null);
    }
}

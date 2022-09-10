package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.Shape;
/* compiled from: PG */
/* renamed from: kpa  reason: default package */
/* loaded from: classes7.dex */
final class kpa extends cquv {
    public kpa(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cquv
    public final Shape a(Context context) {
        float a = kpb.a.a(context);
        float a2 = kpb.b.a(context);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        if (bvox.b(context)) {
            path.moveTo(0.0f, a2);
            path.lineTo(a, a2 / 2.0f);
            path.lineTo(0.0f, 0.0f);
        } else {
            path.moveTo(a, a2);
            path.lineTo(0.0f, a2 / 2.0f);
            path.lineTo(a, 0.0f);
        }
        path.close();
        return new PathShape(path, a, a2);
    }
}

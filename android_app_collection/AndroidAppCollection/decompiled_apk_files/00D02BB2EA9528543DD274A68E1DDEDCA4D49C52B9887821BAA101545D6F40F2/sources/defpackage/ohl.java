package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: ohl  reason: default package */
/* loaded from: classes7.dex */
final class ohl implements cqjb<oxq, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(oxq oxqVar, Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        float min = Math.min(cqrp.d(600.0d).a(context), point.x);
        return Integer.valueOf((int) ((min + min) / 3.0f));
    }
}

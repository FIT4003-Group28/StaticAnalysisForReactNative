package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: onh  reason: default package */
/* loaded from: classes7.dex */
final class onh implements cqjb<jba, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(jba jbaVar, Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return Integer.valueOf((int) (point.x * 0.42857143f));
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: bwko  reason: default package */
/* loaded from: classes4.dex */
final class bwko implements cqjb<bwob, cqtv> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ cqtv a(bwob bwobVar, Context context) {
        Point point;
        float f;
        if (bwobVar.t().booleanValue() && cqhl.c(context)) {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(new Point());
            if ((point.x / context.getResources().getDisplayMetrics().density) - 600.0f > 0.0f) {
                return cqrp.d(f / 2.0f);
            }
        }
        return cqrp.d(dcyn.a);
    }
}

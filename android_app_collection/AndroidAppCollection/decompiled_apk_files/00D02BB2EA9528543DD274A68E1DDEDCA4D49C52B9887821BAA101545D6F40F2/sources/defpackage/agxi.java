package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: agxi  reason: default package */
/* loaded from: classes2.dex */
final class agxi extends cqsz {
    @Override // defpackage.cqtv
    public final float a(Context context) {
        Point point;
        float f;
        if (!cqhl.d(context) && !cqhl.b(context)) {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(new Point());
            if ((point.x / context.getResources().getDisplayMetrics().density) - 570.0f > 0.0f) {
                return cqrp.d(Math.max(f / 2.0f, 20.0f)).a(context);
            }
        }
        return 0.0f;
    }
}

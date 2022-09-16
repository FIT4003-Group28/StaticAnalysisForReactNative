package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* renamed from: beky  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class beky implements cqjb {
    static final cqjb a = new beky();

    private beky() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        benw benwVar = (benw) cqkpVar;
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return Boolean.valueOf(((int) (((float) point.x) / context.getResources().getDisplayMetrics().density)) >= 356);
    }
}

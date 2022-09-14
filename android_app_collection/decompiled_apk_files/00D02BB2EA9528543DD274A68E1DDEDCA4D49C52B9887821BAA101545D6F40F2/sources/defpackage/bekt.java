package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* renamed from: bekt  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bekt implements cqjb {
    static final cqjb a = new bekt();

    private bekt() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        bens bensVar = (bens) cqkpVar;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        boolean z = true;
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            if (((int) (point.x / context.getResources().getDisplayMetrics().density)) < 356) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return true;
    }
}

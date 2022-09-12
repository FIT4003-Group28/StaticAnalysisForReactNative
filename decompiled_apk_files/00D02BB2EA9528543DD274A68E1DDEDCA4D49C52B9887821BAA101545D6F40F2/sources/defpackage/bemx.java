package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* renamed from: bemx  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bemx implements cqjb {
    static final cqjb a = new bemx();

    private bemx() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        benv benvVar = (benv) cqkpVar;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        boolean z = true;
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            if (((int) (point.x / context.getResources().getDisplayMetrics().density)) < 355) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return true;
    }
}

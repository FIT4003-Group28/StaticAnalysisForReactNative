package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* renamed from: bavh  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bavh implements cqjb {
    static final cqjb a = new bavh();

    private bavh() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = bavs.a;
        boolean z = false;
        if (cqjv.v(((baye) cqkpVar).g()).booleanValue()) {
            return false;
        }
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        if (((int) (point.y / context.getResources().getDisplayMetrics().density)) >= 530) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

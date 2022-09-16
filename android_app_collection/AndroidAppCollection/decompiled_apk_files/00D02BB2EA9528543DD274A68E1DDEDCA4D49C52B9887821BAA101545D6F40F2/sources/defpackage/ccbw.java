package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: ccbw  reason: default package */
/* loaded from: classes4.dex */
final class ccbw extends aag {
    private final int a;

    public ccbw(Context context) {
        super(0, false);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            this.a = -1;
            return;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.a = Math.max(point.x, point.y) * 5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aag
    public final void K(aci aciVar, int[] iArr) {
        int i = this.a;
        if (i != -1) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        super.K(aciVar, iArr);
    }
}

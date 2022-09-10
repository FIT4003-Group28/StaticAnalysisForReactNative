package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: bcko  reason: default package */
/* loaded from: classes3.dex */
final class bcko implements cqjb<bcmg, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(bcmg bcmgVar, Context context) {
        bcmg bcmgVar2 = bcmgVar;
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        int i = (int) (point.y / context.getResources().getDisplayMetrics().density);
        boolean z = true;
        if (i < 530 || (bcmgVar2.b() == null && bcmgVar2.c() == null)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

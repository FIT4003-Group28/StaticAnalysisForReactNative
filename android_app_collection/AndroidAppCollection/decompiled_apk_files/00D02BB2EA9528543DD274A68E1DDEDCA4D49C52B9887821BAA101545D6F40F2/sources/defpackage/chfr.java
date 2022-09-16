package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: chfr  reason: default package */
/* loaded from: classes4.dex */
final class chfr implements cqjb<chmz, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(chmz chmzVar, Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return Boolean.valueOf(((int) (((float) point.y) / context.getResources().getDisplayMetrics().density)) > 570);
    }
}

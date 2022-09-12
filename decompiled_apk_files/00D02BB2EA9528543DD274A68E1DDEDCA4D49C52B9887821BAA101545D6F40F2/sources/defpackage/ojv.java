package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: ojv  reason: default package */
/* loaded from: classes7.dex */
final class ojv implements cqjb {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return Integer.valueOf((int) ((point.x * 3.0f) / 8.0f));
    }
}

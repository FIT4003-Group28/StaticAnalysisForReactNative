package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
/* renamed from: aicw  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aicw implements dbty {
    static final dbty a = new aicw();

    private aicw() {
    }

    @Override // defpackage.dbty
    public final Object a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.rgb(66, 133, 244));
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }
}

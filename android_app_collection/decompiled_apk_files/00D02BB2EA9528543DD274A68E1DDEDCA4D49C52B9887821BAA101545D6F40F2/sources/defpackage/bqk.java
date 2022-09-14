package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqk  reason: default package */
/* loaded from: classes4.dex */
public final class bqk extends View {
    private final Paint a;

    public bqk(Context context) {
        super(context);
        Paint paint = new Paint();
        this.a = paint;
        Resources resources = context.getResources();
        resources.getColor(17170443);
        resources.getColor(R.color.numbers_text_color);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getWidth();
    }
}

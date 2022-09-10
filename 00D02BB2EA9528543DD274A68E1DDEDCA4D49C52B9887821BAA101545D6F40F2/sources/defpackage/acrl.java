package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acrl  reason: default package */
/* loaded from: classes2.dex */
public final class acrl extends cpsb<Double> {
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public acrl(Activity activity) {
        Resources resources = activity.getResources();
        this.d = acpe.b(resources, 4);
        this.e = acpe.b(resources, 2);
        this.b = resources.getColor(R.color.qu_daynight_grey_600);
        this.c = resources.getColor(R.color.qu_daynight_grey_400);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cpsb, defpackage.cprz
    public final void d(Canvas canvas, cpry<Double> cpryVar, Rect rect, Rect rect2, int i, Paint paint) {
        int i2;
        CharSequence charSequence = cpryVar.b;
        boolean z = false;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        }
        int i3 = z ? this.d : this.e;
        if (z) {
            i2 = this.b;
        } else {
            i2 = this.c;
        }
        Paint paint2 = new Paint(paint);
        paint2.setColor(i2);
        float round = Math.round(cpryVar.e);
        canvas.drawLine(round, rect.top + i3, round, rect.top, paint2);
    }
}

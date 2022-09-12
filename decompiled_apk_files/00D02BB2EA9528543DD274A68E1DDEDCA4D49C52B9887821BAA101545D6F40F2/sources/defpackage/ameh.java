package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
/* compiled from: PG */
/* renamed from: ameh  reason: default package */
/* loaded from: classes.dex */
final class ameh {
    public static final Rect a(String str, float f, Typeface typeface) {
        Rect rect = new Rect();
        if (dbsj.d(str)) {
            return rect;
        }
        Paint paint = new Paint();
        paint.setTextSize(f);
        paint.setTypeface(typeface);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect;
    }
}

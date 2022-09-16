package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class e extends b {
    private ReadableMap L;
    private int M = 0;

    private void a(Paint paint) {
        Paint.Align align;
        ReadableMap readableMap;
        ReadableMap mo210getMap;
        int i = this.M;
        int i2 = 2;
        if (i == 0) {
            align = Paint.Align.LEFT;
        } else if (i != 1) {
            if (i == 2) {
                align = Paint.Align.CENTER;
            }
            readableMap = this.L;
            if (readableMap != null || !readableMap.hasKey("font") || (mo210getMap = this.L.mo210getMap("font")) == null) {
                return;
            }
            float f2 = 12.0f;
            if (mo210getMap.hasKey("fontSize")) {
                f2 = (float) mo210getMap.getDouble("fontSize");
            }
            paint.setTextSize(f2 * this.B);
            boolean z = mo210getMap.hasKey("fontWeight") && "bold".equals(mo210getMap.getString("fontWeight"));
            boolean z2 = mo210getMap.hasKey("fontStyle") && "italic".equals(mo210getMap.getString("fontStyle"));
            if (z && z2) {
                i2 = 3;
            } else if (z) {
                i2 = 1;
            } else if (!z2) {
                i2 = 0;
            }
            paint.setTypeface(Typeface.create(mo210getMap.getString("fontFamily"), i2));
            return;
        } else {
            align = Paint.Align.RIGHT;
        }
        paint.setTextAlign(align);
        readableMap = this.L;
        if (readableMap != null) {
        }
    }

    @Override // com.facebook.react.views.art.b, com.facebook.react.views.art.f
    public void a(Canvas canvas, Paint paint, float f2) {
        ReadableArray array;
        ReadableMap readableMap = this.L;
        if (readableMap == null) {
            return;
        }
        float f3 = f2 * this.z;
        if (f3 <= 0.01f || !readableMap.hasKey("lines") || (array = this.L.getArray("lines")) == null || array.size() == 0) {
            return;
        }
        b(canvas);
        String[] strArr = new String[array.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = array.getString(i);
        }
        String join = TextUtils.join("\n", strArr);
        if (b(paint, f3)) {
            a(paint);
            Path path = this.E;
            if (path == null) {
                canvas.drawText(join, 0.0f, -paint.ascent(), paint);
            } else {
                canvas.drawTextOnPath(join, path, 0.0f, 0.0f, paint);
            }
        }
        if (a(paint, f3)) {
            a(paint);
            Path path2 = this.E;
            if (path2 == null) {
                canvas.drawText(join, 0.0f, -paint.ascent(), paint);
            } else {
                canvas.drawTextOnPath(join, path2, 0.0f, 0.0f, paint);
            }
        }
        a(canvas);
        e();
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.M = i;
    }

    @com.facebook.react.uimanager.e1.a(name = "frame")
    public void setFrame(ReadableMap readableMap) {
        this.L = readableMap;
    }
}

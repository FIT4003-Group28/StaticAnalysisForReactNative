package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.LruCache;
import com.google.geo.imagery.viewer.api.Text;
import com.google.geo.imagery.viewer.api.TextRequest;
import com.google.geo.imagery.viewer.api.TextRequestContainer;
import com.google.geo.imagery.viewer.api.TextService;
import com.google.geo.imagery.viewer.api.TextServiceSwigJNI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfue  reason: default package */
/* loaded from: classes6.dex */
public final class dfue extends TextService {
    public static final dbtm b = dbtm.a('\n').f();
    public final TextPaint c;
    public final LruCache<Integer, Bitmap> d = new LruCache<>(20);
    public final dfuh e;
    private final Executor f;

    public dfue(dfuh dfuhVar, Executor executor) {
        this.e = dfuhVar;
        this.f = executor;
        TextPaint textPaint = new TextPaint(65);
        this.c = textPaint;
        textPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextSize(8.0f);
    }

    @Override // com.google.geo.imagery.viewer.api.TextService
    public final void request(TextRequest textRequest) {
        final Text text;
        final TextRequestContainer textRequestContainer = new TextRequestContainer(TextServiceSwigJNI.new_RequestContainer(TextRequest.a(textRequest), textRequest));
        byte[] TextRequestContainer_rawRequest = TextServiceSwigJNI.TextRequestContainer_rawRequest(textRequestContainer.a, textRequestContainer);
        if (TextRequestContainer_rawRequest == null) {
            text = null;
        } else {
            try {
                text = (Text) dsqw.cq(Text.k, TextRequestContainer_rawRequest);
            } catch (dsrm e) {
                throw new RuntimeException("Unable to parse com.google.geo.imagery.viewer.api.Text protocol message.", e);
            }
        }
        if (text.b.isEmpty()) {
            textRequestContainer.b(null);
            return;
        }
        this.f.execute(new Runnable(this, text, textRequestContainer) { // from class: dfud
            private final dfue a;
            private final Text b;
            private final TextRequestContainer c;

            {
                this.a = this;
                this.b = text;
                this.c = textRequestContainer;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextRequestContainer textRequestContainer2;
                int i;
                int i2;
                float f;
                dfue dfueVar = this.a;
                Text text2 = this.b;
                TextRequestContainer textRequestContainer3 = this.c;
                int i3 = text2.bC;
                if (i3 == 0) {
                    i3 = dsst.a.b(text2).c(text2);
                    text2.bC = i3;
                }
                Bitmap bitmap = dfueVar.d.get(Integer.valueOf(i3));
                if (bitmap == null) {
                    dfueVar.c.setTextSize(text2.c);
                    boolean z = text2.f;
                    boolean z2 = text2.g;
                    if (z && z2) {
                        dfueVar.c.setTypeface(Typeface.create(Typeface.DEFAULT, 3));
                    } else if (z) {
                        dfueVar.c.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    } else if (z2) {
                        dfueVar.c.setTypeface(Typeface.create(Typeface.DEFAULT, 2));
                    } else {
                        dfueVar.c.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
                    }
                    List<String> i4 = dfue.b.i(text2.b);
                    ArrayList arrayList = new ArrayList(i4.size());
                    float f2 = 0.0f;
                    for (String str : i4) {
                        float measureText = dfueVar.c.measureText(str);
                        arrayList.add(Float.valueOf(measureText));
                        f2 = Math.max(f2, measureText);
                    }
                    float f3 = text2.e;
                    double ceil = Math.ceil(f2);
                    double d = f3;
                    float f4 = f2;
                    int ceil2 = (int) Math.ceil(d);
                    double ceil3 = Math.ceil(dfueVar.c.descent());
                    int i5 = i3;
                    double floor = Math.floor(dfueVar.c.ascent());
                    int ceil4 = (int) Math.ceil(d);
                    Bitmap createBitmap = Bitmap.createBitmap(((int) ceil) + ceil2 + ceil2, i4.size() * ((((int) ceil3) - ((int) floor)) + ceil4 + ceil4), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    createBitmap.eraseColor(text2.h);
                    float f5 = f3;
                    dfueVar.c.setStrokeWidth(f5);
                    int i6 = 0;
                    while (i6 < i4.size()) {
                        float floatValue = f5 + ((f4 - ((Float) arrayList.get(i6)).floatValue()) / 2.0f);
                        float ascent = ((i6 * i) + f5) - dfueVar.c.ascent();
                        if (f5 > 0.0f) {
                            dfueVar.c.setColor(text2.i);
                            dfueVar.c.setStyle(Paint.Style.STROKE);
                            i2 = i6;
                            f = f5;
                            canvas.drawText(i4.get(i6), 0, i4.get(i6).length(), floatValue, ascent, (Paint) dfueVar.c);
                        } else {
                            i2 = i6;
                            f = f5;
                        }
                        dfueVar.c.setColor(text2.j);
                        dfueVar.c.setStyle(Paint.Style.FILL);
                        canvas.drawText(i4.get(i2), 0, i4.get(i2).length(), floatValue, ascent, (Paint) dfueVar.c);
                        i6 = i2 + 1;
                        f5 = f;
                    }
                    dfueVar.d.put(Integer.valueOf(i5), createBitmap);
                    bitmap = createBitmap;
                    textRequestContainer2 = textRequestContainer3;
                } else {
                    textRequestContainer2 = textRequestContainer3;
                }
                textRequestContainer2.b(bitmap);
                dfueVar.e.a();
            }
        });
    }
}

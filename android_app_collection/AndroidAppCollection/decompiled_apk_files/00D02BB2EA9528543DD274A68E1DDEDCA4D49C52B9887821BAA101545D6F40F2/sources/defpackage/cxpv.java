package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxpv  reason: default package */
/* loaded from: classes5.dex */
public final class cxpv {
    public final Context a;
    public int b;
    public int c;
    public chw e;
    public int f;
    public Bitmap g;
    public chv<Bitmap> h;
    public cxps l;
    public final Paint d = new Paint(1);
    public final Paint[] i = {new Paint(1), new Paint(1), new Paint(1), new Paint(1)};
    public final Bitmap[] j = new Bitmap[4];
    public final List<cij<Bitmap>> k = new ArrayList(4);

    public cxpv(Context context) {
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [crxy] */
    public final void a(Channel channel, int i, int i2, int i3) {
        String str;
        dbsk.a(i > 0);
        dbsk.a(i2 > 0);
        dbsk.a(i3 < 4);
        String n = channel.n();
        if (TextUtils.isEmpty(n)) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Context context = this.a;
            createBitmap.eraseColor(cxpq.a(context, channel.i(context)));
            String m = channel.m();
            if (!TextUtils.isEmpty(m)) {
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(1);
                paint.setColor(akm.c(this.a, R.color.quantum_white_100));
                double b = cxpq.b(this.a, m, i);
                Double.isNaN(b);
                paint.setTextSize((float) (b * 1.5d));
                paint.setTypeface(Typeface.create("google-sans", 0));
                Rect rect = new Rect();
                paint.getTextBounds(m, 0, m.length(), rect);
                int width = createBitmap.getWidth();
                int width2 = rect.width();
                int height = createBitmap.getHeight();
                int height2 = rect.height();
                float f = this.a.getResources().getDisplayMetrics().density;
                canvas.drawText(m, ((width - width2) / 6) * f, ((height + height2) / 5) * f, paint);
            }
            this.j[i3] = createBitmap;
            b(i, i2, i3);
            return;
        }
        cxpt cxptVar = new cxpt(this, i, i2, i3, i, i2);
        if (i3 > this.k.size() - 1) {
            this.k.add(cxptVar);
        } else {
            this.k.set(i3, cxptVar);
        }
        if (cxot.a(n)) {
            cryd crydVar = new cryd();
            crydVar.c();
            crydVar.b();
            crydVar.e();
            str = new crxy(n, crydVar);
        } else {
            str = null;
        }
        brw<Bitmap> e = brc.d(this.a).g().e(this.e);
        if (str != null) {
            n = str;
        }
        e.j(n);
        e.k(this.h);
        e.i(cxptVar);
    }

    public final void b(int i, int i2, int i3) {
        Bitmap bitmap = this.j[i3];
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        bitmapShader.setLocalMatrix(c(i, i2, bitmap.getWidth(), bitmap.getHeight(), i3));
        this.i[i3].setShader(bitmapShader);
        cxps cxpsVar = this.l;
        if (cxpsVar != null) {
            cxpsVar.a();
        }
    }

    public final Matrix c(float f, float f2, float f3, float f4, int i) {
        float f5 = f / f2;
        float f6 = f3 / f4;
        float f7 = f6 <= f5 ? f3 : f4 * f5;
        float f8 = f6 >= f5 ? f4 : f3 / f5;
        Matrix matrix = new Matrix();
        matrix.postTranslate(-((f3 - f7) / 2.0f), -((f4 - f8) / 2.0f));
        matrix.postScale(f / f7, f2 / f8);
        cxps cxpsVar = this.l;
        if (cxpsVar != null) {
            if (i == 1) {
                matrix.postTranslate(f, 0.0f);
            } else if (i == 2) {
                if (cxpsVar.a.b.size() != 3) {
                    f = 0.0f;
                }
                matrix.postTranslate(f, f2);
            } else if (i == 3) {
                matrix.postTranslate(f, f2);
            }
        }
        return matrix;
    }
}

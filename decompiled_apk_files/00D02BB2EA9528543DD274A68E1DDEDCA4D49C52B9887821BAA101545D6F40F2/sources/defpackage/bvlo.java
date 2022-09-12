package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: bvlo  reason: default package */
/* loaded from: classes.dex */
public class bvlo {
    public final Resources a;
    private final bvly b;
    private final bvln c;

    public bvlo(Application application, bvly bvlyVar, bvln bvlnVar) {
        this.a = application.getResources();
        this.b = bvlyVar;
        this.c = bvlnVar;
    }

    public static bvlo a() {
        return ((bvlp) btsr.a(bvlp.class)).sF();
    }

    public final Drawable b(Resources resources, int i, bvlw bvlwVar) {
        return c(this.b.b(resources, i), bvlwVar);
    }

    public final Drawable c(Picture picture, bvlw bvlwVar) {
        int intValue;
        int intValue2;
        int intValue3;
        int round;
        int i;
        int i2;
        Bitmap.Config config = bvlwVar.d() ? Bitmap.Config.ALPHA_8 : Bitmap.Config.ARGB_8888;
        int i3 = true != bvlwVar.c() ? -3 : -1;
        Integer a = bvlwVar.a();
        Integer b = bvlwVar.b();
        if (a == null) {
            if (b == null) {
                float f = this.a.getDisplayMetrics().density;
                intValue3 = Math.round(picture.getWidth() * f);
                round = Math.round(picture.getHeight() * f);
                i2 = round;
                i = intValue3;
            } else {
                intValue = Math.round((b.intValue() * picture.getWidth()) / picture.getHeight());
                intValue2 = b.intValue();
                i = intValue;
                i2 = intValue2;
            }
        } else if (b == null) {
            intValue3 = a.intValue();
            round = Math.round((a.intValue() * picture.getHeight()) / picture.getWidth());
            i2 = round;
            i = intValue3;
        } else {
            intValue = a.intValue();
            intValue2 = b.intValue();
            i = intValue;
            i2 = intValue2;
        }
        ggt e = bvlwVar.e();
        if (e == null) {
            e = ggt.e(0.0f, 0.0f, i, i2);
        }
        ggt ggtVar = e;
        bvlu a2 = this.c.a.a();
        bvln.a(a2, 1);
        bvln.a(picture, 2);
        bvln.a(ggtVar, 3);
        bvln.a(config, 6);
        bvll bvllVar = new bvll(a2, picture, ggtVar, i, i2, config, i3);
        Paint paint = new Paint();
        paint.setDither(true);
        paint.setFilterBitmap(true);
        return new bvlm(new bvlk(bvllVar, paint));
    }
}

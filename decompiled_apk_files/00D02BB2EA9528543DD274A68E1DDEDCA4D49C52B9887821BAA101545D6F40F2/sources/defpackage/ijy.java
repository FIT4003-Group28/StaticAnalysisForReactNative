package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ijy  reason: default package */
/* loaded from: classes6.dex */
public abstract class ijy {
    public static final int l;
    public static final int m;
    public static final int n;

    static {
        l = true != iva.a().booleanValue() ? R.color.mod_daynight_white : R.color.mod_grey900_with_elevation_1;
        m = true != iva.a().booleanValue() ? R.color.mod_daynight_grey800 : R.color.mod_google_black;
        n = R.color.mod_daynight_grey800;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ijy l(int i, int i2, int i3, int i4, int i5, int i6, int i7, Paint paint, Paint paint2, Paint paint3, TextPaint textPaint) {
        return new iju(i, i2, i3, i4, i5, i6, i7, paint, paint2, paint3, textPaint);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract Paint h();

    public abstract Paint i();

    public abstract Paint j();

    public abstract TextPaint k();
}

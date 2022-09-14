package defpackage;

import android.graphics.Color;
import com.google.android.filament.Colors;
/* compiled from: PG */
/* renamed from: dbep  reason: default package */
/* loaded from: classes5.dex */
public final class dbep {
    public float a;
    public float b;
    public float c;
    public float d;

    public dbep() {
        b(1.0f, 1.0f, 1.0f);
    }

    private static float e(float f) {
        return ((-0.155f) * f) / (f - 1.019f);
    }

    public final void a(dbep dbepVar) {
        c(dbepVar.a, dbepVar.b, dbepVar.c, dbepVar.d);
    }

    public final void b(float f, float f2, float f3) {
        c(f, f2, f3, 1.0f);
    }

    public final void c(float f, float f2, float f3, float f4) {
        this.a = Math.max(0.0f, Math.min(1.0f, f));
        this.b = Math.max(0.0f, Math.min(1.0f, f2));
        this.c = Math.max(0.0f, Math.min(1.0f, f3));
        this.d = Math.max(0.0f, Math.min(1.0f, f4));
    }

    public final dbep d() {
        dbep dbepVar = new dbep(this.a, this.b, this.c, this.d);
        dbepVar.a = e(this.a);
        dbepVar.b = e(this.b);
        dbepVar.c = e(this.c);
        return dbepVar;
    }

    public dbep(byte[] bArr) {
        b(1.0f, 1.0f, 1.0f);
    }

    public dbep(float f, float f2, float f3, float f4) {
        c(f, f2, f3, f4);
    }

    public dbep(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        float[] linear = Colors.toLinear(Colors.RgbType.SRGB, red * 0.003921569f, green * 0.003921569f, blue * 0.003921569f);
        this.a = linear[0];
        this.b = linear[1];
        this.c = linear[2];
        this.d = alpha * 0.003921569f;
    }

    public dbep(dbep dbepVar) {
        a(dbepVar);
    }
}

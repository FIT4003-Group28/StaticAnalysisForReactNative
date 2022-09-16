package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: sdg  reason: default package */
/* loaded from: classes4.dex */
public final class sdg {
    public int c;
    public int d;
    public final TextPaint h;
    public final Paint i;
    public final Paint j;
    public ser a = ser.a();
    public sev b = sev.a();
    public final int k = 2;
    public float e = 0.0f;
    public final int f = 20;
    public final boolean g = true;

    public sdg(Context context) {
        sfc sfcVar = sce.a;
        if (sfcVar.a == null) {
            sfcVar.a = new Paint();
            sfcVar.a.setAntiAlias(true);
            sfcVar.a.setColor(Color.parseColor("#707070"));
            sfcVar.a.setTextSize(scf.b(null, 10.0f));
        }
        TextPaint textPaint = new TextPaint(sfcVar.a);
        this.h = textPaint;
        this.i = new Paint(sce.a.a());
        sfc sfcVar2 = sce.a;
        if (sfcVar2.b == null) {
            sfcVar2.b = new Paint(sfcVar2.a());
            sfcVar2.b.setColor(Color.parseColor("#DCDCDC"));
        }
        this.j = new Paint(sfcVar2.b);
        this.c = (int) scf.b(context, 3.0f);
        this.d = (int) scf.b(context, 5.0f);
        if (context != null) {
            textPaint.setTextSize(textPaint.getTextSize() * context.getResources().getConfiguration().fontScale);
        }
    }

    public final void a() {
        this.j.setStrokeWidth(0.0f);
    }

    public final void b(int i) {
        this.h.setColor(i);
    }

    public final void c(float f) {
        this.h.setTextSize(f);
    }

    public final void d(ser serVar) {
        sho.g(serVar, "rangeBandConfig");
        this.a = serVar;
    }

    public final void e(int i) {
        this.i.setColor(i);
    }

    public final void f() {
        this.c = 0;
    }
}

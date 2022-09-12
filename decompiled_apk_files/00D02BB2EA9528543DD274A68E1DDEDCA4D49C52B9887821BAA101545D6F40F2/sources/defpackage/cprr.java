package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
/* compiled from: PG */
/* renamed from: cprr  reason: default package */
/* loaded from: classes5.dex */
public final class cprr {
    public int d;
    public int e;
    public final TextPaint i;
    public final Paint j;
    public final Paint k;
    public cpsm a = cpsm.a();
    public cpsq b = cpsq.a();
    public cprq c = cprq.CENTER;
    public float f = 0.0f;
    public final int g = 20;
    public final boolean h = true;

    private cprr(Context context) {
        cptd cptdVar = (cptd) cpqg.a;
        if (cptdVar.a == null) {
            cptdVar.a = new Paint();
            cptdVar.a.setAntiAlias(true);
            cptdVar.a.setColor(Color.parseColor("#707070"));
            cptdVar.a.setTextSize(cpqk.a(null, 10.0f));
        }
        TextPaint textPaint = new TextPaint(cptdVar.a);
        this.i = textPaint;
        this.j = new Paint(cpqg.a.b());
        cptd cptdVar2 = (cptd) cpqg.a;
        if (cptdVar2.b == null) {
            cptdVar2.b = new Paint(cptdVar2.b());
            cptdVar2.b.setColor(Color.parseColor("#DCDCDC"));
        }
        this.k = new Paint(cptdVar2.b);
        this.d = (int) cpqk.a(context, 3.0f);
        this.e = (int) cpqk.a(context, 5.0f);
        if (context != null) {
            textPaint.setTextSize(textPaint.getTextSize() * context.getResources().getConfiguration().fontScale);
        }
    }

    public static cprr a(Context context, cpsm cpsmVar) {
        cprr cprrVar = new cprr(context);
        if (cpsmVar != null) {
            cprrVar.b(cpsmVar);
        }
        return cprrVar;
    }

    public final void b(cpsm cpsmVar) {
        cpwl.h(cpsmVar, "rangeBandConfig");
        this.a = cpsmVar;
    }

    public final void c(int i) {
        this.j.setColor(i);
    }
}

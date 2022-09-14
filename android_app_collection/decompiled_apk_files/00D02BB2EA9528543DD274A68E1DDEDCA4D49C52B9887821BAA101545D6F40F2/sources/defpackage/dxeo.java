package defpackage;

import android.graphics.Paint;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxeo  reason: default package */
/* loaded from: classes6.dex */
public final class dxeo {
    public Paint a;
    public Paint b;
    public final float c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public dxeo(dxep dxepVar, Attributes attributes) {
        this.a = null;
        this.b = null;
        this.g = 0;
        Float valueOf = Float.valueOf(0.0f);
        this.c = dxepVar.c("x", attributes, valueOf).floatValue();
        this.d = dxepVar.c("y", attributes, valueOf).floatValue();
        this.e = null;
        this.f = true;
        dxen dxenVar = new dxen(attributes);
        if (dxepVar.a(dxenVar, dxepVar.t)) {
            Paint paint = new Paint(dxepVar.h);
            this.b = paint;
            dxepVar.d(attributes, paint);
        }
        if (dxepVar.b(dxenVar)) {
            Paint paint2 = new Paint(dxepVar.d);
            this.a = paint2;
            dxepVar.d(attributes, paint2);
        }
        String e = dxer.e("alignment-baseline", attributes);
        if ("middle".equals(e)) {
            this.g = 1;
        } else if (!"top".equals(e)) {
        } else {
            this.g = 2;
        }
    }
}

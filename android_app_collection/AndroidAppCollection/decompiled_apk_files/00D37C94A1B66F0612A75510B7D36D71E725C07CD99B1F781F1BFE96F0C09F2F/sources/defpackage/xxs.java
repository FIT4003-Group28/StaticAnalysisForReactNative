package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
/* compiled from: PG */
/* renamed from: xxs  reason: default package */
/* loaded from: classes4.dex */
public final class xxs {
    public static void a(Spannable spannable, float f, float f2, float f3, int i) {
        aaft[] aaftVarArr;
        if (spannable.length() != 0) {
            for (aaft aaftVar : (aaft[]) spannable.getSpans(0, spannable.length(), aaft.class)) {
                apzg apzgVar = aaftVar.c;
                if (apzgVar != null && apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
                    String str = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c;
                    if (!str.isEmpty()) {
                        int spanStart = spannable.getSpanStart(aaftVar);
                        int spanEnd = spannable.getSpanEnd(aaftVar);
                        if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                            spannable.setSpan(new ajwp(str, f, f2, f3, i), spanStart, spanEnd, 33);
                        }
                    }
                }
            }
            for (Object obj : (aaft[]) spannable.getSpans(0, spannable.length(), aaft.class)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void b(Editable editable) {
        ajwp[] ajwpVarArr;
        for (ajwp ajwpVar : (ajwp[]) editable.getSpans(0, editable.length(), ajwp.class)) {
            int spanStart = editable.getSpanStart(ajwpVar);
            int spanEnd = editable.getSpanEnd(ajwpVar);
            if (spanStart != -1 && spanEnd != -1 && spanStart < spanEnd) {
                String valueOf = String.valueOf(ajwpVar.a);
                editable.replace(spanStart, spanEnd, valueOf.length() != 0 ? "@".concat(valueOf) : new String("@"));
            }
        }
        for (Object obj : (ajwp[]) editable.getSpans(0, editable.length(), ajwp.class)) {
            editable.removeSpan(obj);
        }
    }

    public static Drawable c(Context context, Drawable drawable, int i) {
        if (i != 0 && (drawable instanceof BitmapDrawable)) {
            Matrix matrix = new Matrix();
            matrix.postRotate(i);
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            return new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true));
        }
        return drawable;
    }

    public static arif d(float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (f <= 0.0f || f2 <= 0.0f) {
            f3 = 1.0f;
            f4 = 1.0f;
            f5 = 0.0f;
        } else if (f > f2) {
            float f7 = f2 / f;
            f6 = 0.5f - (f7 / 2.0f);
            f4 = f7 + f6;
            f3 = 1.0f;
            f5 = 0.0f;
            aopa createBuilder = arif.a.createBuilder();
            float max = Math.max(0.0f, f6);
            createBuilder.copyOnWrite();
            arif arifVar = (arif) createBuilder.instance;
            arifVar.b |= 1;
            arifVar.c = max;
            float min = Math.min(1.0f, f4);
            createBuilder.copyOnWrite();
            arif arifVar2 = (arif) createBuilder.instance;
            arifVar2.b |= 4;
            arifVar2.e = min;
            float max2 = Math.max(0.0f, f5);
            createBuilder.copyOnWrite();
            arif arifVar3 = (arif) createBuilder.instance;
            arifVar3.b |= 2;
            arifVar3.d = max2;
            float min2 = Math.min(1.0f, f3);
            createBuilder.copyOnWrite();
            arif arifVar4 = (arif) createBuilder.instance;
            arifVar4.b |= 8;
            arifVar4.f = min2;
            return (arif) createBuilder.mo39build();
        } else {
            float f8 = f / f2;
            float f9 = 0.5f - (f8 / 2.0f);
            f3 = f8 + f9;
            f5 = f9;
            f4 = 1.0f;
        }
        f6 = 0.0f;
        aopa createBuilder2 = arif.a.createBuilder();
        float max3 = Math.max(0.0f, f6);
        createBuilder2.copyOnWrite();
        arif arifVar5 = (arif) createBuilder2.instance;
        arifVar5.b |= 1;
        arifVar5.c = max3;
        float min3 = Math.min(1.0f, f4);
        createBuilder2.copyOnWrite();
        arif arifVar22 = (arif) createBuilder2.instance;
        arifVar22.b |= 4;
        arifVar22.e = min3;
        float max22 = Math.max(0.0f, f5);
        createBuilder2.copyOnWrite();
        arif arifVar32 = (arif) createBuilder2.instance;
        arifVar32.b |= 2;
        arifVar32.d = max22;
        float min22 = Math.min(1.0f, f3);
        createBuilder2.copyOnWrite();
        arif arifVar42 = (arif) createBuilder2.instance;
        arifVar42.b |= 8;
        arifVar42.f = min22;
        return (arif) createBuilder2.mo39build();
    }

    public static void e(aajl aajlVar, String str) {
        aqaa aqaaVar = (aqaa) aajlVar.f(str).g(aqaa.class).W();
        if (aqaaVar != null) {
            apzy e = aqaaVar.e();
            aopa aopaVar = e.a;
            aopaVar.copyOnWrite();
            aqab aqabVar = (aqab) aopaVar.instance;
            aqab aqabVar2 = aqab.a;
            aqabVar.b |= 2;
            aqabVar.d = "";
            aopa aopaVar2 = e.a;
            aopaVar2.copyOnWrite();
            aqab aqabVar3 = (aqab) aopaVar2.instance;
            aqabVar3.b |= 4;
            aqabVar3.e = "";
            Boolean bool = true;
            aopa aopaVar3 = e.a;
            boolean booleanValue = bool.booleanValue();
            aopaVar3.copyOnWrite();
            aqab aqabVar4 = (aqab) aopaVar3.instance;
            aqabVar4.b |= 256;
            aqabVar4.l = booleanValue;
            Boolean bool2 = false;
            aopa aopaVar4 = e.a;
            boolean booleanValue2 = bool2.booleanValue();
            aopaVar4.copyOnWrite();
            aqab aqabVar5 = (aqab) aopaVar4.instance;
            aqabVar5.b |= 4096;
            aqabVar5.p = booleanValue2;
            aqaa a = e.a(aajlVar);
            aahb c = ((aagu) aajlVar).c();
            c.d(a);
            c.b().Q();
        }
    }

    public static void f(aajl aajlVar, String str) {
        apzw apzwVar = (apzw) aajlVar.f(str).g(apzw.class).W();
        if (apzwVar != null) {
            apzu e = apzwVar.e();
            Boolean bool = false;
            aopa aopaVar = e.a;
            boolean booleanValue = bool.booleanValue();
            aopaVar.copyOnWrite();
            apzx apzxVar = (apzx) aopaVar.instance;
            apzx apzxVar2 = apzx.a;
            apzxVar.c |= 8;
            apzxVar.g = booleanValue;
            apzw b = e.b();
            aahb c = ((aagu) aajlVar).c();
            c.d(b);
            c.b().Q();
        }
    }

    public static void g(aajl aajlVar, String str, boolean z) {
        aqaa aqaaVar = (aqaa) aajlVar.f(str).g(aqaa.class).W();
        if (aqaaVar != null) {
            apzy e = aqaaVar.e();
            Boolean valueOf = Boolean.valueOf(z);
            aopa aopaVar = e.a;
            boolean booleanValue = valueOf.booleanValue();
            aopaVar.copyOnWrite();
            aqab aqabVar = (aqab) aopaVar.instance;
            aqab aqabVar2 = aqab.a;
            aqabVar.b |= 16384;
            aqabVar.r = booleanValue;
            aqaa a = e.a(aajlVar);
            aajs c = aajlVar.c();
            c.d(a);
            c.b().Q();
        }
    }
}

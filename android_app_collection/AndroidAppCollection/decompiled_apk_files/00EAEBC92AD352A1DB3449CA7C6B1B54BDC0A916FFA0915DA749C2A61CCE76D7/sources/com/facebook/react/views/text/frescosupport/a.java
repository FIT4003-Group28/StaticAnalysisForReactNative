package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.views.text.o;
import com.facebook.react.views.text.y;
import java.util.Locale;
/* loaded from: classes.dex */
public class a extends o {
    private Uri A;
    private ReadableMap B;
    private final c.d.h.c.b C;
    private final Object D;
    private float E = Float.NaN;
    private float F = Float.NaN;
    private int G = 0;

    public a(c.d.h.c.b bVar, Object obj) {
        this.C = bVar;
        this.D = obj;
    }

    private static Uri a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    @Override // com.facebook.react.views.text.o
    public y R() {
        return new b(i().getResources(), (int) Math.ceil(this.F), (int) Math.ceil(this.E), this.G, V(), U(), T(), S());
    }

    public Object S() {
        return this.D;
    }

    public c.d.h.c.b T() {
        return this.C;
    }

    public ReadableMap U() {
        return this.B;
    }

    public Uri V() {
        return this.A;
    }

    @com.facebook.react.uimanager.e1.a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.B = readableMap;
    }

    @Override // com.facebook.react.uimanager.i
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.F = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1.getScheme() == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    @com.facebook.react.uimanager.e1.a(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L16
        La:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.mo209getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L17
        L16:
            r4 = r0
        L17:
            if (r4 == 0) goto L31
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L24
            goto L27
        L24:
            r0 = r1
            goto L27
        L26:
        L27:
            if (r0 != 0) goto L31
            com.facebook.react.uimanager.k0 r0 = r3.i()
            android.net.Uri r0 = a(r0, r4)
        L31:
            android.net.Uri r4 = r3.A
            if (r0 == r4) goto L38
            r3.M()
        L38:
            r3.A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.a.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @com.facebook.react.uimanager.e1.a(name = "tintColor")
    public void setTintColor(int i) {
        this.G = i;
    }

    @Override // com.facebook.react.uimanager.i
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.E = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
    }

    @Override // com.facebook.react.uimanager.b0, com.facebook.react.uimanager.a0
    public boolean y() {
        return true;
    }
}

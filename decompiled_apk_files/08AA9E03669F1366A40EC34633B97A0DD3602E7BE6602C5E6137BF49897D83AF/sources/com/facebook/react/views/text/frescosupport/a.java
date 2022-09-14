package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.g;
import com.facebook.react.bridge.n;
import com.facebook.react.views.text.h;
import java.util.Locale;
/* compiled from: FrescoBasedReactTextInlineImageShadowNode.java */
/* loaded from: classes.dex */
public class a extends h {

    /* renamed from: a  reason: collision with root package name */
    private Uri f4085a;

    /* renamed from: b  reason: collision with root package name */
    private an f4086b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.f.c.b f4087c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f4088d;
    private float e = Float.NaN;
    private float f = Float.NaN;

    @Override // com.facebook.react.uimanager.x, com.facebook.react.uimanager.w
    public boolean isVirtual() {
        return true;
    }

    public a(com.facebook.f.c.b bVar, Object obj) {
        this.f4087c = bVar;
        this.f4088d = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r1.getScheme() == null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    @com.facebook.react.uimanager.a.a(a = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSource(com.facebook.react.bridge.am r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L16
        La:
            r1 = 0
            com.facebook.react.bridge.an r4 = r4.c(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L17
        L16:
            r4 = r0
        L17:
            if (r4 == 0) goto L2f
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r1.getScheme()     // Catch: java.lang.Exception -> L24
            if (r2 != 0) goto L24
            goto L25
        L24:
            r0 = r1
        L25:
            if (r0 != 0) goto L2f
            com.facebook.react.uimanager.af r0 = r3.getThemedContext()
            android.net.Uri r0 = a(r0, r4)
        L2f:
            android.net.Uri r4 = r3.f4085a
            if (r0 == r4) goto L36
            r3.markUpdated()
        L36:
            r3.f4085a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.a.setSource(com.facebook.react.bridge.am):void");
    }

    @com.facebook.react.uimanager.a.a(a = "headers")
    public void setHeaders(an anVar) {
        this.f4086b = anVar;
    }

    @Override // com.facebook.react.uimanager.g
    public void setWidth(g gVar) {
        if (gVar.d() == ReadableType.Number) {
            this.e = (float) gVar.b();
            return;
        }
        throw new n("Inline images must not have percentage based width");
    }

    @Override // com.facebook.react.uimanager.g
    public void setHeight(g gVar) {
        if (gVar.d() == ReadableType.Number) {
            this.f = (float) gVar.b();
            return;
        }
        throw new n("Inline images must not have percentage based height");
    }

    public Uri b() {
        return this.f4085a;
    }

    public an c() {
        return this.f4086b;
    }

    private static Uri a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR), "drawable", context.getPackageName()))).build();
    }

    @Override // com.facebook.react.views.text.h
    public com.facebook.react.views.text.n a() {
        return new b(getThemedContext().getResources(), (int) Math.ceil(this.f), (int) Math.ceil(this.e), b(), c(), d(), e());
    }

    public com.facebook.f.c.b d() {
        return this.f4087c;
    }

    public Object e() {
        return this.f4088d;
    }
}

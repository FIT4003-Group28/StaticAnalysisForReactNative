package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: blt  reason: default package */
/* loaded from: classes3.dex */
public final class blt {
    private static final Object e = new Object();
    public final Context a;
    public String b;
    public bil c;
    public final Map<String, bjs> d;

    public blt(Drawable.Callback callback, String str, bil bilVar, Map<String, bjs> map) {
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.b;
            if (str2.charAt(str2.length() - 1) != '/') {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
                sb.append(valueOf);
                sb.append('/');
                this.b = sb.toString();
            }
        }
        if (!(callback instanceof View)) {
            bpo.a("LottieDrawable must be inside of a view for images to work.");
            this.d = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.d = map;
        this.c = bilVar;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (e) {
            this.d.get(str).e = bitmap;
        }
    }
}

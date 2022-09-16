package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bzp  reason: default package */
/* loaded from: classes2.dex */
public final class bzp {
    private static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public bzp(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1);
            sb.append(str);
            sb.append('/');
            this.b = sb.toString();
        } else {
            this.b = str;
        }
        if (!(callback instanceof View)) {
            cda.a("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.c = map;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (d) {
            ((bxo) this.c.get(str)).e = bitmap;
        }
    }
}

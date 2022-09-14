package com.facebook.react.j0.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f5549b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f5550a = new HashMap();

    private c() {
    }

    public static c a() {
        if (f5549b == null) {
            synchronized (c.class) {
                if (f5549b == null) {
                    f5549b = new c();
                }
            }
        }
        return f5549b;
    }

    public Drawable a(Context context, String str) {
        int b2 = b(context, str);
        if (b2 > 0) {
            return context.getResources().getDrawable(b2);
        }
        return null;
    }

    public int b(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f5550a.containsKey(replace)) {
                    return this.f5550a.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f5550a.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    public Uri c(Context context, String str) {
        int b2 = b(context, str);
        return b2 > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(b2)).build() : Uri.EMPTY;
    }
}

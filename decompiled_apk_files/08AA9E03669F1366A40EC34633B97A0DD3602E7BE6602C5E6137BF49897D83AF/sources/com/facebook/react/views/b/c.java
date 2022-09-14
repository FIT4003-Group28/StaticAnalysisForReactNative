package com.facebook.react.views.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ResourceDrawableIdHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f3955b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f3956a = new HashMap();

    private c() {
    }

    public static c a() {
        if (f3955b == null) {
            synchronized (c.class) {
                if (f3955b == null) {
                    f3955b = new c();
                }
            }
        }
        return f3955b;
    }

    public int a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace("-", b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR);
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f3956a.containsKey(replace)) {
                    return this.f3956a.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f3956a.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    public Drawable b(Context context, String str) {
        int a2 = a(context, str);
        if (a2 > 0) {
            return context.getResources().getDrawable(a2);
        }
        return null;
    }

    public Uri c(Context context, String str) {
        int a2 = a(context, str);
        return a2 > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(a2)).build() : Uri.EMPTY;
    }
}

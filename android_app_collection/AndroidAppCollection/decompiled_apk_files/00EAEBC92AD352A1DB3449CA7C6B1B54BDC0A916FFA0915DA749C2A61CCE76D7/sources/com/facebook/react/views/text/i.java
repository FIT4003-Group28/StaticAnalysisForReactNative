package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class i {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f6284c = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f6285d = {".ttf", ".otf"};

    /* renamed from: e  reason: collision with root package name */
    private static i f6286e;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f6287a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Typeface> f6288b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<Typeface> f6289a;

        private b() {
            this.f6289a = new SparseArray<>(4);
        }

        public Typeface a(int i) {
            return this.f6289a.get(i);
        }

        public void a(int i, Typeface typeface) {
            this.f6289a.put(i, typeface);
        }
    }

    private i() {
    }

    public static i a() {
        if (f6286e == null) {
            f6286e = new i();
        }
        return f6286e;
    }

    private static Typeface b(String str, int i, AssetManager assetManager) {
        String[] strArr;
        String str2 = f6284c[i];
        for (String str3 : f6285d) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i);
    }

    public Typeface a(String str, int i, int i2, AssetManager assetManager) {
        if (this.f6288b.containsKey(str)) {
            Typeface typeface = this.f6288b.get(str);
            if (Build.VERSION.SDK_INT < 28 || i2 < 100 || i2 > 1000) {
                return Typeface.create(typeface, i);
            }
            return Typeface.create(typeface, i2, (i & 2) != 0);
        }
        b bVar = this.f6287a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f6287a.put(str, bVar);
        }
        Typeface a2 = bVar.a(i);
        if (a2 == null && (a2 = b(str, i, assetManager)) != null) {
            bVar.a(i, a2);
        }
        return a2;
    }

    public Typeface a(String str, int i, AssetManager assetManager) {
        return a(str, i, 0, assetManager);
    }
}

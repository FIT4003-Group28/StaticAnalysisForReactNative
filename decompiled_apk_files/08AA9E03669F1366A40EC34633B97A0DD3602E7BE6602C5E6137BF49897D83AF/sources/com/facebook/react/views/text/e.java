package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ReactFontManager.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f4079a = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f4080b = {".ttf", ".otf"};

    /* renamed from: c  reason: collision with root package name */
    private static e f4081c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, a> f4082d = new HashMap();

    private e() {
    }

    public static e a() {
        if (f4081c == null) {
            f4081c = new e();
        }
        return f4081c;
    }

    public Typeface a(String str, int i, AssetManager assetManager) {
        a aVar = this.f4082d.get(str);
        if (aVar == null) {
            aVar = new a();
            this.f4082d.put(str, aVar);
        }
        Typeface a2 = aVar.a(i);
        if (a2 == null && (a2 = b(str, i, assetManager)) != null) {
            aVar.a(i, a2);
        }
        return a2;
    }

    private static Typeface b(String str, int i, AssetManager assetManager) {
        String[] strArr;
        String str2 = f4079a[i];
        for (String str3 : f4080b) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i);
    }

    /* compiled from: ReactFontManager.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<Typeface> f4083a;

        private a() {
            this.f4083a = new SparseArray<>(4);
        }

        public Typeface a(int i) {
            return this.f4083a.get(i);
        }

        public void a(int i, Typeface typeface) {
            this.f4083a.put(i, typeface);
        }
    }
}

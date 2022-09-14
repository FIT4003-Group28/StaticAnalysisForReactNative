package com.facebook.react.flat;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import java.util.HashMap;
/* compiled from: TypefaceCache.java */
/* loaded from: classes.dex */
final class ag {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Typeface[]> f3383a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Typeface, Typeface[]> f3384b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f3385c = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f3386d = {".ttf", ".otf"};
    private static AssetManager e;

    public static Typeface a(String str, int i) {
        Typeface[] typefaceArr = f3383a.get(str);
        if (typefaceArr == null) {
            typefaceArr = new Typeface[4];
            f3383a.put(str, typefaceArr);
        } else if (typefaceArr[i] != null) {
            return typefaceArr[i];
        }
        Typeface b2 = b(str, i);
        typefaceArr[i] = b2;
        f3384b.put(b2, typefaceArr);
        return b2;
    }

    private static Typeface b(String str, int i) {
        String str2 = f3385c[i];
        StringBuilder sb = new StringBuilder(32);
        sb.append("fonts/");
        sb.append(str);
        sb.append(str2);
        int length = sb.length();
        for (String str3 : f3386d) {
            sb.append(str3);
            try {
                return Typeface.createFromAsset(e, sb.toString());
            } catch (RuntimeException unused) {
                sb.setLength(length);
            }
        }
        return (Typeface) com.facebook.j.a.a.a(Typeface.create(str, i));
    }

    public static Typeface a(Typeface typeface, int i) {
        if (typeface == null) {
            return Typeface.defaultFromStyle(i);
        }
        Typeface[] typefaceArr = f3384b.get(typeface);
        if (typefaceArr == null) {
            typefaceArr = new Typeface[4];
            typefaceArr[typeface.getStyle()] = typeface;
        } else if (typefaceArr[i] != null) {
            return typefaceArr[i];
        }
        Typeface create = Typeface.create(typeface, i);
        typefaceArr[i] = create;
        f3384b.put(create, typefaceArr);
        return create;
    }
}

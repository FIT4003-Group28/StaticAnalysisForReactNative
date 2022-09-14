package com.baidu.platform.comjni.map.favorite;

import android.os.Bundle;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private long f2147a = 0;

    /* renamed from: b  reason: collision with root package name */
    private JNIFavorite f2148b;

    /* renamed from: com.baidu.platform.comjni.map.favorite.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0040a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f2149a = false;

        /* JADX INFO: Access modifiers changed from: private */
        public static void b() {
            f2149a = true;
        }
    }

    public a() {
        this.f2148b = null;
        this.f2148b = new JNIFavorite();
    }

    public int a(Bundle bundle) {
        try {
            return this.f2148b.GetAll(this.f2147a, bundle);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public long a() {
        this.f2147a = this.f2148b.Create();
        return this.f2147a;
    }

    public boolean a(int i) {
        return this.f2148b.SetType(this.f2147a, i);
    }

    public boolean a(String str) {
        return this.f2148b.Remove(this.f2147a, str);
    }

    public boolean a(String str, String str2) {
        C0040a.b();
        return this.f2148b.Add(this.f2147a, str, str2);
    }

    public boolean a(String str, String str2, String str3, int i, int i2, int i3) {
        return this.f2148b.Load(this.f2147a, str, str2, str3, i, i2, i3);
    }

    public int b() {
        return this.f2148b.Release(this.f2147a);
    }

    public String b(String str) {
        try {
            return this.f2148b.GetValue(this.f2147a, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean b(String str, String str2) {
        C0040a.b();
        return this.f2148b.Update(this.f2147a, str, str2);
    }

    public boolean c() {
        return this.f2148b.Clear(this.f2147a);
    }

    public boolean c(String str) {
        try {
            return this.f2148b.IsExist(this.f2147a, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean d() {
        return this.f2148b.SaveCache(this.f2147a);
    }
}

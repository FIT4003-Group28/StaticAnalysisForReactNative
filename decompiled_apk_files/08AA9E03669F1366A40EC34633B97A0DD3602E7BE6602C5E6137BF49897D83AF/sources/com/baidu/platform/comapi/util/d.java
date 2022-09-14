package com.baidu.platform.comapi.util;

import android.content.Context;
import android.os.Environment;
import java.io.File;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2125a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2126b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2127c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2128d;
    private final String e;
    private final String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
        this.f2125a = false;
        this.f2126b = Environment.getExternalStorageDirectory().getAbsolutePath();
        this.f2127c = this.f2126b + File.separator + "BaiduMapSDKNew";
        this.f2128d = context.getCacheDir().getAbsolutePath();
        this.e = "";
        this.f = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, boolean z, String str2, Context context) {
        this.f2125a = z;
        this.f2126b = str;
        this.f2127c = this.f2126b + File.separator + "BaiduMapSDKNew";
        this.f2128d = this.f2127c + File.separator + "cache";
        this.e = context.getCacheDir().getAbsolutePath();
        this.f = str2;
    }

    public String a() {
        return this.f2126b;
    }

    public String b() {
        return this.f2126b + File.separator + "BaiduMapSDKNew";
    }

    public String c() {
        return this.f2128d;
    }

    public String d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !d.class.isInstance(obj)) {
            return false;
        }
        return this.f2126b.equals(((d) obj).f2126b);
    }
}

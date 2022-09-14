package com.baidu.platform.comjni.map.commonmemcache;

import android.os.Bundle;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private long f2145a = 0;

    /* renamed from: b  reason: collision with root package name */
    private JNICommonMemCache f2146b;

    public a() {
        this.f2146b = null;
        this.f2146b = new JNICommonMemCache();
    }

    public long a() {
        this.f2145a = this.f2146b.Create();
        return this.f2145a;
    }

    public void a(Bundle bundle) {
        if (this.f2145a != 0) {
            this.f2146b.Init(this.f2145a, bundle);
        }
    }

    public String b() {
        return this.f2146b.GetPhoneInfoUrl(this.f2145a);
    }
}

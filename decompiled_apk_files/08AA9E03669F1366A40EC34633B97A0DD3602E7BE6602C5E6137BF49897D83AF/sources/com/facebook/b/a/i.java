package com.facebook.b.a;

import android.net.Uri;
/* compiled from: SimpleCacheKey.java */
/* loaded from: classes.dex */
public class i implements d {

    /* renamed from: a  reason: collision with root package name */
    final String f2177a;

    public i(String str) {
        this.f2177a = (String) com.facebook.common.d.i.a(str);
    }

    public String toString() {
        return this.f2177a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f2177a.equals(((i) obj).f2177a);
    }

    public int hashCode() {
        return this.f2177a.hashCode();
    }

    @Override // com.facebook.b.a.d
    public boolean a(Uri uri) {
        return this.f2177a.contains(uri.toString());
    }

    @Override // com.facebook.b.a.d
    public String a() {
        return this.f2177a;
    }
}

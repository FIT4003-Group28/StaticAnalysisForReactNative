package com.facebook.b.a;

import android.net.Uri;
import java.util.List;
/* compiled from: MultiCacheKey.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    final List<d> f2174a;

    public List<d> b() {
        return this.f2174a;
    }

    public String toString() {
        return "MultiCacheKey:" + this.f2174a.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f2174a.equals(((f) obj).f2174a);
    }

    public int hashCode() {
        return this.f2174a.hashCode();
    }

    @Override // com.facebook.b.a.d
    public boolean a(Uri uri) {
        for (int i = 0; i < this.f2174a.size(); i++) {
            if (this.f2174a.get(i).a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.b.a.d
    public String a() {
        return this.f2174a.get(0).a();
    }
}

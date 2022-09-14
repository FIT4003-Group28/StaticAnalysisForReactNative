package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
/* loaded from: classes.dex */
final class h extends v.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8901a;

    @Override // com.google.firebase.crashlytics.c.j.v.d.a.b
    public String a() {
        return this.f8901a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.d.a.b)) {
            return false;
        }
        return this.f8901a.equals(((v.d.a.b) obj).a());
    }

    public int hashCode() {
        return this.f8901a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f8901a + "}";
    }
}

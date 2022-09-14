package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
/* loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.x.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new o();

    /* renamed from: b  reason: collision with root package name */
    private final int f6796b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6797c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        s.a(str, (Object) "scopeUri must not be null or empty");
        this.f6796b = i;
        this.f6797c = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f6797c.equals(((Scope) obj).f6797c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6797c.hashCode();
    }

    public final String q() {
        return this.f6797c;
    }

    public final String toString() {
        return this.f6797c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f6796b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, q(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o extends com.google.android.gms.common.internal.x.a implements Iterable<String> {
    public static final Parcelable.Creator<o> CREATOR = new q();

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f7540b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Bundle bundle) {
        this.f7540b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(String str) {
        return this.f7540b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long b(String str) {
        return Long.valueOf(this.f7540b.getLong(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double c(String str) {
        return Double.valueOf(this.f7540b.getDouble(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(String str) {
        return this.f7540b.getString(str);
    }

    public final int f() {
        return this.f7540b.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new n(this);
    }

    public final Bundle j() {
        return new Bundle(this.f7540b);
    }

    public final String toString() {
        return this.f7540b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, j(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}

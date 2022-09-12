package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Distance extends AbstractBundleable {
    public static final Parcelable.Creator<Distance> CREATOR = new cld(Distance.class);
    private int a;
    private String b;
    private int c;

    public Distance() {
        this.a = -1;
        this.c = 0;
    }

    private Distance(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putInt("meters", this.a);
        bundle.putString("display_value", this.b);
        bundle.putInt("display_unit", this.c);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = bundle.getInt("meters", -1);
        this.b = bundle.getString("display_value");
        this.c = bundle.getInt("display_unit", 0);
    }

    public static Distance c(int i, String str, int i2) {
        if (i >= 0) {
            if (str == null) {
                throw new IllegalArgumentException("DisplayValue must not be null.");
            }
            return new Distance(i, str, i2);
        }
        throw new IllegalArgumentException("Meters must be a positive value");
    }
}

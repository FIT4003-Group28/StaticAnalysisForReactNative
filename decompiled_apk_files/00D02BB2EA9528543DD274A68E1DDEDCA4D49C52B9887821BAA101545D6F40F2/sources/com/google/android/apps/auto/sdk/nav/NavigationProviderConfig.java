package com.google.android.apps.auto.sdk.nav;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationProviderConfig extends AbstractBundleable {
    public static final Parcelable.Creator<NavigationProviderConfig> CREATOR = new cld(NavigationProviderConfig.class);
    private int a;
    private int b;

    public NavigationProviderConfig() {
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putInt("MIN_VERSION", this.a);
        bundle.putInt("MAX_VERSION", this.b);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = bundle.getInt("MIN_VERSION");
        this.b = bundle.getInt("MAX_VERSION");
    }

    public NavigationProviderConfig(int i, int i2) {
        if (i <= i2) {
            if (i > 0) {
                this.a = i;
                this.b = i2;
                return;
            }
            throw new IllegalArgumentException("Min version was <= 0. Min version must be > 0");
        }
        throw new IllegalArgumentException("Min version was greater than max version. Min version must be less than max version");
    }
}

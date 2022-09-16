package com.google.android.apps.auto.sdk.nav;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationClientConfig extends AbstractBundleable {
    public static final Parcelable.Creator<NavigationClientConfig> CREATOR = new cld(NavigationClientConfig.class);
    public Bundle a;
    private int b;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putInt("version", this.b);
        bundle.putBundle("dynamic_configuration", this.a);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.b = bundle.getInt("version");
        Bundle bundle2 = bundle.getBundle("dynamic_configuration");
        this.a = bundle2;
        if (bundle2 == null) {
            this.a = new Bundle();
        }
    }
}

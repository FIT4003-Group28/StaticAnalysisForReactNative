package com.google.android.apps.auto.sdk.nav;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ClientMode extends AbstractBundleable {
    public static final Parcelable.Creator<ClientMode> CREATOR = new cld(ClientMode.class);
    public int a;

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putInt("mode", this.a);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = bundle.getInt("mode");
    }
}

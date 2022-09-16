package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LaneDirection extends AbstractBundleable {
    public static final Parcelable.Creator<LaneDirection> CREATOR = new cld(LaneDirection.class);
    private int a;
    private boolean b;

    public LaneDirection() {
        this.a = 0;
    }

    private LaneDirection(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static LaneDirection c(int i, boolean z) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(34);
            sb.append("Lane shape is invalid: ");
            sb.append(0);
            throw new IllegalArgumentException(sb.toString());
        }
        return new LaneDirection(i, z);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putInt("lane_shape", this.a);
        bundle.putBoolean("is_highlighted", this.b);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = bundle.getInt("lane_shape");
        this.b = bundle.getBoolean("is_highlighted");
    }
}

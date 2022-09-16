package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class Lane extends AbstractBundleable {
    public static final Parcelable.Creator<Lane> CREATOR = new cld(Lane.class);
    private List<LaneDirection> a;

    public Lane() {
    }

    public Lane(List<LaneDirection> list) {
        this.a = list;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = bundle.getParcelableArrayList("lane_directions");
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        List<LaneDirection> list = this.a;
        bundle.putParcelableArrayList("lane_directions", list == null ? null : new ArrayList<>(list));
    }
}

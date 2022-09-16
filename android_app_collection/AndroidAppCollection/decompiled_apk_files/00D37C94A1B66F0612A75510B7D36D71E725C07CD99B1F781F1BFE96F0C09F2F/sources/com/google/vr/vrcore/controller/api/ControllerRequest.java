package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.base.api.ParcelableProtoLite;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ControllerRequest extends ParcelableProtoLite {
    public static final Parcelable.Creator CREATOR = new axfs(3);

    public ControllerRequest() {
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProtoLite
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ControllerRequest)) {
            return false;
        }
        return Arrays.equals(((ControllerRequest) obj).a, this.a);
    }

    public ControllerRequest(Parcel parcel) {
        super(parcel);
    }
}

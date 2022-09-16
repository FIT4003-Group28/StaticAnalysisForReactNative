package com.google.vr.vrcore.controller.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControllerTrackingStatusEvent extends ControllerEvent {
    public static final Parcelable.Creator CREATOR = new axfs(5);
    public int a = 0;

    public ControllerTrackingStatusEvent() {
    }

    public int a() {
        return 20;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent
    public void b(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        super.b(parcel);
        this.a = parcel.readInt();
        parcel.setDataPosition(dataPosition + readInt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.vr.vrcore.controller.api.ControllerEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(20);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        if (parcel.dataPosition() - dataPosition == 20) {
            return;
        }
        throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
    }

    public ControllerTrackingStatusEvent(Parcel parcel) {
        b(parcel);
    }
}

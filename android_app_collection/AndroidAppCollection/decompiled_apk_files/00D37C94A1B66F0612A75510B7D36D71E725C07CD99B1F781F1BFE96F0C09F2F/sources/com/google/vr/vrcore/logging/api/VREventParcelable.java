package com.google.vr.vrcore.logging.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VREventParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axfs(6);
    final anfj a;
    private final anfk b;

    public VREventParcelable(Parcel parcel) {
        anfk a = anfk.a(parcel.readInt());
        this.b = a == null ? anfk.UNKNOWN_EVENT_TYPE : a;
        anfj anfjVar = null;
        try {
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray != null) {
                anfjVar = (anfj) anfu.c(createByteArray).mo52toBuilder();
            }
        } catch (IOException e) {
            String.valueOf(String.valueOf(e)).length();
        }
        this.a = anfjVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b.eD);
        anfj anfjVar = this.a;
        parcel.writeByteArray(anfjVar == null ? null : ((anfu) anfjVar.mo39build()).toByteArray());
    }

    public VREventParcelable(anfk anfkVar, anfj anfjVar) {
        anfkVar.getClass();
        this.b = anfkVar;
        this.a = anfjVar;
    }
}

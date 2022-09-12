package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
/* compiled from: PG */
/* renamed from: cpyp  reason: default package */
/* loaded from: classes5.dex */
public abstract class cpyp extends clb implements cpyq {
    public cpyp() {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            e(parcel.createByteArray());
        } else if (i != 2) {
            return false;
        } else {
            parcel.readString();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) clc.d(parcel, ParcelFileDescriptor.CREATOR);
        }
        return true;
    }
}

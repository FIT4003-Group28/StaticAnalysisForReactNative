package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_PersonExtendedData extends C$AutoValue_PersonExtendedData implements Parcelable {
    public static final Parcelable.Creator<AutoValue_PersonExtendedData> CREATOR = new cydh();
    private static final ClassLoader c = AutoValue_PersonExtendedData.class.getClassLoader();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AutoValue_PersonExtendedData(android.os.Parcel r5) {
        /*
            r4 = this;
            java.lang.ClassLoader r0 = com.google.android.libraries.social.populous.core.AutoValue_PersonExtendedData.c
            java.lang.Object r1 = r5.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            byte r2 = r5.readByte()
            r3 = 1
            if (r2 != r3) goto L1a
            android.os.Parcelable r5 = r5.readParcelable(r0)
            com.google.android.libraries.social.populous.core.DynamiteExtendedData r5 = (com.google.android.libraries.social.populous.core.DynamiteExtendedData) r5
            goto L1b
        L1a:
            r5 = 0
        L1b:
            r4.<init>(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_PersonExtendedData.<init>(android.os.Parcel):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.a));
        parcel.writeByte(this.b == null ? (byte) 0 : (byte) 1);
        DynamiteExtendedData dynamiteExtendedData = this.b;
        if (dynamiteExtendedData != null) {
            parcel.writeParcelable(dynamiteExtendedData, 0);
        }
    }

    public AutoValue_PersonExtendedData(boolean z, DynamiteExtendedData dynamiteExtendedData) {
        super(z, dynamiteExtendedData);
    }
}

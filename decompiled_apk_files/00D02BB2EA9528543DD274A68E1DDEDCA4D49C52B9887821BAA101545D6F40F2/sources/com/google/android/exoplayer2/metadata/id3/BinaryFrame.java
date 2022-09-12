package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new cmcl();
    public final byte[] a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BinaryFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.cmny.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = defpackage.cmny.c(r3)
            byte[] r3 = (byte[]) r3
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (this.f.equals(binaryFrame.f) && Arrays.equals(this.a, binaryFrame.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.a);
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }
}

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new cntm();
    final int a;
    ParcelFileDescriptor b;
    final int c;
    public File d;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    private static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b != null) {
            int d = cnwn.d(parcel);
            cnwn.g(parcel, 1, this.a);
            cnwn.u(parcel, 2, this.b, i | 1);
            cnwn.g(parcel, 3, this.c);
            cnwn.c(parcel, d);
            this.b = null;
            return;
        }
        cnwc.a(null);
        throw null;
    }
}

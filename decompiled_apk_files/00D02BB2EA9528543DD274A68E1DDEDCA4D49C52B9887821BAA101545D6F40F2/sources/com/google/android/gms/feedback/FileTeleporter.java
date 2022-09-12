package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FileTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileTeleporter> CREATOR = new cocy();
    ParcelFileDescriptor a;
    final String b;
    final String c;
    public File d;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            File file = this.d;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.a = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        Object[] objArr = null;
                        try {
                            try {
                                dataOutputStream.writeInt(objArr.length);
                                dataOutputStream.writeUTF(this.b);
                                dataOutputStream.writeUTF(this.c);
                                dataOutputStream.write((byte[]) null);
                            } catch (IOException e) {
                                throw new IllegalStateException("Could not write into unlinked file", e);
                            }
                        } finally {
                            a(dataOutputStream);
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file:", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
        }
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.c(parcel, d);
    }
}

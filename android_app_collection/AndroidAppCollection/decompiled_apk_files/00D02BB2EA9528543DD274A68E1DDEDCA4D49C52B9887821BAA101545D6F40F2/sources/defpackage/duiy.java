package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.dynamite.client.INativeLibraryLoader;
/* compiled from: PG */
/* renamed from: duiy  reason: default package */
/* loaded from: classes6.dex */
public final class duiy extends cla implements INativeLibraryLoader {
    public duiy(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel Si = Si(2, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel Si = Si(1, a);
        long readLong = Si.readLong();
        Si.recycle();
        return readLong;
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rat  reason: default package */
/* loaded from: classes4.dex */
public final class rat extends dvc implements IInterface {
    public rat(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() {
        Parcel pw = pw(6, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }
}

package defpackage;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: qdl  reason: default package */
/* loaded from: classes4.dex */
public final class qdl extends dvc implements qdn {
    public qdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // defpackage.qdn
    public final double a() {
        Parcel pw = pw(3, pv());
        double readDouble = pw.readDouble();
        pw.recycle();
        return readDouble;
    }

    @Override // defpackage.qdn
    public final int f() {
        Parcel pw = pw(5, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.qdn
    public final int g() {
        Parcel pw = pw(4, pv());
        int readInt = pw.readInt();
        pw.recycle();
        return readInt;
    }

    @Override // defpackage.qdn
    public final Uri h() {
        Parcel pw = pw(2, pv());
        Uri uri = (Uri) dve.a(pw, Uri.CREATOR);
        pw.recycle();
        return uri;
    }

    @Override // defpackage.qdn
    public final rad i() {
        rad rabVar;
        Parcel pw = pw(1, pv());
        IBinder readStrongBinder = pw.readStrongBinder();
        if (readStrongBinder == null) {
            rabVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof rad) {
                rabVar = (rad) queryLocalInterface;
            } else {
                rabVar = new rab(readStrongBinder);
            }
        }
        pw.recycle();
        return rabVar;
    }
}

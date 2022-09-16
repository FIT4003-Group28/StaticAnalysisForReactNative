package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyc  reason: default package */
/* loaded from: classes.dex */
public final class alyc extends dvc implements IInterface {
    public alyc(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IConnectionCallbacks");
    }

    public final void a(String str, IBinder iBinder) {
        Parcel pv = pv();
        pv.writeString(str);
        pv.writeStrongBinder(iBinder);
        px(1, pv);
    }
}

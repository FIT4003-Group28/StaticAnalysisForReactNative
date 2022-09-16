package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: alyb  reason: default package */
/* loaded from: classes.dex */
public final class alyb extends dvc implements IInterface {
    public alyb(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IAsyncResultCallback");
    }

    public final void a(long j) {
        Parcel pv = pv();
        pv.writeLong(j);
        px(2, pv);
    }
}

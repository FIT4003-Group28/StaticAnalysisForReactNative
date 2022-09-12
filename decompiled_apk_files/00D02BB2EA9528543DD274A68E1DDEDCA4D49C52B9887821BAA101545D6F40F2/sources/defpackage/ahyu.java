package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.gmm.locationsharing.interprocess.api.InterfaceVersion;
/* compiled from: PG */
/* renamed from: ahyu  reason: default package */
/* loaded from: classes2.dex */
public final class ahyu extends cla implements IInterface {
    public ahyu(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.gmm.locationsharing.interprocess.api.IInterfaceVersionListener");
    }

    public final void e(InterfaceVersion interfaceVersion) {
        Parcel a = a();
        clc.e(a, interfaceVersion);
        Sj(2, a);
    }
}

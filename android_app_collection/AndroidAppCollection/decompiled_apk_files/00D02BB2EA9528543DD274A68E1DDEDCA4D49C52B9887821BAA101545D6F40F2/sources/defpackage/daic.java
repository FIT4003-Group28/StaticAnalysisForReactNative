package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
/* compiled from: PG */
/* renamed from: daic  reason: default package */
/* loaded from: classes5.dex */
public final class daic extends cla implements IInterface {
    public daic(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
    }

    public final void e(String str, List<Bundle> list, Bundle bundle, daie daieVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeTypedList(list);
        clc.e(a, bundle);
        clc.f(a, daieVar);
        Sj(1, a);
    }

    public final void f(String str, Bundle bundle, daie daieVar) {
        Parcel a = a();
        a.writeString(str);
        clc.e(a, bundle);
        clc.f(a, daieVar);
        Sj(2, a);
    }
}

package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
/* compiled from: PG */
/* renamed from: damj  reason: default package */
/* loaded from: classes5.dex */
public final class damj extends cla implements IInterface {
    public damj(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    public final void e(String str, List<Bundle> list, Bundle bundle, daml damlVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeTypedList(list);
        clc.e(a, bundle);
        clc.f(a, damlVar);
        Sj(2, a);
    }

    public final void f(String str, List<Bundle> list, Bundle bundle, daml damlVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeTypedList(list);
        clc.e(a, bundle);
        clc.f(a, damlVar);
        Sj(13, a);
    }

    public final void g(String str, List<Bundle> list, Bundle bundle, daml damlVar) {
        Parcel a = a();
        a.writeString(str);
        a.writeTypedList(list);
        clc.e(a, bundle);
        clc.f(a, damlVar);
        Sj(14, a);
    }
}

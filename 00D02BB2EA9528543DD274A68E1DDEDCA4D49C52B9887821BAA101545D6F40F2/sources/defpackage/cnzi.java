package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
/* compiled from: PG */
/* renamed from: cnzi  reason: default package */
/* loaded from: classes5.dex */
public final class cnzi extends cla implements IInterface {
    public cnzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextManagerService");
    }

    public final void e(cnzh cnzhVar, String str, String str2, String str3, WriteBatchImpl writeBatchImpl) {
        Parcel a = a();
        clc.f(a, cnzhVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        clc.e(a, writeBatchImpl);
        Sk(1, a);
    }

    public final void f(cnzh cnzhVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        Parcel a = a();
        clc.f(a, cnzhVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        clc.e(a, contextDataFilterImpl);
        clc.e(a, null);
        Sk(2, a);
    }

    public final void g(cnzh cnzhVar, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, cnzf cnzfVar) {
        Parcel a = a();
        clc.f(a, cnzhVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        clc.e(a, contextDataFilterImpl);
        clc.e(a, null);
        clc.f(a, cnzfVar);
        clc.e(a, null);
        Sk(5, a);
    }

    public final void h(cnzh cnzhVar, String str, String str2, String str3, cnzf cnzfVar) {
        Parcel a = a();
        clc.f(a, cnzhVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        clc.f(a, cnzfVar);
        clc.e(a, null);
        Sk(6, a);
    }
}

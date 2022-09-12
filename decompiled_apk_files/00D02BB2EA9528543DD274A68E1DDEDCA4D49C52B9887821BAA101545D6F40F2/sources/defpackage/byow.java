package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: byow  reason: default package */
/* loaded from: classes4.dex */
public final class byow implements dbrn<IBinder, danq> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ danq a(IBinder iBinder) {
        IBinder iBinder2 = iBinder;
        if (iBinder2 == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.remotesearch.IRemoteSearchService");
        return queryLocalInterface instanceof danq ? (danq) queryLocalInterface : new danq(iBinder2);
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: dow  reason: default package */
/* loaded from: classes3.dex */
final class dow implements IInterface {
    public final IBinder a;

    public dow(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}

package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: qxq  reason: default package */
/* loaded from: classes4.dex */
final class qxq implements IInterface {
    public final IBinder a;

    public qxq(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}

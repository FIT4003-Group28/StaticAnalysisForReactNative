package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: fb  reason: default package */
/* loaded from: classes3.dex */
final class fb implements IInterface {
    public final IBinder a;

    public fb(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}

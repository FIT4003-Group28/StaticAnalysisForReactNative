package defpackage;

import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: cl  reason: default package */
/* loaded from: classes2.dex */
public final class cl implements IInterface {
    public final IBinder a;

    public cl(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}

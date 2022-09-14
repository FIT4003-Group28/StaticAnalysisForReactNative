package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class e extends a implements c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // c.e.a.b.d.g.c
    public final void a(String str, String str2, Bundle bundle, long j) {
        Parcel e2 = e();
        e2.writeString(str);
        e2.writeString(str2);
        b0.a(e2, bundle);
        e2.writeLong(j);
        b(1, e2);
    }

    @Override // c.e.a.b.d.g.c
    public final int f() {
        Parcel a2 = a(2, e());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }
}

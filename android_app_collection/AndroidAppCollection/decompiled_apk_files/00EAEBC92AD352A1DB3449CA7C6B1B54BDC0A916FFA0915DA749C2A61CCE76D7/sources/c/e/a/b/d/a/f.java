package c.e.a.b.d.a;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class f extends a implements d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // c.e.a.b.d.a.d
    public final String a() {
        Parcel a2 = a(1, e());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // c.e.a.b.d.a.d
    public final boolean a(boolean z) {
        Parcel e2 = e();
        c.a(e2, true);
        Parcel a2 = a(2, e2);
        boolean a3 = c.a(a2);
        a2.recycle();
        return a3;
    }
}

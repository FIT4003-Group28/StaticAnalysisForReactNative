package c.e.a.b.e.b;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class h extends c.e.a.b.d.b.b implements f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // c.e.a.b.e.b.f
    public final void a(j jVar, d dVar) {
        Parcel e2 = e();
        c.e.a.b.d.b.c.a(e2, jVar);
        c.e.a.b.d.b.c.a(e2, dVar);
        a(12, e2);
    }
}

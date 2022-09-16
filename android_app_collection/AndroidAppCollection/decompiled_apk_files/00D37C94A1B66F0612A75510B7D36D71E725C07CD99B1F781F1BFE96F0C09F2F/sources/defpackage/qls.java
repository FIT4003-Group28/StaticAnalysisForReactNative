package defpackage;

import android.content.Context;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qls  reason: default package */
/* loaded from: classes4.dex */
public final class qls {
    public static final qpu a = new qpu("SessionManager");
    public final qlj b;
    private final Context c;

    public qls(qlj qljVar, Context context) {
        this.b = qljVar;
        this.c = context;
    }

    public final qku a() {
        qnm.g("Must be called from the main thread.");
        qlr b = b();
        if (b == null || !(b instanceof qku)) {
            return null;
        }
        return (qku) b;
    }

    public final qlr b() {
        qnm.g("Must be called from the main thread.");
        try {
            return (qlr) rac.b(this.b.a());
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void d(boolean z) {
        qnm.g("Must be called from the main thread.");
        try {
            a.a("End session for %s", this.c.getPackageName());
            this.b.g(z);
        } catch (RemoteException unused) {
        }
    }

    public final void c(qlt qltVar, Class cls) {
        if (qltVar == null) {
            throw new NullPointerException("SessionManagerListener can't be null");
        }
        qnm.g("Must be called from the main thread.");
        try {
            this.b.h(new qlk(qltVar, cls));
        } catch (RemoteException unused) {
        }
    }
}

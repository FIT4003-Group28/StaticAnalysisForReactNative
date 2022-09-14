package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cohi  reason: default package */
/* loaded from: classes5.dex */
public final class cohi {
    private final dbug a;
    private final long b;
    private final cohm c;

    public cohi(cohm cohmVar) {
        this.c = cohmVar;
        dbug dbugVar = dbpc.a;
        this.a = dbugVar;
        this.b = dbugVar.a();
    }

    public final void a(cogc cogcVar) {
        dbsk.t(cogcVar, "iterator must not be null");
        long a = this.a.a() - this.b;
        cohg cohgVar = new cohg(cogcVar, this.a);
        try {
            this.c.e(cohgVar, a);
        } catch (RemoteException unused) {
            cohgVar.b();
        }
    }

    public final void b(int i, @dzsi String str) {
        try {
            this.c.f(new Status(i, str), this.a.a() - this.b);
        } catch (RemoteException unused) {
        }
    }
}

package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: qmk  reason: default package */
/* loaded from: classes4.dex */
public final class qmk extends kt {
    private final qmj a;

    static {
        new qpu("MediaRouterCallback");
    }

    public qmk(qmj qmjVar) {
        qnm.b(qmjVar);
        this.a = qmjVar;
    }

    @Override // defpackage.kt
    public final void A(bhc bhcVar, int i) {
        if (bhcVar.k != 1) {
            return;
        }
        try {
            this.a.i(bhcVar.c, bhcVar.q, i);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.kt
    public final void s(bhc bhcVar) {
        try {
            this.a.a(bhcVar.c, bhcVar.q);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.kt
    public final void t(bhc bhcVar) {
        try {
            this.a.f(bhcVar.c, bhcVar.q);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.kt
    public final void u(bhc bhcVar) {
        try {
            this.a.g(bhcVar.c, bhcVar.q);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.kt
    public final void y(bhc bhcVar, int i) {
        if (bhcVar.k != 1) {
            return;
        }
        try {
            this.a.h(bhcVar.c, bhcVar.q);
        } catch (RemoteException unused) {
        }
    }
}

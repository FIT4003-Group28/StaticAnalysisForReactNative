package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qto  reason: default package */
/* loaded from: classes4.dex */
public abstract class qto {
    public final int c;

    public qto(int i) {
        this.c = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(qum qumVar);

    public abstract void g(que queVar, boolean z);
}

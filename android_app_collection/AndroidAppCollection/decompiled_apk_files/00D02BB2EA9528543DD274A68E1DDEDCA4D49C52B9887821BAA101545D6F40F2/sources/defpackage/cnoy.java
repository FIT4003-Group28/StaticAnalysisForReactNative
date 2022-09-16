package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnoy  reason: default package */
/* loaded from: classes.dex */
public abstract class cnoy {
    public final int c;

    public cnoy(int i) {
        this.c = i;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(cnpy cnpyVar, boolean z);

    public abstract void f(cnrj<?> cnrjVar);
}

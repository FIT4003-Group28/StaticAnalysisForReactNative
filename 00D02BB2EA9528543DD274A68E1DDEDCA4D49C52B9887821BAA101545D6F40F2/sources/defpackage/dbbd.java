package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.ar.core.ArCoreApk;
/* compiled from: PG */
/* renamed from: dbbd  reason: default package */
/* loaded from: classes5.dex */
final class dbbd implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ ArCoreApk.ICheckAvailabilityCallback b;
    final /* synthetic */ dbbk c;

    public dbbd(dbbk dbbkVar, Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        this.c = dbbkVar;
        this.a = context;
        this.b = iCheckAvailabilityCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.e.f(this.a.getApplicationInfo().packageName, dbbk.h(), new dbbc(this));
        } catch (RemoteException unused) {
            this.b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}

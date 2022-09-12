package defpackage;

import com.google.ar.core.ArCoreApk;
/* compiled from: PG */
/* renamed from: dban  reason: default package */
/* loaded from: classes5.dex */
final class dban implements ArCoreApk.ICheckAvailabilityCallback {
    final /* synthetic */ dbao a;

    public dban(dbao dbaoVar) {
        this.a = dbaoVar;
    }

    @Override // com.google.ar.core.ArCoreApk.ICheckAvailabilityCallback
    public final void onResult(ArCoreApk.Availability availability) {
        synchronized (this.a) {
            dbao dbaoVar = this.a;
            dbaoVar.d = availability;
            dbaoVar.e = false;
        }
    }
}

package defpackage;

import com.google.ar.core.ArCoreApk;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dbat  reason: default package */
/* loaded from: classes5.dex */
public final class dbat implements ArCoreApk.ICheckAvailabilityCallback {
    final /* synthetic */ AtomicReference a;

    public dbat(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // com.google.ar.core.ArCoreApk.ICheckAvailabilityCallback
    public final void onResult(ArCoreApk.Availability availability) {
        this.a.set(availability);
    }
}

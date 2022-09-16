package defpackage;

import com.google.android.apps.gmm.location.navigation.LocationIntegratorJni;
/* compiled from: PG */
/* renamed from: ahoh  reason: default package */
/* loaded from: classes2.dex */
final class ahoh extends LocationIntegratorJni {
    public final boolean a = false;

    public ahoh(byte[] bArr, float f) {
        b();
        this.c = LocationIntegratorJni.nativeCreateRouteLocationIntegrator(bArr, true, f);
    }
}

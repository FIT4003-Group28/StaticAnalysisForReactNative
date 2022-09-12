package defpackage;

import com.google.android.apps.gmm.location.navigation.LocationIntegratorJni;
/* compiled from: PG */
/* renamed from: ahoi  reason: default package */
/* loaded from: classes2.dex */
final class ahoi extends LocationIntegratorJni {
    public final boolean a = false;

    public ahoi(long j, byte[] bArr, String str, String str2, float f, boolean z, boolean z2, boolean z3, long j2, byte[] bArr2) {
        b();
        this.c = LocationIntegratorJni.nativeCreateSnaptileLocationIntegrator(j, bArr, true, str, str2, f, z, z2, z3, j2, bArr2);
    }

    public final void a(boolean z) {
        if (!d()) {
            return;
        }
        nativeEnableAcausalResolver(this.c, z);
    }
}

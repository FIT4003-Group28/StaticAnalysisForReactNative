package defpackage;

import com.google.android.apps.gmm.location.navigation.LocationIntegratorJni;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: craw  reason: default package */
/* loaded from: classes5.dex */
public final class craw {
    public static final void a(GmmLocation gmmLocation) {
        bvrj.NAVIGATION_INTERNAL.c();
        amvu amvuVar = gmmLocation.l;
        ahmr ahmrVar = amvuVar != null ? amvuVar.z : null;
        if (ahmrVar != null) {
            long j = ahmrVar.a;
            if (j == 0) {
                return;
            }
            LocationIntegratorJni.nativeDeleteLocationIntegratorResult(j);
            ahmrVar.a = 0L;
        }
    }

    public final void finalize() {
    }
}

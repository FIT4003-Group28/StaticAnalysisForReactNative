package defpackage;

import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* renamed from: dhia  reason: default package */
/* loaded from: classes6.dex */
public final class dhia implements csdx {
    private final LensApi.LensAvailabilityCallback a;
    private final int b;

    public dhia(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.a = lensAvailabilityCallback;
        this.b = i;
    }

    @Override // defpackage.csdx
    public final void a(csfl csflVar) {
        int a;
        int i = 1;
        if (this.b == 0 ? (a = csfk.a(csflVar.d)) != 0 : (a = csfk.a(csflVar.e)) != 0) {
            i = a;
        }
        this.a.onAvailabilityStatusFetched(i - 2);
    }
}

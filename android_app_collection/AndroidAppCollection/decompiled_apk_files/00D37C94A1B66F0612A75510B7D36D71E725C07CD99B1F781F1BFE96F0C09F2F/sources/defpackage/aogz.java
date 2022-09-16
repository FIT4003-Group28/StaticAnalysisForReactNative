package defpackage;

import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* renamed from: aogz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aogz implements tja {
    public final /* synthetic */ LensApi.LensAvailabilityCallback a;
    private final /* synthetic */ int b;

    public /* synthetic */ aogz(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.b = i;
        this.a = lensAvailabilityCallback;
    }

    @Override // defpackage.tja
    public final void a(int i) {
        if (this.b == 0) {
            LensApi.LensAvailabilityCallback lensAvailabilityCallback = this.a;
            int i2 = i - 2;
            int i3 = LensApi.c;
            if (i == 0) {
                throw null;
            }
            lensAvailabilityCallback.onAvailabilityStatusFetched(i2);
            return;
        }
        LensApi.LensAvailabilityCallback lensAvailabilityCallback2 = this.a;
        int i4 = i - 2;
        int i5 = LensApi.c;
        if (i == 0) {
            throw null;
        }
        lensAvailabilityCallback2.onAvailabilityStatusFetched(i4);
    }
}

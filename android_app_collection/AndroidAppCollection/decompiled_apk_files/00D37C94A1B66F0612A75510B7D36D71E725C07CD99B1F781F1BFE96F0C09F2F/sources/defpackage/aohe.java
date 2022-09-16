package defpackage;

import com.google.lens.sdk.LensApi;
/* compiled from: PG */
/* renamed from: aohe  reason: default package */
/* loaded from: classes.dex */
public final class aohe implements tiv {
    private final LensApi.LensAvailabilityCallback a;
    private final int b;

    public aohe(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.a = lensAvailabilityCallback;
        this.b = i;
    }

    @Override // defpackage.tiv
    public final void a(tjl tjlVar) {
        int c;
        int i = 1;
        if (this.b == 0 ? (c = tjw.c(tjlVar.e)) != 0 : (c = tjw.c(tjlVar.f)) != 0) {
            i = c;
        }
        this.a.onAvailabilityStatusFetched(i - 2);
    }
}

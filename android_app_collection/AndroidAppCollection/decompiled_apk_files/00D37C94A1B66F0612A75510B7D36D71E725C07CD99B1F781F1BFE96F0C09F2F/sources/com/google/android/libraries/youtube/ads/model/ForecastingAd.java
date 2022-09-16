package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ForecastingAd extends PlayerAd {
    public static final Parcelable.Creator CREATOR = new rxi(20);
    public static final xdk a = new xcc();
    public final aqzm b;

    public ForecastingAd(InstreamAdBreak instreamAdBreak, PlayerConfigModel playerConfigModel, String str, long j, aqzm aqzmVar) {
        this(instreamAdBreak.f, instreamAdBreak.i, instreamAdBreak.h, instreamAdBreak.g, instreamAdBreak.e, playerConfigModel, str, j, aqzmVar);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof ForecastingAd)) {
            return false;
        }
        ForecastingAd forecastingAd = (ForecastingAd) obj;
        return super.equals(forecastingAd) && akzj.f(this.b, forecastingAd.b);
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new xcc(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        zgd.K(this.b, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ForecastingAd(java.lang.String r13, byte[] r14, java.lang.String r15, java.lang.String r16, boolean r17, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r18, java.lang.String r19, long r20, defpackage.aqzm r22) {
        /*
            r12 = this;
            r11 = r22
            if (r17 == 0) goto L9
            long r0 = com.google.android.libraries.youtube.ads.model.ForecastingAd.d
            long r0 = r20 + r0
            goto Le
        L9:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Le:
            r8 = r0
            com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel r10 = new com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel
            apai r0 = defpackage.apai.a
            aopa r0 = r0.createBuilder()
            aopu r1 = r11.b
            r0.copyOnWrite()
            aopi r2 = r0.instance
            apai r2 = (defpackage.apai) r2
            aopu r3 = r2.b
            boolean r4 = r3.c()
            if (r4 != 0) goto L2e
            aopu r3 = defpackage.aopi.mutableCopy(r3)
            r2.b = r3
        L2e:
            aopu r2 = r2.b
            defpackage.aonk.addAll(r1, r2)
            aopi r0 = r0.mo39build()
            apai r0 = (defpackage.apai) r0
            r10.<init>(r0)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10)
            r22.getClass()
            r0.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.ads.model.ForecastingAd.<init>(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, java.lang.String, long, aqzm):void");
    }
}

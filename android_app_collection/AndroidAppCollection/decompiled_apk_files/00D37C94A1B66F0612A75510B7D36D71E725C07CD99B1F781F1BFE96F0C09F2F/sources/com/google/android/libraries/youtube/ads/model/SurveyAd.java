package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SurveyAd extends MediaBreakAd implements aall {
    public static final Parcelable.Creator CREATOR = new xcg(4);
    public static final xdk a = new xeb();
    public final avcu b;
    public final avee c;
    public final amuk p;

    public SurveyAd(InstreamAdBreak instreamAdBreak, PlayerConfigModel playerConfigModel, String str, avcu avcuVar) {
        this(instreamAdBreak.f, instreamAdBreak.i, instreamAdBreak.h, instreamAdBreak.g, instreamAdBreak.e, playerConfigModel, str, avcuVar);
    }

    public final apzg A() {
        avcu avcuVar = this.b;
        if ((avcuVar.b & 1) != 0) {
            apzg apzgVar = avcuVar.d;
            return apzgVar == null ? apzg.a : apzgVar;
        }
        return null;
    }

    @Override // defpackage.aall
    public final List B() {
        return this.p;
    }

    public final boolean ab() {
        avcu avcuVar = this.b;
        return (avcuVar.b & 512) == 0 || avcuVar.l;
    }

    public final SurveyQuestionRendererModel ac() {
        if (this.p.size() <= 0) {
            zep.l("Trying to retrieve question that is out of range.");
            return null;
        }
        return (SurveyQuestionRendererModel) this.p.get(0);
    }

    public final int ad() {
        int aF = awwc.aF(this.b.k);
        if (aF == 0) {
            return 1;
        }
        return aF;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        if (!this.p.isEmpty()) {
            return ac().a();
        }
        return 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof SurveyAd)) {
            return false;
        }
        SurveyAd surveyAd = (SurveyAd) obj;
        return super.equals(surveyAd) && akzj.f(this.b, surveyAd.b);
    }

    @Override // defpackage.afto
    public final /* bridge */ /* synthetic */ aftn h() {
        return new xeb(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    protected final int p() {
        return ac().c() * 1000;
    }

    public final aoob q() {
        return this.b.j;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyz qP() {
        avcu avcuVar = this.b;
        if ((avcuVar.b & 32) != 0) {
            aoyz aoyzVar = avcuVar.i;
            return aoyzVar == null ? aoyz.a : aoyzVar;
        }
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final apaj s() {
        apaj apajVar = this.b.h;
        return apajVar == null ? apaj.a : apajVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        zgd.K(this.b, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SurveyAd(java.lang.String r12, byte[] r13, java.lang.String r14, java.lang.String r15, boolean r16, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r17, java.lang.String r18, defpackage.avcu r19) {
        /*
            r11 = this;
            r9 = r11
            r10 = r19
            com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel r8 = new com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel
            aopu r0 = r10.c
            int r0 = r0.size()
            if (r0 <= 0) goto L2f
            aopu r0 = r10.c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            avcw r0 = (defpackage.avcw) r0
            int r1 = r0.b
            r1 = r1 & 1
            if (r1 == 0) goto L2f
            avct r0 = r0.c
            if (r0 != 0) goto L22
            avct r0 = defpackage.avct.a
        L22:
            avcv r0 = r0.f
            if (r0 != 0) goto L28
            avcv r0 = defpackage.avcv.a
        L28:
            apai r0 = r0.e
            if (r0 != 0) goto L31
            apai r0 = defpackage.apai.a
            goto L31
        L2f:
            apai r0 = defpackage.apai.a
        L31:
            r8.<init>(r0)
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r19.getClass()
            r9.b = r10
            aunb r0 = r10.e
            if (r0 != 0) goto L4d
            aunb r0 = defpackage.aunb.a
        L4d:
            aopg r1 = com.google.protos.youtube.api.innertube.SurveyTextInterstitialRendererOuterClass.surveyTextInterstitialRenderer
            java.lang.Object r0 = defpackage.ajjh.l(r0, r1)
            avee r0 = (defpackage.avee) r0
            r9.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            aopu r1 = r10.c
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()
            avcw r2 = (defpackage.avcw) r2
            int r3 = r2.b
            r3 = r3 & 1
            if (r3 == 0) goto L62
            com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel r3 = new com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel
            avct r2 = r2.c
            if (r2 != 0) goto L7c
            avct r2 = defpackage.avct.a
        L7c:
            r3.<init>(r2)
            r0.add(r3)
            goto L62
        L83:
            amuk r0 = defpackage.amuk.o(r0)
            r9.p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.ads.model.SurveyAd.<init>(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, java.lang.String, avcu):void");
    }
}

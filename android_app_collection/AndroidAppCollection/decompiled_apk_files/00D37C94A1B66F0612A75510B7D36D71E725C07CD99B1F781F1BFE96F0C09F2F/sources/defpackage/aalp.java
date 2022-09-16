package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aalp  reason: default package */
/* loaded from: classes.dex */
public final class aalp extends aftn {
    private VastAd a;

    public aalp() {
    }

    public aalp(VastAd vastAd) {
        this.a = vastAd;
    }

    private static final byte[] c(JSONObject jSONObject, String str) {
        String h = h(jSONObject, str);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        return Base64.decode(h, 2);
    }

    @Override // defpackage.aftn
    public final int a() {
        return 1;
    }

    @Override // defpackage.aftn
    protected final void d(JSONObject jSONObject) {
        q(jSONObject, "impressionUris", this.a.b);
        m(jSONObject, "adVideoId", this.a.c);
        m(jSONObject, "originalVideoId", this.a.d);
        m(jSONObject, "contentPlayerAdParams", this.a.e);
        m(jSONObject, "contentPlayerAdNextParams", this.a.f);
        m(jSONObject, "adPlayerAdNextParams", this.a.g);
        byte[] bArr = this.a.h;
        String str = null;
        m(jSONObject, "requestTrackingParams", bArr == null ? null : Base64.encodeToString(bArr, 2));
        m(jSONObject, "adBreakId", this.a.i);
        m(jSONObject, "vastAdId", this.a.j);
        m(jSONObject, "vastAdSystem", this.a.k);
        aalh aalhVar = this.a.l;
        jSONObject.put("billingPartner", aalhVar == null ? JSONObject.NULL : aalhVar.name());
        m(jSONObject, "adFormat", this.a.m);
        jSONObject.put("duration", this.a.n);
        PlayerResponseModel playerResponseModel = this.a.o;
        if (playerResponseModel != null) {
            m(jSONObject, "playerResponse", Base64.encodeToString(playerResponseModel.K(), 2));
        }
        m(jSONObject, "playbackTracking", Base64.encodeToString(this.a.p.k.toByteArray(), 2));
        m(jSONObject, "playerConfig", Base64.encodeToString(this.a.q.bb(), 2));
        m(jSONObject, "clickthroughUri", this.a.s);
        q(jSONObject, "startPingUris", this.a.t);
        q(jSONObject, "firstQuartilePingUris", this.a.u);
        q(jSONObject, "midpointPingUris", this.a.v);
        q(jSONObject, "thirdQuartilePingUris", this.a.w);
        n(jSONObject, "progressPings", this.a.x);
        q(jSONObject, "skipPingUris", this.a.y);
        q(jSONObject, "skipShownPingUris", this.a.z);
        q(jSONObject, "engagedViewPingUris", this.a.A);
        q(jSONObject, "completePingUris", this.a.B);
        q(jSONObject, "closePingUris", this.a.D);
        q(jSONObject, "pausePingUris", this.a.E);
        q(jSONObject, "resumePingUris", this.a.F);
        q(jSONObject, "mutePingUris", this.a.G);
        q(jSONObject, "fullscreenPingUris", this.a.H);
        q(jSONObject, "endFullscreenPingUris", this.a.I);
        q(jSONObject, "clickthroughPingUris", this.a.f165J);
        q(jSONObject, "videoTitleClickedPingUris", this.a.K);
        q(jSONObject, "errorPingUris", this.a.L);
        q(jSONObject, "exclusionReasonPingUris", this.a.M);
        q(jSONObject, "abandonPingUris", this.a.N);
        q(jSONObject, "instreamAdCompletePingUris", this.a.C);
        m(jSONObject, "videoAdTrackingTemplateUri", this.a.O);
        m(jSONObject, "adSenseBaseConversionUri", this.a.P);
        jSONObject.put("fallbackHint", this.a.Q);
        jSONObject.put("expirationTimeMillis", this.a.R);
        jSONObject.put("assetFrequencyCap", this.a.S);
        jSONObject.put("isPublicVideo", this.a.T);
        aphd aphdVar = this.a.U;
        if (aphdVar != null) {
            m(jSONObject, "adAnnotations", Base64.encodeToString(aphdVar.toByteArray(), 2));
        }
        arit aritVar = this.a.V;
        if (aritVar != null) {
            m(jSONObject, "adInfoCards", Base64.encodeToString(aritVar.toByteArray(), 2));
        }
        atzm atzmVar = this.a.r;
        if (atzmVar != null) {
            m(jSONObject, "playerAttestation", Base64.encodeToString(atzmVar.toByteArray(), 2));
        }
        jSONObject.put("requestTimeMilliseconds", this.a.Z);
        jSONObject.put("offlineShouldCountPlayback", this.a.aa);
        jSONObject.put("shouldAllowQueuedOfflinePings", this.a.ab);
        m(jSONObject, "adWrapperUri", this.a.W);
        o(jSONObject, "prefetchedAd", this.a.X);
        o(jSONObject, "parentWrapper", this.a.Y);
        n(jSONObject, "infoCards", this.a.ac);
        o(jSONObject, "survey", this.a.ad);
        q(jSONObject, "activeViewGroupMViewablePingUris", this.a.af);
        q(jSONObject, "activeViewViewablePingUris", this.a.ag);
        q(jSONObject, "activeViewMeasurablePingUris", this.a.ah);
        jSONObject.put("isSurveyEnabled", this.a.ae);
        Pattern pattern = this.a.ai;
        m(jSONObject, "trackingDecorationRegexpPattern", pattern == null ? "" : pattern.pattern());
        byte[] bArr2 = this.a.aj;
        if (bArr2 != null) {
            str = Base64.encodeToString(bArr2, 2);
        }
        m(jSONObject, "trackingParams", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0281  */
    @Override // defpackage.aftn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object b(org.json.JSONObject r73, int r74) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aalp.b(org.json.JSONObject, int):java.lang.Object");
    }
}

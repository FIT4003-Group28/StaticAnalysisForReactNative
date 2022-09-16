package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
/* compiled from: PG */
/* renamed from: aanx  reason: default package */
/* loaded from: classes.dex */
final class aanx extends zer {
    public aanx() {
        super("VideoStreamingDataFactory.Lazy<VideoStreamingData>.create()");
    }

    @Override // defpackage.zer
    /* renamed from: c */
    public final synchronized VideoStreamingData a() {
        aanz aanzVar;
        aopa createBuilder;
        aanzVar = aanz.a;
        createBuilder = asan.a.createBuilder();
        createBuilder.al(aanz.d().e);
        createBuilder.ak(aalx.DASH_FMP4_H264_ULTRALOW_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_LOW_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_MED_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_HIGH_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_HIGH_MQ_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_HIGH_HQ_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_720P_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_720P_MQ_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_720P_HFR_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_720P_MQ_HFR_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_720P_HQ_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_1080P_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_1080P_MQ_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_1080P_HFR_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_1080P_MQ_HFR_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_1080P_HQ_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_HE_AAC_LOW_CENC.a());
        createBuilder.ak(aalx.DASH_FMP4_AAC_MED_CENC.a());
        return aanzVar.e((asan) createBuilder.mo39build(), "zzzzzzzzzzz", 60000L);
    }
}

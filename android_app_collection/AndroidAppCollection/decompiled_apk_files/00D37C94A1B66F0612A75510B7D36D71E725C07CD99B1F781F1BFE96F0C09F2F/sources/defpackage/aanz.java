package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerThreedRendererModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aanz  reason: default package */
/* loaded from: classes.dex */
public final class aanz {
    public static final aanz a;
    @Deprecated
    public static final aanz b;
    public static final zer c;
    public static final zer d;
    private final aany[] e;

    static {
        aanz aanzVar = new aanz(new aany[0]);
        a = aanzVar;
        b = aanzVar;
        c = new aanw();
        d = new aanx();
    }

    public aanz(aany... aanyVarArr) {
        this.e = aanyVarArr;
    }

    public static VideoStreamingData b(String str, List list) {
        aanz aanzVar = a;
        aopa createBuilder = asan.a.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqzx aqzxVar = (aqzx) it.next();
            aopc aopcVar = (aopc) aqzx.b.createBuilder();
            int i = aqzxVar.d;
            aopcVar.copyOnWrite();
            aqzx aqzxVar2 = (aqzx) aopcVar.instance;
            aqzxVar2.c |= 1;
            aqzxVar2.d = i;
            int i2 = aqzxVar.g;
            aopcVar.copyOnWrite();
            aqzx aqzxVar3 = (aqzx) aopcVar.instance;
            aqzxVar3.c |= 8;
            aqzxVar3.g = i2;
            String str2 = aqzxVar.f;
            aopcVar.copyOnWrite();
            aqzx aqzxVar4 = (aqzx) aopcVar.instance;
            str2.getClass();
            aqzxVar4.c |= 4;
            aqzxVar4.f = str2;
            int i3 = aqzxVar.d;
            StringBuilder sb = new StringBuilder(28);
            sb.append("http://oda/?itag=");
            sb.append(i3);
            String sb2 = sb.toString();
            aopcVar.copyOnWrite();
            aqzx aqzxVar5 = (aqzx) aopcVar.instance;
            sb2.getClass();
            aqzxVar5.c |= 2;
            aqzxVar5.e = sb2;
            int i4 = aqzxVar.i;
            if (i4 > 0 && aqzxVar.j > 0) {
                aopcVar.copyOnWrite();
                aqzx aqzxVar6 = (aqzx) aopcVar.instance;
                aqzxVar6.c |= 32;
                aqzxVar6.i = i4;
                int i5 = aqzxVar.j;
                aopcVar.copyOnWrite();
                aqzx aqzxVar7 = (aqzx) aopcVar.instance;
                aqzxVar7.c |= 64;
                aqzxVar7.j = i5;
            }
            createBuilder.ak((aqzx) aopcVar.mo39build());
        }
        return aanzVar.e((asan) createBuilder.mo39build(), str, -9223372036854775807L);
    }

    public static VideoStreamingData c(int i) {
        aopa createBuilder = asan.a.createBuilder();
        aopc aopcVar = (aopc) aqzx.b.createBuilder();
        aopcVar.copyOnWrite();
        aqzx aqzxVar = (aqzx) aopcVar.instance;
        aqzxVar.c |= 1;
        aqzxVar.d = i;
        aopcVar.copyOnWrite();
        aqzx aqzxVar2 = (aqzx) aopcVar.instance;
        aqzxVar2.c |= 64;
        aqzxVar2.j = 144;
        createBuilder.copyOnWrite();
        asan asanVar = (asan) createBuilder.instance;
        aqzx aqzxVar3 = (aqzx) aopcVar.mo39build();
        aqzxVar3.getClass();
        asanVar.a();
        asanVar.e.add(aqzxVar3);
        return a.e((asan) createBuilder.mo39build(), "zzzzzzzzzzz", -9223372036854775807L);
    }

    public static asan d() {
        aopa createBuilder = asan.a.createBuilder();
        createBuilder.ak(aalx.DASH_FMP4_H264_2K.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_1080P.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_720P.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_HIGH.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_MED.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_LOW.a());
        createBuilder.ak(aalx.DASH_FMP4_H264_ULTRALOW.a());
        createBuilder.ak(aalx.DASH_WEBM_VP9_2K.a());
        createBuilder.ak(aalx.DASH_WEBM_VP9_1080P.a());
        createBuilder.ak(aalx.DASH_WEBM_VP9_720P.a());
        createBuilder.ak(aalx.DASH_WEBM_VP9_HIGH.a());
        createBuilder.ak(aalx.DASH_WEBM_VP9_MED.a());
        createBuilder.ak(aalx.DASH_WEBM_VP9_LOW.a());
        createBuilder.ak(aalx.DASH_WEBM_VP9_ULTRALOW.a());
        createBuilder.ak(aalx.DASH_FMP4_AV1_2K.a());
        createBuilder.ak(aalx.DASH_FMP4_AV1_1080P.a());
        createBuilder.ak(aalx.DASH_FMP4_AV1_720P.a());
        createBuilder.ak(aalx.DASH_FMP4_AV1_HIGH.a());
        createBuilder.ak(aalx.DASH_FMP4_AV1_MED.a());
        createBuilder.ak(aalx.DASH_FMP4_AV1_LOW.a());
        createBuilder.ak(aalx.DASH_FMP4_AV1_ULTRALOW.a());
        createBuilder.ak(aalx.DASH_FMP4_HE_AAC_LOW.a());
        createBuilder.ak(aalx.DASH_FMP4_AAC_MED.a());
        createBuilder.ak(aalx.DASH_WEBM_OPUS_LOW.a());
        createBuilder.ak(aalx.DASH_WEBM_OPUS_MED.a());
        createBuilder.ak(aalx.DASH_WEBM_OPUS_HIGH.a());
        createBuilder.an(aalx.MP4_AVCBASE640_AAC.a());
        createBuilder.an(aalx.MP4_AVC720P_AAC.a());
        return (asan) createBuilder.mo39build();
    }

    public final VideoStreamingData a(asan asanVar, String str, String str2, long j, long j2, boolean z, boolean z2, boolean z3, int i, ataz atazVar, PlayerThreedRendererModel playerThreedRendererModel, String str3, PlayerConfigModel playerConfigModel) {
        VideoStreamingData videoStreamingData = new VideoStreamingData(asanVar, str, j, j2, z, z2, z3, i, atazVar, playerThreedRendererModel, str3, playerConfigModel);
        aany[] aanyVarArr = this.e;
        int length = aanyVarArr.length;
        for (int i2 = 0; i2 < length; i2 = 1) {
            videoStreamingData = aanyVarArr[0].a(videoStreamingData, str2);
        }
        return videoStreamingData;
    }

    public final VideoStreamingData e(asan asanVar, String str, long j) {
        return a(asanVar, str, null, j, 0L, false, false, false, 0, ataz.MDE_STREAM_OPTIMIZATIONS_RENDERER_LATENCY_UNKNOWN, new PlayerThreedRendererModel(), "", PlayerConfigModel.b);
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aalx  reason: default package */
/* loaded from: classes.dex */
public enum aalx {
    INVALID_VIDEO_FORMAT(0, "", -1, -1, -1),
    RAW(15, "", -1, -1, -1),
    MP4_AVCBASE640_AAC(18, "video/mp4", b(400), 640, 360),
    MP4_H264_AAC_DVD(78, "video/mp4", b(720), 854, 480),
    MP4_H264_AAC_HIGH(59, "video/mp4", b(720), 854, 480),
    MP4_AVC720P_AAC(22, "video/mp4", c(2), 1280, 720),
    THREEGPP_MPEG4SP_AAC(17, "video/3gpp", b(56), 176, 144),
    THREEGPP_MPEG4SP_AAC_HIGH(36, "video/3gpp", b(192), 320, 240),
    M2TS_H264_AAC_MED(93, "", b(400), 640, 360),
    DASH_FMP4_AV1_ULTRALOW(394, "video/mp4", b(72), 256, 144),
    DASH_FMP4_AV1_LOW(395, "video/mp4", b(114), 426, 240),
    DASH_FMP4_AV1_MED(396, "video/mp4", b(210), 640, 360),
    DASH_FMP4_AV1_HIGH(397, "video/mp4", b(389), 854, 480),
    DASH_FMP4_AV1_720P(398, "video/mp4", b(778), 1280, 720),
    DASH_FMP4_AV1_1080P(399, "video/mp4", c(1), 1920, 1080),
    DASH_FMP4_AV1_2K(400, "video/mp4", c(5), 2560, 1440),
    DASH_FMP4_AV1_4K(401, "video/mp4", c(9), 3840, 2160),
    DASH_FMP4_AV1_8K(571, "video/mp4", c(18), 7680, 4320),
    DASH_FMP4_AV1_HIGHRES(402, "video/mp4", c(74), 14336, 14336),
    DASH_FMP4_AV1_ULTRALOW_HDR(694, "video/mp4", b(149), 256, 144),
    DASH_FMP4_AV1_LOW_HDR(695, "video/mp4", b(318), 426, 240),
    DASH_FMP4_AV1_MED_HDR(696, "video/mp4", b(663), 640, 360),
    DASH_FMP4_AV1_HIGH_HDR(697, "video/mp4", c(1), 854, 480),
    DASH_FMP4_AV1_720P_HDR(698, "video/mp4", c(3), 1280, 720),
    DASH_FMP4_AV1_1080P_HDR(699, "video/mp4", c(5), 1920, 1080),
    DASH_FMP4_AV1_2K_HDR(700, "video/mp4", c(14), 2560, 1440),
    DASH_FMP4_AV1_4K_HDR(701, "video/mp4", c(24), 3840, 2160),
    DASH_FMP4_AV1_8K_HDR(702, "video/mp4", c(49), 7680, 4320),
    DASH_FMP4_AV1_HIGHRES_HDR(703, "video/mp4", c(201), 14336, 14336),
    DASH_WEBM_VP9_ULTRALOW_LQ(598, "video/webm", b(28), 256, 144),
    DASH_WEBM_VP9_ULTRALOW(278, "video/webm", b(95), 256, 144),
    DASH_WEBM_VP9_LOW(242, "video/webm", b(150), 426, 240),
    DASH_WEBM_VP9_MED(243, "video/webm", b(276), 640, 360),
    DASH_WEBM_VP9_HIGH(244, "video/webm", b(512), 854, 480),
    DASH_WEBM_VP9_HIGH_MQ(245, "video/webm", b(750), 854, 480),
    DASH_WEBM_VP9_HIGH_HQ(246, "video/webm", c(1), 854, 480),
    DASH_WEBM_VP9_720P(247, "video/webm", c(1), 1280, 720),
    DASH_WEBM_VP9_720P_MQ(353, "video/webm", c(2), 1280, 720),
    DASH_WEBM_VP9_720P_HFR(302, "video/webm", c(2), 1280, 720),
    DASH_WEBM_VP9_720P_MQ_HFR(407, "video/webm", c(4), 1280, 720),
    DASH_WEBM_VP9_1080P(248, "video/webm", c(2), 1920, 1080),
    DASH_WEBM_VP9_1080P_MQ(355, "video/webm", c(4), 1920, 1080),
    DASH_WEBM_VP9_1080P_HFR(303, "video/webm", c(3), 1920, 1080),
    DASH_WEBM_VP9_1080P_MQ_HFR(408, "video/webm", c(6), 1920, 1080),
    DASH_WEBM_VP9_2K(271, "video/webm", c(6), 2560, 1440),
    DASH_WEBM_VP9_2K_HFR(308, "video/webm", c(9), 2560, 1440),
    DASH_WEBM_VP9_4K(313, "video/webm", c(12), 3840, 2160),
    DASH_WEBM_VP9_4K_HFR(315, "video/webm", c(18), 3840, 2160),
    DASH_WEBM_VP9_HIGHRES(272, "video/webm", c(18), 8192, 8192),
    DASH_WEBM_VP9_HDR_ULTRALOW(330, "video/webm", b(142), 256, 144),
    DASH_WEBM_VP9_HDR_LOW(331, "video/webm", b(225), 426, 240),
    DASH_WEBM_VP9_HDR_MED(332, "video/webm", b(414), 640, 360),
    DASH_WEBM_VP9_HDR_HIGH(333, "video/webm", b(768), 854, 480),
    DASH_WEBM_VP9_HDR_720P(334, "video/webm", c(2), 1280, 720),
    DASH_WEBM_VP9_HDR_1080P(335, "video/webm", c(3), 1920, 1080),
    DASH_WEBM_VP9_HDR_2K(336, "video/webm", c(9), 2560, 1440),
    DASH_WEBM_VP9_HDR_4K(337, "video/webm", c(18), 3840, 2160),
    DASH_WEBM_OPUS_ULTRALOW_LQ(600, "audio/webm", b(32)),
    DASH_WEBM_OPUS_LOW(249, "audio/webm", b(48)),
    DASH_WEBM_OPUS_MED(250, "audio/webm", b(64)),
    DASH_WEBM_OPUS_HIGH(251, "audio/webm", b(128)),
    DASH_WEBM_OPUS_AMBISONICS(338, "audio/webm", b(256)),
    DASH_WEBM_VORBIS_AMBISONICS(339, "audio/webm", b(256)),
    DASH_WEBM_VP9_LOW_ENC(279, "video/webm", b(150), 426, 240),
    DASH_WEBM_VP9_MED_ENC(280, "video/webm", b(276), 640, 360),
    DASH_WEBM_VP9_HIGH_ENC(317, "video/webm", b(512), 854, 480),
    DASH_WEBM_VP9_HIGH_MQ_ENC(318, "video/webm", b(750), 854, 480),
    DASH_WEBM_VP9_HIGH_HQ_ENC(273, "video/webm", c(1), 854, 480),
    DASH_WEBM_VP9_720P_ENC(274, "video/webm", c(1), 1280, 720),
    DASH_WEBM_VP9_720P_MQ_ENC(357, "video/webm", c(2), 1280, 720),
    DASH_WEBM_VP9_720P_HQ_ENC(358, "video/webm", c(4), 1280, 720),
    DASH_WEBM_VP9_720P_HFR_ENC(409, "video/webm", c(2), 1280, 720),
    DASH_WEBM_VP9_720P_MQ_HFR_ENC(410, "video/webm", c(4), 1280, 720),
    DASH_WEBM_VP9_1080P_ENC(275, "video/webm", c(2), 1920, 1080),
    DASH_WEBM_VP9_1080P_MQ_ENC(359, "video/webm", c(4), 1920, 1080),
    DASH_WEBM_VP9_1080P_HQ_ENC(360, "video/webm", c(5), 1920, 1080),
    DASH_WEBM_VP9_1080P_HFR_ENC(411, "video/webm", c(3), 1920, 1080),
    DASH_WEBM_VP9_1080P_MQ_HFR_ENC(412, "video/webm", c(6), 1920, 1080),
    DASH_WEBM_VP9_2K_ENC(276, "video/webm", c(6), 2560, 1440),
    DASH_WEBM_VP9_HIGHRES_ENC(277, "video/webm", c(18), 8192, 8192),
    DASH_FMP4_H264_ULTRALOW_LQ(597, "video/mp4", b(30), 256, 144),
    DASH_FMP4_H264_ULTRALOW(160, "video/mp4", b(108), 256, 144),
    DASH_FMP4_H264_LOW(133, "video/mp4", b(242), 426, 240),
    DASH_FMP4_H264_MED(134, "video/mp4", b(400), 640, 360),
    DASH_FMP4_H264_HIGH(135, "video/mp4", c(1), 854, 480),
    DASH_FMP4_H264_HIGH_MQ(212, "video/mp4", c(2), 854, 480),
    DASH_FMP4_H264_HIGH_HQ(213, "video/mp4", c(3), 854, 480),
    DASH_FMP4_H264_720P(136, "video/mp4", c(2), 1280, 720),
    DASH_FMP4_H264_720P_MQ(214, "video/mp4", c(3), 1280, 720),
    DASH_FMP4_H264_720P_HQ(215, "video/mp4", c(5), 1280, 720),
    DASH_FMP4_H264_720P_HFR(298, "video/mp4", c(3), 1280, 720),
    DASH_FMP4_H264_720P_MQ_HFR(374, "video/mp4", c(4), 1280, 720),
    DASH_FMP4_H264_1080P(137, "video/mp4", c(4), 1920, 1080),
    DASH_FMP4_H264_1080P_MQ(216, "video/mp4", c(5), 1920, 1080),
    DASH_FMP4_H264_1080P_HQ(217, "video/mp4", c(7), 1920, 1080),
    DASH_FMP4_H264_1080P_HFR(299, "video/mp4", c(5), 1920, 1080),
    DASH_FMP4_H264_1080P_MQ_HFR(375, "video/mp4", c(6), 1920, 1080),
    DASH_FMP4_H264_2K(264, "video/mp4", c(9), 2560, 1440),
    DASH_FMP4_H264_2K_HFR(304, "video/mp4", c(14), 2560, 1440),
    DASH_FMP4_H264_4K(266, "video/mp4", c(17), 3840, 2160),
    DASH_FMP4_H264_4K_HFR(305, "video/mp4", c(25), 3840, 2160),
    DASH_FMP4_H264_HIGHRES(138, "video/mp4", c(22), 8192, 8192),
    DASH_FMP4_HE_AAC_ULTRALOW_LQ(599, "audio/mp4", b(30)),
    DASH_FMP4_HE_AAC_LOW(139, "audio/mp4", b(48)),
    DASH_FMP4_AAC_MED(140, "audio/mp4", b(128)),
    DASH_FMP4_AAC_HIGH(141, "audio/mp4", b(256)),
    DASH_FMP4_AAC_51_LOW(256, "audio/mp4", b(192)),
    DASH_FMP4_AAC_51_HIGH(258, "audio/mp4", b(384)),
    DASH_FMP4_H264_ULTRALOW_CENC(161, "video/mp4", b(108), 256, 144),
    DASH_FMP4_H264_LOW_CENC(142, "video/mp4", b(242), 426, 240),
    DASH_FMP4_H264_MED_CENC(143, "video/mp4", b(400), 640, 360),
    DASH_FMP4_H264_HIGH_CENC(144, "video/mp4", c(1), 854, 480),
    DASH_FMP4_H264_HIGH_MQ_CENC(222, "video/mp4", c(2), 854, 480),
    DASH_FMP4_H264_HIGH_HQ_CENC(223, "video/mp4", c(3), 854, 480),
    DASH_FMP4_H264_720P_CENC(145, "video/mp4", c(2), 1280, 720),
    DASH_FMP4_H264_720P_MQ_CENC(224, "video/mp4", c(3), 1280, 720),
    DASH_FMP4_H264_720P_HFR_CENC(384, "video/mp4", c(3), 1280, 720),
    DASH_FMP4_H264_720P_MQ_HFR_CENC(376, "video/mp4", c(4), 1280, 720),
    DASH_FMP4_H264_720P_HQ_CENC(225, "video/mp4", c(5), 1280, 720),
    DASH_FMP4_H264_1080P_CENC(146, "video/mp4", c(4), 1920, 1080),
    DASH_FMP4_H264_1080P_MQ_CENC(226, "video/mp4", c(5), 1920, 1080),
    DASH_FMP4_H264_1080P_HFR_CENC(385, "video/mp4", c(5), 1920, 1080),
    DASH_FMP4_H264_1080P_MQ_HFR_CENC(377, "video/mp4", c(6), 1920, 1080),
    DASH_FMP4_H264_1080P_HQ_CENC(227, "video/mp4", c(7), 1920, 1080),
    DASH_FMP4_H264_HIGHRES_CENC(147, "video/mp4", c(22), 8192, 8192),
    DASH_FMP4_HE_AAC_LOW_CENC(148, "audio/mp4", b(48)),
    DASH_FMP4_AAC_MED_CENC(149, "audio/mp4", b(128)),
    DASH_FMP4_AAC_HIGH_CENC(150, "audio/mp4", b(256)),
    DASH_FMP4_AAC_51_LOW_CENC(259, "audio/mp4", b(192)),
    DASH_FMP4_AAC_51_HIGH_CENC(261, "audio/mp4", b(384)),
    DASH_FMP4_TT_FMT3(386, "text/mp4", b(8)),
    DASH_FMP4_TT_WEBVTT(387, "text/webvtt", b(8));
    
    public static final aalx bC;
    public final int bD;
    public final String bE;
    public final int bF;
    public final int bG;
    public final int bH;

    static {
        aalx aalxVar;
        bC = aalxVar;
    }

    aalx(int i, String str, int i2) {
        this(i, str, i2, -2, -2);
    }

    private static int b(int i) {
        return i << 10;
    }

    private static int c(int i) {
        return i << 20;
    }

    public final aqzx a() {
        aopc aopcVar = (aopc) aqzx.b.createBuilder();
        int i = this.bD;
        aopcVar.copyOnWrite();
        aqzx aqzxVar = (aqzx) aopcVar.instance;
        aqzxVar.c |= 1;
        aqzxVar.d = i;
        String str = this.bE;
        aopcVar.copyOnWrite();
        aqzx aqzxVar2 = (aqzx) aopcVar.instance;
        str.getClass();
        aqzxVar2.c |= 4;
        aqzxVar2.f = str;
        int i2 = this.bF;
        aopcVar.copyOnWrite();
        aqzx aqzxVar3 = (aqzx) aopcVar.instance;
        aqzxVar3.c |= 8;
        aqzxVar3.g = i2;
        int i3 = this.bG;
        if (i3 > 0 && this.bH > 0) {
            aopcVar.copyOnWrite();
            aqzx aqzxVar4 = (aqzx) aopcVar.instance;
            aqzxVar4.c |= 32;
            aqzxVar4.i = i3;
            int i4 = this.bH;
            aopcVar.copyOnWrite();
            aqzx aqzxVar5 = (aqzx) aopcVar.instance;
            aqzxVar5.c |= 64;
            aqzxVar5.j = i4;
        }
        return (aqzx) aopcVar.mo39build();
    }

    aalx(int i, String str, int i2, int i3, int i4) {
        this.bD = i;
        this.bE = str;
        this.bF = i2;
        this.bG = i3;
        this.bH = i4;
    }
}

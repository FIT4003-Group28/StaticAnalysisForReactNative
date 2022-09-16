package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aank  reason: default package */
/* loaded from: classes.dex */
public final class aank {
    private static final zer bI;
    private static final zer bJ;
    private static final zer bK;
    private static final zer bL;
    private static final zer bM;
    private static final zer bN;
    private static final zer bO;
    private static final zer bP;
    private static final zer bQ;
    private static final zer bR;
    private static final zer bS;
    public static final zer bn;
    public static final zer bo;
    public static final zer bp;
    public static final zer bq;
    public static final zer br;
    public static final zer bs;
    public static final zer bt;
    public static final int a = aalx.INVALID_VIDEO_FORMAT.bD;
    public static final int b = aalx.MP4_AVCBASE640_AAC.bD;
    public static final int c = aalx.MP4_H264_AAC_DVD.bD;
    public static final int d = aalx.MP4_H264_AAC_HIGH.bD;
    public static final int e = aalx.MP4_AVC720P_AAC.bD;
    public static final int f = aalx.THREEGPP_MPEG4SP_AAC.bD;
    public static final int g = aalx.THREEGPP_MPEG4SP_AAC_HIGH.bD;
    public static final int h = aalx.DASH_FMP4_AV1_ULTRALOW.bD;
    public static final int i = aalx.DASH_FMP4_AV1_LOW.bD;
    public static final int j = aalx.DASH_FMP4_AV1_MED.bD;
    public static final int k = aalx.DASH_FMP4_AV1_HIGH.bD;
    public static final int l = aalx.DASH_FMP4_AV1_720P.bD;
    public static final int m = aalx.DASH_FMP4_AV1_1080P.bD;
    public static final int n = aalx.DASH_FMP4_AV1_2K.bD;
    public static final int o = aalx.DASH_FMP4_AV1_4K.bD;
    public static final int p = aalx.DASH_FMP4_AV1_8K.bD;
    public static final int q = aalx.DASH_FMP4_AV1_HIGHRES.bD;
    public static final int r = aalx.DASH_FMP4_AV1_ULTRALOW_HDR.bD;
    public static final int s = aalx.DASH_FMP4_AV1_LOW_HDR.bD;
    public static final int t = aalx.DASH_FMP4_AV1_MED_HDR.bD;
    public static final int u = aalx.DASH_FMP4_AV1_HIGH_HDR.bD;
    public static final int v = aalx.DASH_FMP4_AV1_720P_HDR.bD;
    public static final int w = aalx.DASH_FMP4_AV1_1080P_HDR.bD;
    public static final int x = aalx.DASH_FMP4_AV1_2K_HDR.bD;
    public static final int y = aalx.DASH_FMP4_AV1_4K_HDR.bD;
    public static final int z = aalx.DASH_FMP4_AV1_8K_HDR.bD;
    public static final int A = aalx.DASH_FMP4_AV1_HIGHRES_HDR.bD;
    public static final int B = aalx.DASH_WEBM_VP9_ULTRALOW_LQ.bD;
    public static final int C = aalx.DASH_WEBM_VP9_ULTRALOW.bD;
    public static final int D = aalx.DASH_WEBM_VP9_LOW.bD;
    public static final int E = aalx.DASH_WEBM_VP9_MED.bD;
    public static final int F = aalx.DASH_WEBM_VP9_HIGH.bD;
    public static final int G = aalx.DASH_WEBM_VP9_720P.bD;
    public static final int H = aalx.DASH_WEBM_VP9_720P_MQ.bD;
    public static final int I = aalx.DASH_WEBM_VP9_720P_HFR.bD;

    /* renamed from: J  reason: collision with root package name */
    public static final int f21J = aalx.DASH_WEBM_VP9_720P_MQ_HFR.bD;
    public static final int K = aalx.DASH_WEBM_VP9_1080P.bD;
    public static final int L = aalx.DASH_WEBM_VP9_1080P_MQ.bD;
    public static final int M = aalx.DASH_WEBM_VP9_1080P_HFR.bD;
    public static final int N = aalx.DASH_WEBM_VP9_1080P_MQ_HFR.bD;
    public static final int O = aalx.DASH_WEBM_VP9_2K.bD;
    public static final int P = aalx.DASH_WEBM_VP9_2K_HFR.bD;
    public static final int Q = aalx.DASH_WEBM_VP9_4K.bD;
    public static final int R = aalx.DASH_WEBM_VP9_4K_HFR.bD;
    public static final int S = aalx.DASH_WEBM_VP9_HIGHRES.bD;
    public static final int T = aalx.DASH_WEBM_OPUS_ULTRALOW_LQ.bD;
    public static final int U = aalx.DASH_WEBM_OPUS_LOW.bD;
    public static final int V = aalx.DASH_WEBM_OPUS_MED.bD;
    public static final int W = aalx.DASH_WEBM_OPUS_HIGH.bD;
    public static final int X = aalx.DASH_WEBM_OPUS_AMBISONICS.bD;
    public static final int Y = aalx.DASH_WEBM_VORBIS_AMBISONICS.bD;
    public static final int Z = aalx.DASH_WEBM_VP9_HDR_ULTRALOW.bD;
    public static final int aa = aalx.DASH_WEBM_VP9_HDR_LOW.bD;
    public static final int ab = aalx.DASH_WEBM_VP9_HDR_MED.bD;
    public static final int ac = aalx.DASH_WEBM_VP9_HDR_HIGH.bD;
    public static final int ad = aalx.DASH_WEBM_VP9_HDR_720P.bD;
    public static final int ae = aalx.DASH_WEBM_VP9_HDR_1080P.bD;
    public static final int af = aalx.DASH_WEBM_VP9_HDR_2K.bD;
    public static final int ag = aalx.DASH_WEBM_VP9_HDR_4K.bD;
    public static final int ah = aalx.DASH_WEBM_VP9_LOW_ENC.bD;
    public static final int ai = aalx.DASH_WEBM_VP9_MED_ENC.bD;
    public static final int aj = aalx.DASH_WEBM_VP9_HIGH_ENC.bD;
    public static final int ak = aalx.DASH_WEBM_VP9_HIGH_MQ_ENC.bD;
    public static final int al = aalx.DASH_WEBM_VP9_HIGH_HQ_ENC.bD;
    public static final int am = aalx.DASH_WEBM_VP9_720P_ENC.bD;
    public static final int an = aalx.DASH_WEBM_VP9_720P_MQ_ENC.bD;
    public static final int ao = aalx.DASH_WEBM_VP9_720P_HQ_ENC.bD;
    public static final int ap = aalx.DASH_WEBM_VP9_720P_HFR_ENC.bD;
    public static final int aq = aalx.DASH_WEBM_VP9_720P_MQ_HFR_ENC.bD;
    public static final int ar = aalx.DASH_WEBM_VP9_1080P_ENC.bD;
    public static final int as = aalx.DASH_WEBM_VP9_1080P_MQ_ENC.bD;
    public static final int at = aalx.DASH_WEBM_VP9_1080P_HQ_ENC.bD;
    public static final int au = aalx.DASH_WEBM_VP9_1080P_HFR_ENC.bD;
    public static final int av = aalx.DASH_WEBM_VP9_1080P_MQ_HFR_ENC.bD;
    public static final int aw = aalx.DASH_FMP4_H264_ULTRALOW_LQ.bD;
    public static final int ax = aalx.DASH_FMP4_H264_ULTRALOW.bD;
    public static final int ay = aalx.DASH_FMP4_H264_LOW.bD;
    public static final int az = aalx.DASH_FMP4_H264_MED.bD;
    public static final int aA = aalx.DASH_FMP4_H264_HIGH.bD;
    public static final int aB = aalx.DASH_FMP4_H264_720P.bD;
    public static final int aC = aalx.DASH_FMP4_H264_720P_MQ.bD;
    public static final int aD = aalx.DASH_FMP4_H264_720P_HFR.bD;
    public static final int aE = aalx.DASH_FMP4_H264_720P_MQ_HFR.bD;
    public static final int aF = aalx.DASH_FMP4_H264_1080P.bD;
    public static final int aG = aalx.DASH_FMP4_H264_1080P_MQ.bD;
    public static final int aH = aalx.DASH_FMP4_H264_1080P_HFR.bD;
    public static final int aI = aalx.DASH_FMP4_H264_1080P_MQ_HFR.bD;
    public static final int aJ = aalx.DASH_FMP4_H264_2K.bD;
    public static final int aK = aalx.DASH_FMP4_H264_2K_HFR.bD;
    public static final int aL = aalx.DASH_FMP4_H264_4K.bD;
    public static final int aM = aalx.DASH_FMP4_H264_4K_HFR.bD;
    public static final int aN = aalx.DASH_FMP4_HE_AAC_ULTRALOW_LQ.bD;
    public static final int aO = aalx.DASH_FMP4_HE_AAC_LOW.bD;
    public static final int aP = aalx.DASH_FMP4_AAC_MED.bD;
    public static final int aQ = aalx.DASH_FMP4_AAC_HIGH.bD;
    public static final int aR = aalx.DASH_FMP4_H264_ULTRALOW_CENC.bD;
    public static final int aS = aalx.DASH_FMP4_H264_LOW_CENC.bD;
    public static final int aT = aalx.DASH_FMP4_H264_MED_CENC.bD;
    public static final int aU = aalx.DASH_FMP4_H264_HIGH_CENC.bD;
    public static final int aV = aalx.DASH_FMP4_H264_HIGH_MQ_CENC.bD;
    public static final int aW = aalx.DASH_FMP4_H264_HIGH_HQ_CENC.bD;
    public static final int aX = aalx.DASH_FMP4_H264_720P_CENC.bD;
    public static final int aY = aalx.DASH_FMP4_H264_720P_MQ_CENC.bD;
    public static final int aZ = aalx.DASH_FMP4_H264_720P_HFR_CENC.bD;
    public static final int ba = aalx.DASH_FMP4_H264_720P_MQ_HFR_CENC.bD;
    public static final int bb = aalx.DASH_FMP4_H264_720P_HQ_CENC.bD;
    public static final int bc = aalx.DASH_FMP4_H264_1080P_CENC.bD;
    public static final int bd = aalx.DASH_FMP4_H264_1080P_MQ_CENC.bD;
    public static final int be = aalx.DASH_FMP4_H264_1080P_HFR_CENC.bD;
    public static final int bf = aalx.DASH_FMP4_H264_1080P_MQ_HFR_CENC.bD;
    public static final int bg = aalx.DASH_FMP4_H264_1080P_HQ_CENC.bD;
    public static final int bh = aalx.DASH_FMP4_HE_AAC_LOW_CENC.bD;
    public static final int bi = aalx.DASH_FMP4_AAC_MED_CENC.bD;
    public static final int bj = aalx.bC.bD;
    private static final zer bu = new aamk();
    private static final zer bv = new aamv();
    private static final zer bw = new aand();
    private static final zer bx = new aane();
    private static final zer by = new aanf();
    private static final zer bz = new aang();
    private static final zer bA = new aanh();
    private static final zer bB = new aani();
    private static final zer bC = new aanj();
    private static final zer bD = new aama();
    public static final zer bk = new aamb();
    private static final zer bE = new aamc();
    private static final zer bF = new aamd();
    public static final zer bl = new aame();
    private static final zer bG = new aamf();
    public static final zer bm = new aamg();
    private static final zer bH = new aamh();

    static {
        new aami();
        bn = new aamj();
        bo = new aaml();
        bp = new aamm();
        bI = new aamn();
        bJ = new aamo();
        bK = new aamp();
        bL = new aamq();
        bM = new aamr();
        bN = new aams();
        bO = new aamt();
        bP = new aamu();
        bq = new aamw();
        bQ = new aamx();
        bR = new aamy();
        br = new aamz();
        bS = new aana();
        bs = new aanb();
        bt = new aanc();
    }

    public static Set a() {
        return (Set) bN.get();
    }

    public static Set b() {
        return (Set) bO.get();
    }

    public static Set c() {
        return (Set) bG.get();
    }

    public static Set d() {
        return (Set) bB.get();
    }

    public static Set e() {
        return (Set) bD.get();
    }

    public static Set f(boolean z2) {
        return (Set) (z2 ? bP : bq).get();
    }

    public static Set g() {
        return (Set) bH.get();
    }

    public static Set h() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(i());
        hashSet.addAll(j());
        return Collections.unmodifiableSet(hashSet);
    }

    public static Set i() {
        return (Set) bE.get();
    }

    public static Set j() {
        return (Set) bx.get();
    }

    public static Set k() {
        return (Set) bA.get();
    }

    public static Set l() {
        return (Set) bC.get();
    }

    public static Set m() {
        return (Set) bu.get();
    }

    public static Set n() {
        return (Set) bv.get();
    }

    public static Set o() {
        return (Set) bw.get();
    }

    public static Set p() {
        return (Set) bF.get();
    }

    public static Set q() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(z());
        hashSet.addAll(e());
        return Collections.unmodifiableSet(hashSet);
    }

    public static Set r() {
        return (Set) bS.get();
    }

    public static Set s() {
        return (Set) bJ.get();
    }

    public static Set t() {
        return (Set) bM.get();
    }

    public static Set u(boolean z2) {
        return (Set) (z2 ? bK : bL).get();
    }

    public static Set v() {
        return (Set) bQ.get();
    }

    public static Set w() {
        return (Set) bR.get();
    }

    public static Set x() {
        return (Set) bI.get();
    }

    public static Set y() {
        return (Set) by.get();
    }

    public static Set z() {
        return (Set) bz.get();
    }
}

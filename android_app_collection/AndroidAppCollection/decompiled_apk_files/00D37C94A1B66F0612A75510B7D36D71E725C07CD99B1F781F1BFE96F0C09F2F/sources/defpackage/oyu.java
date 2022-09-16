package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: oyu  reason: default package */
/* loaded from: classes4.dex */
public class oyu {
    public static final int aA;
    public static final int aB;
    public static final int aC;
    public static final int aD;
    public static final int aE;
    public static final int aF;
    public static final int aG;
    public static final int aH;
    public static final int aI;
    public static final int aJ;
    public static final int aK;
    public static final int aL;
    public static final int aM;
    public static final int aN;
    public static final int aO;
    public static final int aP;
    public static final int an;
    public static final int ao;
    public static final int ap;
    public static final int aq;
    public static final int ar;
    public static final int as;
    public static final int at;
    public static final int au;
    public static final int av;
    public static final int aw;
    public static final int ax;
    public static final int ay;
    public static final int az;
    public final int aQ;
    public static final int d = pcx.c("ftyp");
    public static final int e = pcx.c("avc1");
    public static final int f = pcx.c("avc3");
    public static final int g = pcx.c("hvc1");
    public static final int h = pcx.c("hev1");
    public static final int i = pcx.c("s263");
    public static final int j = pcx.c("d263");
    public static final int k = pcx.c("mdat");
    public static final int l = pcx.c("mp4a");
    public static final int m = pcx.c(".mp3");
    public static final int n = pcx.c("wave");
    public static final int o = pcx.c("lpcm");
    public static final int p = pcx.c("sowt");
    public static final int q = pcx.c("ac-3");
    public static final int r = pcx.c("dac3");
    public static final int s = pcx.c("ec-3");
    public static final int t = pcx.c("dec3");
    public static final int u = pcx.c("dtsc");
    public static final int v = pcx.c("dtsh");
    public static final int w = pcx.c("dtsl");
    public static final int x = pcx.c("dtse");
    public static final int y = pcx.c("ddts");
    public static final int z = pcx.c("tfdt");
    public static final int A = pcx.c("tfhd");
    public static final int B = pcx.c("trex");
    public static final int C = pcx.c("trun");
    public static final int D = pcx.c("sidx");
    public static final int E = pcx.c("moov");
    public static final int F = pcx.c("mvhd");
    public static final int G = pcx.c("trak");
    public static final int H = pcx.c("mdia");
    public static final int I = pcx.c("minf");

    /* renamed from: J  reason: collision with root package name */
    public static final int f250J = pcx.c("stbl");
    public static final int K = pcx.c("avcC");
    public static final int L = pcx.c("hvcC");
    public static final int M = pcx.c("esds");
    public static final int N = pcx.c("moof");
    public static final int O = pcx.c("traf");
    public static final int P = pcx.c("mvex");
    public static final int Q = pcx.c("mehd");
    public static final int R = pcx.c("tkhd");
    public static final int S = pcx.c("edts");
    public static final int T = pcx.c("elst");
    public static final int U = pcx.c("mdhd");
    public static final int V = pcx.c("hdlr");
    public static final int W = pcx.c("stsd");
    public static final int X = pcx.c("pssh");
    public static final int Y = pcx.c("sinf");
    public static final int Z = pcx.c("schm");
    public static final int aa = pcx.c("schi");
    public static final int ab = pcx.c("tenc");
    public static final int ac = pcx.c("encv");
    public static final int ad = pcx.c("enca");
    public static final int ae = pcx.c("frma");
    public static final int af = pcx.c("saiz");
    public static final int ag = pcx.c("saio");
    public static final int ah = pcx.c("sbgp");
    public static final int ai = pcx.c("sgpd");
    public static final int aj = pcx.c("uuid");
    public static final int ak = pcx.c("senc");
    public static final int al = pcx.c("pasp");
    public static final int am = pcx.c("TTML");

    static {
        pcx.c("vmhd");
        an = pcx.c("mp4v");
        ao = pcx.c("stts");
        ap = pcx.c("stss");
        aq = pcx.c("ctts");
        ar = pcx.c("stsc");
        as = pcx.c("stsz");
        at = pcx.c("stz2");
        au = pcx.c("stco");
        av = pcx.c("co64");
        aw = pcx.c("tx3g");
        ax = pcx.c("wvtt");
        ay = pcx.c("stpp");
        az = pcx.c("samr");
        aA = pcx.c("sawb");
        aB = pcx.c("udta");
        aC = pcx.c("meta");
        aD = pcx.c("ilst");
        aE = pcx.c("mean");
        aF = pcx.c("name");
        aG = pcx.c("data");
        aH = pcx.c("emsg");
        aI = pcx.c("st3d");
        aJ = pcx.c("sv3d");
        aK = pcx.c("proj");
        aL = pcx.c("vp08");
        aM = pcx.c("vp09");
        aN = pcx.c("vpcC");
        aO = pcx.c("camm");
        aP = pcx.c("----");
    }

    public oyu(int i2) {
        this.aQ = i2;
    }

    public static int e(int i2) {
        return i2 & 16777215;
    }

    public static int f(int i2) {
        return (i2 >> 24) & PrivateKeyType.INVALID;
    }

    public static String g(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i2 >> 24));
        sb.append((char) ((i2 >> 16) & PrivateKeyType.INVALID));
        sb.append((char) ((i2 >> 8) & PrivateKeyType.INVALID));
        sb.append((char) (i2 & PrivateKeyType.INVALID));
        return sb.toString();
    }

    public String toString() {
        return g(this.aQ);
    }
}

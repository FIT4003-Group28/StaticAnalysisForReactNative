package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: axh  reason: default package */
/* loaded from: classes2.dex */
public final class axh implements awx, atk {
    public static final amul a;
    public static final amuk b;
    public static final amuk c;
    public static final amuk d;
    public static final amuk e;
    public static final amuk f;
    public static final amuk g;
    private static axh i;
    public final awv h;
    private final amup j;
    private final pxa k;
    private final boolean l;
    private int m;
    private long n;
    private long o;
    private int p;
    private long q;
    private long r;
    private long s;
    private long t;

    static {
        amsq e2 = amsq.e();
        arey.D("AD", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("AE", new Integer[]{1, 4, 4, 4, 2, 2}, e2);
        arey.D("AF", new Integer[]{4, 4, 3, 4, 2, 2}, e2);
        arey.D("AG", new Integer[]{4, 2, 1, 4, 2, 2}, e2);
        arey.D("AI", new Integer[]{1, 2, 2, 2, 2, 2}, e2);
        arey.D("AL", new Integer[]{1, 1, 1, 1, 2, 2}, e2);
        arey.D("AM", new Integer[]{2, 2, 1, 3, 2, 2}, e2);
        arey.D("AO", new Integer[]{3, 4, 3, 1, 2, 2}, e2);
        arey.D("AR", new Integer[]{2, 4, 2, 1, 2, 2}, e2);
        arey.D("AS", new Integer[]{2, 2, 3, 3, 2, 2}, e2);
        arey.D("AT", new Integer[]{0, 1, 0, 0, 0, 2}, e2);
        arey.D("AU", new Integer[]{0, 2, 0, 1, 1, 2}, e2);
        arey.D("AW", new Integer[]{1, 2, 0, 4, 2, 2}, e2);
        arey.D("AX", new Integer[]{0, 2, 2, 2, 2, 2}, e2);
        arey.D("AZ", new Integer[]{3, 3, 3, 4, 4, 2}, e2);
        arey.D("BA", new Integer[]{1, 1, 0, 1, 2, 2}, e2);
        arey.D("BB", new Integer[]{0, 2, 0, 0, 2, 2}, e2);
        arey.D("BD", new Integer[]{2, 0, 3, 3, 2, 2}, e2);
        arey.D("BE", new Integer[]{0, 0, 2, 3, 2, 2}, e2);
        arey.D("BF", new Integer[]{4, 4, 4, 2, 2, 2}, e2);
        arey.D("BG", new Integer[]{0, 1, 0, 0, 2, 2}, e2);
        arey.D("BH", new Integer[]{1, 0, 2, 4, 2, 2}, e2);
        arey.D("BI", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("BJ", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("BL", new Integer[]{1, 2, 2, 2, 2, 2}, e2);
        arey.D("BM", new Integer[]{0, 2, 0, 0, 2, 2}, e2);
        arey.D("BN", new Integer[]{3, 2, 1, 0, 2, 2}, e2);
        arey.D("BO", new Integer[]{1, 2, 4, 2, 2, 2}, e2);
        arey.D("BQ", new Integer[]{1, 2, 1, 2, 2, 2}, e2);
        arey.D("BR", new Integer[]{2, 4, 3, 2, 2, 2}, e2);
        arey.D("BS", new Integer[]{2, 2, 1, 3, 2, 2}, e2);
        arey.D("BT", new Integer[]{3, 0, 3, 2, 2, 2}, e2);
        arey.D("BW", new Integer[]{3, 4, 1, 1, 2, 2}, e2);
        arey.D("BY", new Integer[]{1, 1, 1, 2, 2, 2}, e2);
        arey.D("BZ", new Integer[]{2, 2, 2, 2, 2, 2}, e2);
        arey.D("CA", new Integer[]{0, 3, 1, 2, 4, 2}, e2);
        arey.D("CD", new Integer[]{4, 2, 2, 1, 2, 2}, e2);
        arey.D("CF", new Integer[]{4, 2, 3, 2, 2, 2}, e2);
        arey.D("CG", new Integer[]{3, 4, 2, 2, 2, 2}, e2);
        arey.D("CH", new Integer[]{0, 0, 0, 0, 1, 2}, e2);
        arey.D("CI", new Integer[]{3, 3, 3, 3, 2, 2}, e2);
        arey.D("CK", new Integer[]{2, 2, 3, 0, 2, 2}, e2);
        arey.D("CL", new Integer[]{1, 1, 2, 2, 2, 2}, e2);
        arey.D("CM", new Integer[]{3, 4, 3, 2, 2, 2}, e2);
        arey.D("CN", new Integer[]{2, 2, 2, 1, 3, 2}, e2);
        arey.D("CO", new Integer[]{2, 3, 4, 2, 2, 2}, e2);
        arey.D("CR", new Integer[]{2, 3, 4, 4, 2, 2}, e2);
        arey.D("CU", new Integer[]{4, 4, 2, 2, 2, 2}, e2);
        arey.D("CV", new Integer[]{2, 3, 1, 0, 2, 2}, e2);
        arey.D("CW", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("CY", new Integer[]{1, 1, 0, 0, 2, 2}, e2);
        arey.D("CZ", new Integer[]{0, 1, 0, 0, 1, 2}, e2);
        arey.D("DE", new Integer[]{0, 0, 1, 1, 0, 2}, e2);
        arey.D("DJ", new Integer[]{4, 0, 4, 4, 2, 2}, e2);
        arey.D("DK", new Integer[]{0, 0, 1, 0, 0, 2}, e2);
        arey.D("DM", new Integer[]{1, 2, 2, 2, 2, 2}, e2);
        arey.D("DO", new Integer[]{3, 4, 4, 4, 2, 2}, e2);
        arey.D("DZ", new Integer[]{3, 3, 4, 4, 2, 4}, e2);
        arey.D("EC", new Integer[]{2, 4, 3, 1, 2, 2}, e2);
        arey.D("EE", new Integer[]{0, 1, 0, 0, 2, 2}, e2);
        arey.D("EG", new Integer[]{3, 4, 3, 3, 2, 2}, e2);
        arey.D("EH", new Integer[]{2, 2, 2, 2, 2, 2}, e2);
        arey.D("ER", new Integer[]{4, 2, 2, 2, 2, 2}, e2);
        arey.D("ES", new Integer[]{0, 1, 1, 1, 2, 2}, e2);
        arey.D("ET", new Integer[]{4, 4, 4, 1, 2, 2}, e2);
        arey.D("FI", new Integer[]{0, 0, 0, 0, 0, 2}, e2);
        arey.D("FJ", new Integer[]{3, 0, 2, 3, 2, 2}, e2);
        arey.D("FK", new Integer[]{4, 2, 2, 2, 2, 2}, e2);
        arey.D("FM", new Integer[]{3, 2, 4, 4, 2, 2}, e2);
        arey.D("FO", new Integer[]{1, 2, 0, 1, 2, 2}, e2);
        arey.D("FR", new Integer[]{1, 1, 2, 0, 1, 2}, e2);
        arey.D("GA", new Integer[]{3, 4, 1, 1, 2, 2}, e2);
        arey.D("GB", new Integer[]{0, 0, 1, 1, 1, 2}, e2);
        arey.D("GD", new Integer[]{1, 2, 2, 2, 2, 2}, e2);
        arey.D("GE", new Integer[]{1, 1, 1, 2, 2, 2}, e2);
        arey.D("GF", new Integer[]{2, 2, 2, 3, 2, 2}, e2);
        arey.D("GG", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("GH", new Integer[]{3, 1, 3, 2, 2, 2}, e2);
        arey.D("GI", new Integer[]{0, 2, 0, 0, 2, 2}, e2);
        arey.D("GL", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("GM", new Integer[]{4, 3, 2, 4, 2, 2}, e2);
        arey.D("GN", new Integer[]{4, 3, 4, 2, 2, 2}, e2);
        arey.D("GP", new Integer[]{2, 1, 2, 3, 2, 2}, e2);
        arey.D("GQ", new Integer[]{4, 2, 2, 4, 2, 2}, e2);
        arey.D("GR", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("GT", new Integer[]{3, 2, 3, 1, 2, 2}, e2);
        arey.D("GU", new Integer[]{1, 2, 3, 4, 2, 2}, e2);
        arey.D("GW", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("GY", new Integer[]{3, 3, 3, 4, 2, 2}, e2);
        arey.D("HK", new Integer[]{0, 1, 2, 3, 2, 0}, e2);
        arey.D("HN", new Integer[]{3, 1, 3, 3, 2, 2}, e2);
        arey.D("HR", new Integer[]{1, 1, 0, 0, 3, 2}, e2);
        arey.D("HT", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("HU", new Integer[]{0, 0, 0, 0, 0, 2}, e2);
        arey.D("ID", new Integer[]{3, 2, 3, 3, 2, 2}, e2);
        arey.D("IE", new Integer[]{0, 0, 1, 1, 3, 2}, e2);
        arey.D("IL", new Integer[]{1, 0, 2, 3, 4, 2}, e2);
        arey.D("IM", new Integer[]{0, 2, 0, 1, 2, 2}, e2);
        arey.D("IN", new Integer[]{2, 1, 3, 3, 2, 2}, e2);
        arey.D("IO", new Integer[]{4, 2, 2, 4, 2, 2}, e2);
        arey.D("IQ", new Integer[]{3, 3, 4, 4, 2, 2}, e2);
        arey.D("IR", new Integer[]{3, 2, 3, 2, 2, 2}, e2);
        arey.D("IS", new Integer[]{0, 2, 0, 0, 2, 2}, e2);
        arey.D("IT", new Integer[]{0, 4, 0, 1, 2, 2}, e2);
        arey.D("JE", new Integer[]{2, 2, 1, 2, 2, 2}, e2);
        arey.D("JM", new Integer[]{3, 3, 4, 4, 2, 2}, e2);
        arey.D("JO", new Integer[]{2, 2, 1, 1, 2, 2}, e2);
        arey.D("JP", new Integer[]{0, 0, 0, 0, 2, 1}, e2);
        arey.D("KE", new Integer[]{3, 4, 2, 2, 2, 2}, e2);
        arey.D("KG", new Integer[]{2, 0, 1, 1, 2, 2}, e2);
        arey.D("KH", new Integer[]{1, 0, 4, 3, 2, 2}, e2);
        arey.D("KI", new Integer[]{4, 2, 4, 3, 2, 2}, e2);
        arey.D("KM", new Integer[]{4, 3, 2, 3, 2, 2}, e2);
        arey.D("KN", new Integer[]{1, 2, 2, 2, 2, 2}, e2);
        arey.D("KP", new Integer[]{4, 2, 2, 2, 2, 2}, e2);
        arey.D("KR", new Integer[]{0, 0, 1, 3, 1, 2}, e2);
        arey.D("KW", new Integer[]{1, 3, 1, 1, 1, 2}, e2);
        arey.D("KY", new Integer[]{1, 2, 0, 2, 2, 2}, e2);
        arey.D("KZ", new Integer[]{2, 2, 2, 3, 2, 2}, e2);
        arey.D("LA", new Integer[]{1, 2, 1, 1, 2, 2}, e2);
        arey.D("LB", new Integer[]{3, 2, 0, 0, 2, 2}, e2);
        arey.D("LC", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("LI", new Integer[]{0, 2, 2, 2, 2, 2}, e2);
        arey.D("LK", new Integer[]{2, 0, 2, 3, 2, 2}, e2);
        arey.D("LR", new Integer[]{3, 4, 4, 3, 2, 2}, e2);
        arey.D("LS", new Integer[]{3, 3, 2, 3, 2, 2}, e2);
        arey.D("LT", new Integer[]{0, 0, 0, 0, 2, 2}, e2);
        arey.D("LU", new Integer[]{1, 0, 1, 1, 2, 2}, e2);
        arey.D("LV", new Integer[]{0, 0, 0, 0, 2, 2}, e2);
        arey.D("LY", new Integer[]{4, 2, 4, 3, 2, 2}, e2);
        arey.D("MA", new Integer[]{3, 2, 2, 1, 2, 2}, e2);
        arey.D("MC", new Integer[]{0, 2, 0, 0, 2, 2}, e2);
        arey.D("MD", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("ME", new Integer[]{1, 2, 0, 1, 2, 2}, e2);
        arey.D("MF", new Integer[]{2, 2, 1, 1, 2, 2}, e2);
        arey.D("MG", new Integer[]{3, 4, 2, 2, 2, 2}, e2);
        arey.D("MH", new Integer[]{4, 2, 2, 4, 2, 2}, e2);
        arey.D("MK", new Integer[]{1, 1, 0, 0, 2, 2}, e2);
        arey.D("ML", new Integer[]{4, 4, 2, 2, 2, 2}, e2);
        arey.D("MM", new Integer[]{2, 3, 3, 3, 2, 2}, e2);
        arey.D("MN", new Integer[]{2, 4, 2, 2, 2, 2}, e2);
        arey.D("MO", new Integer[]{0, 2, 4, 4, 2, 2}, e2);
        arey.D("MP", new Integer[]{0, 2, 2, 2, 2, 2}, e2);
        arey.D("MQ", new Integer[]{2, 2, 2, 3, 2, 2}, e2);
        arey.D("MR", new Integer[]{3, 0, 4, 3, 2, 2}, e2);
        arey.D("MS", new Integer[]{1, 2, 2, 2, 2, 2}, e2);
        arey.D("MT", new Integer[]{0, 2, 0, 0, 2, 2}, e2);
        arey.D("MU", new Integer[]{2, 1, 1, 2, 2, 2}, e2);
        arey.D("MV", new Integer[]{4, 3, 2, 4, 2, 2}, e2);
        arey.D("MW", new Integer[]{4, 2, 1, 0, 2, 2}, e2);
        arey.D("MX", new Integer[]{2, 4, 4, 4, 4, 2}, e2);
        arey.D("MY", new Integer[]{1, 0, 3, 2, 2, 2}, e2);
        arey.D("MZ", new Integer[]{3, 3, 2, 1, 2, 2}, e2);
        arey.D("NA", new Integer[]{4, 3, 3, 2, 2, 2}, e2);
        arey.D("NC", new Integer[]{3, 0, 4, 4, 2, 2}, e2);
        arey.D("NE", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("NF", new Integer[]{2, 2, 2, 2, 2, 2}, e2);
        arey.D("NG", new Integer[]{3, 3, 2, 3, 2, 2}, e2);
        arey.D("NI", new Integer[]{2, 1, 4, 4, 2, 2}, e2);
        arey.D("NL", new Integer[]{0, 2, 3, 2, 0, 2}, e2);
        arey.D("NO", new Integer[]{0, 1, 2, 0, 0, 2}, e2);
        arey.D("NP", new Integer[]{2, 0, 4, 2, 2, 2}, e2);
        arey.D("NR", new Integer[]{3, 2, 3, 1, 2, 2}, e2);
        arey.D("NU", new Integer[]{4, 2, 2, 2, 2, 2}, e2);
        arey.D("NZ", new Integer[]{0, 2, 1, 2, 4, 2}, e2);
        arey.D("OM", new Integer[]{2, 2, 1, 3, 3, 2}, e2);
        arey.D("PA", new Integer[]{1, 3, 3, 3, 2, 2}, e2);
        arey.D("PE", new Integer[]{2, 3, 4, 4, 2, 2}, e2);
        arey.D("PF", new Integer[]{2, 2, 2, 1, 2, 2}, e2);
        arey.D("PG", new Integer[]{4, 4, 3, 2, 2, 2}, e2);
        arey.D("PH", new Integer[]{2, 1, 3, 3, 3, 2}, e2);
        arey.D("PK", new Integer[]{3, 2, 3, 3, 2, 2}, e2);
        arey.D("PL", new Integer[]{1, 0, 1, 2, 3, 2}, e2);
        arey.D("PM", new Integer[]{0, 2, 2, 2, 2, 2}, e2);
        arey.D("PR", new Integer[]{2, 1, 2, 2, 4, 3}, e2);
        arey.D("PS", new Integer[]{3, 3, 2, 2, 2, 2}, e2);
        arey.D("PT", new Integer[]{0, 1, 1, 0, 2, 2}, e2);
        arey.D("PW", new Integer[]{1, 2, 4, 1, 2, 2}, e2);
        arey.D("PY", new Integer[]{2, 0, 3, 2, 2, 2}, e2);
        arey.D("QA", new Integer[]{2, 3, 1, 2, 3, 2}, e2);
        arey.D("RE", new Integer[]{1, 0, 2, 2, 2, 2}, e2);
        arey.D("RO", new Integer[]{0, 1, 0, 1, 0, 2}, e2);
        arey.D("RS", new Integer[]{1, 2, 0, 0, 2, 2}, e2);
        arey.D("RU", new Integer[]{0, 1, 0, 1, 4, 2}, e2);
        arey.D("RW", new Integer[]{3, 3, 3, 1, 2, 2}, e2);
        arey.D("SA", new Integer[]{2, 2, 2, 1, 1, 2}, e2);
        arey.D("SB", new Integer[]{4, 2, 3, 2, 2, 2}, e2);
        arey.D("SC", new Integer[]{4, 2, 1, 3, 2, 2}, e2);
        arey.D("SD", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("SE", new Integer[]{0, 0, 0, 0, 0, 2}, e2);
        arey.D("SG", new Integer[]{1, 0, 1, 2, 3, 2}, e2);
        arey.D("SH", new Integer[]{4, 2, 2, 2, 2, 2}, e2);
        arey.D("SI", new Integer[]{0, 0, 0, 0, 2, 2}, e2);
        arey.D("SJ", new Integer[]{2, 2, 2, 2, 2, 2}, e2);
        arey.D("SK", new Integer[]{0, 1, 0, 0, 2, 2}, e2);
        arey.D("SL", new Integer[]{4, 3, 4, 0, 2, 2}, e2);
        arey.D("SM", new Integer[]{0, 2, 2, 2, 2, 2}, e2);
        arey.D("SN", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("SO", new Integer[]{3, 3, 3, 4, 2, 2}, e2);
        arey.D("SR", new Integer[]{3, 2, 2, 2, 2, 2}, e2);
        arey.D("SS", new Integer[]{4, 4, 3, 3, 2, 2}, e2);
        arey.D("ST", new Integer[]{2, 2, 1, 2, 2, 2}, e2);
        arey.D("SV", new Integer[]{2, 1, 4, 3, 2, 2}, e2);
        arey.D("SX", new Integer[]{2, 2, 1, 0, 2, 2}, e2);
        arey.D("SY", new Integer[]{4, 3, 3, 2, 2, 2}, e2);
        arey.D("SZ", new Integer[]{3, 3, 2, 4, 2, 2}, e2);
        arey.D("TC", new Integer[]{2, 2, 2, 0, 2, 2}, e2);
        arey.D("TD", new Integer[]{4, 3, 4, 4, 2, 2}, e2);
        arey.D("TG", new Integer[]{3, 2, 2, 4, 2, 2}, e2);
        arey.D("TH", new Integer[]{0, 3, 2, 3, 2, 2}, e2);
        arey.D("TJ", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("TL", new Integer[]{4, 0, 4, 4, 2, 2}, e2);
        arey.D("TM", new Integer[]{4, 2, 4, 3, 2, 2}, e2);
        arey.D("TN", new Integer[]{2, 1, 1, 2, 2, 2}, e2);
        arey.D("TO", new Integer[]{3, 3, 4, 3, 2, 2}, e2);
        arey.D("TR", new Integer[]{1, 2, 1, 1, 2, 2}, e2);
        arey.D("TT", new Integer[]{1, 4, 0, 1, 2, 2}, e2);
        arey.D("TV", new Integer[]{3, 2, 2, 4, 2, 2}, e2);
        arey.D("TW", new Integer[]{0, 0, 0, 0, 1, 0}, e2);
        arey.D("TZ", new Integer[]{3, 3, 3, 2, 2, 2}, e2);
        arey.D("UA", new Integer[]{0, 3, 1, 1, 2, 2}, e2);
        arey.D("UG", new Integer[]{3, 2, 3, 3, 2, 2}, e2);
        arey.D("US", new Integer[]{1, 1, 2, 2, 4, 2}, e2);
        arey.D("UY", new Integer[]{2, 2, 1, 1, 2, 2}, e2);
        arey.D("UZ", new Integer[]{2, 1, 3, 4, 2, 2}, e2);
        arey.D("VC", new Integer[]{1, 2, 2, 2, 2, 2}, e2);
        arey.D("VE", new Integer[]{4, 4, 4, 4, 2, 2}, e2);
        arey.D("VG", new Integer[]{2, 2, 1, 1, 2, 2}, e2);
        arey.D("VI", new Integer[]{1, 2, 1, 2, 2, 2}, e2);
        arey.D("VN", new Integer[]{0, 1, 3, 4, 2, 2}, e2);
        arey.D("VU", new Integer[]{4, 0, 3, 1, 2, 2}, e2);
        arey.D("WF", new Integer[]{4, 2, 2, 4, 2, 2}, e2);
        arey.D("WS", new Integer[]{3, 1, 3, 1, 2, 2}, e2);
        arey.D("XK", new Integer[]{0, 1, 1, 0, 2, 2}, e2);
        arey.D("YE", new Integer[]{4, 4, 4, 3, 2, 2}, e2);
        arey.D("YT", new Integer[]{4, 2, 2, 3, 2, 2}, e2);
        arey.D("ZA", new Integer[]{3, 3, 2, 1, 2, 2}, e2);
        arey.D("ZM", new Integer[]{3, 2, 3, 3, 2, 2}, e2);
        arey.D("ZW", new Integer[]{3, 2, 4, 3, 2, 2}, e2);
        a = arey.B(e2);
        b = amuk.v(6200000L, 3900000L, 2300000L, 1300000L, 620000L);
        c = amuk.v(248000L, 160000L, 142000L, 127000L, 113000L);
        d = amuk.v(2200000L, 1300000L, 950000L, 760000L, 520000L);
        e = amuk.v(4400000L, 2300000L, 1500000L, 1100000L, 640000L);
        f = amuk.v(10000000L, 7200000L, 5000000L, 2700000L, 1600000L);
        g = amuk.v(2600000L, 2200000L, 2000000L, 1500000L, 470000L);
    }

    @Deprecated
    public axh() {
        int i2 = amup.a;
        pvq pvqVar = pvq.a;
        throw null;
    }

    public static synchronized axh h(Context context) {
        axh axhVar;
        synchronized (axh.class) {
            if (i == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                amuk a2 = a.a(pxi.D(context));
                if (a2.isEmpty()) {
                    a2 = amuk.w(2, 2, 2, 2, 2, 2);
                }
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                amuk amukVar = b;
                hashMap.put(2, (Long) amukVar.get(((Integer) a2.get(0)).intValue()));
                hashMap.put(3, (Long) c.get(((Integer) a2.get(1)).intValue()));
                hashMap.put(4, (Long) d.get(((Integer) a2.get(2)).intValue()));
                hashMap.put(5, (Long) e.get(((Integer) a2.get(3)).intValue()));
                hashMap.put(10, (Long) f.get(((Integer) a2.get(4)).intValue()));
                hashMap.put(9, (Long) g.get(((Integer) a2.get(5)).intValue()));
                hashMap.put(7, (Long) amukVar.get(((Integer) a2.get(0)).intValue()));
                i = new axh(applicationContext, hashMap);
            }
            axhVar = i;
        }
        return axhVar;
    }

    private final long j(int i2) {
        Long l = (Long) this.j.get(Integer.valueOf(i2));
        if (l == null) {
            l = (Long) this.j.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private final void k(int i2, long j, long j2) {
        int i3;
        if (i2 != 0) {
            i3 = i2;
        } else if (j == 0 && j2 == this.t) {
            return;
        } else {
            i3 = 0;
        }
        this.t = j2;
        this.h.b(i3, j, j2);
    }

    private static boolean l(asy asyVar, boolean z) {
        return z && !asyVar.g(8);
    }

    @Override // defpackage.atk
    public final synchronized void a(asv asvVar, asy asyVar, boolean z, int i2) {
        if (!l(asyVar, z)) {
            return;
        }
        this.o += i2;
    }

    @Override // defpackage.atk
    public final synchronized void b(asv asvVar, asy asyVar, boolean z) {
        if (!l(asyVar, z)) {
            return;
        }
        ptx.e(this.m > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = (int) (elapsedRealtime - this.n);
        this.q += i2;
        long j = this.r;
        long j2 = this.o;
        this.r = j + j2;
        if (i2 > 0) {
            this.k.m((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i2);
            if (this.q >= 2000 || this.r >= 524288) {
                this.s = this.k.a(0.5f);
            }
            k(i2, this.o, this.s);
            this.n = elapsedRealtime;
            this.o = 0L;
        }
        this.m--;
    }

    @Override // defpackage.atk
    public final void c(asv asvVar, asy asyVar, boolean z) {
    }

    @Override // defpackage.atk
    public final synchronized void d(asv asvVar, asy asyVar, boolean z) {
        if (!l(asyVar, z)) {
            return;
        }
        if (this.m == 0) {
            this.n = SystemClock.elapsedRealtime();
        }
        this.m++;
    }

    @Override // defpackage.awx
    public final synchronized long e() {
        return this.s;
    }

    @Override // defpackage.awx
    public final void f(Handler handler, aww awwVar) {
        throw null;
    }

    @Override // defpackage.awx
    public final void g(aww awwVar) {
        throw null;
    }

    public axh(Context context, Map map) {
        this.j = amup.j(map);
        this.h = new awv();
        this.k = new pxa(2000);
        this.l = true;
        if (context != null) {
            final pws b2 = pws.b(context);
            int a2 = b2.a();
            this.p = a2;
            this.s = j(a2);
            final axg axgVar = new axg(this);
            Iterator it = b2.b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    b2.b.remove(weakReference);
                }
            }
            b2.b.add(new WeakReference(axgVar));
            b2.a.post(new Runnable() { // from class: pwp
                @Override // java.lang.Runnable
                public final void run() {
                    axgVar.a(pws.this.a());
                }
            });
            return;
        }
        this.p = 0;
        this.s = j(0);
    }

    public final synchronized void i(int i2) {
        int i3 = this.p;
        if (i3 == 0 || this.l) {
            if (i3 == i2) {
                return;
            }
            this.p = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.s = j(i2);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                k(this.m > 0 ? (int) (elapsedRealtime - this.n) : 0, this.o, this.s);
                this.n = elapsedRealtime;
                this.o = 0L;
                this.r = 0L;
                this.q = 0L;
                pxa pxaVar = this.k;
                pxaVar.a.clear();
                pxaVar.b = -1;
                pxaVar.c = 0;
                pxaVar.d = 0;
            }
        }
    }
}

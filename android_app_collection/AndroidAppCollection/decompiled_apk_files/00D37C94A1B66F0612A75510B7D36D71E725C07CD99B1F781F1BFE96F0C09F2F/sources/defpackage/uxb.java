package defpackage;

import org.chromium.net.CellularSignalStrengthError;
import org.chromium.net.NetError;
/* compiled from: PG */
/* renamed from: uxb  reason: default package */
/* loaded from: classes4.dex */
public final class uxb {
    public static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram");
    public static final int[] b = {0, 4, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 150, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    public static final int[] c = {CellularSignalStrengthError.ERROR_NOT_SUPPORTED, NetError.ERR_CERT_COMMON_NAME_INVALID, NetError.ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN, -100, -90, -80, -70, -60, -50, -40, -30, -25, -20, -18, -16, -14, -12, -10, -8, -6, -4, -2, 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 25, 30, 40, 50, 60, 70, 80, 90, 100, 150, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
    public final snc d;
    public final long e;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final int[] f = new int[28];
    public final int[] g = new int[52];
    public int p = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public uxb(snc sncVar) {
        this.d = sncVar;
        this.e = sncVar.d();
    }
}

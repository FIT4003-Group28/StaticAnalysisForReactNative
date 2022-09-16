package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yqf  reason: default package */
/* loaded from: classes4.dex */
public final class yqf implements yrj {
    private static final Map d;
    public final yug a;
    public final azqb b;
    public final ypq c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("\"GIN-3g\"", 10);
        hashMap.put("GIN-3g", 10);
        hashMap.put("\"GIN-2g\"", 2);
        hashMap.put("GIN-2g", 2);
        hashMap.put("\"GIN-2g-poor\"", 2);
        hashMap.put("GIN-2g-poor", 2);
    }

    public yqf(yug yugVar, ConnectivityManager connectivityManager, azqb azqbVar, ypq ypqVar) {
        yugVar.getClass();
        this.a = yugVar;
        this.b = azqbVar;
        this.c = ypqVar;
        ((ypx) azqbVar.get()).a.I().Z(new ayqb() { // from class: yqd
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                yqf yqfVar = yqf.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ypq ypqVar2 = yqfVar.c;
                if (ypqVar2.d()) {
                    ypqVar2.b();
                }
                yqfVar.a.f();
                if (booleanValue) {
                    ((ypx) yqfVar.b.get()).b(yqfVar.o(), yqfVar.p(), yqfVar.q(), yqfVar.i(), yqfVar.a());
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 30) {
            connectivityManager.registerDefaultNetworkCallback(new yqe(this));
        }
    }

    private static final long A(int i) {
        switch (i) {
            case 1:
                return v(114.0d);
            case 2:
                return v(135.0d);
            case 3:
                return v(384.0d);
            case 4:
                return v(115.0d);
            case 5:
                return v(700.0d);
            case 6:
            case 14:
                return v(900.0d);
            case 7:
                return v(70.0d);
            case 8:
                return w(1.8d);
            case 9:
            case 10:
                return w(1.0d);
            case 11:
                return v(13.0d);
            case 12:
                return w(5.0d);
            case 13:
                return w(5.0d);
            case 15:
                return w(5.0d);
            default:
                return -1L;
        }
    }

    private static final boolean B(int i) {
        if (i != 13) {
            if (i == 20) {
                return z();
            }
            return false;
        }
        return true;
    }

    private final int t() {
        NetworkInfo a = this.a.a();
        if (a != null) {
            WifiInfo c = this.a.c();
            if (c != null) {
                Map map = d;
                if (map.containsKey(c.getSSID())) {
                    return ((Integer) map.get(c.getSSID())).intValue();
                }
            }
            return a.getSubtype();
        }
        return 0;
    }

    private static long v(double d2) {
        return (long) (d2 * 1000.0d);
    }

    private static long w(double d2) {
        return (long) (d2 * 1000000.0d);
    }

    private final boolean x(NetworkInfo networkInfo) {
        WifiInfo c;
        if (networkInfo.getType() != 1 || (c = this.a.c()) == null) {
            return false;
        }
        return d.containsKey(c.getSSID());
    }

    private final boolean y(int i) {
        NetworkInfo a = this.a.a();
        if (a != null) {
            if (x(a)) {
                return i == 0;
            } else if (a.getType() == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean z() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.yrj
    public final int a() {
        NetworkInfo a = this.a.a();
        if (a == null || !o()) {
            return 2;
        }
        int type = a.getType();
        if (type == 0) {
            return u(a.getSubtype());
        }
        if (type != 1) {
            return type != 6 ? 1 : 6;
        } else if (x(a)) {
            return u(t());
        } else {
            return i() ? 10 : 3;
        }
    }

    @Override // defpackage.yrj
    public final long b() {
        return c(this.a.a());
    }

    @Override // defpackage.yrj
    public final long c(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0L;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            return A(networkInfo.getSubtype());
        }
        if (type == 1) {
            if (x(networkInfo)) {
                return A(t());
            }
            return w(this.a.c().getLinkSpeed());
        } else if (type == 6) {
            return w(3.0d);
        } else {
            if (type == 9) {
                return w(480.0d);
            }
            return -1L;
        }
    }

    @Override // defpackage.yrj
    public final NetworkInfo d() {
        return this.a.a();
    }

    @Override // defpackage.yrj
    public final ampq e() {
        return ampq.i(this.a.c());
    }

    @Override // defpackage.yrj
    public final aqlv f() {
        return g(this.a.a());
    }

    @Override // defpackage.yrj
    public final aqlv g(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return aqlv.DETAILED_NETWORK_TYPE_DISCONNECTED;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type != 1) {
                if (type == 9) {
                    return aqlv.DETAILED_NETWORK_TYPE_ETHERNET;
                }
                if (type == 6) {
                    return aqlv.DETAILED_NETWORK_TYPE_WIMAX;
                }
                if (type == 7) {
                    return aqlv.DETAILED_NETWORK_TYPE_BLUETOOTH;
                }
                return aqlv.DETAILED_NETWORK_TYPE_NON_MOBILE_UNKNOWN;
            }
            WifiInfo c = this.a.c();
            if (c == null) {
                return aqlv.DETAILED_NETWORK_TYPE_WIFI;
            }
            if (d.containsKey(c.getSSID())) {
                return aqlv.DETAILED_NETWORK_TYPE_INTERNAL_WIFI_IMPAIRED;
            }
            return aqlv.DETAILED_NETWORK_TYPE_WIFI;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            if (this.c.d()) {
                return aqlv.DETAILED_NETWORK_TYPE_NR_SA;
            }
            return aqlv.DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN;
        }
        switch (subtype) {
            case 1:
                return aqlv.DETAILED_NETWORK_TYPE_GPRS;
            case 2:
                return aqlv.DETAILED_NETWORK_TYPE_EDGE;
            case 3:
                return aqlv.DETAILED_NETWORK_TYPE_UMTS;
            case 4:
                return aqlv.DETAILED_NETWORK_TYPE_CDMA;
            case 5:
                return aqlv.DETAILED_NETWORK_TYPE_EVDO_0;
            case 6:
                return aqlv.DETAILED_NETWORK_TYPE_EVDO_A;
            case 7:
                return aqlv.DETAILED_NETWORK_TYPE_1_X_RTT;
            case 8:
                return aqlv.DETAILED_NETWORK_TYPE_HSDPA;
            case 9:
                return aqlv.DETAILED_NETWORK_TYPE_HSUPA;
            case 10:
                return aqlv.DETAILED_NETWORK_TYPE_HSPA;
            case 11:
                return aqlv.DETAILED_NETWORK_TYPE_IDEN;
            case 12:
                return aqlv.DETAILED_NETWORK_TYPE_EVDO_B;
            case 13:
                if (this.c.c()) {
                    return aqlv.DETAILED_NETWORK_TYPE_NR_NSA;
                }
                return aqlv.DETAILED_NETWORK_TYPE_LTE;
            case 14:
                return aqlv.DETAILED_NETWORK_TYPE_EHRPD;
            case 15:
                return aqlv.DETAILED_NETWORK_TYPE_HSPAP;
            default:
                return aqlv.DETAILED_NETWORK_TYPE_MOBILE_UNKNOWN;
        }
    }

    @Override // defpackage.yrj
    public final List h() {
        return this.a.d();
    }

    @Override // defpackage.yrj
    public final boolean i() {
        return o() && this.a.g();
    }

    @Override // defpackage.yrj
    public final boolean j() {
        return y(9);
    }

    @Override // defpackage.yrj
    public final boolean k() {
        NetworkInfo a = this.a.a();
        if (a != null) {
            int type = a.getType();
            if (type == 0) {
                return B(a.getSubtype());
            }
            if (type != 1) {
                if (type != 6 && type != 9) {
                    return false;
                }
            } else if (x(a)) {
                return B(t());
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.yrj
    public final boolean l() {
        return this.c.b.d();
    }

    @Override // defpackage.yrj
    public final boolean m() {
        return y(0);
    }

    @Override // defpackage.yrj
    public final boolean n() {
        return this.a.b() != null;
    }

    @Override // defpackage.yrj
    public final boolean o() {
        NetworkInfo a = this.a.a();
        return a != null && a.isConnectedOrConnecting();
    }

    @Override // defpackage.yrj
    public final boolean p() {
        NetworkInfo a = this.a.a();
        return a != null && a.isConnected();
    }

    @Override // defpackage.yrj
    public final boolean q() {
        return this.a.h();
    }

    @Override // defpackage.yrj
    public final boolean r() {
        return y(1);
    }

    @Override // defpackage.yrj
    public final String[] s() {
        WifiInfo c;
        String[] strArr = {"", "", ""};
        NetworkInfo a = this.a.a();
        if (a != null && a.isConnected()) {
            strArr[0] = a.getTypeName();
            strArr[1] = a.getSubtypeName();
            if (a.getType() == 1 && (c = this.a.c()) != null) {
                strArr[2] = c.getSSID();
            }
        }
        return strArr;
    }

    private final int u(int i) {
        if (i == 20) {
            if (!z()) {
                return 7;
            }
            return !this.c.d() ? 9 : 11;
        }
        switch (i) {
            case 1:
            case 2:
                return 4;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
                return 5;
            case 13:
                return this.c.c() ? 12 : 6;
            default:
                return 7;
        }
    }
}

package defpackage;

import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: adwc  reason: default package */
/* loaded from: classes.dex */
public final class adwc {
    public static final String a = zep.a("MDX.discoveryUtils");
    public final azqb b;
    public final boolean c;
    public final SharedPreferences d;

    public adwc(azqb azqbVar, boolean z, SharedPreferences sharedPreferences) {
        this.b = azqbVar;
        this.c = z;
        this.d = sharedPreferences;
    }

    public static boolean e(String str) {
        try {
            Inet4Address inet4Address = (Inet4Address) Inet4Address.getByName(str);
            if (inet4Address == null) {
                return false;
            }
            if (inet4Address.isSiteLocalAddress()) {
                return true;
            }
            return inet4Address.isLinkLocalAddress();
        } catch (ClassCastException e) {
            zep.f(a, "Cannot use IPv6 addresses.", e);
            return false;
        } catch (UnknownHostException unused) {
            zep.c(a, str.length() != 0 ? "Failed to validate IPv4 address ".concat(str) : new String("Failed to validate IPv4 address "));
            return false;
        }
    }

    private final yrf h() {
        List d = d();
        for (int i = 0; i < d.size(); i++) {
            if (d.get(i) != null) {
                return (yrf) d.get(i);
            }
        }
        return null;
    }

    private static InetAddress i(yrf yrfVar) {
        Enumeration c = yrfVar.c();
        if (c != null) {
            while (c.hasMoreElements()) {
                InetAddress inetAddress = (InetAddress) c.nextElement();
                if (inetAddress instanceof Inet4Address) {
                    return inetAddress;
                }
            }
        }
        return null;
    }

    public final yrf a() {
        if (this.c) {
            return h();
        }
        ampq e = ((yrj) this.b.get()).e();
        if (!e.h()) {
            return null;
        }
        int ipAddress = ((WifiInfo) e.c()).getIpAddress();
        try {
            InetAddress byAddress = InetAddress.getByAddress(new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >> 24)});
            List d = d();
            for (int i = 0; i < d.size(); i++) {
                yrf yrfVar = (yrf) d.get(i);
                Enumeration c = yrfVar.c();
                while (c.hasMoreElements()) {
                    if (byAddress.equals((InetAddress) c.nextElement())) {
                        return yrfVar;
                    }
                }
            }
        } catch (UnknownHostException unused) {
        }
        return null;
    }

    public final String b() {
        yrj yrjVar = (yrj) this.b.get();
        return yrjVar.r() ? yrjVar.s()[2] : "";
    }

    public final String c() {
        yrf h;
        InetAddress i;
        if (!this.c || (h = h()) == null || (i = i(h)) == null) {
            ampq e = ((yrj) this.b.get()).e();
            if (!e.h()) {
                return null;
            }
            int ipAddress = ((WifiInfo) e.c()).getIpAddress();
            try {
                return InetAddress.getByAddress(new byte[]{(byte) ipAddress, (byte) (ipAddress >> 8), (byte) (ipAddress >> 16), (byte) (ipAddress >> 24)}).getHostAddress();
            } catch (UnknownHostException e2) {
                throw new AssertionError(e2);
            }
        }
        return i.getHostAddress();
    }

    public final List d() {
        List<yrf> h = ((yrj) this.b.get()).h();
        if (h.isEmpty()) {
            return h;
        }
        ArrayList arrayList = new ArrayList();
        for (yrf yrfVar : h) {
            try {
                if (!yrfVar.a.isLoopback() && !yrfVar.a.isPointToPoint() && yrfVar.c().hasMoreElements() && i(yrfVar) != null) {
                    arrayList.add(yrfVar);
                }
            } catch (SocketException e) {
                zep.f(a, String.format(Locale.US, "Could not read interface type for %s", yrfVar.a()), e);
            }
        }
        return arrayList;
    }

    public final boolean f() {
        return ((yrj) this.b.get()).p();
    }

    public final boolean g(int i) {
        if (this.c) {
            return true;
        }
        yrj yrjVar = (yrj) this.b.get();
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2) {
            return (yrjVar.r() || yrjVar.j()) && yrjVar.p();
        } else if (i2 == 3) {
            return yrjVar.p();
        } else {
            String W = almu.W(i);
            StringBuilder sb = new StringBuilder(String.valueOf(W).length() + 21);
            sb.append("illegal sessionType: ");
            sb.append(W);
            aqxo.z(false, sb.toString());
            return false;
        }
    }
}

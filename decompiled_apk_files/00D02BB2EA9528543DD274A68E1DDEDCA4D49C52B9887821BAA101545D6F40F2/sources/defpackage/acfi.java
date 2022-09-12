package defpackage;

import android.content.ContentResolver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.WifiScan;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfi  reason: default package */
/* loaded from: classes2.dex */
public final class acfi implements achf {
    private static final dcdc<String> e = dcdc.f("location:proks_config");
    private static final dbrz f = dbrz.e("/");
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    @dzsi
    private achg K;
    private final ckoq L;
    public final akox a;
    acfh b;
    public final boolean c;
    final achc d;
    private final gga g;
    private final btrm h;
    private final ahjq i;
    private final dxio<cref> j;
    private final bvjj k;
    private final bvrb l;
    private final araj m;
    private final btvo n;
    private final btpa o;
    private final btyy p;
    private final ccie q;
    private final boolean r;
    @dzsi
    private final achb s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    @dzsi
    private final String z;

    public acfi(gga ggaVar, achb achbVar, achc achcVar, akox akoxVar, btrm btrmVar, ahjq ahjqVar, dxio dxioVar, bvjj bvjjVar, ckoq ckoqVar, bvrb bvrbVar, String str, boolean z, boolean z2, araj arajVar, btvo btvoVar, btpa btpaVar, achg achgVar, btyy btyyVar, ccie ccieVar) {
        this.g = ggaVar;
        this.s = achbVar;
        this.d = achcVar;
        this.a = akoxVar;
        this.h = btrmVar;
        this.i = ahjqVar;
        this.j = dxioVar;
        this.k = bvjjVar;
        this.L = ckoqVar;
        this.l = bvrbVar;
        this.z = str;
        this.c = z;
        this.r = z2;
        this.m = arajVar;
        this.n = btvoVar;
        this.o = btpaVar;
        this.K = achgVar;
        this.p = btyyVar;
        this.q = ccieVar;
    }

    public static void d(Map<String, String> map, String str, @dzsi String str2) {
        if (!dbsj.d(str2)) {
            map.put(str, str2);
        }
    }

    @Override // defpackage.achf
    public final void a(@dzsi Bitmap bitmap) {
        this.h.b(new acfl(acfk.SCREENSHOT_COMPLETED, null));
    }

    public final void b() {
        Bundle extras;
        String num;
        String sb;
        byte[] byteArray;
        File file;
        File file2;
        ahjt h = this.i.h();
        this.w = "LocationState[gps = " + ((Object) duxb.a(ahjt.e(h.a))) + ", cell = " + ((Object) duxb.a(ahjt.e(h.b))) + ", wifi = " + ((Object) duxb.a(ahjt.e(h.c))) + "]";
        LocationAvailability i = this.i.i();
        String str = "unknown";
        this.x = i == null ? str : i.toString();
        GmmLocation a = this.i.a();
        dcqe dcqeVar = GmmLocation.g;
        int i2 = 99999;
        if (a != null && a.hasAccuracy()) {
            i2 = (int) a.getAccuracy();
        }
        StringBuilder sb2 = new StringBuilder(11);
        sb2.append(i2);
        this.y = sb2.toString();
        GmmLocation a2 = this.i.a();
        String str2 = "unavailable";
        boolean z = false;
        if (a2 == null || (extras = a2.getExtras()) == null) {
            num = str2;
        } else {
            int i3 = extras.getInt("locationType", 0);
            num = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? Integer.toString(i3) : "wifi" : "cell" : "gps" : str;
        }
        this.C = num;
        GmmLocation a3 = this.i.a();
        String str3 = null;
        if (a3 == null) {
            sb = "WIFI[unavailable]";
        } else {
            Bundle extras2 = a3.getExtras();
            WifiScan wifiScan = (extras2 == null || (byteArray = extras2.getByteArray(FusedLocationProviderApi.EXTRA_KEY_WIFI_SCAN)) == null) ? null : (WifiScan) cnwo.b(byteArray, WifiScan.CREATOR);
            if (wifiScan != null) {
                int a4 = wifiScan.a();
                ArrayList arrayList = new ArrayList(a4 + a4);
                for (int i4 = 0; i4 < a4; i4++) {
                    arrayList.add(Byte.toString(wifiScan.c(i4)));
                    arrayList.add(String.format("%012X", Long.valueOf(wifiScan.b(i4))));
                }
                str2 = f.g(arrayList);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 6);
            sb3.append("WIFI[");
            sb3.append(str2);
            sb3.append("]");
            sb = sb3.toString();
        }
        this.D = sb;
        long m = this.o.m();
        StringBuilder sb4 = new StringBuilder(32);
        sb4.append("Graydot[ms=");
        sb4.append(m);
        sb4.append("]");
        this.E = sb4.toString();
        ArrayList a5 = dchl.a();
        a5.addAll(this.n.getLoggingParameters().j);
        a5.addAll(this.n.getTriggerExperimentIdParameters().a);
        a5.addAll(this.p.b());
        this.F = dbrz.e(",").g(a5);
        String str4 = "";
        if (this.d == achc.LOCATION_QUALITY_FEEDBACK) {
            GmmLocation a6 = this.i.a();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("LocationSpeed[speed = ");
            if (a6 == null || !a6.hasSpeed()) {
                sb5.append(str);
            } else {
                sb5.append(a6.getSpeed());
            }
            sb5.append(", bearing = ");
            if (a6 == null || !a6.hasBearing()) {
                sb5.append(str);
            } else {
                sb5.append(a6.getBearing());
            }
            sb5.append("]");
            this.v = sb5.toString();
            try {
                PackageInfo packageInfo = this.g.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                if (packageInfo != null) {
                    str = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 20);
            sb6.append("Versions[gmscore = ");
            sb6.append(str);
            sb6.append("]");
            this.A = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Connectivity[");
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.g.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                sb7.append("isConnected = ");
                sb7.append(activeNetworkInfo.isConnected());
                sb7.append(", type = ");
                sb7.append(activeNetworkInfo.getTypeName());
                sb7.append(", subtype = ");
                sb7.append(activeNetworkInfo.getSubtype());
                sb7.append(", state = ");
                sb7.append(activeNetworkInfo.getState());
                sb7.append(", detailedState = ");
                sb7.append(activeNetworkInfo.getDetailedState());
            }
            sb7.append("]");
            this.t = sb7.toString();
            int k = this.m.k();
            StringBuilder sb8 = new StringBuilder(43);
            sb8.append("OrientationAccuracy[accuracy = ");
            sb8.append(k);
            sb8.append("]");
            this.u = sb8.toString();
            ContentResolver contentResolver = this.g.getContentResolver();
            dcdc<String> dcdcVar = e;
            StringBuilder sb9 = new StringBuilder("Gservices[");
            int size = dcdcVar.size();
            String str5 = str4;
            int i5 = 0;
            while (i5 < size) {
                String str6 = dcdcVar.get(i5);
                sb9.append(str5);
                sb9.append(str6);
                sb9.append(" = ");
                sb9.append(cpke.b(contentResolver, str6));
                i5++;
                str5 = ", ";
            }
            Map<String, String> e2 = cpke.e(contentResolver, "user_location_reporting:experiment");
            for (String str7 : e2.keySet()) {
                sb9.append(str5);
                sb9.append(str7);
                sb9.append(" = ");
                sb9.append(e2.get(str7));
                str5 = ", ";
            }
            sb9.append("]");
            this.B = sb9.toString();
        } else {
            this.v = str4;
            this.A = str4;
            this.t = str4;
            this.u = str4;
            this.B = str4;
        }
        alad n = this.a.n();
        if (this.L != null) {
            try {
                file = this.g.getExternalFilesDir(null);
            } catch (Exception unused2) {
                file = null;
            }
            if (file == null) {
                file2 = null;
            } else {
                String absolutePath = file.getAbsolutePath();
                String valueOf = String.valueOf(File.separator);
                String concat = valueOf.length() != 0 ? "google.android.apps.gmm.*?".concat(valueOf) : new String("google.android.apps.gmm.*?");
                String valueOf2 = String.valueOf(File.separator);
                file2 = new File(absolutePath.replaceFirst(concat, valueOf2.length() != 0 ? "google.android.apps.gmm".concat(valueOf2) : new String("google.android.apps.gmm")));
            }
            if (file2 != null) {
                new File(file2, "event-track-" + bvod.a(new Date()) + ".xml").getAbsolutePath();
            }
        }
        this.G = this.j.a().p().toString();
        if (this.k.m(bvjk.bU, false)) {
            this.H = cren.MUTED.toString();
        } else {
            cren a7 = cren.a(this.k.s(bvjk.bV, cren.UNMUTED.d));
            if (a7 != null) {
                str4 = a7.toString();
            }
            this.H = str4;
        }
        this.I = Boolean.toString(this.k.m(bvjk.eO, true));
        AudioManager audioManager = (AudioManager) this.g.getSystemService("audio");
        if (audioManager.isBluetoothA2dpOn() || (audioManager.isBluetoothScoOn() && audioManager.isBluetoothScoAvailableOffCall())) {
            z = true;
        }
        this.J = Boolean.toString(z);
        dqwa a8 = this.q.a();
        if (a8 != null) {
            dqvy dqvyVar = a8.c;
            if (dqvyVar == null) {
                dqvyVar = dqvy.h;
            }
            int a9 = dqvx.a(dqvyVar.g);
            if (a9 == 0) {
                a9 = 1;
            }
            int i6 = a9 - 1;
            if (i6 == 1) {
                int i7 = dqvyVar.d;
                if ((dqvyVar.a & 16) != 0) {
                    StringBuilder sb10 = new StringBuilder(11);
                    sb10.append(i7);
                    str3 = sb10.toString();
                }
            } else if (i6 == 2) {
                str3 = "not_opted_in";
            }
        }
        String str8 = str3;
        if (this.r) {
            try {
                this.K = acgp.d(this, this.g, this.a, this.l);
            } catch (OutOfMemoryError unused3) {
            }
        }
        this.b = new acfh(n, this.K, this.s, this.d, this.v, this.w, this.x, this.y, this.z, this.A, this.t, this.u, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, str8);
        if (this.r || this.K != null) {
            if (this.c) {
                this.h.b(new acfl(acfk.FEEDBACK_SHAKEN_DIALOG_START, this));
                return;
            } else {
                this.h.b(new acfl(acfk.FEEDBACK_WAIT_UNTIL_SCREENSHOT, this));
                return;
            }
        }
        this.h.b(new acfl(acfk.PLAIN_FEEDBACK_CREATED, this));
    }

    @dzsi
    public final String c() {
        acfh acfhVar = this.b;
        if (acfhVar == null) {
            return null;
        }
        return acfhVar.a;
    }
}

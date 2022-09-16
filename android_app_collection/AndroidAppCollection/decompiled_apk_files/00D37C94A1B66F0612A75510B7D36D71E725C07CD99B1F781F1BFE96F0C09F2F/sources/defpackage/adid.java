package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adid  reason: default package */
/* loaded from: classes.dex */
public final class adid extends adie {
    private static final AppStatus o = AppStatus.d(-2);
    public AppStatus a;
    public final Uri b;
    public final Uri c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final int l;
    public final int m;
    public adit n;

    public adid() {
    }

    public adid(Uri uri, Uri uri2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, int i2) {
        this.b = uri;
        this.c = uri2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = j;
        this.l = i;
        this.m = i2;
    }

    public static Uri f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("dial.dial_app_uri", "");
        if (!amps.e(string)) {
            return Uri.parse(string);
        }
        return null;
    }

    public static adic h() {
        adic adicVar = new adic();
        adicVar.a = o;
        adicVar.d(-1L);
        adicVar.e(0);
        adicVar.i = 1;
        adicVar.c("");
        return adicVar;
    }

    @Override // defpackage.adig
    public final String b() {
        return this.d;
    }

    @Override // defpackage.adig
    public final String c() {
        String str = this.f;
        String str2 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Override // defpackage.adig
    public final int d() {
        return 3;
    }

    @Override // defpackage.adie
    public final adit e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adid) {
            adid adidVar = (adid) obj;
            Uri uri = this.b;
            if (uri != null ? uri.equals(adidVar.b) : adidVar.b == null) {
                Uri uri2 = this.c;
                if (uri2 != null ? uri2.equals(adidVar.c) : adidVar.c == null) {
                    if (this.d.equals(adidVar.d) && this.e.equals(adidVar.e) && ((str = this.f) != null ? str.equals(adidVar.f) : adidVar.f == null) && ((str2 = this.g) != null ? str2.equals(adidVar.g) : adidVar.g == null) && ((str3 = this.h) != null ? str3.equals(adidVar.h) : adidVar.h == null) && ((str4 = this.i) != null ? str4.equals(adidVar.i) : adidVar.i == null) && ((str5 = this.j) != null ? str5.equals(adidVar.j) : adidVar.j == null) && this.k == adidVar.k && this.l == adidVar.l) {
                        int i = this.m;
                        int i2 = adidVar.m;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == i2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.b;
        int i = 0;
        int hashCode = ((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003;
        Uri uri2 = this.c;
        int hashCode2 = (((((hashCode ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.i;
        int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.j;
        if (str5 != null) {
            i = str5.hashCode();
        }
        long j = this.k;
        int i2 = (((((hashCode6 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l) * 1000003;
        int i3 = this.m;
        if (i3 != 0) {
            return i2 ^ i3;
        }
        throw null;
    }

    @Override // defpackage.adie, defpackage.adig
    public final boolean i(adig adigVar) {
        if (adigVar.d() != 3) {
            return false;
        }
        return this.n.equals(((adid) adigVar).n);
    }

    public final adic j() {
        adic adicVar = new adic(this);
        adicVar.a = this.a;
        adicVar.j = this.n;
        return adicVar;
    }

    public final adid k(AppStatus appStatus) {
        adic j = j();
        j.a = appStatus;
        return j.a();
    }

    public final ScreenId l() {
        AppStatus appStatus = this.a;
        if (appStatus != null) {
            return appStatus.e();
        }
        return null;
    }

    public final Map m() {
        AppStatus appStatus = this.a;
        if (appStatus != null) {
            return appStatus.h();
        }
        return null;
    }

    public final boolean n() {
        return o() && this.b == null;
    }

    public final boolean o() {
        return this.j != null;
    }

    public final adit p() {
        AppStatus appStatus = this.a;
        if (appStatus != null) {
            return appStatus.l();
        }
        return null;
    }

    @Override // defpackage.adie, defpackage.adig
    public final Bundle r() {
        Bundle r = super.r();
        Uri uri = this.b;
        r.putString("dial.dial_app_uri", uri == null ? "" : uri.toString());
        return r;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        String str6 = this.i;
        String str7 = this.j;
        long j = this.k;
        int i = this.l;
        int i2 = this.m;
        String num = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 228 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str6).length() + String.valueOf(str7).length() + String.valueOf(num).length());
        sb.append("MdxDialScreen{dialAppUri=");
        sb.append(valueOf);
        sb.append(", dialBaseUri=");
        sb.append(valueOf2);
        sb.append(", deviceName=");
        sb.append(str);
        sb.append(", networkId=");
        sb.append(str2);
        sb.append(", manufacturer=");
        sb.append(str3);
        sb.append(", modelName=");
        sb.append(str4);
        sb.append(", modelNumber=");
        sb.append(str5);
        sb.append(", deviceVersion=");
        sb.append(str6);
        sb.append(", wakeOnLanMac=");
        sb.append(str7);
        sb.append(", wakeOnLanTimeout=");
        sb.append(j);
        sb.append(", wakeOnLanStatusOnStarted=");
        sb.append(i);
        sb.append(", cacheMethod=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }
}

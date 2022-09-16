package com.google.android.libraries.youtube.innertube.model.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.Format;
import java.util.Set;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class FormatStreamModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aalf(10);
    public final aqzx a;
    public final String b;
    public final long c;
    public final Uri d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;
    private final boolean i;

    public FormatStreamModel(aqzx aqzxVar, String str, long j) {
        this(aqzxVar, str, j, false);
    }

    public static boolean D(int i) {
        return i == -2 || i == -1;
    }

    public static boolean I(aqzx aqzxVar) {
        return aank.r().contains(Integer.valueOf(aqzxVar.d)) || aqzxVar.k > 32;
    }

    public static boolean O(int i) {
        return i >= 0;
    }

    public static int g(int i, int i2) {
        if (i < i2) {
            return aalw.a(i2, i);
        }
        return aalw.a(i, i2);
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        aopa createBuilder = awzl.a.createBuilder();
        for (String str2 : str.split(":", -1)) {
            String[] split = str2.split("=", -1);
            int length = split.length;
            String str3 = length > 0 ? split[0] : "";
            String str4 = length > 1 ? split[1] : "";
            aopa createBuilder2 = awzk.a.createBuilder();
            createBuilder2.copyOnWrite();
            awzk awzkVar = (awzk) createBuilder2.instance;
            str3.getClass();
            awzkVar.b = 1 | awzkVar.b;
            awzkVar.c = str3;
            createBuilder2.copyOnWrite();
            awzk awzkVar2 = (awzk) createBuilder2.instance;
            str4.getClass();
            awzkVar2.b |= 2;
            awzkVar2.d = str4;
            createBuilder.copyOnWrite();
            awzl awzlVar = (awzl) createBuilder.instance;
            awzk awzkVar3 = (awzk) createBuilder2.mo39build();
            awzkVar3.getClass();
            aopu aopuVar = awzlVar.b;
            if (!aopuVar.c()) {
                awzlVar.b = aopi.mutableCopy(aopuVar);
            }
            awzlVar.b.add(awzkVar3);
        }
        return Base64.encodeToString(((awzl) createBuilder.mo39build()).toByteArray(), 11);
    }

    public final boolean A() {
        return aank.c().contains(Integer.valueOf(e()));
    }

    public final boolean B() {
        return aank.y().contains(Integer.valueOf(e()));
    }

    public final boolean C() {
        return aanp.c(t());
    }

    public final boolean E() {
        apip apipVar = this.a.v;
        if (apipVar == null) {
            apipVar = apip.a;
        }
        return apipVar.e;
    }

    public final boolean F() {
        aqzx aqzxVar = this.a;
        if ((aqzxVar.c & 524288) != 0) {
            aqzw aqzwVar = aqzxVar.w;
            if (aqzwVar == null) {
                aqzwVar = aqzw.a;
            }
            int e = araa.e(aqzwVar.d);
            return e != 0 && e == 2;
        }
        return false;
    }

    public final boolean G() {
        return ((Set) aank.bs.get()).contains(Integer.valueOf(e()));
    }

    public final boolean H() {
        return I(this.a);
    }

    public final boolean J() {
        return zgt.n(this.d);
    }

    public final boolean K() {
        return aank.t().contains(Integer.valueOf(e()));
    }

    public final boolean L() {
        int d = araa.d(this.a.A);
        return d != 0 && d == 4;
    }

    public final boolean M() {
        return aank.v().contains(Integer.valueOf(e()));
    }

    public final boolean N() {
        int i = this.a.c;
        return ((i & 256) == 0 || (i & 512) == 0) ? false : true;
    }

    public final boolean P() {
        return aanp.d(t());
    }

    public final boolean Q() {
        for (ason asonVar : new aops(this.a.r, aqzx.a)) {
            if (asonVar == ason.WIDEVINE) {
                return true;
            }
        }
        return false;
    }

    public final avg R(String str) {
        Format m = m();
        long j = this.a.o;
        String uri = l(str).toString();
        aqzy aqzyVar = this.a.m;
        if (aqzyVar == null) {
            aqzyVar = aqzy.a;
        }
        long j2 = aqzyVar.c;
        aqzy aqzyVar2 = this.a.m;
        if (aqzyVar2 == null) {
            aqzyVar2 = aqzy.a;
        }
        long j3 = aqzyVar2.d;
        aqzy aqzyVar3 = this.a.n;
        if (aqzyVar3 == null) {
            aqzyVar3 = aqzy.a;
        }
        long j4 = aqzyVar3.c;
        aqzy aqzyVar4 = this.a.n;
        if (aqzyVar4 == null) {
            aqzyVar4 = aqzy.a;
        }
        long j5 = aqzyVar4.d;
        amuk q = amuk.q();
        String str2 = this.h;
        long j6 = j();
        return new avg(m, amuk.r(new avd(uri)), new avh(new avf(null, j2, (j3 - j2) + 1), j4, (j5 - j4) + 1), q, str2, j6);
    }

    public final long S() {
        String queryParameter = this.d.getQueryParameter("maxdsq");
        if (queryParameter == null) {
            queryParameter = this.d.getQueryParameter("max_sq");
        }
        if (queryParameter != null) {
            try {
                return Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public final long T() {
        String queryParameter = this.d.getQueryParameter("mindsq");
        if (queryParameter == null) {
            queryParameter = this.d.getQueryParameter("min_sq");
        }
        if (queryParameter != null) {
            try {
                return Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int U() {
        aqzx aqzxVar = this.a;
        if ((aqzxVar.c & 524288) != 0) {
            aqzw aqzwVar = aqzxVar.w;
            if (aqzwVar == null) {
                aqzwVar = aqzw.a;
            }
            int c = araa.c(aqzwVar.c);
            if (c != 0) {
                return c;
            }
            return 1;
        }
        return 3;
    }

    public final int V() {
        int b = araa.b(this.a.t);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    public final double a() {
        return this.a.z;
    }

    public final float b() {
        return this.a.C;
    }

    public final int c() {
        return this.a.k;
    }

    public final int d() {
        return this.a.j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatStreamModel)) {
            return false;
        }
        FormatStreamModel formatStreamModel = (FormatStreamModel) obj;
        return this.c == formatStreamModel.c && akzj.f(this.b, formatStreamModel.b) && this.a.equals(formatStreamModel.a);
    }

    public final int f() {
        if (P()) {
            return g(i(), d());
        }
        if (!C() || !aank.b().contains(Integer.valueOf(e()))) {
            return -1;
        }
        if (((Set) aank.bn.get()).contains(Integer.valueOf(e()))) {
            return 1;
        }
        if (((Set) aank.bo.get()).contains(Integer.valueOf(e()))) {
            return 2;
        }
        return ((Set) aank.bp.get()).contains(Integer.valueOf(e())) ? 4 : 3;
    }

    public final int h() {
        return (int) (this.a.y * 1000.0d);
    }

    public final int hashCode() {
        long j = this.c;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        String str = this.b;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.a.hashCode();
    }

    public final int i() {
        return this.a.i;
    }

    public final long j() {
        return this.a.p;
    }

    public final long k() {
        return this.a.o;
    }

    public final Uri l(String str) {
        aalz n = n();
        n.c(str);
        return n.a();
    }

    public final Format m() {
        pis pisVar = new pis();
        pisVar.a = this.e;
        pisVar.j = v();
        String a = aanp.a(t());
        pisVar.h = a;
        int i = this.f;
        pisVar.f = i;
        pisVar.g = i;
        int i2 = 4;
        if (P()) {
            pisVar.k = pwl.g(a);
            pisVar.p = i();
            pisVar.q = d();
            int c = c();
            pisVar.r = c > 0 ? c : -1.0f;
            pisVar.d = 4;
        } else {
            pisVar.k = pwl.d(a);
            if (true == E()) {
                i2 = 1;
            }
            pisVar.d = i2;
            pisVar.c = q();
        }
        return pisVar.a();
    }

    public final aalz n() {
        return aalz.b(this.d);
    }

    public final String p() {
        apip apipVar = this.a.v;
        if (apipVar == null) {
            apipVar = apip.a;
        }
        return apipVar.c;
    }

    public final String q() {
        apip apipVar = this.a.v;
        if (apipVar == null) {
            apipVar = apip.a;
        }
        return apipVar.d;
    }

    public final String r() {
        appr apprVar = this.a.B;
        if (apprVar == null) {
            apprVar = appr.a;
        }
        return apprVar.b;
    }

    public final String s() {
        appr apprVar = this.a.B;
        if (apprVar == null) {
            apprVar = appr.a;
        }
        return apprVar.d;
    }

    public final String t() {
        return this.a.f;
    }

    public final String toString() {
        String str;
        int e = e();
        String w = w();
        String str2 = "";
        if (C()) {
            boolean E = E();
            String q = q();
            String p = p();
            StringBuilder sb = new StringBuilder(String.valueOf(q).length() + 63 + String.valueOf(p).length());
            sb.append(" isDefaultAudioTrack=");
            sb.append(E);
            sb.append(" audioTrackId=");
            sb.append(q);
            sb.append(" audioTrackDisplayName=");
            sb.append(p);
            str = sb.toString();
        } else {
            str = str2;
        }
        if (P()) {
            int i = i();
            int d = d();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append(" width=");
            sb2.append(i);
            sb2.append(" height=");
            sb2.append(d);
            str2 = sb2.toString();
        }
        String t = t();
        String obj = new aops(this.a.r, aqzx.a).toString();
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(w).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(t).length();
        StringBuilder sb3 = new StringBuilder(length + 65 + length2 + length3 + length4 + String.valueOf(obj).length() + String.valueOf(valueOf).length());
        sb3.append("FormatStream(itag=");
        sb3.append(e);
        sb3.append(" xtags=");
        sb3.append(w);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(" mimeType=");
        sb3.append(t);
        sb3.append(" drmFamilies=");
        sb3.append(obj);
        sb3.append(" uri=");
        sb3.append(valueOf);
        sb3.append(")");
        return sb3.toString();
    }

    public final String u() {
        int i;
        if (!TextUtils.isEmpty(this.a.s)) {
            return this.a.s;
        }
        String str = "";
        if (P()) {
            int i2 = i();
            int d = d();
            int[] iArr = aalw.a;
            if (i2 < 0 || d < 0 || (i2 == 0 && d == 0)) {
                i = -1;
            } else {
                int[] iArr2 = aalw.b;
                int min = Math.min(i2, d);
                int max = Math.max(i2, d);
                int i3 = 0;
                while (i3 < 10 && max < aalw.a[i3] * 1.3f && min < aalw.b[i3] * 1.3f) {
                    i3++;
                }
                i = iArr2[Math.max(0, i3 - 1)];
            }
            if (i != -1) {
                int c = c();
                String str2 = c >= 55 ? "60" : c >= 49 ? "50" : c >= 39 ? "48" : str;
                if (true == G()) {
                    str = " HDR";
                }
                StringBuilder sb = new StringBuilder(str2.length() + 12 + str.length());
                sb.append(i);
                sb.append("p");
                sb.append(str2);
                sb.append(str);
                return sb.toString();
            }
        }
        return str;
    }

    public final String v() {
        return aanp.b(t());
    }

    public final String w() {
        return this.a.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zgd.K(this.a, parcel);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.i ? 1 : 0);
    }

    public final boolean x() {
        return (this.a.c & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0;
    }

    public final boolean y() {
        return aank.d().contains(Integer.valueOf(e()));
    }

    public final boolean z() {
        return aank.p().contains(Integer.valueOf(e()));
    }

    public FormatStreamModel(aqzx aqzxVar, String str, long j, boolean z) {
        String sb;
        this.a = aqzxVar;
        this.b = str;
        this.c = j;
        this.d = Uri.parse(aqzxVar.e);
        String b = ovm.b(aqzxVar.d, aqzxVar.q);
        this.e = b;
        int i = aqzxVar.h;
        i = i <= 0 ? (int) (aqzxVar.g * 0.8f) : i;
        this.g = i;
        this.f = !z ? aqzxVar.g : i;
        this.i = z;
        if (str == null) {
            sb = null;
        } else {
            long j2 = aqzxVar.o;
            StringBuilder sb2 = new StringBuilder(str.length() + 22 + String.valueOf(b).length());
            sb2.append(str);
            sb2.append(".");
            sb2.append(b);
            sb2.append(".");
            sb2.append(j2);
            sb = sb2.toString();
        }
        this.h = sb;
    }
}

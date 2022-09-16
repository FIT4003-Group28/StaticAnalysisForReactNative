package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: agql  reason: default package */
/* loaded from: classes.dex */
public final class agql {
    public static final int[] a = {0, 1, 2, 3, 4};
    public final FormatStreamModel b;
    public final boolean c;
    public final long d;
    public final int e;
    public final long f;
    public final byte[] g;
    public final byte[] h;
    public final awxi i;
    public final String j;
    public final int k;
    public final String l;
    public final boolean m;
    public final Uri n;
    public final int o;

    public agql() {
    }

    public agql(FormatStreamModel formatStreamModel, boolean z, long j, int i, long j2, int i2, byte[] bArr, byte[] bArr2, awxi awxiVar, String str, int i3, String str2, boolean z2, Uri uri) {
        this.b = formatStreamModel;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.o = i2;
        this.g = bArr;
        this.h = bArr2;
        this.i = awxiVar;
        this.j = str;
        this.k = i3;
        this.l = str2;
        this.m = z2;
        this.n = uri;
    }

    public static agqk e() {
        agqk agqkVar = new agqk();
        agqkVar.g(0);
        agqkVar.h(0L);
        agqkVar.i(1);
        agqkVar.e(0);
        agqkVar.f(false);
        return agqkVar;
    }

    public final int a() {
        return this.b.e();
    }

    public final long b() {
        return this.b.j();
    }

    public final agpz c(List list) {
        String f;
        String str;
        if (i() && (f = f()) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                agpz agpzVar = (agpz) it.next();
                if (agpzVar != null && ((str = this.l) == null || str.equals(agpzVar.a))) {
                    if (agpzVar.g().contains(f) && agpzVar.m(f, 0L, b())) {
                        return agpzVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public final agqk d() {
        agqk e = e();
        e.d(this.b);
        e.b(this.c);
        e.c(this.d);
        e.g(this.e);
        e.h(this.f);
        e.i(this.o);
        e.a = this.g;
        e.b = this.h;
        e.c = this.i;
        e.d = this.j;
        e.e(this.k);
        e.e = this.l;
        e.f(this.m);
        e.f = this.n;
        return e;
    }

    public final boolean equals(Object obj) {
        awxi awxiVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agql) {
            agql agqlVar = (agql) obj;
            if (this.b.equals(agqlVar.b) && this.c == agqlVar.c && this.d == agqlVar.d && this.e == agqlVar.e && this.f == agqlVar.f) {
                int i = this.o;
                int i2 = agqlVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    boolean z = agqlVar instanceof agql;
                    if (Arrays.equals(this.g, z ? agqlVar.g : agqlVar.g)) {
                        if (Arrays.equals(this.h, z ? agqlVar.h : agqlVar.h) && ((awxiVar = this.i) != null ? awxiVar.equals(agqlVar.i) : agqlVar.i == null) && ((str = this.j) != null ? str.equals(agqlVar.j) : agqlVar.j == null) && this.k == agqlVar.k && ((str2 = this.l) != null ? str2.equals(agqlVar.l) : agqlVar.l == null) && this.m == agqlVar.m) {
                            Uri uri = this.n;
                            Uri uri2 = agqlVar.n;
                            if (uri != null ? uri.equals(uri2) : uri2 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return aear.c(g(), a(), h(), this.b.k());
    }

    public final String g() {
        return amps.d(this.b.b);
    }

    public final String h() {
        return this.b.w();
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        int i = 1237;
        int i2 = true != this.c ? 1237 : 1231;
        long j = this.d;
        int i3 = this.e;
        long j2 = this.f;
        int i4 = (((((((hashCode ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i3) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i5 = this.o;
        if (i5 != 0) {
            int hashCode2 = (((((i4 ^ i5) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003) ^ Arrays.hashCode(this.h)) * 1000003;
            awxi awxiVar = this.i;
            int i6 = 0;
            int hashCode3 = (hashCode2 ^ (awxiVar == null ? 0 : awxiVar.hashCode())) * 1000003;
            String str = this.j;
            int hashCode4 = (((hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.k) * 1000003;
            String str2 = this.l;
            int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
            if (true == this.m) {
                i = 1231;
            }
            int i7 = (hashCode5 ^ i) * 1000003;
            Uri uri = this.n;
            if (uri != null) {
                i6 = uri.hashCode();
            }
            return i7 ^ i6;
        }
        throw null;
    }

    public final boolean i() {
        return this.d == b();
    }

    public final boolean j(List list) {
        return c(list) != null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        long j = this.d;
        int i = this.e;
        long j2 = this.f;
        int i2 = this.o;
        String num = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        String arrays = Arrays.toString(this.g);
        String arrays2 = Arrays.toString(this.h);
        String valueOf2 = String.valueOf(this.i);
        String str = this.j;
        int i3 = this.k;
        String str2 = this.l;
        boolean z2 = this.m;
        String valueOf3 = String.valueOf(this.n);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(num).length();
        int length3 = String.valueOf(arrays).length();
        int length4 = String.valueOf(arrays2).length();
        int length5 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 306 + length2 + length3 + length4 + length5 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length());
        sb.append("OfflineStream{formatStream=");
        sb.append(valueOf);
        sb.append(", audioOnly=");
        sb.append(z);
        sb.append(", bytesTransferred=");
        sb.append(j);
        sb.append(", streamStatus=");
        sb.append(i);
        sb.append(", streamStatusTimestamp=");
        sb.append(j2);
        sb.append(", offlineStorageFormat=");
        sb.append(num);
        sb.append(", wrappedKey=");
        sb.append(arrays);
        sb.append(", discoKeyIv=");
        sb.append(arrays2);
        sb.append(", discoKey=");
        sb.append(valueOf2);
        sb.append(", discoNonce=");
        sb.append(str);
        sb.append(", streamEncryptionKeyType=");
        sb.append(i3);
        sb.append(", storageId=");
        sb.append(str2);
        sb.append(", streamExpired=");
        sb.append(z2);
        sb.append(", ytbUri=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

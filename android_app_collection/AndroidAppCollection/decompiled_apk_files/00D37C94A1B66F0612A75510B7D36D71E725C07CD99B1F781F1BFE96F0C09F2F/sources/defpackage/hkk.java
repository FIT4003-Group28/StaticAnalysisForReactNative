package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: hkk  reason: default package */
/* loaded from: classes3.dex */
public final class hkk {
    public final avuk a;
    public final Uri b;
    public final Uri c;
    public final atnp d;
    public final String e;
    public final Long f;
    public final String g;
    public final String h;
    public final amuk i;
    public final awbb j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final int o;

    public hkk() {
    }

    public hkk(avuk avukVar, int i, Uri uri, Uri uri2, atnp atnpVar, String str, Long l, String str2, String str3, amuk amukVar, awbb awbbVar, boolean z, boolean z2, String str4, String str5) {
        this.a = avukVar;
        this.o = i;
        this.b = uri;
        this.c = uri2;
        this.d = atnpVar;
        this.e = str;
        this.f = l;
        this.g = str2;
        this.h = str3;
        this.i = amukVar;
        this.j = awbbVar;
        this.k = z;
        this.l = z2;
        this.m = str4;
        this.n = str5;
    }

    public static hkj a() {
        hkj hkjVar = new hkj();
        hkjVar.d(false);
        hkjVar.b(false);
        return hkjVar;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        atnp atnpVar;
        String str;
        Long l;
        String str2;
        String str3;
        amuk amukVar;
        awbb awbbVar;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkk) {
            hkk hkkVar = (hkk) obj;
            if (this.a.equals(hkkVar.a)) {
                int i = this.o;
                int i2 = hkkVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(hkkVar.b) && ((uri = this.c) != null ? uri.equals(hkkVar.c) : hkkVar.c == null) && ((atnpVar = this.d) != null ? atnpVar.equals(hkkVar.d) : hkkVar.d == null) && ((str = this.e) != null ? str.equals(hkkVar.e) : hkkVar.e == null) && ((l = this.f) != null ? l.equals(hkkVar.f) : hkkVar.f == null) && ((str2 = this.g) != null ? str2.equals(hkkVar.g) : hkkVar.g == null) && ((str3 = this.h) != null ? str3.equals(hkkVar.h) : hkkVar.h == null) && ((amukVar = this.i) != null ? amxp.v(amukVar, hkkVar.i) : hkkVar.i == null) && ((awbbVar = this.j) != null ? awbbVar.equals(hkkVar.j) : hkkVar.j == null) && this.k == hkkVar.k && this.l == hkkVar.l && ((str4 = this.m) != null ? str4.equals(hkkVar.m) : hkkVar.m == null)) {
                    String str5 = this.n;
                    String str6 = hkkVar.n;
                    if (str5 != null ? str5.equals(str6) : str6 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.o;
        awwc.am(i);
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003;
        Uri uri = this.c;
        int i2 = 0;
        int hashCode3 = (hashCode2 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        atnp atnpVar = this.d;
        int hashCode4 = (hashCode3 ^ (atnpVar == null ? 0 : atnpVar.hashCode())) * 1000003;
        String str = this.e;
        int hashCode5 = (hashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.f;
        int hashCode6 = (hashCode5 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode7 = (hashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode8 = (hashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        amuk amukVar = this.i;
        int hashCode9 = (hashCode8 ^ (amukVar == null ? 0 : amukVar.hashCode())) * 1000003;
        awbb awbbVar = this.j;
        int i3 = 1237;
        int hashCode10 = (((hashCode9 ^ (awbbVar == null ? 0 : awbbVar.hashCode())) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003;
        if (true == this.l) {
            i3 = 1231;
        }
        int i4 = (hashCode10 ^ i3) * 1000003;
        String str4 = this.m;
        int hashCode11 = (i4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.n;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode11 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.o;
        String al = i != 0 ? awwc.al(i) : "null";
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String str = this.e;
        String valueOf5 = String.valueOf(this.f);
        String str2 = this.g;
        String str3 = this.h;
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        boolean z = this.k;
        boolean z2 = this.l;
        String str4 = this.m;
        String str5 = this.n;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(al).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(str).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(str2).length();
        int length9 = String.valueOf(str3).length();
        int length10 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 294 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf7).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("ShortsUploadInfo{uploadFlowSource=");
        sb.append(valueOf);
        sb.append(", uploadFlowFlavor=");
        sb.append(al);
        sb.append(", sourceUri=");
        sb.append(valueOf2);
        sb.append(", editedVideoUri=");
        sb.append(valueOf3);
        sb.append(", interactionLoggingExtension=");
        sb.append(valueOf4);
        sb.append(", shortsProjectDir=");
        sb.append(str);
        sb.append(", videoDuration=");
        sb.append(valueOf5);
        sb.append(", flowLoggingNonce=");
        sb.append(str2);
        sb.append(", thumbnailPath=");
        sb.append(str3);
        sb.append(", creationSurfaces=");
        sb.append(valueOf6);
        sb.append(", videoShortsCreation=");
        sb.append(valueOf7);
        sb.append(", usesYTAudioSource=");
        sb.append(z);
        sb.append(", isShortsEligible=");
        sb.append(z2);
        sb.append(", frontendId=");
        sb.append(str4);
        sb.append(", title=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}

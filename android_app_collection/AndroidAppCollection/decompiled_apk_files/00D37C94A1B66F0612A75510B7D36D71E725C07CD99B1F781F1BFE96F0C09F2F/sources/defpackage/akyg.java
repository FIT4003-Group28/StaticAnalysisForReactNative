package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: akyg  reason: default package */
/* loaded from: classes.dex */
public final class akyg {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final alda d;
    public final avuk e;
    public final arxl f;
    public final String g;
    public final Bitmap h;
    public final awbb i;
    public final alcx j;
    public final alcp k;
    public final amuk l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;

    public akyg() {
    }

    public akyg(String str, Uri uri, Uri uri2, int i, alda aldaVar, avuk avukVar, arxl arxlVar, String str2, Bitmap bitmap, awbb awbbVar, alcx alcxVar, alcp alcpVar, amuk amukVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.p = i;
        this.d = aldaVar;
        this.e = avukVar;
        this.f = arxlVar;
        this.g = str2;
        this.h = bitmap;
        this.i = awbbVar;
        this.j = alcxVar;
        this.k = alcpVar;
        this.l = amukVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static akyf a() {
        akyf akyfVar = new akyf();
        akyfVar.b(false);
        akyfVar.c(false);
        akyfVar.d(false);
        return akyfVar;
    }

    public final akyf b() {
        return new akyf(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akyg) {
            akyg akygVar = (akyg) obj;
            String str = this.a;
            if (str != null ? str.equals(akygVar.a) : akygVar.a == null) {
                Uri uri = this.b;
                if (uri != null ? uri.equals(akygVar.b) : akygVar.b == null) {
                    Uri uri2 = this.c;
                    if (uri2 != null ? uri2.equals(akygVar.c) : akygVar.c == null) {
                        int i = this.p;
                        if (i != 0 ? i == akygVar.p : akygVar.p == 0) {
                            alda aldaVar = this.d;
                            if (aldaVar != null ? aldaVar.equals(akygVar.d) : akygVar.d == null) {
                                avuk avukVar = this.e;
                                if (avukVar != null ? avukVar.equals(akygVar.e) : akygVar.e == null) {
                                    arxl arxlVar = this.f;
                                    if (arxlVar != null ? arxlVar.equals(akygVar.f) : akygVar.f == null) {
                                        String str2 = this.g;
                                        if (str2 != null ? str2.equals(akygVar.g) : akygVar.g == null) {
                                            Bitmap bitmap = this.h;
                                            if (bitmap != null ? bitmap.equals(akygVar.h) : akygVar.h == null) {
                                                awbb awbbVar = this.i;
                                                if (awbbVar != null ? awbbVar.equals(akygVar.i) : akygVar.i == null) {
                                                    alcx alcxVar = this.j;
                                                    if (alcxVar != null ? alcxVar.equals(akygVar.j) : akygVar.j == null) {
                                                        alcp alcpVar = this.k;
                                                        if (alcpVar != null ? alcpVar.equals(akygVar.k) : akygVar.k == null) {
                                                            amuk amukVar = this.l;
                                                            if (amukVar != null ? amxp.v(amukVar, akygVar.l) : akygVar.l == null) {
                                                                if (this.m == akygVar.m && this.n == akygVar.n && this.o == akygVar.o) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Uri uri = this.b;
        int hashCode2 = (hashCode ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.c;
        int hashCode3 = (hashCode2 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        int i2 = this.p;
        if (i2 == 0) {
            i2 = 0;
        } else {
            awwc.am(i2);
        }
        int i3 = (hashCode3 ^ i2) * 1000003;
        alda aldaVar = this.d;
        int hashCode4 = (i3 ^ (aldaVar == null ? 0 : aldaVar.hashCode())) * 1000003;
        avuk avukVar = this.e;
        int hashCode5 = (hashCode4 ^ (avukVar == null ? 0 : avukVar.hashCode())) * 1000003;
        arxl arxlVar = this.f;
        int hashCode6 = (hashCode5 ^ (arxlVar == null ? 0 : arxlVar.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode7 = (hashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Bitmap bitmap = this.h;
        int hashCode8 = (hashCode7 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        awbb awbbVar = this.i;
        int hashCode9 = (hashCode8 ^ (awbbVar == null ? 0 : awbbVar.hashCode())) * 1000003;
        alcx alcxVar = this.j;
        int hashCode10 = (hashCode9 ^ (alcxVar == null ? 0 : alcxVar.hashCode())) * 1000003;
        alcp alcpVar = this.k;
        int hashCode11 = (hashCode10 ^ (alcpVar == null ? 0 : alcpVar.hashCode())) * 1000003;
        amuk amukVar = this.l;
        if (amukVar != null) {
            i = amukVar.hashCode();
        }
        int i4 = 1237;
        int i5 = (((((hashCode11 ^ i) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003;
        if (true == this.o) {
            i4 = 1231;
        }
        return i5 ^ i4;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.p;
        String al = i != 0 ? awwc.al(i) : "null";
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String str2 = this.g;
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        boolean z = this.m;
        boolean z2 = this.n;
        boolean z3 = this.o;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(al).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(str2).length();
        int length9 = String.valueOf(valueOf6).length();
        int length10 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 327 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("Upload{frontendUploadId=");
        sb.append(str);
        sb.append(", sourceUri=");
        sb.append(valueOf);
        sb.append(", uploadUri=");
        sb.append(valueOf2);
        sb.append(", uploadFlowFlavor=");
        sb.append(al);
        sb.append(", uploadMetadataProto=");
        sb.append(valueOf3);
        sb.append(", uploadFlowSource=");
        sb.append(valueOf4);
        sb.append(", metadataUpdateRequest=");
        sb.append(valueOf5);
        sb.append(", filename=");
        sb.append(str2);
        sb.append(", videoFileThumbnail=");
        sb.append(valueOf6);
        sb.append(", videoShortsCreation=");
        sb.append(valueOf7);
        sb.append(", mediaStorageInfo=");
        sb.append(valueOf8);
        sb.append(", mediaStoreVideoMetadata=");
        sb.append(valueOf9);
        sb.append(", filesToDeleteAfterUpload=");
        sb.append(valueOf10);
        sb.append(", confirmed=");
        sb.append(z);
        sb.append(", creationFailed=");
        sb.append(z2);
        sb.append(", unconfirmedFlowFailed=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}

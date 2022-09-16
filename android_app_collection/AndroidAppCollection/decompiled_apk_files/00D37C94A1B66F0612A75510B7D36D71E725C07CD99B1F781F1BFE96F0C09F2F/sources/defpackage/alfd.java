package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: alfd  reason: default package */
/* loaded from: classes.dex */
public final class alfd {
    public final Uri a;
    public final String b;
    public final avuk c;
    public final boolean d;
    public final Uri e;
    public final alda f;
    public final arxl g;
    public final algb h;
    public final Bitmap i;
    public final awbb j;
    public final alcx k;
    public final amuk l;
    public final int m;
    private final String n;
    private final String o;
    private final alcp p;

    public alfd() {
    }

    public alfd(Uri uri, String str, avuk avukVar, int i, boolean z, Uri uri2, alda aldaVar, arxl arxlVar, algb algbVar, String str2, Bitmap bitmap, String str3, awbb awbbVar, alcx alcxVar, alcp alcpVar, amuk amukVar) {
        this.a = uri;
        this.b = str;
        this.c = avukVar;
        this.m = i;
        this.d = z;
        this.e = uri2;
        this.f = aldaVar;
        this.g = arxlVar;
        this.h = algbVar;
        this.n = str2;
        this.i = bitmap;
        this.o = str3;
        this.j = awbbVar;
        this.k = alcxVar;
        this.p = alcpVar;
        this.l = amukVar;
    }

    public final boolean equals(Object obj) {
        arxl arxlVar;
        algb algbVar;
        String str;
        Bitmap bitmap;
        String str2;
        awbb awbbVar;
        alcx alcxVar;
        alcp alcpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof alfd) {
            alfd alfdVar = (alfd) obj;
            if (this.a.equals(alfdVar.a) && this.b.equals(alfdVar.b) && this.c.equals(alfdVar.c)) {
                int i = this.m;
                int i2 = alfdVar.m;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.d == alfdVar.d && this.e.equals(alfdVar.e) && this.f.equals(alfdVar.f) && ((arxlVar = this.g) != null ? arxlVar.equals(alfdVar.g) : alfdVar.g == null) && ((algbVar = this.h) != null ? algbVar.equals(alfdVar.h) : alfdVar.h == null) && ((str = this.n) != null ? str.equals(alfdVar.n) : alfdVar.n == null) && ((bitmap = this.i) != null ? bitmap.equals(alfdVar.i) : alfdVar.i == null) && ((str2 = this.o) != null ? str2.equals(alfdVar.o) : alfdVar.o == null) && ((awbbVar = this.j) != null ? awbbVar.equals(alfdVar.j) : alfdVar.j == null) && ((alcxVar = this.k) != null ? alcxVar.equals(alfdVar.k) : alfdVar.k == null) && ((alcpVar = this.p) != null ? alcpVar.equals(alfdVar.p) : alfdVar.p == null)) {
                    amuk amukVar = this.l;
                    amuk amukVar2 = alfdVar.l;
                    if (amukVar != null ? amxp.v(amukVar, amukVar2) : amukVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int i = this.m;
        awwc.am(i);
        int hashCode4 = (((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        arxl arxlVar = this.g;
        int i2 = 0;
        int hashCode5 = (hashCode4 ^ (arxlVar == null ? 0 : arxlVar.hashCode())) * 1000003;
        algb algbVar = this.h;
        int hashCode6 = (hashCode5 ^ (algbVar == null ? 0 : algbVar.hashCode())) * 1000003;
        String str = this.n;
        int hashCode7 = (hashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Bitmap bitmap = this.i;
        int hashCode8 = (hashCode7 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        String str2 = this.o;
        int hashCode9 = (hashCode8 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        awbb awbbVar = this.j;
        int hashCode10 = (hashCode9 ^ (awbbVar == null ? 0 : awbbVar.hashCode())) * 1000003;
        alcx alcxVar = this.k;
        int hashCode11 = (hashCode10 ^ (alcxVar == null ? 0 : alcxVar.hashCode())) * 1000003;
        alcp alcpVar = this.p;
        int hashCode12 = (hashCode11 ^ (alcpVar == null ? 0 : alcpVar.hashCode())) * 1000003;
        amuk amukVar = this.l;
        if (amukVar != null) {
            i2 = amukVar.hashCode();
        }
        return hashCode12 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.m;
        String al = i != 0 ? awwc.al(i) : "null";
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String str2 = this.n;
        String valueOf7 = String.valueOf(this.i);
        String str3 = this.o;
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.p);
        String valueOf11 = String.valueOf(this.l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(al).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(str2).length();
        int length10 = String.valueOf(valueOf7).length();
        int length11 = String.valueOf(str3).length();
        int length12 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 333 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("PendingUpload{sourceUri=");
        sb.append(valueOf);
        sb.append(", frontendUploadId=");
        sb.append(str);
        sb.append(", uploadFlowSource=");
        sb.append(valueOf2);
        sb.append(", uploadFlowFlavor=");
        sb.append(al);
        sb.append(", isShortsEligible=");
        sb.append(z);
        sb.append(", uploadUri=");
        sb.append(valueOf3);
        sb.append(", uploadMetadataProto=");
        sb.append(valueOf4);
        sb.append(", metadataUpdateRequest=");
        sb.append(valueOf5);
        sb.append(", uploadComponent=");
        sb.append(valueOf6);
        sb.append(", filename=");
        sb.append(str2);
        sb.append(", videoFileThumbnail=");
        sb.append(valueOf7);
        sb.append(", videoFileThumbnailPath=");
        sb.append(str3);
        sb.append(", videoShortsCreation=");
        sb.append(valueOf8);
        sb.append(", mediaStorageInfo=");
        sb.append(valueOf9);
        sb.append(", mediaStoreVideoMetadata=");
        sb.append(valueOf10);
        sb.append(", filesToDeleteAfterUpload=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }
}

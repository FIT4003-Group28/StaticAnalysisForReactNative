package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dhhr  reason: default package */
/* loaded from: classes6.dex */
public final class dhhr extends dhic {
    public final Uri a;
    public final Bitmap b;
    public final String c;
    public final Location d;
    public final String e;
    public final byte[] f = null;
    public final Long g;
    public final Boolean h;
    public final csfh i;
    public final Integer j;
    public final Integer k;
    public final String l;

    public dhhr(Uri uri, Bitmap bitmap, String str, Location location, String str2, Long l, Boolean bool, csfh csfhVar, Integer num, Integer num2, String str3) {
        this.a = uri;
        this.b = bitmap;
        this.c = str;
        this.d = location;
        this.e = str2;
        this.g = l;
        this.h = bool;
        this.i = csfhVar;
        this.j = num;
        this.k = num2;
        this.l = str3;
    }

    @Override // defpackage.dhic
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.dhic
    public final Bitmap b() {
        return this.b;
    }

    @Override // defpackage.dhic
    public final Rect c() {
        return null;
    }

    @Override // defpackage.dhic
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dhic
    public final Rect e() {
        return null;
    }

    public final boolean equals(Object obj) {
        String str;
        Location location;
        String str2;
        byte[] h;
        Long l;
        Boolean bool;
        csfh csfhVar;
        Integer num;
        Integer num2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dhic) {
            dhic dhicVar = (dhic) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(dhicVar.a()) : dhicVar.a() == null) {
                Bitmap bitmap = this.b;
                if (bitmap != null ? bitmap.equals(dhicVar.b()) : dhicVar.b() == null) {
                    if (dhicVar.c() == null && ((str = this.c) != null ? str.equals(dhicVar.d()) : dhicVar.d() == null) && dhicVar.e() == null && ((location = this.d) != null ? location.equals(dhicVar.f()) : dhicVar.f() == null) && ((str2 = this.e) != null ? str2.equals(dhicVar.g()) : dhicVar.g() == null)) {
                        if (dhicVar instanceof dhhr) {
                            byte[] bArr = ((dhhr) dhicVar).f;
                            h = null;
                        } else {
                            h = dhicVar.h();
                        }
                        if (Arrays.equals((byte[]) null, h) && ((l = this.g) != null ? l.equals(dhicVar.i()) : dhicVar.i() == null) && dhicVar.j() == null && dhicVar.k() == null && ((bool = this.h) != null ? bool.equals(dhicVar.l()) : dhicVar.l() == null) && ((csfhVar = this.i) != null ? csfhVar.equals(dhicVar.m()) : dhicVar.m() == null) && ((num = this.j) != null ? num.equals(dhicVar.n()) : dhicVar.n() == null) && ((num2 = this.k) != null ? num2.equals(dhicVar.o()) : dhicVar.o() == null) && dhicVar.p() == null && dhicVar.q() == null && ((str3 = this.l) != null ? str3.equals(dhicVar.r()) : dhicVar.r() == null) && dhicVar.s() == null && dhicVar.t() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dhic
    public final Location f() {
        return this.d;
    }

    @Override // defpackage.dhic
    public final String g() {
        return this.e;
    }

    @Override // defpackage.dhic
    public final byte[] h() {
        return null;
    }

    public final int hashCode() {
        int i;
        Uri uri = this.a;
        int i2 = 0;
        int hashCode = ((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003;
        Bitmap bitmap = this.b;
        int hashCode2 = (hashCode ^ (bitmap == null ? 0 : bitmap.hashCode())) * (-721379959);
        String str = this.c;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        Location location = this.d;
        int hashCode4 = (hashCode3 ^ (location == null ? 0 : location.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode5 = (((hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ Arrays.hashCode((byte[]) null)) * 1000003;
        Long l = this.g;
        int hashCode6 = (hashCode5 ^ (l == null ? 0 : l.hashCode())) * 583896283;
        Boolean bool = this.h;
        int hashCode7 = (hashCode6 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        csfh csfhVar = this.i;
        if (csfhVar == null) {
            i = 0;
        } else {
            i = csfhVar.bC;
            if (i == 0) {
                i = dsst.a.b(csfhVar).c(csfhVar);
                csfhVar.bC = i;
            }
        }
        int i3 = (hashCode7 ^ i) * 1000003;
        Integer num = this.j;
        int hashCode8 = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.k;
        int hashCode9 = (hashCode8 ^ (num2 == null ? 0 : num2.hashCode())) * 583896283;
        String str3 = this.l;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return (hashCode9 ^ i2) * (-721379959);
    }

    @Override // defpackage.dhic
    public final Long i() {
        return this.g;
    }

    @Override // defpackage.dhic
    public final Long j() {
        return null;
    }

    @Override // defpackage.dhic
    public final Boolean k() {
        return null;
    }

    @Override // defpackage.dhic
    public final Boolean l() {
        return this.h;
    }

    @Override // defpackage.dhic
    public final csfh m() {
        return this.i;
    }

    @Override // defpackage.dhic
    public final Integer n() {
        return this.j;
    }

    @Override // defpackage.dhic
    public final Integer o() {
        return this.k;
    }

    @Override // defpackage.dhic
    public final PointF p() {
        return null;
    }

    @Override // defpackage.dhic
    public final Integer q() {
        return null;
    }

    @Override // defpackage.dhic
    public final String r() {
        return this.l;
    }

    @Override // defpackage.dhic
    public final Boolean s() {
        return null;
    }

    @Override // defpackage.dhic
    public final Boolean t() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        String valueOf3 = String.valueOf(this.d);
        String str2 = this.e;
        String arrays = Arrays.toString((byte[]) null);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.k);
        String str3 = this.l;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = "null".length();
        int length4 = String.valueOf(str).length();
        int length5 = "null".length();
        int length6 = String.valueOf(valueOf3).length();
        int length7 = String.valueOf(str2).length();
        int length8 = String.valueOf(arrays).length();
        int length9 = String.valueOf(valueOf4).length();
        int length10 = "null".length();
        int length11 = "null".length();
        int length12 = String.valueOf(valueOf5).length();
        int length13 = String.valueOf(valueOf6).length();
        int length14 = String.valueOf(valueOf7).length();
        int length15 = String.valueOf(valueOf8).length();
        int length16 = "null".length();
        int length17 = "null".length();
        int length18 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 379 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + length18 + "null".length() + "null".length());
        sb.append("LensMetadata{bitmapUri=");
        sb.append(valueOf);
        sb.append(", bitmap=");
        sb.append(valueOf2);
        sb.append(", imageLocationOnScreen=");
        sb.append("null");
        sb.append(", account=");
        sb.append(str);
        sb.append(", cropBoundingBox=");
        sb.append("null");
        sb.append(", imageLocation=");
        sb.append(valueOf3);
        sb.append(", imagePlaceId=");
        sb.append(str2);
        sb.append(", imagePayload=");
        sb.append(arrays);
        sb.append(", lensActivityLaunchTimestampNanos=");
        sb.append(valueOf4);
        sb.append(", startStreamingRequestTimestampNanos=");
        sb.append("null");
        sb.append(", hideLensCloseButton=");
        sb.append("null");
        sb.append(", disableArtLookalike=");
        sb.append(valueOf5);
        sb.append(", lensInitParams=");
        sb.append(valueOf6);
        sb.append(", transitionType=");
        sb.append(valueOf7);
        sb.append(", intentType=");
        sb.append(valueOf8);
        sb.append(", tapLocation=");
        sb.append("null");
        sb.append(", lensTheme=");
        sb.append("null");
        sb.append(", fifeUrl=");
        sb.append(str3);
        sb.append(", disableIntentOptimizations=");
        sb.append("null");
        sb.append(", promoAddShortcut=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.dhic
    public final dhib u() {
        return new dhhq(this);
    }
}

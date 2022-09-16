package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
/* compiled from: PG */
/* renamed from: adwj  reason: default package */
/* loaded from: classes.dex */
public final class adwj {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final adwf f;
    public final WatchNextResponseModel g;
    public final aijx h;
    public final aika i;
    public final int j;
    public final adwh k;
    public final String l;

    public adwj() {
    }

    public adwj(int i, String str, String str2, int i2, int i3, adwf adwfVar, WatchNextResponseModel watchNextResponseModel, aijx aijxVar, aika aikaVar, int i4, adwh adwhVar, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = adwfVar;
        this.g = watchNextResponseModel;
        this.h = aijxVar;
        this.i = aikaVar;
        this.j = i4;
        this.k = adwhVar;
        this.l = str3;
    }

    public static adwi a() {
        adwi adwiVar = new adwi();
        adwiVar.e(0);
        adwiVar.g(0);
        adwiVar.c(0);
        adwiVar.b("");
        adwiVar.f(aijx.NEW);
        adwiVar.h(aika.NEW);
        adwiVar.d(2);
        adwiVar.c = adwf.a().a();
        adwg adwgVar = new adwg();
        adwgVar.b(1);
        adwiVar.e = adwgVar.a();
        return adwiVar;
    }

    public final adwi b() {
        return new adwi(this);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        WatchNextResponseModel watchNextResponseModel;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adwj) {
            adwj adwjVar = (adwj) obj;
            if (this.a == adwjVar.a && ((str = this.b) != null ? str.equals(adwjVar.b) : adwjVar.b == null) && ((str2 = this.c) != null ? str2.equals(adwjVar.c) : adwjVar.c == null) && this.d == adwjVar.d && this.e == adwjVar.e && this.f.equals(adwjVar.f) && ((watchNextResponseModel = this.g) != null ? watchNextResponseModel.equals(adwjVar.g) : adwjVar.g == null) && this.h.equals(adwjVar.h) && this.i.equals(adwjVar.i) && this.j == adwjVar.j && this.k.equals(adwjVar.k) && this.l.equals(adwjVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode2 = (((((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003;
        WatchNextResponseModel watchNextResponseModel = this.g;
        if (watchNextResponseModel != null) {
            i2 = watchNextResponseModel.hashCode();
        }
        return ((((((((((hashCode2 ^ i2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        int i4 = this.j;
        String valueOf5 = String.valueOf(this.k);
        String str3 = this.l;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 263 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(str3).length());
        sb.append("MdxWatchState{playbackState=");
        sb.append(i);
        sb.append(", videoTitle=");
        sb.append(str);
        sb.append(", screenName=");
        sb.append(str2);
        sb.append(", totalVideosInQueue=");
        sb.append(i2);
        sb.append(", currentVideoIndexInQueue=");
        sb.append(i3);
        sb.append(", mdxAdState=");
        sb.append(valueOf);
        sb.append(", watchNextResponse=");
        sb.append(valueOf2);
        sb.append(", sequencerStage=");
        sb.append(valueOf3);
        sb.append(", videoStage=");
        sb.append(valueOf4);
        sb.append(", mdxConnectionState=");
        sb.append(i4);
        sb.append(", autonavState=");
        sb.append(valueOf5);
        sb.append(", currentVideoId=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}

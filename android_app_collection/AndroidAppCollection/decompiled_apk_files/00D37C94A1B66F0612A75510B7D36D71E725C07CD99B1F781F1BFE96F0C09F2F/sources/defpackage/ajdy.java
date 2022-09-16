package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ajdy  reason: default package */
/* loaded from: classes.dex */
public final class ajdy {
    public final String a;
    public final byte[] b;
    public final asaa c;
    public final VideoStreamingData d;
    public final arzt e;
    public final aoob f;
    public final atzm g;
    public final boolean h;
    public final String i;

    public ajdy() {
    }

    public ajdy(String str, byte[] bArr, asaa asaaVar, VideoStreamingData videoStreamingData, arzt arztVar, aoob aoobVar, atzm atzmVar, boolean z, String str2) {
        this.a = str;
        this.b = bArr;
        this.c = asaaVar;
        this.d = videoStreamingData;
        this.e = arztVar;
        this.f = aoobVar;
        this.g = atzmVar;
        this.h = z;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        VideoStreamingData videoStreamingData;
        arzt arztVar;
        aoob aoobVar;
        atzm atzmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajdy) {
            ajdy ajdyVar = (ajdy) obj;
            if (this.a.equals(ajdyVar.a)) {
                if (Arrays.equals(this.b, ajdyVar instanceof ajdy ? ajdyVar.b : ajdyVar.b) && this.c.equals(ajdyVar.c) && ((videoStreamingData = this.d) != null ? videoStreamingData.equals(ajdyVar.d) : ajdyVar.d == null) && ((arztVar = this.e) != null ? arztVar.equals(ajdyVar.e) : ajdyVar.e == null) && ((aoobVar = this.f) != null ? aoobVar.equals(ajdyVar.f) : ajdyVar.f == null) && ((atzmVar = this.g) != null ? atzmVar.equals(ajdyVar.g) : ajdyVar.g == null) && this.h == ajdyVar.h) {
                    String str = this.i;
                    String str2 = ajdyVar.i;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003;
        VideoStreamingData videoStreamingData = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (videoStreamingData == null ? 0 : videoStreamingData.hashCode())) * 1000003;
        arzt arztVar = this.e;
        int hashCode3 = (hashCode2 ^ (arztVar == null ? 0 : arztVar.hashCode())) * 1000003;
        aoob aoobVar = this.f;
        int hashCode4 = (hashCode3 ^ (aoobVar == null ? 0 : aoobVar.hashCode())) * 1000003;
        atzm atzmVar = this.g;
        int hashCode5 = (((hashCode4 ^ (atzmVar == null ? 0 : atzmVar.hashCode())) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 ^ i;
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.b);
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        boolean z = this.h;
        String str2 = this.i;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 212 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(str2).length());
        sb.append("PlayerResponseHeartbeatInfo{currentVideoId=");
        sb.append(str);
        sb.append(", trackingParams=");
        sb.append(arrays);
        sb.append(", initialPlayabilityStatus=");
        sb.append(valueOf);
        sb.append(", videoStreamingData=");
        sb.append(valueOf2);
        sb.append(", heartbeatParams=");
        sb.append(valueOf3);
        sb.append(", heartbeatServerData=");
        sb.append(valueOf4);
        sb.append(", playerAttestation=");
        sb.append(valueOf5);
        sb.append(", enablePremiereTrailerCodepath=");
        sb.append(z);
        sb.append(", cpn=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

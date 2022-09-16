package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: adnl  reason: default package */
/* loaded from: classes.dex */
public final class adnl {
    public static final adnl a = c().a();
    public final String b;
    public final long c;
    public final SubtitleTrack d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final boolean i;
    public final byte[] j;

    public adnl() {
    }

    public adnl(String str, long j, SubtitleTrack subtitleTrack, String str2, int i, String str3, String str4, boolean z, byte[] bArr) {
        this.b = str;
        this.c = j;
        this.d = subtitleTrack;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = str4;
        this.i = z;
        this.j = bArr;
    }

    public static int a(int i) {
        return i >= 0 ? i + 1 : a.f;
    }

    public static int b(int i) {
        return i > 0 ? i - 1 : a.f;
    }

    public static adnk c() {
        adnk adnkVar = new adnk();
        adnkVar.c(false);
        adnkVar.b(0L);
        adnkVar.e(-1);
        return adnkVar;
    }

    public static adnl d(atdp atdpVar) {
        adnk c = c();
        c.f(atdpVar.d);
        c.d(atdpVar.f);
        c.e(atdpVar.g);
        c.b(atdpVar.e);
        c.c = atdpVar.h;
        c.c(atdpVar.i);
        return c.a();
    }

    public final boolean e() {
        return !this.e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adnl) {
            adnl adnlVar = (adnl) obj;
            if (i(adnlVar.b) && h(adnlVar.e) && this.f == adnlVar.f && this.i == adnlVar.i && akzj.f(this.g, adnlVar.g) && akzj.f(this.h, adnlVar.h) && Arrays.equals(this.j, adnlVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final boolean g() {
        return f() || e();
    }

    public final boolean h(String str) {
        return adwa.b(this.e, str);
    }

    public final int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.b;
        objArr[1] = adwa.a(this.e) ? "RQ" : this.e;
        objArr[2] = Integer.valueOf(this.f);
        objArr[3] = this.g;
        objArr[4] = this.h;
        objArr[5] = Boolean.valueOf(this.i);
        objArr[6] = Integer.valueOf(Arrays.hashCode(this.j));
        return Arrays.hashCode(objArr);
    }

    public final boolean i(String str) {
        return this.b.equals(str);
    }

    public final adnk j() {
        return new adnk(this);
    }

    public final String toString() {
        String str = this.b;
        long j = this.c;
        String valueOf = String.valueOf(this.d);
        String str2 = this.e;
        int i = this.f;
        String str3 = this.g;
        String str4 = this.h;
        boolean z = this.i;
        String arrays = Arrays.toString(this.j);
        int length = String.valueOf(str).length();
        int length2 = "null".length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 239 + length2 + length3 + length4 + length5 + length6 + String.valueOf(arrays).length() + "null".length());
        sb.append("MdxPlaybackDescriptor{videoId=");
        sb.append(str);
        sb.append(", videoIds=");
        sb.append("null");
        sb.append(", currentPositionMillis=");
        sb.append(j);
        sb.append(", subtitleTrack=");
        sb.append(valueOf);
        sb.append(", playlistId=");
        sb.append(str2);
        sb.append(", playlistIndex=");
        sb.append(i);
        sb.append(", watchParams=");
        sb.append(str3);
        sb.append(", playerParams=");
        sb.append(str4);
        sb.append(", forceReloadPlayback=");
        sb.append(z);
        sb.append(", clickTrackingParams=");
        sb.append(arrays);
        sb.append(", mdxClientAppInfo=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}

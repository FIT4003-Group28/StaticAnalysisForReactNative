package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: jbe  reason: default package */
/* loaded from: classes3.dex */
public final class jbe {
    public final String a;
    public final String b;
    public final String c;
    public final Optional d;
    public final amuk e;
    public final int f;
    public final Optional g;

    public jbe() {
    }

    public jbe(String str, String str2, String str3, Optional optional, amuk amukVar, int i, Optional optional2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = optional;
        this.e = amukVar;
        this.f = i;
        this.g = optional2;
    }

    public static jbe a(Context context, boolean z, amuk amukVar) {
        String str;
        String str2;
        amuk amukVar2;
        Integer num;
        amuk amukVar3 = (amuk) Collection.EL.stream(amukVar).map(ioc.l).filter(gka.j).map(ioc.m).collect(amsf.a);
        jbd jbdVar = new jbd(null);
        jbdVar.b("");
        jbdVar.a("");
        jbdVar.d(amuk.q());
        jbdVar.c(0);
        jbdVar.a = "PPSV";
        jbdVar.b(context.getString(R.string.single_videos_playlist_title));
        jbdVar.d(amukVar3);
        jbdVar.c(amukVar3.size());
        if (z) {
            jbdVar.a(context.getString(R.string.single_videos_playlist_subtitle));
            aopc aopcVar = (aopc) arhs.a.createBuilder();
            arhr arhrVar = arhr.OFFLINE_PIN;
            aopcVar.copyOnWrite();
            arhs arhsVar = (arhs) aopcVar.instance;
            arhsVar.c = arhrVar.pS;
            arhsVar.b |= 1;
            jbdVar.d = Optional.of((arhs) aopcVar.mo39build());
        }
        String str3 = jbdVar.a;
        if (str3 == null || (str = jbdVar.b) == null || (str2 = jbdVar.c) == null || (amukVar2 = jbdVar.e) == null || (num = jbdVar.f) == null) {
            StringBuilder sb = new StringBuilder();
            if (jbdVar.a == null) {
                sb.append(" id");
            }
            if (jbdVar.b == null) {
                sb.append(" title");
            }
            if (jbdVar.c == null) {
                sb.append(" subtitle");
            }
            if (jbdVar.e == null) {
                sb.append(" videos");
            }
            if (jbdVar.f == null) {
                sb.append(" totalVideoCount");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new jbe(str3, str, str2, jbdVar.d, amukVar2, num.intValue(), jbdVar.g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbe) {
            jbe jbeVar = (jbe) obj;
            if (this.a.equals(jbeVar.a) && this.b.equals(jbeVar.b) && this.c.equals(jbeVar.c) && this.d.equals(jbeVar.d) && amxp.v(this.e, jbeVar.e) && this.f == jbeVar.f && this.g.equals(jbeVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        String valueOf3 = String.valueOf(this.g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 107 + length2 + length3 + length4 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("MainDownloadedVideoList{id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subtitle=");
        sb.append(str3);
        sb.append(", icon=");
        sb.append(valueOf);
        sb.append(", videos=");
        sb.append(valueOf2);
        sb.append(", totalVideoCount=");
        sb.append(i);
        sb.append(", alertMessage=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

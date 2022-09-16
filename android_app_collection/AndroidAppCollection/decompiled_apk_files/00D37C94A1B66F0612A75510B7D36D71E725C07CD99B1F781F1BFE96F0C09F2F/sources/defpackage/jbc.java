package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: jbc  reason: default package */
/* loaded from: classes3.dex */
public final class jbc {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final avhn e;
    public final avhn f;
    public final arag g;
    public final Long h;
    public final Long i;
    public final String j;
    public final String k;

    public jbc() {
    }

    public jbc(String str, String str2, Integer num, String str3, avhn avhnVar, avhn avhnVar2, arag aragVar, Long l, Long l2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = str3;
        this.e = avhnVar;
        this.f = avhnVar2;
        this.g = aragVar;
        this.h = l;
        this.i = l2;
        this.j = str4;
        this.k = str5;
    }

    public static Optional a(aajj aajjVar) {
        if (aajjVar instanceof awjr) {
            awkx g = ((awjr) aajjVar).g();
            if (g != null) {
                jbb b = b();
                b.f(g.getVideoId());
                b.k(g.getTitle());
                b.g(g.getLengthSeconds().intValue());
                b.j(g.getThumbnail());
                b.l(g.getViewCount().longValue());
                b.i(g.getPublishedTimestampMillis().longValue());
                b.d(g.getFormattedDescription());
                awku localizedStrings = g.getLocalizedStrings();
                if ((localizedStrings.b & 2) != 0) {
                    b.h(localizedStrings.d);
                }
                if ((localizedStrings.b & 4) != 0) {
                    b.e(localizedStrings.e);
                }
                awji b2 = g.b();
                if (b2 != null) {
                    b.c(b2.getTitle());
                    b.b(b2.getAvatar());
                }
                return Optional.of(b.a());
            }
        } else if (aajjVar instanceof asze) {
            asze aszeVar = (asze) aajjVar;
            jbb b3 = b();
            b3.f(aszeVar.getVideoId());
            b3.k(aszeVar.getTitle());
            b3.g(aszeVar.getLengthSeconds().intValue());
            b3.j(aszeVar.getThumbnail());
            b3.l(aszeVar.getViewCount().longValue());
            b3.i(aszeVar.getPublishedTimestampMillis().longValue());
            b3.d(aszeVar.getFormattedDescription());
            awku localizedStrings2 = aszeVar.getLocalizedStrings();
            if ((localizedStrings2.b & 2) != 0) {
                b3.h(localizedStrings2.d);
            }
            if ((localizedStrings2.b & 4) != 0) {
                b3.e(localizedStrings2.e);
            }
            awji f = aszeVar.f();
            if (f != null) {
                b3.c(f.getTitle());
                b3.b(f.getAvatar());
            }
            return Optional.of(b3.a());
        }
        return Optional.empty();
    }

    private static jbb b() {
        jbb jbbVar = new jbb();
        jbbVar.h("");
        jbbVar.e("");
        jbbVar.c("");
        jbbVar.b(avhn.a);
        return jbbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jbc) {
            jbc jbcVar = (jbc) obj;
            if (this.a.equals(jbcVar.a) && this.b.equals(jbcVar.b) && this.c.equals(jbcVar.c) && this.d.equals(jbcVar.d) && this.e.equals(jbcVar.e) && this.f.equals(jbcVar.f) && this.g.equals(jbcVar.g) && this.h.equals(jbcVar.h) && this.i.equals(jbcVar.i) && this.j.equals(jbcVar.j) && this.k.equals(jbcVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String str3 = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.i);
        String str4 = this.j;
        String str5 = this.k;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str3).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(valueOf3).length();
        int length7 = String.valueOf(valueOf4).length();
        int length8 = String.valueOf(valueOf5).length();
        int length9 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 192 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("MainDownloadedVideo{id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", lengthSeconds=");
        sb.append(valueOf);
        sb.append(", channelTitle=");
        sb.append(str3);
        sb.append(", channelThumbnailDetails=");
        sb.append(valueOf2);
        sb.append(", thumbnailDetails=");
        sb.append(valueOf3);
        sb.append(", description=");
        sb.append(valueOf4);
        sb.append(", publishedTimestampMs=");
        sb.append(valueOf5);
        sb.append(", viewCount=");
        sb.append(valueOf6);
        sb.append(", likeCountText=");
        sb.append(str4);
        sb.append(", dislikeCountText=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}

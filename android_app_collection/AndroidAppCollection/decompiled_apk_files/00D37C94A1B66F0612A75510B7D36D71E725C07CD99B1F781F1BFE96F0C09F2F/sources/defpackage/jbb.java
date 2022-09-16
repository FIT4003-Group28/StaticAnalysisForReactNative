package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jbb  reason: default package */
/* loaded from: classes3.dex */
public final class jbb {
    private String a;
    private String b;
    private Integer c;
    private String d;
    private avhn e;
    private avhn f;
    private arag g;
    private Long h;
    private Long i;
    private String j;
    private String k;

    public final void b(avhn avhnVar) {
        if (avhnVar != null) {
            this.e = avhnVar;
            return;
        }
        throw new NullPointerException("Null channelThumbnailDetails");
    }

    public final void c(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null channelTitle");
    }

    public final void d(arag aragVar) {
        if (aragVar != null) {
            this.g = aragVar;
            return;
        }
        throw new NullPointerException("Null description");
    }

    public final void e(String str) {
        if (str != null) {
            this.k = str;
            return;
        }
        throw new NullPointerException("Null dislikeCountText");
    }

    public final void f(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    public final void g(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void h(String str) {
        if (str != null) {
            this.j = str;
            return;
        }
        throw new NullPointerException("Null likeCountText");
    }

    public final void i(long j) {
        this.h = Long.valueOf(j);
    }

    public final void j(avhn avhnVar) {
        if (avhnVar != null) {
            this.f = avhnVar;
            return;
        }
        throw new NullPointerException("Null thumbnailDetails");
    }

    public final void k(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    public final void l(long j) {
        this.i = Long.valueOf(j);
    }

    public final jbc a() {
        String str;
        Integer num;
        String str2;
        avhn avhnVar;
        avhn avhnVar2;
        arag aragVar;
        Long l;
        Long l2;
        String str3;
        String str4;
        String str5 = this.a;
        if (str5 == null || (str = this.b) == null || (num = this.c) == null || (str2 = this.d) == null || (avhnVar = this.e) == null || (avhnVar2 = this.f) == null || (aragVar = this.g) == null || (l = this.h) == null || (l2 = this.i) == null || (str3 = this.j) == null || (str4 = this.k) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" id");
            }
            if (this.b == null) {
                sb.append(" title");
            }
            if (this.c == null) {
                sb.append(" lengthSeconds");
            }
            if (this.d == null) {
                sb.append(" channelTitle");
            }
            if (this.e == null) {
                sb.append(" channelThumbnailDetails");
            }
            if (this.f == null) {
                sb.append(" thumbnailDetails");
            }
            if (this.g == null) {
                sb.append(" description");
            }
            if (this.h == null) {
                sb.append(" publishedTimestampMs");
            }
            if (this.i == null) {
                sb.append(" viewCount");
            }
            if (this.j == null) {
                sb.append(" likeCountText");
            }
            if (this.k == null) {
                sb.append(" dislikeCountText");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new jbc(str5, str, num, str2, avhnVar, avhnVar2, aragVar, l, l2, str3, str4);
    }
}

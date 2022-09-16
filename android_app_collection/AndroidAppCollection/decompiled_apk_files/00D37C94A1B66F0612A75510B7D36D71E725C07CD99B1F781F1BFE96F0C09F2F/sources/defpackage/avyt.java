package defpackage;
/* compiled from: PG */
/* renamed from: avyt  reason: default package */
/* loaded from: classes2.dex */
public final class avyt implements aajq {
    public static final aajr a = new avys();
    private final aajl b;
    private final avyu c;

    public avyt(avyu avyuVar, aajl aajlVar) {
        this.c = avyuVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        avyu avyuVar = this.c;
        if ((avyuVar.b & 4) != 0) {
            amvlVar.c(avyuVar.e);
        }
        amvlVar.j(getThumbnailDetailsModel().a());
        return amvlVar.g();
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new avyr(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avyt) && this.c.equals(((avyt) obj).c);
    }

    public Integer getPercentDurationWatched() {
        return Integer.valueOf(this.c.k);
    }

    public avhn getThumbnailDetails() {
        avhn avhnVar = this.c.j;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getThumbnailDetailsModel() {
        avhn avhnVar = this.c.j;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.b);
    }

    public Long getTimePublished() {
        return Long.valueOf(this.c.h);
    }

    public String getTitle() {
        return this.c.f;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public String getVideoId() {
        return this.c.d;
    }

    public Integer getVideoLength() {
        return Integer.valueOf(this.c.i);
    }

    public Long getViewCount() {
        return Long.valueOf(this.c.g);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("VideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

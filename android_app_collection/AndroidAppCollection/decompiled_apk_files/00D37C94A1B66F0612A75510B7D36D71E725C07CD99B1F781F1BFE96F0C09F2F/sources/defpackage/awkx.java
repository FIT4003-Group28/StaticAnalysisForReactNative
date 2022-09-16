package defpackage;
/* compiled from: PG */
/* renamed from: awkx  reason: default package */
/* loaded from: classes2.dex */
public final class awkx implements aajq {
    public static final aajr a = new awkw();
    public final aajl b;
    public final awky c;

    public awkx(awky awkyVar, aajl aajlVar) {
        this.c = awkyVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        awky awkyVar = this.c;
        if ((awkyVar.c & 8) != 0) {
            amvlVar.c(awkyVar.f);
        }
        awky awkyVar2 = this.c;
        if ((awkyVar2.c & 8192) != 0) {
            amvlVar.c(awkyVar2.p);
        }
        awky awkyVar3 = this.c;
        if ((awkyVar3.c & 32768) != 0) {
            amvlVar.c(awkyVar3.r);
        }
        amvlVar.j(getThumbnailModel().a());
        amvlVar.j(getDescriptionModel().a());
        amvlVar.j(getFormattedDescriptionModel().a());
        getLocalizedStringsModel();
        amvlVar.j(awkt.b());
        return amvlVar.g();
    }

    public final awji b() {
        aajj b = this.b.b(this.c.f);
        boolean z = true;
        if (b != null && !(b instanceof awji)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of YtMainChannelEntityModel, key=channelOwner");
        return (awji) b;
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new awkv(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awkx) && this.c.equals(((awkx) obj).c);
    }

    public final String f() {
        return this.c.f;
    }

    public final boolean g() {
        return (this.c.c & 128) != 0;
    }

    public awma getDescription() {
        awma awmaVar = this.c.k;
        return awmaVar == null ? awma.a : awmaVar;
    }

    public awlt getDescriptionModel() {
        awma awmaVar = this.c.k;
        if (awmaVar == null) {
            awmaVar = awma.a;
        }
        return awlt.b(awmaVar).a(this.b);
    }

    public Long getDislikeCount() {
        return Long.valueOf(this.c.o);
    }

    public arag getFormattedDescription() {
        arag aragVar = this.c.l;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getFormattedDescriptionModel() {
        arag aragVar = this.c.l;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.b);
    }

    public Integer getLengthSeconds() {
        return Integer.valueOf(this.c.i);
    }

    public Long getLikeCount() {
        return Long.valueOf(this.c.n);
    }

    public awku getLocalizedStrings() {
        awku awkuVar = this.c.q;
        return awkuVar == null ? awku.a : awkuVar;
    }

    public awkt getLocalizedStringsModel() {
        awku awkuVar = this.c.q;
        if (awkuVar == null) {
            awkuVar = awku.a;
        }
        return awkt.a(awkuVar).a();
    }

    public Long getPublishedTimestampMillis() {
        return Long.valueOf(this.c.h);
    }

    public avhn getThumbnail() {
        avhn avhnVar = this.c.j;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getThumbnailModel() {
        avhn avhnVar = this.c.j;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.b);
    }

    public String getTitle() {
        return this.c.g;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public String getVideoId() {
        return this.c.e;
    }

    public Long getViewCount() {
        return Long.valueOf(this.c.m);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("YtMainVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

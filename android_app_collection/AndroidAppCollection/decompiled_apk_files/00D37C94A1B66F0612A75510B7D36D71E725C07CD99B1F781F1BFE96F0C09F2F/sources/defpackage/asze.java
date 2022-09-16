package defpackage;
/* compiled from: PG */
/* renamed from: asze  reason: default package */
/* loaded from: classes2.dex */
public final class asze implements aajq {
    public static final aajr a = new aszd();
    public final aszf b;
    private final aajl c;

    public asze(aszf aszfVar, aajl aajlVar) {
        this.b = aszfVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        aszf aszfVar = this.b;
        if ((aszfVar.c & 8) != 0) {
            amvlVar.c(aszfVar.f);
        }
        aszf aszfVar2 = this.b;
        if ((aszfVar2.c & 16384) != 0) {
            amvlVar.c(aszfVar2.q);
        }
        amvlVar.j(getThumbnailModel().a());
        amvlVar.j(getFormattedDescriptionModel().a());
        getLocalizedStringsModel();
        amvlVar.j(awkt.b());
        aszg userStateModel = getUserStateModel();
        amvl amvlVar2 = new amvl();
        aszh aszhVar = userStateModel.a;
        if ((aszhVar.b & 1) != 0) {
            amvlVar2.c(aszhVar.c);
        }
        amvlVar.j(amvlVar2.g());
        return amvlVar.g();
    }

    public final asza b() {
        aajj b = this.c.b(this.b.q);
        boolean z = true;
        if (b != null && !(b instanceof asza)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of MainVideoDownloadStateEntityModel, key=downloadState");
        return (asza) b;
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.b.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aszc(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asze) && this.b.equals(((asze) obj).b);
    }

    public final awji f() {
        aajj b = this.c.b(this.b.f);
        boolean z = true;
        if (b != null && !(b instanceof awji)) {
            z = false;
        }
        aqxo.z(z, "entityFromStore is not instance of YtMainChannelEntityModel, key=owner");
        return (awji) b;
    }

    public Long getDislikeCount() {
        return Long.valueOf(this.b.n);
    }

    public arag getFormattedDescription() {
        arag aragVar = this.b.k;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getFormattedDescriptionModel() {
        arag aragVar = this.b.k;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.c);
    }

    public Integer getLengthSeconds() {
        return Integer.valueOf(this.b.i);
    }

    public Long getLikeCount() {
        return Long.valueOf(this.b.m);
    }

    public awku getLocalizedStrings() {
        awku awkuVar = this.b.o;
        return awkuVar == null ? awku.a : awkuVar;
    }

    public awkt getLocalizedStringsModel() {
        awku awkuVar = this.b.o;
        if (awkuVar == null) {
            awkuVar = awku.a;
        }
        return awkt.a(awkuVar).a();
    }

    public Long getPublishedTimestampMillis() {
        return Long.valueOf(this.b.h);
    }

    public avhn getThumbnail() {
        avhn avhnVar = this.b.j;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public avhr getThumbnailModel() {
        avhn avhnVar = this.b.j;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        return avhr.b(avhnVar).a(this.c);
    }

    public String getTitle() {
        return this.b.g;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public aszh getUserState() {
        aszh aszhVar = this.b.p;
        return aszhVar == null ? aszh.a : aszhVar;
    }

    public aszg getUserStateModel() {
        aszh aszhVar = this.b.p;
        if (aszhVar == null) {
            aszhVar = aszh.a;
        }
        return new aszg((aszh) aszhVar.mo52toBuilder().mo39build());
    }

    public String getVideoId() {
        return this.b.e;
    }

    public Long getViewCount() {
        return Long.valueOf(this.b.l);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("MainVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

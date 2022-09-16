package defpackage;
/* compiled from: PG */
/* renamed from: aqqm  reason: default package */
/* loaded from: classes2.dex */
public final class aqqm implements aajq {
    public static final aajr a = new aqql();
    private final aqqn b;

    public aqqm(aqqn aqqnVar) {
        this.b = aqqnVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        getSmartDownloadsOptInBannerVisibilityModel();
        amvlVar.j(new amvl().g());
        return amvlVar.g();
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
        return new aqqk(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqqm) && this.b.equals(((aqqm) obj).b);
    }

    public aqpe getSmartDownloadsOptInBannerVisibility() {
        aqpe aqpeVar = this.b.e;
        return aqpeVar == null ? aqpe.a : aqpeVar;
    }

    public aqpd getSmartDownloadsOptInBannerVisibilityModel() {
        aqpe aqpeVar = this.b.e;
        if (aqpeVar == null) {
            aqpeVar = aqpe.a;
        }
        return new aqpd((aqpe) ((aopc) aqpeVar.mo52toBuilder()).mo39build());
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
        sb.append("DownloadsPageViewConfigurationEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

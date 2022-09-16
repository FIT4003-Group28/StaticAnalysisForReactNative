package defpackage;
/* compiled from: PG */
/* renamed from: aqoo  reason: default package */
/* loaded from: classes2.dex */
public final class aqoo implements aajq {
    public static final aajr a = new aqon();
    private final aqop b;

    public aqoo(aqop aqopVar) {
        this.b = aqopVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
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
        return new aqom(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqoo) && this.b.equals(((aqoo) obj).b);
    }

    public String getButtonNavigationUrl() {
        return this.b.h;
    }

    public String getButtonText() {
        return this.b.g;
    }

    public Integer getButtonUiType() {
        return Integer.valueOf(this.b.i);
    }

    public String getText() {
        return this.b.e;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public Integer getUiType() {
        return Integer.valueOf(this.b.f);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("DownloadsPageBannerEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

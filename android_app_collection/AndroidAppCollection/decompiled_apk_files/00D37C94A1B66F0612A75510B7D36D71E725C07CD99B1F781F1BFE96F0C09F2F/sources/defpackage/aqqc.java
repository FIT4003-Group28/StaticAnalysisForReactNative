package defpackage;
/* compiled from: PG */
/* renamed from: aqqc  reason: default package */
/* loaded from: classes2.dex */
public final class aqqc implements aajq {
    public static final aajr a = new aqqb();
    private final aqqd b;

    public aqqc(aqqd aqqdVar) {
        this.b = aqqdVar;
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
        return new aqqa(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqqc) && this.b.equals(((aqqc) obj).b);
    }

    public Boolean getShouldPersistDownloadsSectionExpandedState() {
        return Boolean.valueOf(this.b.e);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("DownloadsPageStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

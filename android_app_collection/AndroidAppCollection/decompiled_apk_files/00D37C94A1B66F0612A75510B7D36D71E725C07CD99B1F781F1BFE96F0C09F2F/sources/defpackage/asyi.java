package defpackage;
/* compiled from: PG */
/* renamed from: asyi  reason: default package */
/* loaded from: classes2.dex */
public final class asyi implements aajq {
    public static final aajr a = new asyh();
    private final asyj b;

    public asyi(asyj asyjVar) {
        this.b = asyjVar;
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
        return new asyg(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asyi) && this.b.equals(((asyi) obj).b);
    }

    public asyf getGenerationStatus() {
        asyf b = asyf.b(this.b.e);
        return b == null ? asyf.GENERATION_STATUS_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("MainOfflineGenerationStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: asoz  reason: default package */
/* loaded from: classes2.dex */
public final class asoz implements aajq {
    public static final aajr a = new asoy();
    private final aspa b;

    public asoz(aspa aspaVar) {
        this.b = aspaVar;
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
        return this.b.c;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new asox(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asoz) && this.b.equals(((asoz) obj).b);
    }

    public aspb getLikeStatus() {
        aspb b = aspb.b(this.b.d);
        return b == null ? aspb.LIKE : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("LikeStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

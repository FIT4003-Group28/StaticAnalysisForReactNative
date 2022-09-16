package defpackage;
/* compiled from: PG */
/* renamed from: aowf  reason: default package */
/* loaded from: classes.dex */
public final class aowf implements aajq {
    public static final aajr a = new aowd();
    private final aowg b;

    public aowf(aowg aowgVar) {
        this.b = aowgVar;
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
        return new aowe(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aowf) && this.b.equals(((aowf) obj).b);
    }

    public Boolean getLinked() {
        return Boolean.valueOf(this.b.d);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("AccountLinkStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

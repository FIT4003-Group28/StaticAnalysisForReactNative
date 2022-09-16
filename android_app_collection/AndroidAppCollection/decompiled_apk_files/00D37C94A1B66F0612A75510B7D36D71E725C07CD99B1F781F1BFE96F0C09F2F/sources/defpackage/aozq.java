package defpackage;
/* compiled from: PG */
/* renamed from: aozq  reason: default package */
/* loaded from: classes.dex */
public final class aozq implements aajq {
    public static final aajr a = new aozo();
    private final aozr b;

    public aozq(aozr aozrVar) {
        this.b = aozrVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        return new amvl().g();
    }

    @Override // defpackage.aajj
    /* renamed from: b */
    public final aozp e() {
        return new aozp(this.b.mo52toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof aozq) && this.b.equals(((aozq) obj).b);
    }

    public Boolean getFullscreenForced() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("AdPlayerFullscreenStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

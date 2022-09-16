package defpackage;
/* compiled from: PG */
/* renamed from: aumo  reason: default package */
/* loaded from: classes2.dex */
public final class aumo implements aajq {
    public static final aajr a = new aumn();
    private final aump b;

    public aumo(aump aumpVar) {
        this.b = aumpVar;
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
        return new aumm(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aumo) && this.b.equals(((aumo) obj).b);
    }

    public Long getRefreshTime() {
        return Long.valueOf(this.b.d);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("RefreshEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

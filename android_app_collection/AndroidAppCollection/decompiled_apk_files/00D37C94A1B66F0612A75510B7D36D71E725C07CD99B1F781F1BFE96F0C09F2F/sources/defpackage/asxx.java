package defpackage;
/* compiled from: PG */
/* renamed from: asxx  reason: default package */
/* loaded from: classes2.dex */
public final class asxx implements aajq {
    public static final aajr a = new asxw();
    private final asxy b;

    public asxx(asxy asxyVar) {
        this.b = asxyVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        asxy asxyVar = this.b;
        if ((asxyVar.b & 4) != 0) {
            amvlVar.c(asxyVar.d);
        }
        return amvlVar.g();
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
        return new asxv(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof asxx) && this.b.equals(((asxx) obj).b);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("MainAppVideoMetadataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

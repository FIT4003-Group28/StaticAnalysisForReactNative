package defpackage;
/* compiled from: PG */
/* renamed from: aufm  reason: default package */
/* loaded from: classes2.dex */
public final class aufm implements aajq {
    public static final aajr a = new aufl();
    public final aufn b;

    public aufm(aufn aufnVar) {
        this.b = aufnVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        getPostCreationDataModel();
        amvlVar.j(new amvl().g());
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
        return new aufk(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aufm) && this.b.equals(((aufm) obj).b);
    }

    public aufp getPostCreationData() {
        aufp aufpVar = this.b.d;
        return aufpVar == null ? aufp.a : aufpVar;
    }

    public aufo getPostCreationDataModel() {
        aufp aufpVar = this.b.d;
        if (aufpVar == null) {
            aufpVar = aufp.a;
        }
        return new aufo((aufp) aufpVar.mo52toBuilder().mo39build());
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("PostCreationDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

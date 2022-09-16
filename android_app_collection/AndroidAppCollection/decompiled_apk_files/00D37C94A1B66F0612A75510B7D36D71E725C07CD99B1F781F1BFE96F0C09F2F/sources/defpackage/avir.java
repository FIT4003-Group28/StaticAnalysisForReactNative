package defpackage;
/* compiled from: PG */
/* renamed from: avir  reason: default package */
/* loaded from: classes2.dex */
public final class avir implements aajq {
    public static final aajr a = new aviq();
    private final avis b;

    public avir(avis avisVar) {
        this.b = avisVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        getTimestampModel();
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
        return new avip(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avir) && this.b.equals(((avir) obj).b);
    }

    public String getFormattedTime() {
        return this.b.e;
    }

    public aviu getTimestamp() {
        aviu aviuVar = this.b.d;
        return aviuVar == null ? aviu.a : aviuVar;
    }

    public avit getTimestampModel() {
        aviu aviuVar = this.b.d;
        if (aviuVar == null) {
            aviuVar = aviu.a;
        }
        return new avit((aviu) aviuVar.mo52toBuilder().mo39build());
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("TimestampEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;
/* compiled from: PG */
/* renamed from: aumf  reason: default package */
/* loaded from: classes2.dex */
public final class aumf implements aajq {
    public static final aajr a = new aume();
    private final aajl b;
    private final aumg c;

    public aumf(aumg aumgVar, aajl aajlVar) {
        this.c = aumgVar;
        this.b = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getUpdatedEndpointProtoModel().a());
        return amvlVar.g();
    }

    public final boolean b() {
        return (this.c.c & 2) != 0;
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        return new aumd(this.c.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aumf) && this.c.equals(((aumf) obj).c);
    }

    public final boolean f() {
        return (this.c.c & 4) != 0;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public aoob getUpdatedEndpoint() {
        return this.c.e;
    }

    public apzg getUpdatedEndpointProto() {
        apzg apzgVar = this.c.f;
        return apzgVar == null ? apzg.a : apzgVar;
    }

    public apzf getUpdatedEndpointProtoModel() {
        apzg apzgVar = this.c.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        return apzf.b(apzgVar).a(this.b);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("ReelWatchEndpointDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

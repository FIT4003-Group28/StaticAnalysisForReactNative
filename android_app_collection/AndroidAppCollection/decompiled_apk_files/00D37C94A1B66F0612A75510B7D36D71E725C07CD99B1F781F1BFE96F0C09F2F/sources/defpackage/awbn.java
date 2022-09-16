package defpackage;
/* compiled from: PG */
/* renamed from: awbn  reason: default package */
/* loaded from: classes2.dex */
public final class awbn implements aajq {
    public static final aajr a = new awbm();
    public final awbo b;
    private final aajl c;

    public awbn(awbo awboVar, aajl aajlVar) {
        this.b = awboVar;
        this.c = aajlVar;
    }

    @Override // defpackage.aajj
    public final amvn a() {
        amvl amvlVar = new amvl();
        amvlVar.j(getViewCountModel().a());
        amvlVar.j(getShortViewCountModel().a());
        amvlVar.j(getExtraShortViewCountModel().a());
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
        return new awbl(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof awbn) && this.b.equals(((awbn) obj).b);
    }

    public arag getExtraShortViewCount() {
        arag aragVar = this.b.f;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getExtraShortViewCountModel() {
        arag aragVar = this.b.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.c);
    }

    public arag getShortViewCount() {
        arag aragVar = this.b.e;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getShortViewCountModel() {
        arag aragVar = this.b.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.c);
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aajr mo145getType() {
        return a;
    }

    public String getUnlabeledConcurrentViewers() {
        return this.b.g;
    }

    public arag getViewCount() {
        arag aragVar = this.b.d;
        return aragVar == null ? arag.a : aragVar;
    }

    public arad getViewCountModel() {
        arag aragVar = this.b.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return arad.b(aragVar).a(this.c);
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("ViewCountEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

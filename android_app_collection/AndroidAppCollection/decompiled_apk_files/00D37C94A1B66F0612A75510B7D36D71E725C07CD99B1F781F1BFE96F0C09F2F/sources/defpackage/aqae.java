package defpackage;
/* compiled from: PG */
/* renamed from: aqae  reason: default package */
/* loaded from: classes2.dex */
public final class aqae implements aajq {
    public static final aajr a = new aqad();
    private final aqaf b;

    public aqae(aqaf aqafVar) {
        this.b = aqafVar;
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
        return new aqac(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof aqae) && this.b.equals(((aqae) obj).b);
    }

    public String getLatestTimestampText() {
        return this.b.e;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("CommentComposerTimestampEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

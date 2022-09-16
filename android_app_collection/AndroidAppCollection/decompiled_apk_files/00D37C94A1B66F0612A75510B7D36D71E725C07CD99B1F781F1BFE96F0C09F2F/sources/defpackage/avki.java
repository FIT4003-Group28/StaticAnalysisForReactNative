package defpackage;
/* compiled from: PG */
/* renamed from: avki  reason: default package */
/* loaded from: classes2.dex */
public final class avki implements aajq {
    public static final aajr a = new avkh();
    private final avkj b;

    public avki(avkj avkjVar) {
        this.b = avkjVar;
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
        return new avkg(this.b.mo52toBuilder());
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        return (obj instanceof avki) && this.b.equals(((avki) obj).b);
    }

    public avkb getSearchState() {
        avkb b = avkb.b(this.b.d);
        return b == null ? avkb.TRANSCRIPT_SEARCH_STATE_VALUE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("TranscriptSearchStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

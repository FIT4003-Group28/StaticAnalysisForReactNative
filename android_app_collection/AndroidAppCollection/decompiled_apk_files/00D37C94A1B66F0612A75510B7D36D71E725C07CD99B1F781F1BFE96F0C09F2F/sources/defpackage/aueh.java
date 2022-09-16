package defpackage;
/* compiled from: PG */
/* renamed from: aueh  reason: default package */
/* loaded from: classes2.dex */
public final class aueh {
    public final aajl a;
    public final auej b;

    public aueh(auej auejVar, aajl aajlVar) {
        this.b = auejVar;
        this.a = aajlVar;
    }

    public final aueg a() {
        auei aueiVar;
        auej auejVar = this.b;
        if (auejVar.b == 2) {
            aueiVar = (auei) auejVar.c;
        } else {
            aueiVar = auei.a;
        }
        aopa mo52toBuilder = aueiVar.mo52toBuilder();
        return new aueg((auei) mo52toBuilder.mo39build(), this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aueh) && this.b.equals(((aueh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("PlaylistThumbnailDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

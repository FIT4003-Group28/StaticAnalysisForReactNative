package defpackage;
/* compiled from: PG */
/* renamed from: aqpi  reason: default package */
/* loaded from: classes2.dex */
public final class aqpi {
    public final aajl a;
    public final aqpm b;

    public aqpi(aqpm aqpmVar, aajl aajlVar) {
        this.b = aqpmVar;
        this.a = aajlVar;
    }

    public static aqph a() {
        return new aqph();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqpi) && this.b.equals(((aqpi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("CollageThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

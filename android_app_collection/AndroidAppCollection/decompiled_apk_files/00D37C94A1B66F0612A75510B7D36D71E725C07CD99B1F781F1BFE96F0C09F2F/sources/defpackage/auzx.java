package defpackage;
/* compiled from: PG */
/* renamed from: auzx  reason: default package */
/* loaded from: classes2.dex */
public final class auzx {
    public final auzy a;

    public auzx(auzy auzyVar) {
        this.a = auzyVar;
    }

    public static auzw a(auzy auzyVar) {
        return new auzw(auzyVar.mo52toBuilder());
    }

    public static final amvn b() {
        return new amvl().g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof auzx) && this.a.equals(((auzx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("StreamProgressModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

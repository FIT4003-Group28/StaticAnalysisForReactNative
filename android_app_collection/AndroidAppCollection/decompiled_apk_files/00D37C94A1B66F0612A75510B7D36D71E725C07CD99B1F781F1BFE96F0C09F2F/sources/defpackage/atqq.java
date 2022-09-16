package defpackage;
/* compiled from: PG */
/* renamed from: atqq  reason: default package */
/* loaded from: classes2.dex */
public final class atqq {
    private final atqt a;

    public atqq(atqt atqtVar) {
        this.a = atqtVar;
    }

    public static atqp a(atqt atqtVar) {
        return new atqp(atqtVar.mo52toBuilder());
    }

    public static final amvn b() {
        return new amvl().g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atqq) && this.a.equals(((atqq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("ClientEndpointBuilderDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

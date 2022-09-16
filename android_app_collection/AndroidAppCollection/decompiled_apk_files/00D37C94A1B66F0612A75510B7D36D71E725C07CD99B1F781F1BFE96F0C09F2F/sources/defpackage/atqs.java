package defpackage;
/* compiled from: PG */
/* renamed from: atqs  reason: default package */
/* loaded from: classes2.dex */
public final class atqs {
    private final atqu a;

    public atqs(atqu atquVar) {
        this.a = atquVar;
    }

    public static atqr b(atqu atquVar) {
        return new atqr(atquVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        atqt atqtVar = this.a.e;
        if (atqtVar == null) {
            atqtVar = atqt.a;
        }
        atqq.a(atqtVar).a();
        amvlVar.j(atqq.b());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof atqs) && this.a.equals(((atqs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("OfflineFutureUnplayableInfoModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

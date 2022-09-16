package defpackage;
/* compiled from: PG */
/* renamed from: aquo  reason: default package */
/* loaded from: classes2.dex */
public final class aquo {
    private final aajl a;
    private final aqup b;

    public aquo(aqup aqupVar, aajl aajlVar) {
        this.b = aqupVar;
        this.a = aajlVar;
    }

    public static aqun b(aqup aqupVar) {
        return new aqun(aqupVar.mo52toBuilder());
    }

    public final amvn a() {
        amvl amvlVar = new amvl();
        avhn avhnVar = this.b.f;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        amvlVar.j(avhr.b(avhnVar).a(this.a).a());
        return amvlVar.g();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aquo) && this.b.equals(((aquo) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("EmojiModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

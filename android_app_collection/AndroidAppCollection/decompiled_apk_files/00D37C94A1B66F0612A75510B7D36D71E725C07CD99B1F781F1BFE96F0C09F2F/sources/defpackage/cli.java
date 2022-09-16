package defpackage;
/* compiled from: PG */
/* renamed from: cli  reason: default package */
/* loaded from: classes2.dex */
final class cli implements cln {
    int a;
    public Class b;
    private final clj c;

    public cli(clj cljVar) {
        this.c = cljVar;
    }

    @Override // defpackage.cln
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cli) {
            cli cliVar = (cli) obj;
            if (this.a == cliVar.a && this.b == cliVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Class cls = this.b;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Key{size=");
        sb.append(i);
        sb.append("array=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}

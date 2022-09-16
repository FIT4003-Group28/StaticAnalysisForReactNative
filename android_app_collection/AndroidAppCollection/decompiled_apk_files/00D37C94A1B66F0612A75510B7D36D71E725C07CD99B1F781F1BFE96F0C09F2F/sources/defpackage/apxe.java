package defpackage;
/* compiled from: PG */
/* renamed from: apxe  reason: default package */
/* loaded from: classes2.dex */
public final class apxe {
    public final aajl a;
    public final apxf b;

    public apxe(apxf apxfVar, aajl aajlVar) {
        this.b = apxfVar;
        this.a = aajlVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apxe) && this.b.equals(((apxe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("ClientVeSpecModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

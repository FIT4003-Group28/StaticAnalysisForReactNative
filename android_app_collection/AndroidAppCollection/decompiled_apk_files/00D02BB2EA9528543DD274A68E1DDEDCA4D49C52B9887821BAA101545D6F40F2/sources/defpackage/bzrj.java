package defpackage;
/* compiled from: PG */
/* renamed from: bzrj  reason: default package */
/* loaded from: classes4.dex */
final class bzrj extends bzrn {
    private final int a;
    private final String b;

    public bzrj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.bzrn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bzrn
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzrn) {
            bzrn bzrnVar = (bzrn) obj;
            if (this.a == bzrnVar.a() && this.b.equals(bzrnVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37);
        sb.append("ColoredText{color=");
        sb.append(i);
        sb.append(", text=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

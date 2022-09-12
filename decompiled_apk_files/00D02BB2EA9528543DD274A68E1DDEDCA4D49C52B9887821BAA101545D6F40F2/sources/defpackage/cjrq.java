package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjrq  reason: default package */
/* loaded from: classes.dex */
public final class cjrq extends cjsg {
    private final int a;

    public cjrq(int i) {
        this.a = i;
    }

    @Override // defpackage.cjsg
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cjsg) && this.a == ((cjsg) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(28);
        sb.append("Identifier{base=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

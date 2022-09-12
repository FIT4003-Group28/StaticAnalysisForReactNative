package defpackage;
/* compiled from: PG */
/* renamed from: bxlu  reason: default package */
/* loaded from: classes4.dex */
public final class bxlu extends bxly {
    private final int a;

    public bxlu(int i) {
        this.a = i;
    }

    @Override // defpackage.bxly
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof bxly) && this.a == ((bxly) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        String a = bxlv.a(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 38);
        sb.append("ParentFragmentParameters{initialMode=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}

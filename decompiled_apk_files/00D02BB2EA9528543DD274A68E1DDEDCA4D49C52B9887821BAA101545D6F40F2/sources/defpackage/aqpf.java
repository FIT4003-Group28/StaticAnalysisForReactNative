package defpackage;
/* compiled from: PG */
/* renamed from: aqpf  reason: default package */
/* loaded from: classes2.dex */
final class aqpf extends aqph {
    private final String a;

    public aqpf(String str) {
        this.a = str;
    }

    @Override // defpackage.aqph, defpackage.aqql
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aqql
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqql) {
            aqql aqqlVar = (aqql) obj;
            if (aqqlVar.b() == 1 && this.a.equals(aqqlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 29);
        sb.append("ProfileListItem{dividerText=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

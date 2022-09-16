package defpackage;
/* compiled from: PG */
/* renamed from: cpmq  reason: default package */
/* loaded from: classes5.dex */
final class cpmq extends cpms {
    private final boolean a;
    private final int b;
    private final String c;

    public cpmq(boolean z, int i, String str) {
        this.a = z;
        this.b = i;
        this.c = str;
    }

    @Override // defpackage.cpms
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cpms
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cpms
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpms) {
            cpms cpmsVar = (cpms) obj;
            if (this.a == cpmsVar.a() && this.b == cpmsVar.b() && this.c.equals(cpmsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 89);
        sb.append("WidgetOptions{addressLabelVisible=");
        sb.append(z);
        sb.append(", autocompleteRightPadding=");
        sb.append(i);
        sb.append(", language=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}

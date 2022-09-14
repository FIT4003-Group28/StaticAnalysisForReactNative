package defpackage;
/* compiled from: PG */
/* renamed from: amgx  reason: default package */
/* loaded from: classes.dex */
final class amgx extends amkh {
    private final int a;

    public amgx(int i) {
        this.a = i;
    }

    @Override // defpackage.amkh
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof amkh) && this.a == ((amkh) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("LoggedLabel{idInsideLabelSnapshot=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

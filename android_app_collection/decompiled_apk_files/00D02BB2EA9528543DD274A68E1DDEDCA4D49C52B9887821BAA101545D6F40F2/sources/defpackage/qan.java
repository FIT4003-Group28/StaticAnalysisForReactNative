package defpackage;
/* compiled from: PG */
/* renamed from: qan  reason: default package */
/* loaded from: classes7.dex */
final class qan extends qcq {
    private final boolean a;

    public qan(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qcq
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qcq) && this.a == ((qcq) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(44);
        sb.append("StartDestinationsParams{skipAnimation=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

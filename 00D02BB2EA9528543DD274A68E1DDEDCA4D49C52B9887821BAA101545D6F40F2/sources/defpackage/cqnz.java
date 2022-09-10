package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqnz  reason: default package */
/* loaded from: classes5.dex */
public final class cqnz extends cqok {
    private final dcdc<cqoj> a;

    public cqnz(dcdc<cqoj> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null constraints");
    }

    @Override // defpackage.cqok
    public final dcdc<cqoj> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cqok)) {
            return false;
        }
        return dchl.m(this.a, ((cqok) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("CurvularConstraintSet{constraints=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

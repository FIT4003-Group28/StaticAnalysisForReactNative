package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: antc  reason: default package */
/* loaded from: classes2.dex */
public final class antc extends anzc {
    private final cqss a;

    public antc(cqss cqssVar) {
        if (cqssVar != null) {
            this.a = cqssVar;
            return;
        }
        throw new NullPointerException("Null lineColor");
    }

    @Override // defpackage.anzc, defpackage.anzb
    public cqss a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anzc)) {
            return false;
        }
        return this.a.equals(((anzc) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("DayTravelSegmentSchematicViewModelImpl{lineColor=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

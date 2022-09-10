package defpackage;
/* compiled from: PG */
/* renamed from: acgy  reason: default package */
/* loaded from: classes2.dex */
final class acgy extends achb {
    private final dcdc<acha> a;

    public acgy(dcdc<acha> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.achb
    public final dcdc<acha> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof achb)) {
            return false;
        }
        return dchl.m(this.a, ((achb) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("DebugInfoForFeedback{debugExtras=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

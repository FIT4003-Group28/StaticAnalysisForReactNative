package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aofy  reason: default package */
/* loaded from: classes2.dex */
public final class aofy extends aogt {
    private final dcdc<akqq> a;
    private final dbsg<dvay> b;

    public aofy(dcdc<akqq> dcdcVar, dbsg<dvay> dbsgVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            if (dbsgVar != null) {
                this.b = dbsgVar;
                return;
            }
            throw new NullPointerException("Null optionalTimelineSegment");
        }
        throw new NullPointerException("Null points");
    }

    @Override // defpackage.aogt
    public final dcdc<akqq> a() {
        return this.a;
    }

    @Override // defpackage.aogt
    public final dbsg<dvay> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogt) {
            aogt aogtVar = (aogt) obj;
            if (dchl.m(this.a, aogtVar.a()) && this.b.equals(aogtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("PathSegment{points=");
        sb.append(valueOf);
        sb.append(", optionalTimelineSegment=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

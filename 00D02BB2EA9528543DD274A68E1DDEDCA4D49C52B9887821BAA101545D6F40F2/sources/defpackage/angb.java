package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: angb  reason: default package */
/* loaded from: classes2.dex */
public class angb extends anhh {
    public final dbsg<dvyw> a;

    public angb(dbsg<dvyw> dbsgVar) {
        this.a = dbsgVar;
    }

    @Override // defpackage.anhh
    public final dbsg<dvyw> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anhh)) {
            return false;
        }
        return this.a.equals(((anhh) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("OngoingCheckinState{placeProto=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

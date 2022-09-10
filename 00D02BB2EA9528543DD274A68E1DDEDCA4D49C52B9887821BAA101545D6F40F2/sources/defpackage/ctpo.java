package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: ctpo  reason: default package */
/* loaded from: classes5.dex */
final class ctpo extends ctqq {
    private final dcdc<ContactId> a;

    public ctpo(dcdc<ContactId> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.ctqq
    public final dcdc<ContactId> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctqq)) {
            return false;
        }
        return dchl.m(this.a, ((ctqq) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("GroupInfo{contactIds=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

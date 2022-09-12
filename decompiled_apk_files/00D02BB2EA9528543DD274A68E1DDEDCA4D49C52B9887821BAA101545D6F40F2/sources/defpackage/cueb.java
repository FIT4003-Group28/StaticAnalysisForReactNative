package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: cueb  reason: default package */
/* loaded from: classes5.dex */
public final class cueb extends cuhb {
    private final dcdc<ContactId> a;

    public cueb(dcdc<ContactId> dcdcVar) {
        this.a = dcdcVar;
    }

    @Override // defpackage.cuhb
    public final dcdc<ContactId> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuhb)) {
            return false;
        }
        return dchl.m(this.a, ((cuhb) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("ReceiptMetadata{contactIds=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

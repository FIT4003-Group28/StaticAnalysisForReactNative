package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuus  reason: default package */
/* loaded from: classes5.dex */
public final class cuus extends cuux {
    public final int a;
    private final ContactId b;

    public cuus(ContactId contactId, int i) {
        this.b = contactId;
        this.a = i;
    }

    @Override // defpackage.cuux
    public final ContactId a() {
        return this.b;
    }

    @Override // defpackage.cuux
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cuux) {
            cuux cuuxVar = (cuux) obj;
            if (this.b.equals(cuuxVar.a()) && this.a == cuuxVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        int i = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("CacheKey{contactId=");
        sb.append(valueOf);
        sb.append(", sizeInPx=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

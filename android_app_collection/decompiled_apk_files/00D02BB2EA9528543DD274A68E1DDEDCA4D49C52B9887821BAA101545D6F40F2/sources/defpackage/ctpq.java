package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ctpq  reason: default package */
/* loaded from: classes5.dex */
public final class ctpq extends ctqs {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final Set<ContactId> d;

    public ctpq(String str, boolean z, boolean z2, Set<ContactId> set) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = set;
    }

    @Override // defpackage.ctqs
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ctqs
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.ctqs
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.ctqs
    public final Set<ContactId> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctqs) {
            ctqs ctqsVar = (ctqs) obj;
            if (this.a.equals(ctqsVar.a()) && this.b == ctqsVar.b() && this.c == ctqsVar.c() && this.d.equals(ctqsVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 90 + String.valueOf(valueOf).length());
        sb.append("GroupMetadata{handlerId=");
        sb.append(str);
        sb.append(", supportsBlocking=");
        sb.append(z);
        sb.append(", isBlocked=");
        sb.append(z2);
        sb.append(", importantParticipants=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

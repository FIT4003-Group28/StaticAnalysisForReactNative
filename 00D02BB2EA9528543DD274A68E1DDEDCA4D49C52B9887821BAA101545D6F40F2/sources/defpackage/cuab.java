package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuab  reason: default package */
/* loaded from: classes5.dex */
public final class cuab extends cuae {
    private final ContactId a;

    public cuab(ContactId contactId) {
        this.a = contactId;
    }

    @Override // defpackage.cuae, defpackage.ctzf
    public final ContactId a() {
        return this.a;
    }

    @Override // defpackage.ctzf
    public final int c() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzf) {
            ctzf ctzfVar = (ctzf) obj;
            if (ctzfVar.c() == 2 && this.a.equals(ctzfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("EventCallbackDestination{contactId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

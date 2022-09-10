package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuac  reason: default package */
/* loaded from: classes5.dex */
public final class cuac extends cuae {
    private final ConversationId.GroupId a;

    public cuac(ConversationId.GroupId groupId) {
        this.a = groupId;
    }

    @Override // defpackage.cuae, defpackage.ctzf
    public final ConversationId.GroupId b() {
        return this.a;
    }

    @Override // defpackage.ctzf
    public final int c() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctzf) {
            ctzf ctzfVar = (ctzf) obj;
            if (ctzfVar.c() == 3 && this.a.equals(ctzfVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("EventCallbackDestination{groupId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

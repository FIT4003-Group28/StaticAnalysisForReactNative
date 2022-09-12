package com.google.android.libraries.messaging.lighter.model;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_ConversationId_GroupId  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ConversationId_GroupId extends ConversationId.GroupId {
    private static final long serialVersionUID = 0;
    public final String a;
    public final String b;

    public C$AutoValue_ConversationId_GroupId(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null appName");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.ConversationId.GroupId
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationId.GroupId) {
            ConversationId.GroupId groupId = (ConversationId.GroupId) obj;
            if (this.a.equals(groupId.a()) && this.b.equals(groupId.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length());
        sb.append("GroupId{id=");
        sb.append(str);
        sb.append(", appName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

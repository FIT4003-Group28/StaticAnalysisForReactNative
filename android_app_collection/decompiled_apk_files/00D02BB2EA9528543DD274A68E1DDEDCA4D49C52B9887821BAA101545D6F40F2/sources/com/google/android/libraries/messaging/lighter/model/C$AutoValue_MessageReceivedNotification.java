package com.google.android.libraries.messaging.lighter.model;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.messaging.lighter.model.$AutoValue_MessageReceivedNotification  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_MessageReceivedNotification extends MessageReceivedNotification {
    public final ConversationId a;
    public final String b;
    public final ContactId c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public C$AutoValue_MessageReceivedNotification(ConversationId conversationId, String str, ContactId contactId, String str2, String str3, String str4, String str5, String str6, boolean z) {
        if (conversationId != null) {
            this.a = conversationId;
            if (str != null) {
                this.b = str;
                if (contactId != null) {
                    this.c = contactId;
                    if (str2 != null) {
                        this.d = str2;
                        if (str3 != null) {
                            this.e = str3;
                            if (str4 != null) {
                                this.f = str4;
                                if (str5 != null) {
                                    this.g = str5;
                                    if (str6 != null) {
                                        this.h = str6;
                                        this.i = z;
                                        return;
                                    }
                                    throw new NullPointerException("Null messageContent");
                                }
                                throw new NullPointerException("Null senderName");
                            }
                            throw new NullPointerException("Null body");
                        }
                        throw new NullPointerException("Null title");
                    }
                    throw new NullPointerException("Null avatarUrl");
                }
                throw new NullPointerException("Null senderId");
            }
            throw new NullPointerException("Null messageId");
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final ConversationId a() {
        return this.a;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final ContactId c() {
        return this.c;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final String d() {
        return this.d;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageReceivedNotification) {
            MessageReceivedNotification messageReceivedNotification = (MessageReceivedNotification) obj;
            if (this.a.equals(messageReceivedNotification.a()) && this.b.equals(messageReceivedNotification.b()) && this.c.equals(messageReceivedNotification.c()) && this.d.equals(messageReceivedNotification.d()) && this.e.equals(messageReceivedNotification.e()) && this.f.equals(messageReceivedNotification.f()) && this.g.equals(messageReceivedNotification.g()) && this.h.equals(messageReceivedNotification.h()) && this.i == messageReceivedNotification.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final String f() {
        return this.f;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final String g() {
        return this.g;
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231);
    }

    @Override // com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        boolean z = this.i;
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = str2.length();
        int length5 = str3.length();
        int length6 = str4.length();
        StringBuilder sb = new StringBuilder(length + 153 + length2 + length3 + length4 + length5 + length6 + str5.length() + str6.length());
        sb.append("MessageReceivedNotification{conversationId=");
        sb.append(valueOf);
        sb.append(", messageId=");
        sb.append(str);
        sb.append(", senderId=");
        sb.append(valueOf2);
        sb.append(", avatarUrl=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", body=");
        sb.append(str4);
        sb.append(", senderName=");
        sb.append(str5);
        sb.append(", messageContent=");
        sb.append(str6);
        sb.append(", disableInlineResponse=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

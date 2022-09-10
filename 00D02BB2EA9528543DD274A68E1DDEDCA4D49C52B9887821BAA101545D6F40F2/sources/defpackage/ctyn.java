package defpackage;

import com.google.android.libraries.messaging.lighter.model.AutoValue_MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
/* compiled from: PG */
/* renamed from: ctyn  reason: default package */
/* loaded from: classes5.dex */
public final class ctyn extends cugv {
    private ConversationId a;
    private String b;
    private ContactId c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Boolean i;

    @Override // defpackage.cugv
    public final void b(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null avatarUrl");
    }

    @Override // defpackage.cugv
    public final void c(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null body");
    }

    @Override // defpackage.cugv
    public final void d(ConversationId conversationId) {
        if (conversationId != null) {
            this.a = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.cugv
    public final void e(boolean z) {
        this.i = Boolean.valueOf(z);
    }

    @Override // defpackage.cugv
    public final void f(String str) {
        if (str != null) {
            this.h = str;
            return;
        }
        throw new NullPointerException("Null messageContent");
    }

    @Override // defpackage.cugv
    public final void g(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null messageId");
    }

    @Override // defpackage.cugv
    public final void h(ContactId contactId) {
        if (contactId != null) {
            this.c = contactId;
            return;
        }
        throw new NullPointerException("Null senderId");
    }

    @Override // defpackage.cugv
    public final void i(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null senderName");
    }

    @Override // defpackage.cugv
    public final void j(String str) {
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.cugv
    public final MessageReceivedNotification a() {
        String str = this.a == null ? " conversationId" : "";
        if (this.b == null) {
            str = str.concat(" messageId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" senderId");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" avatarUrl");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" title");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" body");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" senderName");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" messageContent");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" disableInlineResponse");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_MessageReceivedNotification(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i.booleanValue());
    }
}

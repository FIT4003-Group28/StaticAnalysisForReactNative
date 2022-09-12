package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctqb  reason: default package */
/* loaded from: classes5.dex */
public final class ctqb extends ctrh {
    private String a;
    private ConversationId b;
    private ContactId c;
    private Integer d;
    private Long e;
    private Long f;

    @Override // defpackage.ctrh
    public final void b(ConversationId conversationId) {
        if (conversationId != null) {
            this.b = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.ctrh
    public final void c(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.ctrh
    public final void d(ContactId contactId) {
        if (contactId != null) {
            this.c = contactId;
            return;
        }
        throw new NullPointerException("Null sender");
    }

    @Override // defpackage.ctrh
    public final void e(long j) {
        this.f = Long.valueOf(j);
    }

    @Override // defpackage.ctrh
    public final void f(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null typingIndicatorId");
    }

    @Override // defpackage.ctrh
    public final void g(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.ctrh
    public final ctri a() {
        String str = this.a == null ? " typingIndicatorId" : "";
        if (this.b == null) {
            str = str.concat(" conversationId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" sender");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" typingIndicatorStatus");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" refreshIntervalUSec");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" serverTimestampUSec");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctqc(this.a, this.b, this.c, this.d.intValue(), this.e.longValue(), this.f.longValue());
    }
}

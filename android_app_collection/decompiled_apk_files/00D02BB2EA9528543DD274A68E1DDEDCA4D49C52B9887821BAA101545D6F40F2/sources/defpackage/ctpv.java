package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctpv  reason: default package */
/* loaded from: classes5.dex */
public final class ctpv extends ctqz {
    private Integer a;
    private String b;
    private List<String> c;
    private ContactId d;
    private ConversationId e;

    @Override // defpackage.ctqz
    public final void b(ConversationId conversationId) {
        if (conversationId != null) {
            this.e = conversationId;
            return;
        }
        throw new NullPointerException("Null conversationId");
    }

    @Override // defpackage.ctqz
    public final void c(List<String> list) {
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null messageIds");
    }

    @Override // defpackage.ctqz
    public final void d(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null receiptId");
    }

    @Override // defpackage.ctqz
    public final void e(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.ctqz
    public final void f(ContactId contactId) {
        if (contactId != null) {
            this.d = contactId;
            return;
        }
        throw new NullPointerException("Null recipient");
    }

    @Override // defpackage.ctqz
    public final ctra a() {
        String str = this.a == null ? " receiptType" : "";
        if (this.b == null) {
            str = str.concat(" receiptId");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" messageIds");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" recipient");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" conversationId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ctpw(this.a.intValue(), this.b, this.c, this.d, this.e);
    }
}

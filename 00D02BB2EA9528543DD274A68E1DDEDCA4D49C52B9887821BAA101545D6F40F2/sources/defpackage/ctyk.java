package defpackage;

import com.google.android.libraries.messaging.lighter.model.AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: ctyk  reason: default package */
/* loaded from: classes5.dex */
public final class ctyk extends cufk {
    private String a;
    private String b;
    private ContactId.ContactType c;
    private dbsg<String> d;

    public ctyk() {
        this.d = dbpy.a;
    }

    public ctyk(ContactId contactId) {
        this.d = dbpy.a;
        this.a = contactId.a();
        this.b = contactId.b();
        this.c = contactId.c();
        this.d = contactId.d();
    }

    @Override // defpackage.cufk
    public final void b(String str) {
        this.d = dbsg.j(str);
    }

    @Override // defpackage.cufk
    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.cufk
    public final void d(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null tachyonAppName");
    }

    @Override // defpackage.cufk
    public final void e(ContactId.ContactType contactType) {
        if (contactType != null) {
            this.c = contactType;
            return;
        }
        throw new NullPointerException("Null type");
    }

    @Override // defpackage.cufk
    public final ContactId a() {
        String str = this.a == null ? " id" : "";
        if (this.b == null) {
            str = str.concat(" tachyonAppName");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" type");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_ContactId(this.a, this.b, this.c, this.d);
    }
}

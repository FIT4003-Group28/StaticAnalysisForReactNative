package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ctza  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctza {
    public abstract ctzb a();

    public abstract void b(String str);

    public abstract void c(String str);

    public abstract void d(Set<String> set);

    public abstract void e(String str);

    public final void f(ContactId contactId) {
        e(contactId.b());
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.c().ordinal();
        if (ordinal == 1) {
            d(dcep.B(contactId.a()));
        } else if (ordinal == 2) {
            c(contactId.a());
            d(dcmr.a);
        } else if (ordinal == 4) {
            b(contactId.a());
            d(dcmr.a);
        } else {
            cstl.a("AccountUsers");
            c(contactId.a());
            d(dcmr.a);
        }
    }
}

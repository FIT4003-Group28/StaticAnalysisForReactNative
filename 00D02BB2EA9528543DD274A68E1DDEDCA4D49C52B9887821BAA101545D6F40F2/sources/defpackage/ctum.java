package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ctum  reason: default package */
/* loaded from: classes5.dex */
public final class ctum {
    public static dxvs a(ContactId contactId) {
        dxvr bZ = dxvs.d.bZ();
        String b = contactId.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dxvs) bZ.b).c = b;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.c().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                String a = contactId.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a.getClass();
                ((dxvs) bZ.b).b = a;
                ((dxvs) bZ.b).a = eacq.a(3);
            } else if (ordinal == 2) {
                String a2 = contactId.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a2.getClass();
                ((dxvs) bZ.b).b = a2;
                ((dxvs) bZ.b).a = eacq.a(18);
            } else if (ordinal != 3) {
                if (ordinal == 4) {
                    String a3 = contactId.a();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    a3.getClass();
                    ((dxvs) bZ.b).b = a3;
                    ((dxvs) bZ.b).a = eacq.a(15);
                }
            } else if (contactId.d().a()) {
                String b2 = contactId.d().b();
                String a4 = contactId.a();
                StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 1 + String.valueOf(a4).length());
                sb.append(b2);
                sb.append("|");
                sb.append(a4);
                String sb2 = sb.toString();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                sb2.getClass();
                ((dxvs) bZ.b).b = sb2;
                ((dxvs) bZ.b).a = eacq.a(20);
            } else {
                String a5 = contactId.a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a5.getClass();
                ((dxvs) bZ.b).b = a5;
                ((dxvs) bZ.b).a = eacq.a(20);
            }
            return bZ.bK();
        }
        return null;
    }

    public static ContactId b(dxvs dxvsVar) {
        cufk f = ContactId.f();
        f.d(dxvsVar.c);
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int b = eacq.b(dxvsVar.a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            f.c(dxvsVar.b);
            f.e(ContactId.ContactType.PHONE_NUMBER);
        } else if (i == 13) {
            f.c(dxvsVar.b);
            f.e(ContactId.ContactType.DEVICE_ID);
        } else if (i == 16) {
            f.c(dxvsVar.b);
            f.e(ContactId.ContactType.EMAIL);
        } else if (i != 18) {
            return null;
        } else {
            String[] split = dxvsVar.b.split(Pattern.quote("|"), 2);
            if (split.length != 2) {
                return null;
            }
            f.c(split[1]);
            f.b(split[0]);
            f.e(ContactId.ContactType.HANDLER);
        }
        return f.a();
    }

    public static ConversationId c(dxvs dxvsVar, ctyy ctyyVar) {
        int b = eacq.b(dxvsVar.a);
        boolean z = false;
        if (b != 0 && b == 4) {
            z = true;
        }
        dbsk.a(z);
        cufr c = ConversationId.GroupId.c();
        c.c(dxvsVar.b);
        c.b(dxvsVar.c);
        ConversationId.GroupId a = c.a();
        cufq f = ConversationId.f();
        f.d(a);
        f.c(ctyyVar.b().e());
        return f.a();
    }
}

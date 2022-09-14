package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: ctus  reason: default package */
/* loaded from: classes5.dex */
public final class ctus {
    public static dxnc a(ContactId contactId) {
        dxnb bZ = dxnc.e.bZ();
        String a = contactId.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((dxnc) bZ.b).b = a;
        String b = contactId.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        b.getClass();
        ((dxnc) bZ.b).d = b;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.c().ordinal();
        if (ordinal == 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxnc) bZ.b).a = dxov.a(2);
        } else if (ordinal == 1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxnc) bZ.b).a = dxov.a(3);
        } else if (ordinal == 2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxnc) bZ.b).a = dxov.a(4);
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dxnc) bZ.b).a = dxov.a(7);
            }
        } else if (contactId.d().a()) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxnc) bZ.b).a = dxov.a(5);
            String b2 = contactId.d().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            b2.getClass();
            ((dxnc) bZ.b).c = b2;
        }
        return bZ.bK();
    }

    public static dxnc b(ctzf ctzfVar) {
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int c = ctzfVar.c();
        int i = c - 1;
        if (c != 0) {
            if (i == 1) {
                return a(ctzfVar.a());
            }
            if (i == 2) {
                dxnb bZ = dxnc.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ((dxnc) bZ.b).a = dxov.a(6);
                String b = ctzfVar.b().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                b.getClass();
                ((dxnc) bZ.b).d = b;
                String a = ctzfVar.b().a();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                a.getClass();
                ((dxnc) bZ.b).b = a;
                return bZ.bK();
            }
            dxnb bZ2 = dxnc.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ((dxnc) bZ2.b).a = dxov.a(2);
            return bZ2.bK();
        }
        throw null;
    }

    public static ContactId c(dxnc dxncVar) {
        cufk f = ContactId.f();
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int b = dxov.b(dxncVar.a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            f.e(ContactId.ContactType.PHONE_NUMBER);
        } else if (i == 2) {
            f.e(ContactId.ContactType.EMAIL);
        } else if (i == 3) {
            f.e(ContactId.ContactType.HANDLER);
            f.b(dxncVar.c);
        } else if (i == 5) {
            f.e(ContactId.ContactType.DEVICE_ID);
        } else {
            f.e(ContactId.ContactType.UNKNOWN);
        }
        f.c(dxncVar.b);
        f.d(dxncVar.d);
        return f.a();
    }
}

package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: aqda  reason: default package */
/* loaded from: classes2.dex */
public final class aqda {
    public static boolean a(ctyy ctyyVar, btlu btluVar) {
        String t = btlu.q(btluVar).t();
        return t != null && cstg.a(t).equals(cstg.a(ctyyVar.b().a().c("")));
    }

    public static ContactId b(String str, int i) {
        if (dbsj.d(str) || i == 0) {
            return null;
        }
        cufk f = ContactId.f();
        f.c(str);
        f.e(ContactId.ContactType.EMAIL);
        dbsk.l(i != 0);
        f.d(i == 2 ? "GMB" : "GMM");
        return f.a();
    }

    public static boolean c(ctyy ctyyVar) {
        return d(ctyyVar) == 2;
    }

    public static int d(ctyy ctyyVar) {
        return f(ctyyVar.e());
    }

    public static int e(ContactId contactId) {
        return f(contactId.b());
    }

    private static int f(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 70684) {
            if (hashCode == 70695 && str.equals("GMM")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("GMB")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 0 : 2;
        }
        return 1;
    }
}

package defpackage;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* compiled from: PG */
/* renamed from: btlu  reason: default package */
/* loaded from: classes.dex */
public class btlu {
    public static final btlu a = new btlu(btlt.UNKNOWN);
    public static final btlu b = new btlu(btlt.SIGNED_OUT);
    @dzsi
    public static akev c = null;
    public static affj l;
    public final String d;
    public btls e;
    public btlt f;
    public String g;
    public boolean h;
    @dzsi
    public String i;
    @dzsi
    public String j;
    @dzsi
    public String k;
    @dzsi
    private final Account m;
    @dzsi
    private String n;

    public btlu(btlt btltVar) {
        this(btltVar, null, null);
    }

    public static btlu B(@dzsi String str, btlt btltVar) {
        return new btlu(btltVar, str, null);
    }

    public static btlu a(String str, Account account) {
        return new btlu(btlt.GOOGLE, str, account);
    }

    public static btlu b(cqat cqatVar) {
        Random random = new Random();
        String valueOf = String.valueOf(String.format("%010X", Long.valueOf(cqatVar.b() - 1451624400000L)));
        String valueOf2 = String.valueOf(String.format("%06X", Integer.valueOf(random.nextInt(16777215) + 1)));
        return c(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public static btlu c(String str) {
        return new btlu(btlt.INCOGNITO, str, null);
    }

    public static String d(Account account) {
        String valueOf = String.valueOf(account.name);
        return valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
    }

    @Deprecated
    public static boolean e(@dzsi String str) {
        return str != null && str.startsWith(" ");
    }

    public static boolean g(@dzsi btlu btluVar, @dzsi btlu btluVar2) {
        return q(btluVar).equals(q(btluVar2));
    }

    @dzsi
    @Deprecated
    public static String h(@dzsi btlu btluVar) {
        if (btluVar == null || i(btluVar) == btlt.SIGNED_OUT || dbsd.a(btluVar, a)) {
            return null;
        }
        return btluVar.d;
    }

    @Deprecated
    public static btlt i(@dzsi btlu btluVar) {
        return btluVar == null ? btlt.SIGNED_OUT : btluVar.f;
    }

    @Deprecated
    public static boolean n(@dzsi btlu btluVar) {
        return i(btluVar) == btlt.INCOGNITO;
    }

    @Deprecated
    public static boolean p(@dzsi btlu btluVar) {
        return i(btluVar) == btlt.SIGNED_OUT;
    }

    @Deprecated
    public static btlu q(@dzsi btlu btluVar) {
        return btluVar == null ? b : btluVar;
    }

    public final void A(boolean z) {
        dbsk.l(l());
        this.h = z;
    }

    public final boolean equals(@dzsi Object obj) {
        return this == obj || ((obj instanceof btlu) && this.d.equals(((btlu) obj).d));
    }

    @Deprecated
    public final boolean f() {
        return e(this.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d});
    }

    @dzsi
    public final String j() {
        if (!l() || e(this.d)) {
            return null;
        }
        return k();
    }

    public final String k() {
        String str = this.d;
        return str.startsWith("accountId=") ? str.substring(10) : str;
    }

    public final boolean l() {
        return this.f == btlt.GOOGLE;
    }

    public final boolean m() {
        return this.f == btlt.INCOGNITO;
    }

    public final boolean o() {
        return this.f == btlt.SIGNED_OUT;
    }

    public final boolean r() {
        return this.f == btlt.UNKNOWN;
    }

    public final Account s() {
        Account account = this.m;
        if (account != null) {
            return account;
        }
        throw new UnsupportedOperationException();
    }

    @dzsi
    public final String t() {
        Account account = this.m;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        b2.b("accountId", this.d);
        b2.b("account", this.m);
        b2.b("accountType", this.f);
        b2.b("accountOrigin", this.e);
        return b2.toString();
    }

    public final boolean u() {
        btlu btluVar;
        if (c != null && this.f == btlt.GOOGLE) {
            akev akevVar = c;
            Account s = s();
            String str = this.d;
            synchronized (akevVar) {
                Iterator<Map.Entry<btlu, Map<String, btue>>> it = ((akcl) akevVar).p.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        btluVar = null;
                        break;
                    }
                    Map.Entry<btlu, Map<String, btue>> next = it.next();
                    if (str.equals(next.getKey().d)) {
                        btluVar = next.getKey();
                        break;
                    }
                }
            }
            if (btluVar == null) {
                btluVar = a(str, s);
            }
            akcl akclVar = (akcl) akevVar;
            btue z = akclVar.z(btluVar, akclVar.h);
            return (z == null || z.b() == null) ? false : true;
        }
        return false;
    }

    @dzsi
    public final String v() {
        return this.g.isEmpty() ? this.n : this.g;
    }

    public final void w(@dzsi String str) {
        dbsk.l(l());
        this.n = str;
    }

    public final void x(@dzsi String str) {
        dbsk.l(l());
        this.k = str;
    }

    public final void y(@dzsi String str) {
        dbsk.l(l());
        this.i = str;
    }

    public final void z(@dzsi String str) {
        dbsk.l(l());
        this.j = str;
    }

    public btlu(btlt btltVar, @dzsi String str, @dzsi Account account) {
        this.e = btls.UNKNOWN;
        this.f = btlt.UNKNOWN;
        this.g = "";
        this.m = account;
        if (str == null) {
            str = btltVar.e;
        } else if (btltVar != btlt.INCOGNITO || str.length() != 16) {
            if (!str.startsWith(btltVar.e)) {
                String valueOf = String.valueOf(btltVar.e);
                str = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            }
            this.d = str;
            this.f = btltVar;
        }
        this.d = str;
        this.f = btltVar;
    }
}

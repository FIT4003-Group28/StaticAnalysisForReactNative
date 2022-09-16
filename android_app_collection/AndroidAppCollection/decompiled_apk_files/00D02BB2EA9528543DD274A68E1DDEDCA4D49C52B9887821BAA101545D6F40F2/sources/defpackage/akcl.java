package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.RemoteException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: akcl  reason: default package */
/* loaded from: classes.dex */
public final class akcl implements OnAccountsUpdateListener, akfa, akev {
    private final cqat A;
    public final Application b;
    public final akby c;
    public final AccountManager d;
    public final bttf e;
    public final dehp f;
    public final dxio<awoe> g;
    public final dxio<btxc> j;
    public final affr k;
    public dxio<btvo> l;
    public final dxio<btry> u;
    private final bvjj w;
    private final Executor x;
    private final btub y;
    private final dxio<ckcw> z;
    private static final eatp v = eaul.g;
    public static final String a = String.valueOf(btlt.INCOGNITO.e).concat("fake");
    public final deig<Void> i = deig.d();
    public btlu m = btlu.a;
    public final AtomicBoolean n = new AtomicBoolean(false);
    @dzsi
    private String B = null;
    @dzsi
    public btlu o = null;
    public final Map<btlu, Map<String, btue>> p = dcjz.d();
    final Map<Integer, akey> q = Collections.synchronizedMap(new HashMap());
    private final List<deho<Void>> C = dchl.a();
    public final deig<btvo> r = deig.d();
    public final crzp<btvo> s = new akch(this);
    public final String h = btud.a();
    private final crzo<btlu> D = new crzo<>();
    private final crzo<List<btlu>> E = new crzo<>();
    public final crzo<List<btue>> t = new crzo<>();
    private final dbsg F = dbpy.a;

    public akcl(Application application, akby akbyVar, bvjj bvjjVar, bttf bttfVar, Executor executor, dehp dehpVar, dxio<btvo> dxioVar, btub btubVar, dxio<ckcw> dxioVar2, dxio<awoe> dxioVar3, dxio<btry> dxioVar4, dxio<btxc> dxioVar5, cqat cqatVar, affr affrVar) {
        this.b = application;
        this.c = akbyVar;
        this.d = AccountManager.get(application);
        this.w = bvjjVar;
        this.e = bttfVar;
        this.x = executor;
        this.f = dehpVar;
        this.l = dxioVar;
        this.y = btubVar;
        this.z = dxioVar2;
        this.g = dxioVar3;
        this.u = dxioVar4;
        this.j = dxioVar5;
        this.A = cqatVar;
        this.k = affrVar;
    }

    private final synchronized boolean I() {
        dbsk.l(!this.k.c());
        this.w.S(bvjk.m, true);
        this.w.ac(bvjk.p, btlu.b(this.A).d);
        this.w.Z(bvjk.r, -1L);
        this.w.ac(bvjk.s, v.f(eaol.a()));
        this.d.removeOnAccountsUpdatedListener(this);
        return this.w.aq();
    }

    private final dcdc<btlu> J() {
        bvrj.UI_THREAD.d();
        dccx F = dcdc.F();
        for (Account account : u()) {
            F.g(this.c.b(account));
        }
        return F.f();
    }

    private final Map<String, btue> K(btlu btluVar) {
        Map<String, btue> map = this.p.get(btluVar);
        if (map == null) {
            HashMap d = dcjz.d();
            this.p.put(btluVar, d);
            return d;
        }
        return map;
    }

    private final void L() {
        if (!this.w.m(bvjk.in, false) || !d()) {
            return;
        }
        throw new IllegalStateException("Can't get account info while Incognito mode is enabled.");
    }

    @Override // defpackage.akfa
    public final void A(@dzsi btlu btluVar, @dzsi String str) {
        btue z;
        L();
        if (btluVar == null || !btluVar.l() || str == null || (z = z(btluVar, this.h)) == null) {
            return;
        }
        z.c(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final btua B(btlu btluVar, String str) {
        dbsk.a(btluVar.l());
        btub btubVar = this.y;
        Application application = (Application) ((dxjd) btubVar.a).a;
        btub.a(application, 1);
        cqat a2 = btubVar.b.a();
        btub.a(a2, 2);
        ckcw a3 = btubVar.c.a();
        btub.a(a3, 3);
        btub.a(btluVar, 4);
        btub.a(str, 5);
        btrm a4 = btubVar.d.a();
        btub.a(a4, 6);
        btvo a5 = btubVar.e.a();
        btub.a(a5, 7);
        return new btua(application, a2, a3, btluVar, str, a4, a5);
    }

    @Override // defpackage.akfa
    public final crzm<btlu> C() {
        return this.D.a;
    }

    @Override // defpackage.akfa
    public final crzm<List<btlu>> D() {
        return this.E.a;
    }

    public final void E(btlu btluVar) {
        this.D.a(btluVar);
    }

    @Override // defpackage.akfa
    public final void F(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("AccountData:"));
        printWriter.write(String.valueOf(str).concat("  "));
        btlt btltVar = btlt.UNKNOWN;
        int ordinal = btlu.i(j()).ordinal();
        if (ordinal == 1) {
            printWriter.println("Logged in");
        } else if (ordinal == 2) {
            printWriter.println("In Incognito");
        } else if (ordinal == 3) {
            String valueOf = String.valueOf((akez) this.w.H(bvjk.y, akez.class, akez.UNKNOWN));
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Logged out with reason ");
            sb.append(valueOf);
            printWriter.println(sb.toString());
        } else {
            printWriter.println("Unknown login status");
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43 + "none".length());
        sb2.append(str);
        sb2.append("  mostRecentAuthRecoverableGetTokenResult: ");
        sb2.append("none");
        printWriter.println(sb2.toString());
    }

    @Override // defpackage.akfa
    public final void G(deho<Void> dehoVar) {
        synchronized (this) {
            this.C.add(dehoVar);
        }
    }

    @Override // defpackage.akfa
    public final dehn<Void> H() {
        synchronized (this) {
            if (this.C.isEmpty()) {
                return dehk.a;
            }
            ArrayList c = dchl.c(this.C);
            this.C.clear();
            bvmn bvmnVar = bvmo.a;
            int size = c.size();
            for (int i = 0; i < size; i++) {
                this.f.execute((deho) c.get(i));
            }
            return deha.l(c).b(akcg.a, this.f);
        }
    }

    @Override // defpackage.akfa
    public final void a() {
        this.f.execute(new Runnable(this) { // from class: akcc
            private final akcl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akcl akclVar = this.a;
                btue z = akclVar.z(akclVar.k(), akclVar.h);
                if (z != null) {
                    z.e();
                }
            }
        });
    }

    public final btlu b(bvjk bvjkVar) {
        btlu btluVar;
        btlu btluVar2;
        String z;
        Account[] u = u();
        int length = u.length;
        Arrays.toString(u);
        if (length != 0) {
            String z2 = this.w.z(bvjkVar, null);
            if ("*".equals(z2)) {
                btluVar = new btlu(btlt.SIGNED_OUT);
                btluVar.e = btls.RESTORED_FROM_STORAGE;
            } else if (z2 != null) {
                btluVar = n(z2);
                if (btluVar == null) {
                    btluVar = new btlu(btlt.SIGNED_OUT);
                    btluVar.e = btls.RESTORED_FROM_STORAGE;
                } else {
                    btluVar.e = btls.RESTORED_FROM_STORAGE;
                }
            } else {
                btluVar = null;
            }
            String valueOf = String.valueOf(bvjkVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("accountId from ");
            sb.append(valueOf);
            sb.toString();
            btluVar2 = btluVar;
        } else {
            btluVar2 = new btlu(btlt.SIGNED_OUT);
            btluVar2.e = btls.AUTO_PICKED;
        }
        if (btluVar2 == null && (z = this.w.z(bvjk.x, null)) != null) {
            if ("*".equals(z)) {
                btluVar2 = new btlu(btlt.SIGNED_OUT);
            } else {
                Account e = akby.e(u, z);
                if (e != null) {
                    btluVar2 = this.c.b(e);
                }
            }
            if (btluVar2 != null) {
                btluVar2.e = btls.RESTORED_FROM_STORAGE;
            }
        }
        if (btluVar2 == null) {
            new btlu(btlt.SIGNED_OUT);
            btlu b = this.c.b(u[0]);
            b.e = btls.AUTO_PICKED;
            return b;
        }
        return btluVar2;
    }

    @Override // defpackage.akfa
    public final boolean c() {
        btlu j = j();
        return j.l() && j.u();
    }

    @Override // defpackage.akfa
    public final synchronized boolean d() {
        return this.m.m();
    }

    @Override // defpackage.akfa
    public final boolean e(boolean z) {
        if (!z) {
            dbsk.l(!this.k.c());
            this.w.S(bvjk.m, false);
            this.w.P(bvjk.p);
            String z2 = this.w.z(bvjk.s, "");
            if (!z2.isEmpty()) {
                eatp eatpVar = v;
                ((ckcp) this.z.a().a(ckfn.p)).a((eatpVar.i(eatpVar.f(eaol.a())) - eatpVar.i(z2)) / 60000);
            }
            this.w.P(bvjk.s);
            return this.w.aq();
        }
        return I();
    }

    @Override // defpackage.akfa
    @dzsi
    public final String f() {
        return this.B;
    }

    @Override // defpackage.akfa
    @dzsi
    public final cqtd g() {
        if (this.o != null) {
            return new akck(this, new Object[0]);
        }
        return null;
    }

    @Override // defpackage.akfa
    public final void h() {
        String t;
        if (this.w.z(bvjk.j, null) == null) {
            this.B = null;
            return;
        }
        btlu b = b(bvjk.j);
        this.o = b;
        if (b == null || (t = b.t()) == null) {
            return;
        }
        btlw e = this.g.a().e(t);
        this.B = null;
        if (e == null) {
            return;
        }
        this.B = e.c();
    }

    @Override // defpackage.akfa
    public final synchronized boolean i() {
        return this.l.a().getEnableFeatureParameters().m;
    }

    @Override // defpackage.akfa
    public final synchronized btlu j() {
        return this.m;
    }

    @Override // defpackage.akfa
    public final btlu k() {
        deha.s(this.i);
        return j();
    }

    @Override // defpackage.akfa
    public final dehn<Void> l() {
        return this.i;
    }

    @Override // defpackage.akfa
    @dzsi
    public final Account m() {
        btlu j = j();
        if (j.l()) {
            return j.s();
        }
        return null;
    }

    @Override // defpackage.akfa
    @dzsi
    public final btlu n(String str) {
        if (str.equals(btlt.SIGNED_OUT.e)) {
            return btlu.b;
        }
        if (str.equals(btlt.UNKNOWN.e)) {
            return btlu.a;
        }
        if (str.startsWith(btlt.INCOGNITO.e)) {
            return btlu.B(str, btlt.INCOGNITO);
        }
        if (str.startsWith(btlt.SIGNED_OUT.e)) {
            return btlu.B(str, btlt.SIGNED_OUT);
        }
        if (str.startsWith(btlt.UNKNOWN.e)) {
            return btlu.B(str, btlt.UNKNOWN);
        }
        if (str.length() == 16) {
            return btlu.B(str, btlt.INCOGNITO);
        }
        akby akbyVar = this.c;
        Account[] u = u();
        bvrj.UI_THREAD.d();
        Arrays.toString(u);
        for (Account account : u) {
            if (str.equals(akbyVar.c(account))) {
                return btlu.a(str, account);
            }
        }
        return null;
    }

    @Override // defpackage.akfa
    @dzsi
    public final String o() {
        Account m = m();
        if (m != null) {
            return m.name;
        }
        return null;
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public final void onAccountsUpdated(final Account[] accountArr) {
        this.f.execute(new Runnable(this, accountArr) { // from class: akcd
            private final akcl a;
            private final Account[] b;

            {
                this.a = this;
                this.b = accountArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akcl akclVar = this.a;
                HashSet d = dcnm.d(this.b);
                synchronized (akclVar) {
                    Iterator<Map.Entry<btlu, Map<String, btue>>> it = akclVar.p.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<btlu, Map<String, btue>> next = it.next();
                        if (!d.contains(next.getKey().s())) {
                            next.getKey();
                            for (btue btueVar : next.getValue().values()) {
                                String b = btueVar.b();
                                if (b != null) {
                                    btueVar.c(b);
                                }
                            }
                            it.remove();
                        }
                    }
                }
                btlu j = akclVar.j();
                if (j.l() && !d.contains(j.s())) {
                    akclVar.r(akez.ACCOUNT_REMOVED);
                }
                akclVar.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p(btlu btluVar, Iterable<btlu> iterable) {
        btue z;
        ArrayList a2 = dchl.a();
        synchronized (this) {
            if (!this.m.m() || btluVar.m()) {
                boolean z2 = !btlu.g(this.m, btluVar);
                this.m = btluVar;
                q(btluVar);
                if (z2) {
                    this.p.clear();
                    if (!d()) {
                        btue y = y(this.h);
                        if (y != null) {
                            a2.add(y);
                        }
                        for (btlu btluVar2 : iterable) {
                            if (!btlu.g(btluVar2, btluVar) && (z = z(btluVar2, this.h)) != null) {
                                a2.add(z);
                            }
                        }
                    }
                    if (btluVar.f()) {
                        this.w.P(bvjk.i);
                        this.w.ac(bvjk.x, btluVar.s().name);
                    } else if (!btluVar.m() && btluVar.e != btls.AUTO_PICKED) {
                        this.w.ac(bvjk.i, btluVar.o() ? "*" : btluVar.d);
                        this.w.P(bvjk.x);
                    }
                }
                if (z2) {
                    this.t.a(a2);
                }
                E(btluVar);
                return z2;
            }
            return false;
        }
    }

    public final void q(btlu btluVar) {
        String t;
        if (btluVar.l() && (t = btluVar.t()) != null) {
            btlx btlxVar = new btlx(btluVar);
            btlxVar.b = this.g.a().e(t);
            btlw btlwVar = btlxVar.b;
            if (btlwVar == null) {
                btlxVar.a.w(null);
                btlxVar.a.x(null);
                btlxVar.a.y(null);
                btlxVar.a.z(null);
                btlxVar.a.A(false);
                return;
            }
            btlxVar.a.w(btlwVar.a());
            btlxVar.a.x(btlwVar.b());
            btlxVar.a.y(btlwVar.c());
            btlxVar.a.z(btlwVar.d());
            btlxVar.a.A(btlwVar.e());
        }
    }

    @Override // defpackage.akfa
    public final void r(akez akezVar) {
        ((ckcn) this.z.a().a(ckja.O)).a();
        btlu btluVar = new btlu(btlt.SIGNED_OUT);
        btluVar.e = btls.PICKED_BY_USER_OR_TASK;
        p(btluVar, dcdc.e());
        this.w.ai(bvjk.y, akezVar);
    }

    @Override // defpackage.akfa
    public final List<String> s() {
        L();
        ArrayList a2 = dchl.a();
        for (Account account : u()) {
            a2.add(account.name);
        }
        return a2;
    }

    @Override // defpackage.akfa
    public final List<btlu> t() {
        L();
        return J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Account[] u() {
        Account[] accountArr = new Account[0];
        try {
            return cmrb.d(this.b);
        } catch (Exception e) {
            try {
                throw e;
            } catch (RemoteException e2) {
                bvoo.j(e2);
                return accountArr;
            } catch (cnni e3) {
                bvoo.j(e3);
                return accountArr;
            } catch (cnnj e4) {
                cnmq.a.b(this.b, e4.a);
                return accountArr;
            } catch (SecurityException e5) {
                bvoo.f(e5);
                return accountArr;
            }
        }
    }

    @Override // defpackage.akfa
    public final dehn<List<btlu>> v() {
        return this.f.c(new Callable(this) { // from class: akce
            private final akcl a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                akcl akclVar = this.a;
                try {
                    try {
                        dccx F = dcdc.F();
                        try {
                            for (Account account : cmrb.d(akclVar.b)) {
                                F.g(akclVar.c.a(account));
                            }
                            return F.f();
                        } catch (RemoteException e) {
                            throw e;
                        } catch (cnni e2) {
                            throw e2;
                        } catch (cnnj e3) {
                            throw e3;
                        }
                    } catch (cmra e4) {
                        e = e4;
                        throw new akex(e);
                    } catch (IOException e5) {
                        e = e5;
                        throw new akex(e);
                    }
                } catch (RemoteException e6) {
                    e = e6;
                    throw new akex(e);
                } catch (cnni e7) {
                    e = e7;
                    throw new akex(e);
                } catch (cnnj e8) {
                    e = e8;
                    throw new akex(e);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w(@dzsi final akey akeyVar, final boolean z, final boolean z2) {
        if (z) {
            ((ckcn) this.z.a().a(ckja.N)).a();
        }
        if (akeyVar != null) {
            this.x.execute(new Runnable(z, akeyVar, z2) { // from class: akcf
                private final boolean a;
                private final akey b;
                private final boolean c;

                {
                    this.a = z;
                    this.b = akeyVar;
                    this.c = z2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z3 = this.a;
                    akey akeyVar2 = this.b;
                    boolean z4 = this.c;
                    String str = akcl.a;
                    if (z3) {
                        akeyVar2.a(z4);
                    } else {
                        akeyVar2.b();
                    }
                }
            });
        }
    }

    public final void x() {
        dcdc<btlu> J = J();
        bvjj bvjjVar = this.w;
        SharedPreferences.Editor edit = bvjjVar.d.edit();
        HashSet f = dcnm.f(J.size());
        HashMap f2 = dcjz.f(J.size());
        for (btlu btluVar : J) {
            String str = btluVar.s().name;
            f2.put(str, btluVar);
            if (!btluVar.f()) {
                String str2 = btluVar.d;
                f.add(str2);
                edit.putString(bvjj.a(bvjk.d.kz, str), str2);
            }
        }
        Pattern compile = Pattern.compile("^([^#$]+)([#$])(.*)$");
        for (Map.Entry<String, ?> entry : bvjjVar.d.getAll().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                Matcher matcher = compile.matcher(key);
                if (matcher.find()) {
                    String group = matcher.group(2);
                    dbsk.s(group);
                    if ("$".equals(group)) {
                        String group2 = matcher.group(3);
                        dbsk.s(group2);
                        if (!dbsj.d(group2) && !f.contains(group2)) {
                            edit.remove(key);
                        }
                    } else if ("#".equals(group)) {
                        String group3 = matcher.group(3);
                        dbsk.s(group3);
                        if (group3.isEmpty() || f2.containsKey(group3)) {
                            if (!bvjk.d.kz.equals(String.valueOf(matcher.group(1)).concat("#"))) {
                                String h = btlu.h((btlu) f2.get(group3));
                                if (!btlu.e(h)) {
                                    String group4 = matcher.group(1);
                                    dbsk.s(group4);
                                    String b = bvjj.b(group4, h);
                                    Object value = entry.getValue();
                                    if (!key.equals(b)) {
                                        edit.remove(key);
                                        if (value instanceof Boolean) {
                                            edit.putBoolean(b, ((Boolean) value).booleanValue());
                                        } else if (value instanceof Integer) {
                                            edit.putInt(b, ((Integer) value).intValue());
                                        } else if (value instanceof Long) {
                                            edit.putLong(b, ((Long) value).longValue());
                                        } else if (value instanceof Float) {
                                            edit.putFloat(b, ((Float) value).floatValue());
                                        } else if (value instanceof String) {
                                            edit.putString(b, (String) value);
                                        } else if (value instanceof Set) {
                                            edit.putStringSet(b, (Set) value);
                                        }
                                    }
                                }
                            }
                        } else {
                            edit.remove(key);
                        }
                    }
                }
            }
        }
        edit.apply();
        this.E.a(J);
    }

    @Override // defpackage.akfa
    @dzsi
    public final synchronized btue y(String str) {
        L();
        return z(this.m, str);
    }

    @dzsi
    public final synchronized btue z(btlu btluVar, String str) {
        L();
        if (btluVar.l() && this.m.l()) {
            btue btueVar = K(btluVar).get(str);
            if (btueVar != null) {
                return btueVar;
            }
            btua B = B(btluVar, str);
            K(btluVar).put(str, B);
            return B;
        }
        return null;
    }
}

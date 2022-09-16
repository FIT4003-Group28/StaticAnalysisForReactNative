package defpackage;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vzv  reason: default package */
/* loaded from: classes4.dex */
public final class vzv implements wac, wal {
    public final SharedPreferences a;
    public final wea b;
    public final vzo c;
    public final boolean d;
    private final Map e;
    private AccountIdentity f;
    private waj g;
    private boolean h;
    private volatile boolean i;
    private final azqb j;
    private final azqb k;

    public vzv(SharedPreferences sharedPreferences, wea weaVar, ywk ywkVar, azqb azqbVar, vzo vzoVar, azqb azqbVar2) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        weaVar.getClass();
        this.b = weaVar;
        this.c = vzoVar;
        azqbVar.getClass();
        this.k = azqbVar;
        this.j = azqbVar2;
        this.e = new HashMap();
        this.i = false;
        ywkVar.getClass();
        this.d = ywkVar.l(ywk.N);
    }

    private final AccountIdentity x() {
        int i = this.a.getInt(vzx.NEXT_INCOGNITO_SESSION_INDEX, 0);
        String a = vyp.a(i);
        while (this.c.b(a) != null) {
            i++;
            a = vyp.a(i);
        }
        this.a.edit().putInt(vzx.NEXT_INCOGNITO_SESSION_INDEX, i + 1).apply();
        return AccountIdentity.r(a, a);
    }

    private static final boolean y(amuk amukVar, String str) {
        return Collection.EL.stream(amukVar).anyMatch(new oll(str, 3));
    }

    private final void z(int i) {
        arrf a = arrh.a();
        aopa createBuilder = aowv.a.createBuilder();
        createBuilder.copyOnWrite();
        aowv aowvVar = (aowv) createBuilder.instance;
        aowvVar.e = i - 1;
        aowvVar.b |= 4;
        a.copyOnWrite();
        ((arrh) a.instance).bV((aowv) createBuilder.mo39build());
        ((acrq) this.j.get()).a((arrh) a.mo39build());
    }

    @Override // defpackage.wal
    public final synchronized waj a() {
        if (!t()) {
            return waj.a;
        }
        if (!this.h) {
            this.g = this.c.a(this.f);
            this.h = true;
        }
        return this.g;
    }

    @Override // defpackage.wal
    public final synchronized waj b(AccountIdentity accountIdentity) {
        return this.c.a(accountIdentity);
    }

    @Override // defpackage.afvn
    public final synchronized afvm c() {
        if (!this.i) {
            l();
        }
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity != null) {
            return accountIdentity;
        }
        return afvl.a;
    }

    @Override // defpackage.afvn
    public final afvm d(String str) {
        ylr.b();
        if (!this.i) {
            l();
        }
        if ("".equals(str)) {
            return afvl.a;
        }
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity == null || !accountIdentity.d().equals(str)) {
            if (str == null || !str.startsWith("incognito_session_")) {
                return this.c.b(str);
            }
            return AccountIdentity.r(str, str);
        }
        return this.f;
    }

    public final int e() {
        return this.a.getInt(vzx.IDENTITY_VERSION, 2);
    }

    @Override // defpackage.afwe
    public final synchronized String f() {
        if (u()) {
            return this.a.getString("incognito_visitor_id", null);
        } else if (!t() || !this.f.h()) {
            return this.a.getString("visitor_id", null);
        } else {
            return this.a.getString("persona_visitor_data", null);
        }
    }

    @Override // defpackage.afvn
    public final synchronized String g() {
        if (u()) {
            return this.a.getString("incognito_visitor_id", null);
        }
        return this.a.getString("visitor_id", null);
    }

    @Override // defpackage.wac
    public final List h(Account[] accountArr) {
        String[] strArr;
        String sb;
        ylr.b();
        accountArr.getClass();
        int length = accountArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = accountArr[i].name;
        }
        vzs vzsVar = (vzs) this.c;
        vzsVar.b.block();
        if (length == 0) {
            sb = null;
            strArr = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("account NOT IN (");
            for (int i2 = 0; i2 < length - 1; i2++) {
                sb2.append("?, ");
            }
            sb2.append("?)");
            strArr = strArr2;
            sb = sb2.toString();
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = vzsVar.a.getReadableDatabase().query("identity", vzz.a, sb, strArr, null, null, null, null);
        while (query.moveToNext()) {
            try {
                if (!query.isNull(0)) {
                    arrayList.add(vzs.g(query));
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    @Override // defpackage.wal
    public final synchronized void i() {
        if (!t()) {
            return;
        }
        this.g = waj.a;
        this.h = true;
    }

    @Override // defpackage.wal
    public final void j(AccountIdentity accountIdentity) {
        if (c().d().equals(accountIdentity.d())) {
            this.g = waj.a;
        }
        ((vzs) this.c).e("profile", "id = ?", new String[]{accountIdentity.d()});
    }

    @Override // defpackage.wac
    public final synchronized void k() {
        ankt q;
        wea weaVar = this.b;
        if (!wea.e(weaVar.c)) {
            q = anlz.q(((SharedPreferences) weaVar.a.get()).getString("pre_incognito_signed_in_user_id", ""));
        } else {
            q = anii.h(weaVar.d.a(), wdp.c, anjk.a);
        }
        ylx.k(q, anjk.a, new ylv() { // from class: vzt
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                vzv vzvVar = vzv.this;
                if (vzvVar.d) {
                    afus.b(1, 34, "Fail to fetch incognito previousSignedInIdentity");
                }
                vzvVar.a.edit().remove("incognito_visitor_id").apply();
                ylx.i(vzvVar.b.b(), lgj.e);
                vzvVar.r(false);
            }
        }, new ylw() { // from class: vzu
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                vzv vzvVar = vzv.this;
                String str = (String) obj;
                afvm afvmVar = null;
                if (str != null) {
                    afvmVar = vzvVar.c.b(str);
                } else if (vzvVar.d) {
                    afus.b(1, 34, "Fail to resolve incognito previousSignedInIdentity");
                }
                vzvVar.a.edit().remove("incognito_visitor_id").apply();
                ylx.i(vzvVar.b.b(), lgj.f);
                if (afvmVar != null) {
                    vzvVar.o((AccountIdentity) afvmVar);
                } else {
                    vzvVar.r(false);
                }
            }
        });
    }

    protected final synchronized void l() {
        if (!this.i) {
            AccountIdentity accountIdentity = null;
            String string = this.a.getString(vzx.ACCOUNT_NAME, null);
            String string2 = this.a.getString(vzx.EXTERNAL_ID, null);
            String string3 = this.a.getString(vzx.DATASYNC_ID, "");
            boolean z = this.a.getBoolean(vzx.IS_INCOGNITO, false);
            boolean z2 = this.a.getBoolean(vzx.PERSONA_ACCOUNT, false);
            boolean z3 = this.a.getBoolean(vzx.IS_UNICORN, false);
            boolean z4 = this.a.getBoolean(vzx.IS_GRIFFIN, false);
            boolean z5 = this.a.getBoolean(vzx.IS_TEENACORN, false);
            int c = apwt.c(this.a.getInt(vzx.DELEGTATION_TYPE, 1));
            String string4 = this.a.getString(vzx.PAGE_ID, null);
            String string5 = this.a.getString(vzx.DELEGATION_CONTEXT, "NO_DELEGATION_CONTEXT");
            if (true == "No +Page Delegate".equals(string4)) {
                string4 = "";
            }
            if (!"".equals(string3) || string2 == null) {
                if (!z && u()) {
                    accountIdentity = x();
                    o(accountIdentity);
                } else if (string != null && string2 != null) {
                    if (z) {
                        accountIdentity = AccountIdentity.r(string2, string3);
                    } else if (z2) {
                        accountIdentity = AccountIdentity.s(string2, string, string3);
                    } else if (z3) {
                        if (c == 0) {
                            throw null;
                        }
                        if (c == 3) {
                            accountIdentity = AccountIdentity.p(string2, string, string3);
                        } else {
                            accountIdentity = AccountIdentity.u(string2, string, string3, z5);
                        }
                    } else if (z4) {
                        if (c == 0) {
                            throw null;
                        }
                        if (c == 3) {
                            accountIdentity = AccountIdentity.o(string2, string, string3);
                        } else {
                            accountIdentity = AccountIdentity.q(string2, string, string3, z5);
                        }
                    } else if ("NO_DELEGATION_CONTEXT".equals(string5) || TextUtils.isEmpty(string5)) {
                        accountIdentity = AccountIdentity.n(string2, string, string4, string3);
                    } else {
                        accountIdentity = AccountIdentity.B(string2, string, string3, c, string5);
                    }
                }
            } else {
                if (this.d) {
                    afus.b(2, 34, "Data sync id is empty");
                }
                afus.b(2, 34, "[Clockwork][Database]Dropping pref acct w/ empty datasync id");
            }
            this.f = accountIdentity;
            this.h = false;
            this.g = waj.a;
            this.i = true;
        }
    }

    @Override // defpackage.wac
    public final void m(List list) {
        ylr.b();
        list.getClass();
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((AccountIdentity) list.get(i)).a();
        }
        vzs vzsVar = (vzs) this.c;
        vzsVar.b.block();
        if (size == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("account IN (");
        for (int i2 = 0; i2 < size - 1; i2++) {
            sb.append("?, ");
        }
        sb.append("?)");
        vzsVar.e("identity", sb.toString(), strArr);
    }

    @Override // defpackage.wac
    public final synchronized void n(String str, String str2) {
        if (t() && str.equals(this.f.a())) {
            this.f = AccountIdentity.n(this.f.d(), str2, this.f.e(), this.f.b());
            this.a.edit().putString(vzx.ACCOUNT_NAME, str2).apply();
        }
        vzo vzoVar = this.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", str2);
        ((vzs) vzoVar).b.close();
        ((vzs) vzoVar).c.execute(new vzp((vzs) vzoVar, contentValues, new String[]{str}));
    }

    @Override // defpackage.wac
    public final synchronized void o(AccountIdentity accountIdentity) {
        zgh.m(accountIdentity.d());
        zgh.m(accountIdentity.a());
        this.a.edit().putString(vzx.ACCOUNT_NAME, accountIdentity.a()).putString(vzx.PAGE_ID, accountIdentity.e()).putBoolean(vzx.PERSONA_ACCOUNT, accountIdentity.h()).putBoolean(vzx.IS_INCOGNITO, accountIdentity.g()).putString(vzx.EXTERNAL_ID, accountIdentity.d()).putInt(vzx.IDENTITY_VERSION, 2).putString(vzx.DATASYNC_ID, accountIdentity.b()).putBoolean(vzx.IS_UNICORN, accountIdentity.j()).putBoolean(vzx.IS_GRIFFIN, accountIdentity.f()).putBoolean(vzx.IS_TEENACORN, accountIdentity.i()).putInt(vzx.DELEGTATION_TYPE, accountIdentity.l() - 1).putString(vzx.DELEGATION_CONTEXT, accountIdentity.c()).apply();
        if (!accountIdentity.g()) {
            this.a.edit().putBoolean(vzx.USER_SIGNED_OUT, false).remove("incognito_visitor_id").apply();
            ylx.i(this.b.b(), lgj.h);
        }
        this.c.c(accountIdentity);
        if (!accountIdentity.g()) {
            this.e.put(accountIdentity.b(), accountIdentity);
        }
        this.f = accountIdentity;
        this.g = waj.a;
        this.h = false;
        this.i = true;
        ((whf) this.k.get()).b(accountIdentity);
    }

    @Override // defpackage.wac
    public final synchronized void p(String str) {
        ankt anktVar;
        if (t()) {
            String d = c().d();
            wea weaVar = this.b;
            weaVar.b = d;
            if (!wea.e(weaVar.c)) {
                ((SharedPreferences) weaVar.a.get()).edit().putString("pre_incognito_signed_in_user_id", d).apply();
                anktVar = ankq.a;
            } else {
                anktVar = wea.f(weaVar.d, d);
            }
            ylx.i(anktVar, lgj.g);
        }
        r(true);
        this.a.edit().putString("incognito_visitor_id", str).apply();
        o(x());
    }

    @Override // defpackage.wal
    public final synchronized void q(waj wajVar) {
        if (!t()) {
            return;
        }
        this.g = wajVar;
        this.h = true;
        vzo vzoVar = this.c;
        String d = this.f.d();
        if (wajVar != null && !wajVar.equals(waj.a)) {
            arag aragVar = wajVar.c;
            if (aragVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", d);
                contentValues.put("profile_account_name_proto", aragVar.toByteArray());
                vzs.h(contentValues, "profile_account_photo_thumbnails_proto", wajVar.e);
                vzs.h(contentValues, "profile_mobile_banner_thumbnails_proto", wajVar.f);
                ((vzs) vzoVar).f("profile", contentValues);
                return;
            }
            throw new IllegalArgumentException("accountNameProto cannot be null");
        }
    }

    @Override // defpackage.wac
    public final synchronized void r(boolean z) {
        this.a.edit().remove(vzx.ACCOUNT_NAME).remove(vzx.PAGE_ID).remove(vzx.PERSONA_ACCOUNT).remove(vzx.EXTERNAL_ID).remove(vzx.USERNAME).remove(vzx.DATASYNC_ID).remove(vzx.IS_UNICORN).remove(vzx.IS_GRIFFIN).remove(vzx.IS_TEENACORN).remove(vzx.DELEGTATION_TYPE).remove(vzx.DELEGATION_CONTEXT).putBoolean(vzx.USER_SIGNED_OUT, z).putInt(vzx.IDENTITY_VERSION, 2).apply();
        this.i = false;
        this.f = null;
        this.g = waj.a;
        this.h = true;
        ((whf) this.k.get()).b(afvl.a);
    }

    @Override // defpackage.wac
    public final synchronized boolean s() {
        return this.a.getBoolean(vzx.USER_SIGNED_OUT, false);
    }

    @Override // defpackage.afvn
    public final synchronized boolean t() {
        boolean z;
        if (!this.i) {
            l();
        }
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity != null) {
            if (!accountIdentity.g()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    final boolean u() {
        return this.a.getString("incognito_visitor_id", null) != null;
    }

    public final synchronized amuk v() {
        ylr.b();
        amuk d = ((vzs) this.c).d("(is_persona != 0 OR (page_id != \"\" AND page_id IS NOT NULL)) AND datasync_id != \"\"", "youtube-delegated");
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity == null) {
            return d;
        }
        if (!wey.b(accountIdentity).equals("youtube-delegated") || y(d, wey.c(accountIdentity))) {
            return d;
        }
        z(19);
        amuf f = amuk.f();
        f.j(d);
        f.h(wey.a(accountIdentity));
        return f.g();
    }

    public final synchronized amuk w() {
        ylr.b();
        amuk d = ((vzs) this.c).d("is_persona = 0 AND (page_id = \"\" OR page_id IS NULL) AND datasync_id != \"\"", "youtube-direct");
        AccountIdentity accountIdentity = this.f;
        if (accountIdentity == null) {
            z(20);
            return d;
        } else if (!wey.b(accountIdentity).equals("youtube-direct")) {
            z(24);
            return d;
        } else if (!y(d, wey.c(accountIdentity))) {
            z(18);
            amuf f = amuk.f();
            f.j(d);
            f.h(wey.a(accountIdentity));
            return f.g();
        } else {
            if (!d.isEmpty()) {
                if (((amxx) d).c == 1) {
                    z(22);
                } else {
                    z(23);
                }
            } else {
                z(21);
            }
            return d;
        }
    }
}

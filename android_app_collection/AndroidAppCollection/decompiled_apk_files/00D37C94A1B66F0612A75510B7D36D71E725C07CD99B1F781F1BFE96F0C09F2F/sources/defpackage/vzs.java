package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vzs  reason: default package */
/* loaded from: classes4.dex */
public final class vzs implements vzo {
    public final ymq a;
    public final ConditionVariable b;
    public final Executor c;
    private final azqb d;

    public vzs(Context context, Executor executor, azqb azqbVar) {
        this.a = new wab(context);
        executor.getClass();
        this.c = anlz.g(executor);
        this.d = azqbVar;
        this.b = new ConditionVariable(true);
    }

    public static final AccountIdentity g(Cursor cursor) {
        boolean z = false;
        if (cursor.getInt(3) == 1) {
            return AccountIdentity.s(cursor.getString(0), cursor.getString(1), cursor.getString(4));
        }
        if (cursor.getInt(5) == 1) {
            String string = cursor.getString(0);
            String string2 = cursor.getString(1);
            String string3 = cursor.getString(4);
            if (cursor.getInt(7) == 1) {
                z = true;
            }
            return AccountIdentity.u(string, string2, string3, z);
        } else if (cursor.getInt(6) == 1) {
            String string4 = cursor.getString(0);
            String string5 = cursor.getString(1);
            String string6 = cursor.getString(4);
            if (cursor.getInt(7) == 1) {
                z = true;
            }
            return AccountIdentity.q(string4, string5, string6, z);
        } else {
            return AccountIdentity.n(cursor.getString(0), cursor.getString(1), true ^ cursor.isNull(2) ? cursor.getString(2) : null, cursor.getString(4));
        }
    }

    public static final void h(ContentValues contentValues, String str, aalc aalcVar) {
        if (aalcVar == null || !aalcVar.f()) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, aalcVar.e().toByteArray());
        }
    }

    private final Cursor i(String str, String[] strArr, String str2) {
        return this.a.getReadableDatabase().query(str, strArr, "id = ?", new String[]{str2}, null, null, null, "1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        return defpackage.waj.a;
     */
    @Override // defpackage.vzo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.waj a(com.google.android.libraries.youtube.account.identity.AccountIdentity r7) {
        /*
            r6 = this;
            java.lang.String[] r0 = defpackage.waa.a
            java.lang.String r1 = r7.d()
            java.lang.String r2 = "profile"
            android.database.Cursor r0 = r6.i(r2, r0, r1)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            if (r1 == 0) goto L7d
            java.lang.String r7 = r7.a()     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r1 = 0
            boolean r2 = r0.isNull(r1)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            if (r2 == 0) goto L36
            waj r7 = new waj     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r1 = 3
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r2 = 4
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r3 = 5
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r7.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            goto L77
        L36:
            byte[] r1 = r0.getBlob(r1)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r2 = 1
            byte[] r2 = r0.getBlob(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r3 = 2
            byte[] r3 = r0.getBlob(r3)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            aoos r4 = defpackage.aoos.b()     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            arag r5 = defpackage.arag.a     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            aopi r1 = defpackage.aopi.parseFrom(r5, r1, r4)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            arag r1 = (defpackage.arag) r1     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r4 = 0
            if (r2 == 0) goto L61
            avhn r5 = defpackage.avhn.a     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            aopi r2 = defpackage.aopi.parseFrom(r5, r2)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            avhn r2 = (defpackage.avhn) r2     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            aalc r5 = new aalc     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            goto L62
        L61:
            r5 = r4
        L62:
            if (r3 == 0) goto L71
            avhn r2 = defpackage.avhn.a     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            aopi r2 = defpackage.aopi.parseFrom(r2, r3)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            avhn r2 = (defpackage.avhn) r2     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            aalc r4 = new aalc     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
        L71:
            waj r2 = new waj     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r2.<init>(r7, r1, r5, r4)     // Catch: java.lang.Throwable -> L83 defpackage.aopx -> L85
            r7 = r2
        L77:
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            return r7
        L7d:
            if (r0 == 0) goto L8e
        L7f:
            r0.close()
            goto L8e
        L83:
            r7 = move-exception
            goto L91
        L85:
            r7 = move-exception
            java.lang.String r1 = "Error parsing profile data"
            defpackage.zep.d(r1, r7)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L8e
            goto L7f
        L8e:
            waj r7 = defpackage.waj.a
            return r7
        L91:
            if (r0 != 0) goto L94
            goto L97
        L94:
            r0.close()
        L97:
            goto L99
        L98:
            throw r7
        L99:
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzs.a(com.google.android.libraries.youtube.account.identity.AccountIdentity):waj");
    }

    @Override // defpackage.vzo
    public final afvm b(String str) {
        AccountIdentity accountIdentity = null;
        if (str != null) {
            this.b.block();
            Cursor i = i("identity", vzz.a, str);
            try {
                if (i.moveToFirst()) {
                    accountIdentity = g(i);
                    if (i != null) {
                        return accountIdentity;
                    }
                } else if (i != null) {
                    i.close();
                    return null;
                }
            } finally {
                if (i != null) {
                    i.close();
                }
            }
        }
        return accountIdentity;
    }

    @Override // defpackage.vzo
    public final void c(AccountIdentity accountIdentity) {
        if (accountIdentity.g()) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", accountIdentity.d());
        contentValues.put("account", accountIdentity.a());
        contentValues.put("page_id", accountIdentity.e());
        contentValues.put("is_persona", Integer.valueOf(accountIdentity.h() ? 1 : 0));
        contentValues.put(vzx.DATASYNC_ID, accountIdentity.b());
        contentValues.put("is_unicorn", Integer.valueOf(accountIdentity.j() ? 1 : 0));
        contentValues.put("is_griffin", Integer.valueOf(accountIdentity.f() ? 1 : 0));
        contentValues.put("is_teenacorn", Integer.valueOf(accountIdentity.i() ? 1 : 0));
        f("identity", contentValues);
    }

    public final amuk d(String str, String str2) {
        this.b.block();
        int i = vzz.b;
        aqxo.p(true);
        Cursor query = this.a.getReadableDatabase().query("identity", vzz.a, str, null, null, null, null, null);
        try {
            if (query.getCount() == 0) {
                amuk q = amuk.q();
                if (query != null) {
                    query.close();
                }
                return q;
            }
            amuf amufVar = new amuf();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            while (query.moveToNext()) {
                String string = query.getString(4);
                if (TextUtils.isEmpty(string)) {
                    z = true;
                } else if (!arrayList.contains(string)) {
                    aopc aopcVar = (aopc) ambp.a.createBuilder();
                    aopcVar.copyOnWrite();
                    ambp ambpVar = (ambp) aopcVar.instance;
                    ambpVar.b |= 256;
                    ambpVar.i = str2;
                    aopcVar.copyOnWrite();
                    ambp ambpVar2 = (ambp) aopcVar.instance;
                    string.getClass();
                    ambpVar2.b |= 1;
                    ambpVar2.c = string;
                    amufVar.h((ambp) aopcVar.mo39build());
                    arrayList.add(string);
                }
            }
            if (z) {
                afus.b(2, 34, "[Clockwork][Database] getAccountInfos dropping empty datasyncid");
                arrf a = arrh.a();
                aopa createBuilder = aowv.a.createBuilder();
                createBuilder.copyOnWrite();
                aowv aowvVar = (aowv) createBuilder.instance;
                aowvVar.e = 16;
                aowvVar.b |= 4;
                a.copyOnWrite();
                ((arrh) a.instance).bV((aowv) createBuilder.mo39build());
                ((acrq) this.d.get()).a((arrh) a.mo39build());
            }
            amuk g = amufVar.g();
            if (query != null) {
                query.close();
            }
            return g;
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void e(String str, String str2, String[] strArr) {
        this.b.close();
        this.c.execute(new vzq(this, str, str2, strArr));
    }

    public final void f(String str, ContentValues contentValues) {
        this.b.close();
        this.c.execute(new vzr(this, str, contentValues));
    }
}

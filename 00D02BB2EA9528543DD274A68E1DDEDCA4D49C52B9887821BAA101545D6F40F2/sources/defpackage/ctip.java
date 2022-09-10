package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ctip  reason: default package */
/* loaded from: classes5.dex */
public final class ctip implements cusx {
    public final ctir a;
    private final Context b;

    public ctip(Context context, ctir ctirVar) {
        this.b = context;
        this.a = ctirVar;
    }

    private final Cursor j(String[] strArr, String str, String[] strArr2) {
        ctir ctirVar = this.a;
        String a = ctiw.a("reachability", "registration_id");
        String a2 = ctiw.a("registration", "registration_id");
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 43 + String.valueOf(a2).length());
        sb.append("reachability INNER JOIN registration ON ");
        sb.append(a);
        sb.append(" = ");
        sb.append(a2);
        return ctirVar.a(i(sb.toString()), strArr, str, strArr2, null, null);
    }

    private final void k(long j, Set<ContactId> set) {
        String a;
        for (ContactId contactId : set) {
            try {
                ctir ctirVar = this.a;
                Uri i = i("reachability");
                String[] strArr = new String[2];
                strArr[0] = Long.toString(j);
                if (contactId.c() == ContactId.ContactType.EMAIL) {
                    a = cstg.a(contactId.a());
                } else {
                    a = contactId.a();
                }
                strArr[1] = a;
                ctirVar.d(i, "registration_id =? AND reachability_normalized_id =? ", strArr);
            } catch (SQLException unused) {
                cstl.a("SQLiteRegStore");
            }
        }
    }

    public final void a(long j, ctzb ctzbVar) {
        String a;
        dbsg<ctyy> d = d(j);
        HashSet<ContactId> e = dcnm.e(ctzbVar.f());
        if (d.a()) {
            Set<ContactId> e2 = dcnm.e(d.b().b().f());
            e2.removeAll(e);
            k(j, e2);
        }
        for (ContactId contactId : e) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("reachability_id", contactId.a());
            if (contactId.c() == ContactId.ContactType.EMAIL) {
                a = cstg.a(contactId.a());
            } else {
                a = contactId.a();
            }
            contentValues.put("reachability_normalized_id", a);
            contentValues.put("reachability_type", Integer.valueOf(contactId.c().f));
            contentValues.put("registration_id", Long.valueOf(j));
            this.a.b(i("reachability"), contentValues, 5);
        }
    }

    @Override // defpackage.cusx
    public final dbsg<ctyy> b(ContactId contactId) {
        this.a.e();
        try {
            try {
                dbsg<ctyy> dbsgVar = dbpy.a;
                Cursor f = f(contactId);
                try {
                    if (f.moveToFirst()) {
                        dbsgVar = d(f.getInt(ctmf.a(1)));
                    }
                    if (f != null) {
                        f.close();
                    }
                    this.a.h();
                    return dbsgVar;
                } catch (Throwable th) {
                    if (f != null) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                throw new SQLException("Error when executing transaction!!", e);
            }
        } finally {
            this.a.f();
        }
    }

    @Override // defpackage.cusx
    public final dbsg<ctzp> c(ctyy ctyyVar) {
        Cursor e = e(ctyyVar.b());
        try {
            if (!e.moveToFirst()) {
                dbpy<Object> dbpyVar = dbpy.a;
                if (e != null) {
                    e.close();
                }
                return dbpyVar;
            }
            ctzm f = ctzp.f();
            ((cucn) f).a = Long.valueOf(e.getLong(ctmf.a(4)));
            ((cucn) f).b = Long.valueOf(e.getLong(ctmf.a(10)));
            f.c(cstp.b(e.getBlob(ctmf.a(3))));
            dbsg<KeyPair> a = ctkg.a(e.getBlob(ctmf.a(6)), e.getBlob(ctmf.a(7)));
            if (a.a()) {
                f.d(a.b());
            }
            dbsg<ctzp> i = dbsg.i(f.a());
            if (e != null) {
                e.close();
            }
            return i;
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    public final dbsg<ctyy> d(long j) {
        dbsk.l(this.a.g());
        Cursor j2 = j(ctiw.c(ctiw.b("registration", ctmg.a), ctiw.b("reachability", ctme.a)), "registration.registration_id =? ", new String[]{Long.toString(j)});
        try {
            if (!j2.moveToFirst()) {
                if (j2 != null) {
                    j2.close();
                }
                return dbpy.a;
            }
            String string = j2.getString(j2.getColumnIndex("tachyon_app_name"));
            long j3 = j2.getLong(j2.getColumnIndex("registration_id"));
            byte[] blob = j2.getBlob(j2.getColumnIndex("server_registration_id"));
            final int i = j2.getInt(j2.getColumnIndex("server_registration_status"));
            ctza g = ctzb.g();
            g.e(string);
            HashSet hashSet = new HashSet();
            do {
                String string2 = j2.getString(j2.getColumnIndex("reachability_id"));
                int ordinal = ContactId.ContactType.a(j2.getInt(j2.getColumnIndex("reachability_type"))).ordinal();
                if (ordinal == 1) {
                    hashSet.add(string2);
                } else if (ordinal == 2) {
                    g.c(string2);
                } else if (ordinal == 4) {
                    g.b(string2);
                }
            } while (j2.moveToNext());
            g.d(hashSet);
            ctyv f = ctyy.f();
            f.c(j3);
            f.d(dspd.x(blob));
            f.f(g);
            f.e((ctyx) dcbg.c(ctyx.values()).r(new dbsl(i) { // from class: ctyw
                private final int a;

                {
                    this.a = i;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    int i2 = this.a;
                    ctyx ctyxVar = ctyx.VALID;
                    return ((ctyx) obj).c == i2;
                }
            }).c(ctyx.VALID));
            dbsg<ctyy> i2 = dbsg.i(f.a());
            if (j2 != null) {
                j2.close();
            }
            return i2;
        } catch (Throwable th) {
            if (j2 != null) {
                try {
                    j2.close();
                } catch (Throwable th2) {
                    deki.a(th, th2);
                }
            }
            throw th;
        }
    }

    public final Cursor e(ctzb ctzbVar) {
        Cursor f = f(ctzbVar.e());
        dcdc<ContactId> f2 = ctzbVar.f();
        int size = f2.size();
        for (int i = 0; i < size; i++) {
            ContactId contactId = f2.get(i);
            if (f.moveToFirst()) {
                return f;
            }
            f = f(contactId);
        }
        return f;
    }

    public final Cursor f(ContactId contactId) {
        String a;
        String[] strArr = new String[3];
        if (contactId.c() == ContactId.ContactType.EMAIL) {
            a = cstg.a(contactId.a());
        } else {
            a = contactId.a();
        }
        strArr[0] = a;
        strArr[1] = String.valueOf(contactId.c().f);
        strArr[2] = contactId.b();
        return j(ctiw.b("registration", ctmg.a), "reachability_normalized_id =? AND reachability_type =? AND tachyon_app_name =?", strArr);
    }

    @Override // defpackage.cusx
    public final boolean g(ctyy ctyyVar) {
        String a;
        ContactId e = ctyyVar.b().e();
        try {
            ctir ctirVar = this.a;
            Uri i = i("registration");
            String a2 = ctiw.a("reachability", "registration_id");
            String a3 = ctiw.a("registration", "registration_id");
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 203 + String.valueOf(a3).length());
            sb.append("registration.registration_id IN (SELECT registration.registration_id FROM reachability INNER JOIN registration ON ");
            sb.append(a2);
            sb.append(" = ");
            sb.append(a3);
            sb.append(" WHERE ");
            sb.append("reachability_normalized_id");
            sb.append(" =? AND ");
            sb.append("reachability_type");
            sb.append(" =? AND ");
            sb.append("tachyon_app_name");
            sb.append(" =?)");
            String sb2 = sb.toString();
            String[] strArr = new String[3];
            if (e.c() == ContactId.ContactType.EMAIL) {
                a = cstg.a(e.a());
            } else {
                a = e.a();
            }
            strArr[0] = a;
            strArr[1] = String.valueOf(e.c().f);
            strArr[2] = e.b();
            ctirVar.d(i, sb2, strArr);
            return true;
        } catch (SQLException unused) {
            cstl.a("SQLiteRegStore");
            return false;
        }
    }

    public final boolean h(final ContactId contactId, final ContentValues contentValues) {
        return ((Boolean) ctiv.b(this.a, new Callable(this, contactId, contentValues) { // from class: ctio
            private final ctip a;
            private final ContactId b;
            private final ContentValues c;

            {
                this.a = this;
                this.b = contactId;
                this.c = contentValues;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                long j;
                ctip ctipVar = this.a;
                ContactId contactId2 = this.b;
                ContentValues contentValues2 = this.c;
                Cursor f = ctipVar.f(contactId2);
                try {
                    boolean z = false;
                    if (f.moveToFirst()) {
                        j = f.getInt(ctmf.a(1));
                        ctipVar.a.c(ctipVar.i("registration"), contentValues2, "registration_id =? AND tachyon_app_name =?", new String[]{Long.toString(j), contactId2.b()});
                    } else {
                        j = -1;
                    }
                    if (f != null) {
                        f.close();
                    }
                    if (j != -1) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    if (f != null) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            deki.a(th, th2);
                        }
                    }
                    throw th;
                }
            }
        })).booleanValue();
    }

    public final Uri i(String str) {
        return ctiw.f(String.valueOf(this.b.getPackageName()).concat(".lighter.data"), "REGISTRATION", str, new String[0]);
    }
}

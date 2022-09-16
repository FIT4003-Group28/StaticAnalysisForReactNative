package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: udd  reason: default package */
/* loaded from: classes4.dex */
public final class udd {
    private final Context a;
    private final ucs b;
    private final axnm c;
    private final snc d;
    private final HashMap e = new HashMap();

    public udd(Context context, ucs ucsVar, axnm axnmVar, snc sncVar) {
        this.a = context;
        this.b = ucsVar;
        this.c = axnmVar;
        this.d = sncVar;
    }

    private final synchronized udb f(String str) {
        Long l;
        l = -1L;
        if (str != null) {
            l = this.b.b(str).a;
        }
        if (!this.e.containsKey(l)) {
            this.e.put(l, new udb(this.a, l.longValue()));
        }
        return (udb) this.e.get(l);
    }

    private final synchronized amup g(String str, SQLiteDatabase sQLiteDatabase, vfl vflVar) {
        amup b;
        Cursor query = sQLiteDatabase.query("threads", null, vflVar.a, vflVar.a(), null, null, "last_notification_version DESC", null);
        amum h = amup.h();
        while (query.moveToNext()) {
            try {
                uco b2 = ucw.b();
                b2.e(query.getString(uid.f(query, "thread_id")));
                b2.i(akel.J(query.getInt(uid.f(query, "read_state"))));
                b2.g(akel.L(query.getInt(uid.f(query, "count_behavior"))));
                b2.k(akel.G(query.getInt(uid.f(query, "system_tray_behavior"))));
                b2.a = Long.valueOf(query.getLong(uid.f(query, "last_updated__version")));
                b2.b = Long.valueOf(query.getLong(uid.f(query, "last_notification_version")));
                b2.d = query.getString(uid.f(query, "payload_type"));
                b2.f(uid.l(query, aomc.a, "notification_metadata"));
                List<aols> l = uid.l(query, aols.a, "actions");
                ArrayList arrayList = new ArrayList();
                for (aols aolsVar : l) {
                    ampq a = uct.a(aolsVar);
                    if (a.h()) {
                        arrayList.add((uct) a.c());
                    }
                }
                b2.b(arrayList);
                b2.c = Long.valueOf(query.getLong(uid.f(query, "creation_id")));
                b2.c((aolz) uid.k(query, aolz.a, "rendered_message"));
                b2.e = (aono) uid.k(query, aono.a, "payload");
                b2.f = query.getString(uid.f(query, "update_thread_state_token"));
                b2.d(query.getString(uid.f(query, "group_id")));
                b2.g = Long.valueOf(query.getLong(uid.f(query, "expiration_timestamp")));
                b2.h = Long.valueOf(query.getLong(uid.f(query, "thread_stored_timestamp")));
                b2.j(akel.I(query.getInt(uid.f(query, "storage_mode"))));
                b2.h(akel.K(query.getInt(uid.f(query, "deletion_status"))));
                h.f(b2.a(), Long.valueOf(query.getLong(uid.f(query, "reference"))));
            } catch (udf unused) {
                uep c = ((ues) this.c.get()).c(41);
                ((ueu) c).l = str;
                c.i();
            }
        }
        b = h.b();
        if (query != null) {
            query.close();
        }
        return b;
    }

    private final synchronized void h(String str, vfl vflVar, List list) {
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                amzt listIterator = ((amuk) list).listIterator();
                while (listIterator.hasNext()) {
                    vfl vflVar2 = (vfl) listIterator.next();
                    vfm b = vfm.b();
                    b.c("UPDATE ");
                    b.c("threads");
                    b.c(" SET ");
                    b.c(vflVar.a);
                    b.c(" WHERE ");
                    b.c(vflVar2.a);
                    String str2 = b.a().a;
                    String[] a = vflVar.a();
                    String[] a2 = vflVar2.a();
                    int length = a.length;
                    int length2 = a2.length;
                    Object[] a3 = amxp.a(String.class, length + length2);
                    System.arraycopy(a, 0, a3, 0, length);
                    System.arraycopy(a2, 0, a3, length, length2);
                    writableDatabase.execSQL(str2, a3);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (writableDatabase == null) {
                    return;
                }
                writableDatabase.close();
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException | ucr e) {
            uev.c("ChimeThreadStorageHelper", e, "Error updating ChimeThread for %s. Set: %s, Queries: %s", str, vflVar, list);
        }
    }

    public final synchronized amuk a(String str, List list) {
        amuf f = amuk.f();
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                amzt listIterator = ((amuk) list).listIterator();
                while (listIterator.hasNext()) {
                    f.j(g(str, writableDatabase, (vfl) listIterator.next()).keySet());
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                amuk g = f.g();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                return g;
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException | ucr e) {
            uev.c("ChimeThreadStorageHelper", e, "Error getting ChimeThreads for %s. Queries: %s", str, list);
            return amuk.q();
        }
    }

    public final synchronized void b(String str, List list) {
        vfm b = vfm.b();
        b.c("reference");
        b.c(" = ");
        b.c("reference");
        b.d(" & ~?", 1L);
        h(str, b.a(), list);
    }

    public final synchronized int c(String str, ucw ucwVar, boolean z) {
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues(16);
                contentValues.put("thread_id", ucwVar.a);
                int i = ucwVar.o;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                contentValues.put("read_state", Integer.valueOf(i2));
                int i3 = ucwVar.q;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                contentValues.put("count_behavior", Integer.valueOf(i4));
                int i5 = ucwVar.r;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                contentValues.put("system_tray_behavior", Integer.valueOf(i6));
                contentValues.put("last_updated__version", ucwVar.b);
                contentValues.put("last_notification_version", ucwVar.c);
                contentValues.put("payload_type", ucwVar.g);
                contentValues.put("update_thread_state_token", ucwVar.i);
                contentValues.put("group_id", ucwVar.j);
                contentValues.put("expiration_timestamp", ucwVar.k);
                contentValues.put("thread_stored_timestamp", Long.valueOf(this.d.c()));
                contentValues.put("locally_removed", (Boolean) false);
                int i7 = ucwVar.s;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                contentValues.put("storage_mode", Integer.valueOf(i8));
                contentValues.put("creation_id", ucwVar.f);
                contentValues.put("reference", (Long) 1L);
                int i9 = ucwVar.p;
                int i10 = i9 - 1;
                if (i9 == 0) {
                    throw null;
                }
                contentValues.put("deletion_status", Integer.valueOf(i10));
                aolz aolzVar = ucwVar.d;
                if (aolzVar != null) {
                    contentValues.put("rendered_message", aolzVar.toByteArray());
                }
                if (!ucwVar.e.isEmpty()) {
                    aopa createBuilder = uio.a.createBuilder();
                    for (aomc aomcVar : ucwVar.e) {
                        aopa createBuilder2 = aono.a.createBuilder();
                        aoob byteString = aomcVar.toByteString();
                        createBuilder2.copyOnWrite();
                        ((aono) createBuilder2.instance).c = byteString;
                        createBuilder.C((aono) createBuilder2.mo39build());
                    }
                    contentValues.put("notification_metadata", ((uio) createBuilder.mo39build()).toByteArray());
                }
                if (!ucwVar.n.isEmpty()) {
                    aopa createBuilder3 = uio.a.createBuilder();
                    for (uct uctVar : ucwVar.n) {
                        aopa createBuilder4 = aono.a.createBuilder();
                        aoob byteString2 = uctVar.b().toByteString();
                        createBuilder4.copyOnWrite();
                        ((aono) createBuilder4.instance).c = byteString2;
                        createBuilder3.C((aono) createBuilder4.mo39build());
                    }
                    contentValues.put("actions", ((uio) createBuilder3.mo39build()).toByteArray());
                }
                aono aonoVar = ucwVar.h;
                if (aonoVar != null) {
                    contentValues.put("payload", aonoVar.toByteArray());
                }
                vfm b = vfm.b();
                b.c("thread_id");
                b.d(" = ?", ucwVar.a);
                vfl a = b.a();
                amup g = g(str, writableDatabase, a);
                if (g.isEmpty()) {
                    writableDatabase.insertWithOnConflict("threads", null, contentValues, 4);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return 1;
                }
                ucw ucwVar2 = (ucw) g.keySet().g().get(0);
                long longValue = ucwVar2.b.longValue();
                long longValue2 = ucwVar.b.longValue();
                boolean z2 = ucwVar2.b.equals(ucwVar.b) && !ucwVar2.equals(ucwVar);
                if (longValue >= longValue2 && (!z || !z2)) {
                    writableDatabase.endTransaction();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                    return 3;
                }
                writableDatabase.update("threads", contentValues, a.a, a.a());
                writableDatabase.setTransactionSuccessful();
                int i11 = (((Long) g.get(ucwVar2)).longValue() & 1) > 0 ? 2 : 1;
                writableDatabase.endTransaction();
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                return i11;
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException | ucr e) {
            uev.c("ChimeThreadStorageHelper", e, "Error inserting ChimeThread for account: %s, %s", str, ucwVar);
            return 4;
        }
    }

    public final synchronized void d(String str) {
        try {
            this.a.deleteDatabase(f(str).getDatabaseName());
        } catch (RuntimeException | ucr e) {
            uev.c("ChimeThreadStorageHelper", e, "Error deleting database for %s", str);
        }
    }

    public final synchronized void e(String str, List list) {
        try {
            SQLiteDatabase writableDatabase = f(str).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                amzt listIterator = ((amuk) list).listIterator();
                while (listIterator.hasNext()) {
                    vfl vflVar = (vfl) listIterator.next();
                    writableDatabase.delete("threads", vflVar.a, vflVar.a());
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                if (writableDatabase == null) {
                    return;
                }
                writableDatabase.close();
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (RuntimeException | ucr e) {
            uev.c("ChimeThreadStorageHelper", e, "Error deleting ChimeThreads for %s. Queries: %s", str, list);
        }
    }
}

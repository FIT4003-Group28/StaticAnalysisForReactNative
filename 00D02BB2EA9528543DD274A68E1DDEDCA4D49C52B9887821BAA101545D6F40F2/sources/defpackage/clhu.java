package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: clhu  reason: default package */
/* loaded from: classes5.dex */
public final class clhu implements clgu, clif {
    private static final clct b = clct.a("proto");
    public final clgw a;
    private final clib c;
    private final clig d;
    private final clig e;

    public clhu(clig cligVar, clig cligVar2, clgw clgwVar, clib clibVar) {
        this.c = clibVar;
        this.d = cligVar;
        this.e = cligVar2;
        this.a = clgwVar;
    }

    public static clct j(String str) {
        return str == null ? b : clct.a(str);
    }

    public static <T> T l(Cursor cursor, clhr<Cursor, T> clhrVar) {
        try {
            return clhrVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    public static final Long m(SQLiteDatabase sQLiteDatabase, clew clewVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(clewVar.a(), String.valueOf(clil.b(clewVar.c()))));
        if (clewVar.b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(clewVar.b(), 0));
        }
        return (Long) l(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), clhk.a);
    }

    private static String n(Iterable<clgz> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<clgz> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    private final <T> T o(clht<T> clhtVar, clhr<Throwable, T> clhrVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                return clhtVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (SystemClock.elapsedRealtime() < this.a.c() + elapsedRealtime) {
                    SystemClock.sleep(50L);
                } else {
                    return clhrVar.a(e);
                }
            }
        }
    }

    private final <T> T p(clhr<SQLiteDatabase, T> clhrVar) {
        SQLiteDatabase i = i();
        i.beginTransaction();
        try {
            T a = clhrVar.a(i);
            i.setTransactionSuccessful();
            return a;
        } finally {
            i.endTransaction();
        }
    }

    @Override // defpackage.clgu
    public final void a(Iterable<clgz> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        String valueOf = String.valueOf(n(iterable));
        final String concat = valueOf.length() != 0 ? "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(valueOf) : new String("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
        p(new clhr(concat) { // from class: clhl
            private final String a;

            {
                this.a = concat;
            }

            @Override // defpackage.clhr
            public final Object a(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                sQLiteDatabase.compileStatement(this.a).execute();
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
                return null;
            }
        });
    }

    @Override // defpackage.clgu
    public final void b(Iterable<clgz> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        String valueOf = String.valueOf(n(iterable));
        i().compileStatement(valueOf.length() != 0 ? "DELETE FROM events WHERE _id in ".concat(valueOf) : new String("DELETE FROM events WHERE _id in ")).execute();
    }

    @Override // defpackage.clgu
    public final long c(clew clewVar) {
        return ((Long) l(i().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{clewVar.a(), String.valueOf(clil.b(clewVar.c()))}), clhm.a)).longValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.clgu
    public final void d(final clew clewVar, final long j) {
        p(new clhr(j, clewVar) { // from class: clho
            private final long a;
            private final clew b;

            {
                this.a = j;
                this.b = clewVar;
            }

            @Override // defpackage.clhr
            public final Object a(Object obj) {
                long j2 = this.a;
                clew clewVar2 = this.b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j2));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{clewVar2.a(), String.valueOf(clil.b(clewVar2.c()))}) <= 0) {
                    contentValues.put("backend_name", clewVar2.a());
                    contentValues.put("priority", Integer.valueOf(clil.b(clewVar2.c())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // defpackage.clgu
    public final boolean e(final clew clewVar) {
        return ((Boolean) p(new clhr(this, clewVar) { // from class: clhn
            private final clhu a;
            private final clew b;

            {
                this.a = this;
                this.b = clewVar;
            }

            @Override // defpackage.clhr
            public final Object a(Object obj) {
                clhu clhuVar = this.a;
                Long m = clhu.m((SQLiteDatabase) obj, this.b);
                if (m == null) {
                    return false;
                }
                return (Boolean) clhu.l(clhuVar.i().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m.toString()}), clhi.a);
            }
        })).booleanValue();
    }

    @Override // defpackage.clgu
    public final Iterable<clgz> f(final clew clewVar) {
        return (Iterable) p(new clhr(this, clewVar) { // from class: clhp
            private final clhu a;
            private final clew b;

            {
                this.a = this;
                this.b = clewVar;
            }

            @Override // defpackage.clhr
            public final Object a(Object obj) {
                char c;
                clhu clhuVar = this.a;
                clew clewVar2 = this.b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ArrayList arrayList = new ArrayList();
                Long m = clhu.m(sQLiteDatabase, clewVar2);
                if (m != null) {
                    c = 1;
                    clhu.l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m.toString()}, null, null, null, String.valueOf(clhuVar.a.b())), new clhr(clhuVar, arrayList, clewVar2) { // from class: clhc
                        private final clhu a;
                        private final List b;
                        private final clew c;

                        {
                            this.a = clhuVar;
                            this.b = arrayList;
                            this.c = clewVar2;
                        }

                        @Override // defpackage.clhr
                        public final Object a(Object obj2) {
                            clhu clhuVar2 = this.a;
                            List list = this.b;
                            clew clewVar3 = this.c;
                            Cursor cursor = (Cursor) obj2;
                            while (cursor.moveToNext()) {
                                long j = cursor.getLong(0);
                                int i = cursor.getInt(7);
                                clek clekVar = new clek();
                                clekVar.b = new HashMap();
                                clekVar.d(cursor.getString(1));
                                clekVar.c(cursor.getLong(2));
                                clekVar.e(cursor.getLong(3));
                                if (i != 0) {
                                    clekVar.b(new cleq(clhu.j(cursor.getString(4)), cursor.getBlob(5)));
                                } else {
                                    clekVar.b(new cleq(clhu.j(cursor.getString(4)), (byte[]) clhu.l(clhuVar2.i().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), clhd.a)));
                                }
                                if (!cursor.isNull(6)) {
                                    clekVar.a = Integer.valueOf(cursor.getInt(6));
                                }
                                list.add(clgz.d(j, clewVar3, clekVar.a()));
                            }
                            return null;
                        }
                    });
                } else {
                    c = 1;
                }
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append(((clgz) arrayList.get(i)).a());
                    if (i < arrayList.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                String[] strArr = new String[3];
                strArr[0] = "event_id";
                strArr[c] = "name";
                strArr[2] = "value";
                clhu.l(sQLiteDatabase.query("event_metadata", strArr, sb.toString(), null, null, null, null), new clhr(hashMap) { // from class: clhe
                    private final Map a;

                    {
                        this.a = hashMap;
                    }

                    @Override // defpackage.clhr
                    public final Object a(Object obj2) {
                        Map map = this.a;
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            Long valueOf = Long.valueOf(cursor.getLong(0));
                            Set set = (Set) map.get(valueOf);
                            if (set == null) {
                                set = new HashSet();
                                map.put(valueOf, set);
                            }
                            set.add(new clhs(cursor.getString(1), cursor.getString(2)));
                        }
                        return null;
                    }
                });
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    clgz clgzVar = (clgz) listIterator.next();
                    if (hashMap.containsKey(Long.valueOf(clgzVar.a()))) {
                        cles c2 = clgzVar.c();
                        clek clekVar = new clek();
                        clekVar.d(c2.a());
                        clekVar.a = c2.b();
                        clekVar.b(c2.c());
                        clekVar.c(c2.d());
                        clekVar.e(c2.e());
                        clekVar.b = new HashMap(c2.f());
                        for (clhs clhsVar : (Set) hashMap.get(Long.valueOf(clgzVar.a()))) {
                            String str = clhsVar.a;
                            String str2 = clhsVar.b;
                            Map<String, String> map = clekVar.b;
                            if (map == null) {
                                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                            }
                            map.put(str, str2);
                        }
                        listIterator.set(clgz.d(clgzVar.a(), clgzVar.b(), clekVar.a()));
                    }
                }
                return arrayList;
            }
        });
    }

    @Override // defpackage.clgu
    public final Iterable<clew> g() {
        return (Iterable) p(clhq.a);
    }

    @Override // defpackage.clgu
    public final int h() {
        final long currentTimeMillis = System.currentTimeMillis() - this.a.d();
        return ((Integer) p(new clhr(currentTimeMillis) { // from class: clhb
            private final long a;

            {
                this.a = currentTimeMillis;
            }

            @Override // defpackage.clhr
            public final Object a(Object obj) {
                return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.a)}));
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase i() {
        final clib clibVar = this.c;
        clibVar.getClass();
        return (SQLiteDatabase) o(new clht(clibVar) { // from class: clha
            private final clib a;

            {
                this.a = clibVar;
            }

            @Override // defpackage.clht
            public final Object a() {
                return this.a.getWritableDatabase();
            }
        }, clhj.a);
    }

    @Override // defpackage.clif
    public final <T> T k(clie<T> clieVar) {
        final SQLiteDatabase i = i();
        o(new clht(i) { // from class: clhf
            private final SQLiteDatabase a;

            {
                this.a = i;
            }

            @Override // defpackage.clht
            public final Object a() {
                this.a.beginTransaction();
                return null;
            }
        }, clhg.a);
        try {
            T a = clieVar.a();
            i.setTransactionSuccessful();
            return a;
        } finally {
            i.endTransaction();
        }
    }
}

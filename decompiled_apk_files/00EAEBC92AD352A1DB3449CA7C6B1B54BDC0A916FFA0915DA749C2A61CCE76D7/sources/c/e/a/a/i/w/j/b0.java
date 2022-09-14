package c.e.a.a.i.w.j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c.e.a.a.i.h;
import c.e.a.a.i.m;
import c.e.a.a.i.x.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class b0 implements c.e.a.a.i.w.j.c, c.e.a.a.i.x.b {

    /* renamed from: f  reason: collision with root package name */
    private static final c.e.a.a.b f3773f = c.e.a.a.b.a("proto");

    /* renamed from: b  reason: collision with root package name */
    private final h0 f3774b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.y.a f3775c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.i.y.a f3776d;

    /* renamed from: e  reason: collision with root package name */
    private final c.e.a.a.i.w.j.d f3777e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f3778a;

        /* renamed from: b  reason: collision with root package name */
        final String f3779b;

        private c(String str, String str2) {
            this.f3778a = str;
            this.f3779b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(c.e.a.a.i.y.a aVar, c.e.a.a.i.y.a aVar2, c.e.a.a.i.w.j.d dVar, h0 h0Var) {
        this.f3774b = h0Var;
        this.f3775c = aVar;
        this.f3776d = aVar2;
        this.f3777e = dVar;
    }

    private long a(SQLiteDatabase sQLiteDatabase, c.e.a.a.i.m mVar) {
        Long b2 = b(sQLiteDatabase, mVar);
        if (b2 != null) {
            return b2.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", mVar.a());
        contentValues.put("priority", Integer.valueOf(c.e.a.a.i.z.a.a(mVar.c())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (mVar.b() != null) {
            contentValues.put("extras", Base64.encodeToString(mVar.b(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean a(b0 b0Var, c.e.a.a.i.m mVar, SQLiteDatabase sQLiteDatabase) {
        Long b2 = b0Var.b(sQLiteDatabase, mVar);
        if (b2 == null) {
            return false;
        }
        return (Boolean) a(b0Var.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b2.toString()}), u.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Long a(b0 b0Var, c.e.a.a.i.m mVar, c.e.a.a.i.h hVar, SQLiteDatabase sQLiteDatabase) {
        if (b0Var.d()) {
            return -1L;
        }
        long a2 = b0Var.a(sQLiteDatabase, mVar);
        int d2 = b0Var.f3777e.d();
        byte[] a3 = hVar.c().a();
        boolean z = a3.length <= d2;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(a2));
        contentValues.put("transport_name", hVar.f());
        contentValues.put("timestamp_ms", Long.valueOf(hVar.d()));
        contentValues.put("uptime_ms", Long.valueOf(hVar.g()));
        contentValues.put("payload_encoding", hVar.c().b().a());
        contentValues.put("code", hVar.b());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a3 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a3.length / d2);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a3, (i - 1) * d2, Math.min(i * d2, a3.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : hVar.e().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(long j, c.e.a.a.i.m mVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{mVar.a(), String.valueOf(c.e.a.a.i.z.a.a(mVar.c()))}) < 1) {
            contentValues.put("backend_name", mVar.a());
            contentValues.put("priority", Integer.valueOf(c.e.a.a.i.z.a.a(mVar.c())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private static <T> T a(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.a(cursor);
        } finally {
            cursor.close();
        }
    }

    private <T> T a(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase a2 = a();
        a2.beginTransaction();
        try {
            T a3 = bVar.a(a2);
            a2.setTransactionSuccessful();
            return a3;
        } finally {
            a2.endTransaction();
        }
    }

    private <T> T a(d<T> dVar, b<Throwable, T> bVar) {
        long a2 = this.f3776d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f3776d.a() >= this.f3777e.a() + a2) {
                    return bVar.a(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(b0 b0Var, List list, c.e.a.a.i.m mVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            h.a i = c.e.a.a.i.h.i();
            i.a(cursor.getString(1));
            i.a(cursor.getLong(2));
            i.b(cursor.getLong(3));
            i.a(z ? new c.e.a.a.i.g(b(cursor.getString(4)), cursor.getBlob(5)) : new c.e.a.a.i.g(b(cursor.getString(4)), b0Var.a(j)));
            if (!cursor.isNull(6)) {
                i.a(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(i.a(j, mVar, i.a()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(String str, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 10").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(Throwable th) {
        throw new c.e.a.a.i.x.a("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    private List<i> a(List<i> list, Map<Long, Set<c>> map) {
        ListIterator<i> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            i next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.b()))) {
                h.a h2 = next.a().h();
                for (c cVar : map.get(Long.valueOf(next.b()))) {
                    h2.a(cVar.f3778a, cVar.f3779b);
                }
                listIterator.set(i.a(next.b(), next.c(), h2.a()));
            }
        }
        return list;
    }

    private Map<Long, Set<c>> a(SQLiteDatabase sQLiteDatabase, List<i> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).b());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        a(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), p.a((Map) hashMap));
        return hashMap;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        a(q.a(sQLiteDatabase), r.a());
    }

    private byte[] a(long j) {
        return (byte[]) a(a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), o.a());
    }

    private static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private long b() {
        return a().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ SQLiteDatabase b(Throwable th) {
        throw new c.e.a.a.i.x.a("Timed out while trying to open db.", th);
    }

    private static c.e.a.a.b b(String str) {
        return str == null ? f3773f : c.e.a.a.b.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Long b(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    private Long b(SQLiteDatabase sQLiteDatabase, c.e.a.a.i.m mVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(mVar.a(), String.valueOf(c.e.a.a.i.z.a.a(mVar.c()))));
        if (mVar.b() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(mVar.b(), 0));
        }
        return (Long) a(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), x.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List b(b0 b0Var, c.e.a.a.i.m mVar, SQLiteDatabase sQLiteDatabase) {
        List<i> c2 = b0Var.c(sQLiteDatabase, mVar);
        b0Var.a(c2, b0Var.a(sQLiteDatabase, c2));
        return c2;
    }

    private long c() {
        return a().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private static String c(Iterable<i> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<i> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List c(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            m.a d2 = c.e.a.a.i.m.d();
            d2.a(cursor.getString(1));
            d2.a(c.e.a.a.i.z.a.a(cursor.getInt(2)));
            d2.a(a(cursor.getString(3)));
            arrayList.add(d2.a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List c(SQLiteDatabase sQLiteDatabase) {
        return (List) a(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), t.a());
    }

    private List<i> c(SQLiteDatabase sQLiteDatabase, c.e.a.a.i.m mVar) {
        ArrayList arrayList = new ArrayList();
        Long b2 = b(sQLiteDatabase, mVar);
        if (b2 == null) {
            return arrayList;
        }
        a(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b2.toString()}, null, null, null, String.valueOf(this.f3777e.c())), n.a(this, arrayList, mVar));
        return arrayList;
    }

    private boolean d() {
        return b() * c() >= this.f3777e.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ byte[] d(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    SQLiteDatabase a() {
        h0 h0Var = this.f3774b;
        h0Var.getClass();
        return (SQLiteDatabase) a(s.a(h0Var), v.a());
    }

    @Override // c.e.a.a.i.w.j.c
    public i a(c.e.a.a.i.m mVar, c.e.a.a.i.h hVar) {
        c.e.a.a.i.u.a.a("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", mVar.c(), hVar.f(), mVar.a());
        long longValue = ((Long) a(w.a(this, mVar, hVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return i.a(longValue, mVar, hVar);
    }

    @Override // c.e.a.a.i.w.j.c
    public Iterable<i> a(c.e.a.a.i.m mVar) {
        return (Iterable) a(k.a(this, mVar));
    }

    @Override // c.e.a.a.i.x.b
    public <T> T a(b.a<T> aVar) {
        SQLiteDatabase a2 = a();
        a(a2);
        try {
            T execute = aVar.execute();
            a2.setTransactionSuccessful();
            return execute;
        } finally {
            a2.endTransaction();
        }
    }

    @Override // c.e.a.a.i.w.j.c
    public void a(c.e.a.a.i.m mVar, long j) {
        a(j.a(j, mVar));
    }

    @Override // c.e.a.a.i.w.j.c
    public void a(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        a().compileStatement("DELETE FROM events WHERE _id in " + c(iterable)).execute();
    }

    @Override // c.e.a.a.i.w.j.c
    public long b(c.e.a.a.i.m mVar) {
        return ((Long) a(a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{mVar.a(), String.valueOf(c.e.a.a.i.z.a.a(mVar.c()))}), z.a())).longValue();
    }

    @Override // c.e.a.a.i.w.j.c
    public void b(Iterable<i> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        a(y.a("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + c(iterable)));
    }

    @Override // c.e.a.a.i.w.j.c
    public boolean c(c.e.a.a.i.m mVar) {
        return ((Boolean) a(a0.a(this, mVar))).booleanValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3774b.close();
    }

    @Override // c.e.a.a.i.w.j.c
    public int x() {
        return ((Integer) a(m.a(this.f3775c.a() - this.f3777e.b()))).intValue();
    }

    @Override // c.e.a.a.i.w.j.c
    public Iterable<c.e.a.a.i.m> y() {
        return (Iterable) a(l.a());
    }
}

package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.b0;
/* loaded from: classes.dex */
final /* synthetic */ class m implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f3807a;

    private m(long j) {
        this.f3807a = j;
    }

    public static b0.b a(long j) {
        return new m(j);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        Integer valueOf;
        valueOf = Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f3807a)}));
        return valueOf;
    }
}

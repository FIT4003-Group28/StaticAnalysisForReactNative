package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.h0;
/* loaded from: classes.dex */
final /* synthetic */ class f0 implements h0.a {

    /* renamed from: a  reason: collision with root package name */
    private static final f0 f3788a = new f0();

    private f0() {
    }

    public static h0.a a() {
        return f3788a;
    }

    @Override // c.e.a.a.i.w.j.h0.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}

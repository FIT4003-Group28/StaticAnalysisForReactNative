package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements b0.d {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f3813a;

    private q(SQLiteDatabase sQLiteDatabase) {
        this.f3813a = sQLiteDatabase;
    }

    public static b0.d a(SQLiteDatabase sQLiteDatabase) {
        return new q(sQLiteDatabase);
    }

    @Override // c.e.a.a.i.w.j.b0.d
    public Object a() {
        return this.f3813a.beginTransaction();
    }
}

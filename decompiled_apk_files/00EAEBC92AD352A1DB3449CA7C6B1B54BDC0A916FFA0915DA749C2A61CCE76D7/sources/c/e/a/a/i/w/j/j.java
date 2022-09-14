package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.b0;
/* loaded from: classes.dex */
final /* synthetic */ class j implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f3802a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.m f3803b;

    private j(long j, c.e.a.a.i.m mVar) {
        this.f3802a = j;
        this.f3803b = mVar;
    }

    public static b0.b a(long j, c.e.a.a.i.m mVar) {
        return new j(j, mVar);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return b0.a(this.f3802a, this.f3803b, (SQLiteDatabase) obj);
    }
}

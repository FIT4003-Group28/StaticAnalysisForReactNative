package c.e.a.a.i.w.j;

import android.database.Cursor;
import c.e.a.a.i.w.j.b0;
/* loaded from: classes.dex */
final /* synthetic */ class z implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private static final z f3824a = new z();

    private z() {
    }

    public static b0.b a() {
        return f3824a;
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        Long valueOf;
        valueOf = Long.valueOf(r2.moveToNext() ? ((Cursor) obj).getLong(0) : 0L);
        return valueOf;
    }
}

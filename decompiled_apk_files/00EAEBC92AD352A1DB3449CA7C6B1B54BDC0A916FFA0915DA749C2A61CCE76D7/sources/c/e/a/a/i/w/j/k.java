package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.b0;
/* loaded from: classes.dex */
final /* synthetic */ class k implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f3804a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.m f3805b;

    private k(b0 b0Var, c.e.a.a.i.m mVar) {
        this.f3804a = b0Var;
        this.f3805b = mVar;
    }

    public static b0.b a(b0 b0Var, c.e.a.a.i.m mVar) {
        return new k(b0Var, mVar);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return b0.b(this.f3804a, this.f3805b, (SQLiteDatabase) obj);
    }
}

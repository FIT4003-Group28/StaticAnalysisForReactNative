package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.b0;
/* loaded from: classes.dex */
final /* synthetic */ class a0 implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f3768a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.m f3769b;

    private a0(b0 b0Var, c.e.a.a.i.m mVar) {
        this.f3768a = b0Var;
        this.f3769b = mVar;
    }

    public static b0.b a(b0 b0Var, c.e.a.a.i.m mVar) {
        return new a0(b0Var, mVar);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return b0.a(this.f3768a, this.f3769b, (SQLiteDatabase) obj);
    }
}

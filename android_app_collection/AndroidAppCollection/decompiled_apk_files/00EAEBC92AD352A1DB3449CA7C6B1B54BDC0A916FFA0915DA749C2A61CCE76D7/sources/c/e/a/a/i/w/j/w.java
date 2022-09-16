package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.b0;
/* loaded from: classes.dex */
final /* synthetic */ class w implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f3819a;

    /* renamed from: b  reason: collision with root package name */
    private final c.e.a.a.i.m f3820b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.h f3821c;

    private w(b0 b0Var, c.e.a.a.i.m mVar, c.e.a.a.i.h hVar) {
        this.f3819a = b0Var;
        this.f3820b = mVar;
        this.f3821c = hVar;
    }

    public static b0.b a(b0 b0Var, c.e.a.a.i.m mVar, c.e.a.a.i.h hVar) {
        return new w(b0Var, mVar, hVar);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return b0.a(this.f3819a, this.f3820b, this.f3821c, (SQLiteDatabase) obj);
    }
}

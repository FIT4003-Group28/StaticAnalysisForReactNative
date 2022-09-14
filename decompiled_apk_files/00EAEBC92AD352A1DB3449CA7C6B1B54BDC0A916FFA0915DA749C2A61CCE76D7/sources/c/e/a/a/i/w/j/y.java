package c.e.a.a.i.w.j;

import android.database.sqlite.SQLiteDatabase;
import c.e.a.a.i.w.j.b0;
/* loaded from: classes.dex */
final /* synthetic */ class y implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3823a;

    private y(String str) {
        this.f3823a = str;
    }

    public static b0.b a(String str) {
        return new y(str);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return b0.a(this.f3823a, (SQLiteDatabase) obj);
    }
}

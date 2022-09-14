package c.e.a.a.i.w.j;

import android.database.Cursor;
import c.e.a.a.i.w.j.b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private static final u f3817a = new u();

    private u() {
    }

    public static b0.b a() {
        return f3817a;
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}

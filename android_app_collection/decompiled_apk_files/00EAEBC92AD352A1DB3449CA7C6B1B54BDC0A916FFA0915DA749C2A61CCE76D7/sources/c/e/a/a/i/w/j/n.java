package c.e.a.a.i.w.j;

import android.database.Cursor;
import c.e.a.a.i.w.j.b0;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f3808a;

    /* renamed from: b  reason: collision with root package name */
    private final List f3809b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.m f3810c;

    private n(b0 b0Var, List list, c.e.a.a.i.m mVar) {
        this.f3808a = b0Var;
        this.f3809b = list;
        this.f3810c = mVar;
    }

    public static b0.b a(b0 b0Var, List list, c.e.a.a.i.m mVar) {
        return new n(b0Var, list, mVar);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return b0.a(this.f3808a, this.f3809b, this.f3810c, (Cursor) obj);
    }
}

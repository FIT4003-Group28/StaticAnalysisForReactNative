package c.e.a.a.i.w.j;

import android.database.Cursor;
import c.e.a.a.i.w.j.b0;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map f3812a;

    private p(Map map) {
        this.f3812a = map;
    }

    public static b0.b a(Map map) {
        return new p(map);
    }

    @Override // c.e.a.a.i.w.j.b0.b
    public Object a(Object obj) {
        return b0.a(this.f3812a, (Cursor) obj);
    }
}

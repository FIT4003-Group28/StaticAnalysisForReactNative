package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.util.List;
/* renamed from: clhq  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class clhq implements clhr {
    static final clhr a = new clhq();

    private clhq() {
    }

    @Override // defpackage.clhr
    public final Object a(Object obj) {
        return (List) clhu.l(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), clhh.a);
    }
}

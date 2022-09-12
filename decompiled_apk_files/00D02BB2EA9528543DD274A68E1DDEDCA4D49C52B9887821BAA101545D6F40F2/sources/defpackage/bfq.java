package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfq  reason: default package */
/* loaded from: classes3.dex */
public final class bfq {
    public final bn a;
    public final bc<bfo> b;

    public bfq(bn bnVar) {
        this.a = bnVar;
        this.b = new bfp(bnVar);
    }

    public final List<String> a(String str) {
        br a = br.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.f(1);
        } else {
            a.i(1, str);
        }
        this.a.E();
        Cursor q = this.a.q(a);
        try {
            ArrayList arrayList = new ArrayList(q.getCount());
            while (q.moveToNext()) {
                arrayList.add(q.getString(0));
            }
            return arrayList;
        } finally {
            q.close();
            a.c();
        }
    }
}

package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: btt  reason: default package */
/* loaded from: classes2.dex */
public final class btt {
    public final bks a;
    public final bkm b;

    public btt(bks bksVar) {
        this.a = bksVar;
        this.b = new bts(bksVar);
    }

    public final List a(String str) {
        bku a = bku.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a.e(1);
        } else {
            a.f(1, str);
        }
        this.a.e();
        Cursor f = ld.f(this.a, a, false);
        try {
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                arrayList.add(f.getString(0));
            }
            return arrayList;
        } finally {
            f.close();
            a.i();
        }
    }
}

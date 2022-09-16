package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bvc  reason: default package */
/* loaded from: classes2.dex */
public final class bvc extends bve {
    final /* synthetic */ brq a;
    final /* synthetic */ String b;

    public bvc(brq brqVar, String str) {
        this.a = brqVar;
        this.b = str;
    }

    @Override // defpackage.bve
    public final void a() {
        WorkDatabase workDatabase = this.a.d;
        workDatabase.f();
        try {
            bun n = workDatabase.n();
            String str = this.b;
            bku a = bku.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
            a.f(1, str);
            ((bux) n).a.e();
            Cursor f = ld.f(((bux) n).a, a, false);
            ArrayList<String> arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                arrayList.add(f.getString(0));
            }
            f.close();
            a.i();
            for (String str2 : arrayList) {
                c(this.a, str2);
            }
            workDatabase.h();
            workDatabase.g();
            d(this.a);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}

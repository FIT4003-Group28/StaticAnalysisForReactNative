package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvd  reason: default package */
/* loaded from: classes2.dex */
public final class bvd extends bve {
    final /* synthetic */ brq a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;

    public bvd(brq brqVar, String str, boolean z) {
        this.a = brqVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.bve
    public final void a() {
        WorkDatabase workDatabase = this.a.d;
        workDatabase.f();
        try {
            bun n = workDatabase.n();
            String str = this.b;
            bku a = bku.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                a.e(1);
            } else {
                a.f(1, str);
            }
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
            if (!this.c) {
                return;
            }
            d(this.a);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}

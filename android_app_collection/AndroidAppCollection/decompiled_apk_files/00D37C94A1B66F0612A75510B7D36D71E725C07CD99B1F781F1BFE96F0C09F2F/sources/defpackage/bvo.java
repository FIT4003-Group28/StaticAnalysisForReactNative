package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bvo  reason: default package */
/* loaded from: classes2.dex */
public final class bvo implements Runnable {
    final /* synthetic */ brq a;
    final /* synthetic */ String b;
    public final bwk c = bwk.h();

    public bvo(brq brqVar, String str) {
        this.a = brqVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bun n = this.a.d.n();
            String str = this.b;
            bku a = bku.a("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (str == null) {
                a.e(1);
            } else {
                a.f(1, str);
            }
            ((bux) n).a.e();
            ((bux) n).a.f();
            Cursor f = ld.f(((bux) n).a, a, true);
            int h = ld.h(f, "id");
            int h2 = ld.h(f, "state");
            int h3 = ld.h(f, "output");
            int h4 = ld.h(f, "run_attempt_count");
            afw afwVar = new afw();
            afw afwVar2 = new afw();
            while (f.moveToNext()) {
                if (!f.isNull(h)) {
                    String string = f.getString(h);
                    if (((ArrayList) afwVar.get(string)) == null) {
                        afwVar.put(string, new ArrayList());
                    }
                }
                if (!f.isNull(h)) {
                    String string2 = f.getString(h);
                    if (((ArrayList) afwVar2.get(string2)) == null) {
                        afwVar2.put(string2, new ArrayList());
                    }
                }
            }
            f.moveToPosition(-1);
            ((bux) n).m(afwVar);
            ((bux) n).l(afwVar2);
            ArrayList arrayList = new ArrayList(f.getCount());
            while (f.moveToNext()) {
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = !f.isNull(h) ? (ArrayList) afwVar.get(f.getString(h)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                if (!f.isNull(h)) {
                    arrayList2 = (ArrayList) afwVar2.get(f.getString(h));
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                bul bulVar = new bul();
                bulVar.a = f.getString(h);
                bulVar.f = aeh.g(f.getInt(h2));
                bulVar.b = bpx.a(f.getBlob(h3));
                bulVar.c = f.getInt(h4);
                bulVar.d = arrayList3;
                bulVar.e = arrayList2;
                arrayList.add(bulVar);
            }
            ((bux) n).a.h();
            f.close();
            a.i();
            ((bux) n).a.g();
            this.c.e(bum.b.a(arrayList));
        } catch (Throwable th) {
            this.c.f(th);
        }
    }

    public bvo() {
    }
}

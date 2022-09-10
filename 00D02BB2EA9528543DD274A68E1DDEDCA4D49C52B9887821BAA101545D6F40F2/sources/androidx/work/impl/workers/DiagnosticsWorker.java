package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DiagnosticsWorker extends Worker {
    static {
        bbz.f("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static void i(bga bgaVar, bgv bgvVar, bfx bfxVar, List<bgh> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (bgh bghVar : list) {
            bfu c = bfxVar.c(bghVar.a);
            Integer valueOf = c != null ? Integer.valueOf(c.b) : null;
            String str = bghVar.a;
            br a = br.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                a.f(1);
            } else {
                a.i(1, str);
            }
            bgaVar.a.E();
            Cursor q = bgaVar.a.q(a);
            try {
                ArrayList arrayList = new ArrayList(q.getCount());
                while (q.moveToNext()) {
                    arrayList.add(q.getString(0));
                }
                q.close();
                a.c();
                List<String> a2 = bgvVar.a(bghVar.a);
                String join = TextUtils.join(",", arrayList);
                String join2 = TextUtils.join(",", a2);
                Object[] objArr = new Object[6];
                objArr[0] = bghVar.a;
                objArr[1] = bghVar.b;
                objArr[2] = valueOf;
                int i = bghVar.p;
                String a3 = bck.a(i);
                if (i != 0) {
                    objArr[3] = a3;
                    objArr[4] = join;
                    objArr[5] = join2;
                    sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", objArr));
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                q.close();
                a.c();
                throw th;
            }
        }
        sb.toString();
    }

    @Override // androidx.work.Worker
    public final bbx h() {
        WorkDatabase workDatabase = bdn.g(this.a).c;
        bgi t = workDatabase.t();
        bga x = workDatabase.x();
        bgv v = workDatabase.v();
        bfx w = workDatabase.w();
        List<bgh> n = t.n(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<bgh> m = t.m();
        List<bgh> p = t.p();
        if (n != null && !n.isEmpty()) {
            bbz.e().c(new Throwable[0]);
            bbz e = bbz.e();
            i(x, v, w, n);
            e.c(new Throwable[0]);
        }
        if (m != null && !m.isEmpty()) {
            bbz.e().c(new Throwable[0]);
            bbz e2 = bbz.e();
            i(x, v, w, m);
            e2.c(new Throwable[0]);
        }
        if (p != null && !p.isEmpty()) {
            bbz.e().c(new Throwable[0]);
            bbz e3 = bbz.e();
            i(x, v, w, p);
            e3.c(new Throwable[0]);
        }
        return bbx.a();
    }
}

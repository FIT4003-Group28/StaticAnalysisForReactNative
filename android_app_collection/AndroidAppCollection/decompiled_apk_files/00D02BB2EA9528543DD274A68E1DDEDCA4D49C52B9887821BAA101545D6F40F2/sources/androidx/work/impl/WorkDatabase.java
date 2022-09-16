package androidx.work.impl;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class WorkDatabase extends bn {
    private static final long h = TimeUnit.DAYS.toMillis(1);

    public static WorkDatabase r(Context context, Executor executor, boolean z) {
        bk a;
        if (z) {
            a = bj.b(context, WorkDatabase.class);
            a.d = true;
        } else {
            a = bj.a(context, WorkDatabase.class, bdl.a());
            a.c = new bda(context);
        }
        a.a = executor;
        a.b(new bdb());
        a.c(bdk.a);
        a.c(new bdi(context, 2, 3));
        a.c(bdk.b);
        a.c(bdk.c);
        a.c(new bdi(context, 5, 6));
        a.c(bdk.d);
        a.c(bdk.e);
        a.c(bdk.f);
        a.c(new bdj(context));
        a.c(new bdi(context, 10, 11));
        a.e = false;
        a.f = true;
        return (WorkDatabase) a.a();
    }

    public static String s() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - h) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract bgi t();

    public abstract bfq u();

    public abstract bgv v();

    public abstract bfx w();

    public abstract bga x();

    public abstract bgf y();

    public abstract bft z();
}

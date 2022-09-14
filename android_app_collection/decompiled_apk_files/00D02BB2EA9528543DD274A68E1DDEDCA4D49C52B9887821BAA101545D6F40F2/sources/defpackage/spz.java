package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: spz  reason: default package */
/* loaded from: classes7.dex */
public final class spz {
    public final awvy a;
    public final ahjq b;
    public final Executor c;

    public spz(awvy awvyVar, ahjq ahjqVar, Executor executor) {
        this.a = awvyVar;
        this.b = ahjqVar;
        this.c = executor;
    }

    public static void a(dbsz<spv> dbszVar) {
        dbszVar.NU(spv.c(true, null));
    }

    public static void b(awwb awwbVar, dbsz<spv> dbszVar) {
        if (awwbVar == null) {
            a(dbszVar);
            return;
        }
        dbsg a = awwbVar.a(awvv.C);
        if (!a.a()) {
            a(dbszVar);
            return;
        }
        boolean b = awwbVar.c(awvv.C).b();
        if (b || awwbVar.c(awvv.C).a()) {
            dbszVar.NU(spv.c(!b, (dnus) a.b()));
            return;
        }
        awwbVar.c(awvv.C).toString();
        a(dbszVar);
    }
}

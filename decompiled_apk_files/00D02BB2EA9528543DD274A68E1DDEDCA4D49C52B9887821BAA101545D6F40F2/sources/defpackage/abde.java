package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abde  reason: default package */
/* loaded from: classes2.dex */
public final class abde implements abda {
    public final gdc a;
    public final cqkj b;
    public final abdn c;
    public final abdb d;
    public final Executor e;
    public final dqps f;
    public final abcx g;
    @dzsi
    public gde h;
    @dzsi
    public dehn<dhpd> i;

    public abde(Executor executor, cqkj cqkjVar, gdc gdcVar, abdn abdnVar, abdb abdbVar, abcx abcxVar, dqps dqpsVar) {
        this.e = executor;
        this.a = gdcVar;
        this.b = cqkjVar;
        this.c = abdnVar;
        this.d = abdbVar;
        this.f = dqpsVar;
        this.g = abcxVar;
    }

    public static boolean b(@dzsi dqps dqpsVar, @dzsi abcx abcxVar) {
        if (dqpsVar.b.size() != 0 || dqpsVar.d <= 0) {
            return false;
        }
        return !dbsj.d(abcxVar.f) && !dbsj.d(abcxVar.g) && !dbsj.d(abcxVar.h) && !dbsj.d(dqpsVar.c);
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        gde gdeVar = this.h;
        if (gdeVar != null) {
            gdeVar.dismiss();
            this.h = null;
        }
        dehn<dhpd> dehnVar = this.i;
        if (dehnVar != null) {
            dehnVar.cancel(true);
            this.i = null;
        }
    }
}

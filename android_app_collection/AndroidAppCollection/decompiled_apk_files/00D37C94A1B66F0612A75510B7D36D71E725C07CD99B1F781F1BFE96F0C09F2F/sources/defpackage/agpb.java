package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agpb  reason: default package */
/* loaded from: classes.dex */
public final class agpb implements agry {
    public final agvq a;
    public final agrf b;
    private final ankw c;
    private final ScheduledExecutorService d;

    public agpb(agvq agvqVar, agrf agrfVar, ankw ankwVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = agvqVar;
        this.b = agrfVar;
        this.c = ankwVar;
        this.d = scheduledExecutorService;
    }

    @Override // defpackage.agry
    public final agrx a(atrf atrfVar) {
        return agrx.a;
    }

    @Override // defpackage.agry
    public final ankt b(afvm afvmVar, atrf atrfVar) {
        final String g = aakj.g(atrfVar.d);
        int aq = akel.aq(atrfVar.c);
        if (aq == 0) {
            aq = 1;
        }
        if (aq - 1 == 1) {
            final atrc atrcVar = atrfVar.e;
            if (atrcVar == null) {
                atrcVar = atrc.b;
            }
            final agvx a = this.b.a();
            if (!afvmVar.d().equals(a.q())) {
                return anlz.q(agru.b);
            }
            return ((anko) anii.h(anko.q(this.b.a().m().h(g)), new ampg() { // from class: agpa
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    agpb agpbVar = agpb.this;
                    agvx agvxVar = a;
                    String str = g;
                    atrc atrcVar2 = atrcVar;
                    ampq ampqVar = (ampq) obj;
                    if (!ampqVar.h()) {
                        return agru.c;
                    }
                    if (((agqv) ampqVar.c()).b()) {
                        return agru.a;
                    }
                    boolean z = agvxVar instanceof agio;
                    String str2 = null;
                    agkg c = z ? ((agio) agpbVar.b.a()).c() : null;
                    if (c == null) {
                        return agru.a;
                    }
                    atym atymVar = (atym) atrcVar2.qm(atym.b);
                    attl b = attl.b(atymVar.e);
                    if (b == null) {
                        b = attl.UNKNOWN_FORMAT_TYPE;
                    }
                    attl attlVar = b;
                    String str3 = atymVar.f;
                    if ((atymVar.c & 32) != 0) {
                        str2 = atymVar.h;
                    }
                    c.h(str, str2, null, attlVar, str3, agpbVar.a.U(attlVar), agqn.OFFLINE_IMMEDIATELY, 0, false, false, false);
                    return agru.a;
                }
            }, this.c)).r(30L, TimeUnit.SECONDS, this.d);
        }
        return anlz.q(agru.c);
    }

    @Override // defpackage.agry
    public final ankt c(afvm afvmVar, amuk amukVar) {
        throw new UnsupportedOperationException();
    }
}

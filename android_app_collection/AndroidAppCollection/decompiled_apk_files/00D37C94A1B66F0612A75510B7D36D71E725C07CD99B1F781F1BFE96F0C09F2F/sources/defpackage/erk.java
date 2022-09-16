package defpackage;

import com.google.protos.youtube.api.innertube.AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erk  reason: default package */
/* loaded from: classes3.dex */
public final class erk implements aafl {
    public final aafo a;
    public final yzj b;
    private final abab c;
    private final /* synthetic */ int d;

    public erk(abab ababVar, aafo aafoVar, yzj yzjVar, int i) {
        this.d = i;
        ababVar.getClass();
        this.c = ababVar;
        aafoVar.getClass();
        this.a = aafoVar;
        yzjVar.getClass();
        this.b = yzjVar;
    }

    public erk(abab ababVar, aafo aafoVar, yzj yzjVar) {
        ababVar.getClass();
        this.c = ababVar;
        aafoVar.getClass();
        this.a = aafoVar;
        yzjVar.getClass();
        this.b = yzjVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (this.d == 0) {
            abab ababVar = this.c;
            abaf abafVar = new abaf(ababVar.e, ababVar.a.c(), ((RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint) apzgVar.qm(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint)).b);
            abafVar.j(apzgVar.c);
            abab ababVar2 = this.c;
            ababVar2.h.e(abafVar, new erj(this));
            return;
        }
        abab ababVar3 = this.c;
        aazw aazwVar = new aazw(ababVar3.e, ababVar3.a.c(), ((AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint) apzgVar.qm(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint)).b);
        aazwVar.j(apzgVar.c);
        abab ababVar4 = this.c;
        ababVar4.g.e(aazwVar, new eov(this, null));
    }
}

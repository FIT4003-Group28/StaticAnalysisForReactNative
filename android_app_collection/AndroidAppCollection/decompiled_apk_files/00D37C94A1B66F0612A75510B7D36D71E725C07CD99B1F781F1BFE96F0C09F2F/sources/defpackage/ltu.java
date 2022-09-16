package defpackage;

import android.content.Context;
import android.view.View;
import com.google.protos.youtube.api.innertube.AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
/* compiled from: PG */
/* renamed from: ltu  reason: default package */
/* loaded from: classes3.dex */
public class ltu extends ajzv implements ynl {
    protected atep a;

    public ltu(Context context, yni yniVar, aafo aafoVar, ajyi ajyiVar, ajrh ajrhVar, lmm lmmVar, aakn aaknVar, ajyz ajyzVar) {
        super(context, aafoVar, ajyiVar, ajrhVar, lmmVar, aaknVar, ajyzVar);
        yniVar.g(this);
    }

    @Override // defpackage.ajzv, defpackage.ajyh
    public void a(atep atepVar, View view, Object obj, acti actiVar) {
        super.a(atepVar, view, obj, actiVar);
        this.a = atepVar;
    }

    public final void b(isw iswVar) {
        ampq d = iswVar.d();
        if (d.h()) {
            ater aterVar = (ater) d.c();
            if ((aterVar.b & 8) == 0 || this.a == null) {
                return;
            }
            apzg apzgVar = aterVar.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (!apzgVar.qn(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint) && !apzgVar.qn(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint)) {
                return;
            }
            atep atepVar = this.a;
            apzg apzgVar2 = aterVar.e;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aopa mo52toBuilder = atepVar.mo52toBuilder();
            for (int i = 0; i < atepVar.c.size(); i++) {
                if ((((aten) atepVar.c.get(i)).b & 2) != 0) {
                    ater aterVar2 = ((aten) atepVar.c.get(i)).d;
                    if (aterVar2 == null) {
                        aterVar2 = ater.a;
                    }
                    apzg apzgVar3 = aterVar2.e;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    if (!apzgVar2.qn(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint) || !apzgVar3.qn(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint)) {
                        if (apzgVar2.qn(RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint) && apzgVar3.qn(AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint)) {
                            aopa createBuilder = aten.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aten atenVar = (aten) createBuilder.instance;
                            atenVar.d = aterVar;
                            atenVar.b |= 2;
                            mo52toBuilder.aD(i, createBuilder);
                        }
                    } else {
                        aopa createBuilder2 = aten.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aten atenVar2 = (aten) createBuilder2.instance;
                        atenVar2.d = aterVar;
                        atenVar2.b |= 2;
                        mo52toBuilder.aD(i, createBuilder2);
                    }
                }
            }
            this.a = (atep) mo52toBuilder.mo39build();
        }
    }

    public Class[] ky(Class cls, Object obj, int i) {
        return lmr.a(this, obj, i);
    }
}

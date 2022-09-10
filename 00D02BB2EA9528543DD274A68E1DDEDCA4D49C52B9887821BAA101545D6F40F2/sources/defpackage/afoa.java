package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afoa  reason: default package */
/* loaded from: classes2.dex */
public final class afoa implements afks {
    private final afml a;

    public afoa(afml afmlVar) {
        this.a = afmlVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        dpuk dpukVar;
        durd durdVar;
        duqk duqkVar = duqpVar.b;
        if (duqkVar == null) {
            duqkVar = duqk.d;
        }
        duqi b = duqi.b(duqkVar.b);
        if (b == null) {
            b = duqi.ERROR;
        }
        if (b == duqi.DISPLAY_MAJOR_EVENT || b == duqi.DISPLAY_EXPERIENCE) {
            if ((duqpVar.a & 1024) != 0) {
                durb durbVar = duqpVar.g;
                if (durbVar == null) {
                    durbVar = durb.b;
                }
                diji dijiVar = durbVar.a;
                if (dijiVar == null) {
                    dijiVar = diji.e;
                }
                if ((dijiVar.a & 2) == 0) {
                    dpukVar = dpuk.MAJOR_EVENT;
                } else {
                    durb durbVar2 = duqpVar.g;
                    if (durbVar2 == null) {
                        durbVar2 = durb.b;
                    }
                    diji dijiVar2 = durbVar2.a;
                    if (dijiVar2 == null) {
                        dijiVar2 = diji.e;
                    }
                    dpukVar = dpuk.b(dijiVar2.c);
                    if (dpukVar == null) {
                        dpukVar = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
                    }
                }
                afml afmlVar = this.a;
                if ((duqpVar.a & 8388608) != 0) {
                    durdVar = duqpVar.p;
                    if (durdVar == null) {
                        durdVar = durd.c;
                    }
                } else {
                    durdVar = null;
                }
                return new afmk(afmlVar, durdVar, dpukVar);
            }
            throw new afkt("MajorEventDetailsRequest is missing.");
        }
        throw new afkt("Wrong action type.");
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_SHOW_MAJOR_EVENT;
    }
}

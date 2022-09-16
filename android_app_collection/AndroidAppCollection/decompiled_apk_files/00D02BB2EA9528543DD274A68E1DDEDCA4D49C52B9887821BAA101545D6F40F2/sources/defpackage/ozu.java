package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ozu  reason: default package */
/* loaded from: classes7.dex */
public final class ozu implements cjyu<yyb> {
    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ yyb a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtqo dtqoVar = dtkuVar.k;
        if (dtqoVar == null) {
            dtqoVar = dtqo.e;
        }
        if ((dtqoVar.a & 1) != 0) {
            djyo djyoVar = dtqoVar.b;
            if (djyoVar == null) {
                djyoVar = djyo.h;
            }
            djyo djyoVar2 = djyoVar;
            cjtd b = oyf.b(cjztVar.b, dtqoVar.d, dtyi.cc, cjztVar.e, null);
            dthb dthbVar = dtqoVar.c;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            if ((dthbVar.b & 16) != 0) {
                dtmd dtmdVar = dthbVar.z;
                if (dtmdVar == null) {
                    dtmdVar = dtmd.c;
                }
                if ((dtmdVar.a & 2) == 0) {
                    dsqp dsqpVar = (dsqp) dthbVar.cu(5);
                    dsqpVar.bC(dthbVar);
                    dtha dthaVar = (dtha) dsqpVar;
                    dsqp dsqpVar2 = (dsqp) dtmdVar.cu(5);
                    dsqpVar2.bC(dtmdVar);
                    dtmc dtmcVar = (dtmc) dsqpVar2;
                    if (dtmcVar.c) {
                        dtmcVar.bF();
                        dtmcVar.c = false;
                    }
                    dtmd dtmdVar2 = (dtmd) dtmcVar.b;
                    djyoVar2.getClass();
                    dtmdVar2.b = djyoVar2;
                    dtmdVar2.a |= 2;
                    if (dthaVar.c) {
                        dthaVar.bF();
                        dthaVar.c = false;
                    }
                    dthb dthbVar2 = (dthb) dthaVar.b;
                    dtmd bK = dtmcVar.bK();
                    bK.getClass();
                    dthbVar2.z = bK;
                    dthbVar2.b |= 16;
                    dthbVar = dthaVar.bK();
                }
            }
            return new ozt(context, djyoVar2, b, dthbVar, cjztVar);
        }
        return null;
    }
}

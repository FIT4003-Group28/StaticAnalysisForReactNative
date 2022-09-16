package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: xtp  reason: default package */
/* loaded from: classes4.dex */
final class xtp implements View.OnClickListener {
    final /* synthetic */ xmd a;
    final /* synthetic */ aufe b;
    final /* synthetic */ ajrs c;
    final /* synthetic */ xtq d;
    final /* synthetic */ aopa e;

    public xtp(xtq xtqVar, xmd xmdVar, aufe aufeVar, aopa aopaVar, ajrs ajrsVar) {
        this.d = xtqVar;
        this.a = xmdVar;
        this.b = aufeVar;
        this.e = aopaVar;
        this.c = ajrsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aqav aqavVar;
        aqft aqftVar;
        aqax aqaxVar = this.a.a().c;
        if (aqaxVar == null) {
            aqaxVar = aqax.a;
        }
        if (aqaxVar.b == 62285947) {
            aqax aqaxVar2 = this.a.a().c;
            if (aqaxVar2 == null) {
                aqaxVar2 = aqax.a;
            }
            if (aqaxVar2.b == 62285947) {
                aqavVar = (aqav) aqaxVar2.c;
            } else {
                aqavVar = aqav.a;
            }
        } else {
            aqavVar = null;
        }
        aqal c = this.d.b.c(aqavVar, this.a.h());
        if (c == aqal.COMMENT_POLL_STATUS_VOTING) {
            return;
        }
        this.d.b.k(aqavVar.i, this.b.k, aqal.COMMENT_POLL_STATUS_VOTING);
        xlt xltVar = this.d.a;
        xmd xmdVar = this.a;
        aufe aufeVar = this.b;
        aufc aufcVar = (aufc) this.e.mo39build();
        acti actiVar = this.c.a;
        int i = aufcVar.b;
        if ((i & 64) != 0) {
            aafo aafoVar = xltVar.b;
            apzg apzgVar = aufcVar.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        } else if (((i & 128) == 0 || (i & 256) == 0) && (i & 8) == 0) {
            zep.b("Endpoint not filled in poll choice.");
        } else {
            if (c == aqal.COMMENT_POLL_STATUS_VOTE_AND_COMMENT) {
                aufb aufbVar = aufeVar.j;
                if (aufbVar == null) {
                    aufbVar = aufb.a;
                }
                if (aufbVar.b == 64099105) {
                    Context context = xltVar.a;
                    aufb aufbVar2 = aufeVar.j;
                    if (aufbVar2 == null) {
                        aufbVar2 = aufb.a;
                    }
                    if (aufbVar2.b == 64099105) {
                        aqftVar = (aqft) aufbVar2.c;
                    } else {
                        aqftVar = aqft.a;
                    }
                    ajgx.p(context, aqftVar, xltVar.b, actiVar, xltVar.f, new xlq(xltVar, xmdVar, aufeVar, aufcVar, actiVar), null);
                    return;
                }
            }
            xltVar.a(xmdVar, aufeVar, aufcVar, c, actiVar);
        }
    }
}

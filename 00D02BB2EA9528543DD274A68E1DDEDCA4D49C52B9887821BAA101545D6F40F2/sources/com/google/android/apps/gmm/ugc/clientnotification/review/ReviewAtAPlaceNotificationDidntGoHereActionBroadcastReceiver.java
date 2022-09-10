package com.google.android.apps.gmm.ugc.clientnotification.review;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ReviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver extends BroadcastReceiver {
    private static final dcqe e = dcqe.c("com.google.android.apps.gmm.ugc.clientnotification.review.ReviewAtAPlaceNotificationDidntGoHereActionBroadcastReceiver");
    public bzuu a;
    public auhi b;
    public angp c;
    public cqat d;

    private static dwyn b(long j) {
        dwym bZ = dwyn.d.bZ();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwyn dwynVar = (dwyn) bZ.b;
        dwynVar.a |= 1;
        dwynVar.b = seconds;
        return bZ.bK();
    }

    public final void a() {
        this.b.m(dpyv.REVIEW_AT_A_PLACE.dm);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String o;
        dxiq.c(this, context);
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("action");
        dbsk.s(stringExtra);
        if (!stringExtra.equals("follow_up_notification")) {
            return;
        }
        dlif dlifVar = null;
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("place_visit_metadata");
            if (byteArrayExtra != null) {
                dlifVar = (dlif) dsqw.cr(dlif.d, byteArrayExtra, dsqa.c());
            }
        } catch (dsrm unused) {
        }
        dbsg j = dbsg.j(dlifVar);
        if (!j.a()) {
            a();
            bvoo.h("PlaceVisitMetadata is not present in intent: %s", this);
            return;
        }
        dlif dlifVar2 = (dlif) j.b();
        long j2 = dlifVar2.a;
        long j3 = dlifVar2.b;
        dval bZ = dvay.u.bZ();
        dvax dvaxVar = dvax.STOP;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar = (dvay) bZ.b;
        dvayVar.m = dvaxVar.f;
        dvayVar.a |= 64;
        dwyn b = b(j2);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar2 = (dvay) bZ.b;
        b.getClass();
        dvayVar2.f = b;
        dvayVar2.a |= 4;
        dwyn b2 = b(j3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar3 = (dvay) bZ.b;
        b2.getClass();
        dvayVar3.g = b2;
        dvayVar3.a |= 8;
        dvaq bZ2 = dvat.g.bZ();
        dvar bZ3 = dvas.g.bZ();
        dvya bZ4 = dvyw.bv.bZ();
        if (dlifVar2.c.size() != 0) {
            dgrh dgrhVar = dlifVar2.c.get(0).a;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            o = akqi.k(dgrhVar).o();
        } else {
            bvoo.h("PlaceVisitMetadata does not contain any candidate places", new Object[0]);
            o = "";
        }
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dvyw dvywVar = (dvyw) bZ4.b;
        o.getClass();
        dvywVar.a |= 4;
        dvywVar.g = o;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvas dvasVar = (dvas) bZ3.b;
        dvyw bK = bZ4.bK();
        bK.getClass();
        dvasVar.b = bK;
        dvasVar.a |= 1;
        bZ2.a(bZ3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvay dvayVar4 = (dvay) bZ.b;
        dvat bK2 = bZ2.bK();
        bK2.getClass();
        dvayVar4.c = bK2;
        dvayVar4.b = 7;
        dvay bK3 = bZ.bK();
        dpoo bZ5 = dpop.d.bZ();
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dpop dpopVar = (dpop) bZ5.b;
        int i = 1 | dpopVar.a;
        dpopVar.a = i;
        dpopVar.b = j2;
        dpopVar.a = i | 2;
        dpopVar.c = j3;
        this.c.q(bK3, 1, bZ5.bK(), dbsg.i(new bzvj(this, dlifVar2)), false);
    }
}

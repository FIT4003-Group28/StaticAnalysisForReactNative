package defpackage;

import android.content.Intent;
import com.google.android.apps.gmm.place.action.webview.ChattyFormsWebViewCallbacks;
/* compiled from: PG */
/* renamed from: beby  reason: default package */
/* loaded from: classes3.dex */
public class beby implements bdzv {
    private final String a;
    private final boolean b;
    private final cjtd c;
    private final bebt d;
    private final String e;
    @dzsi
    private final jic f;

    public beby(bebu bebuVar, becn becnVar, ilo iloVar, dnwv dnwvVar, dnxf dnxfVar, ddho ddhoVar) {
        Intent intent;
        ddhj ddhjVar;
        String str = dnxfVar.d;
        this.a = str;
        this.e = (dnxfVar.a & 32) != 0 ? dnxfVar.f : str;
        dqdk dqdkVar = dnxfVar.g;
        jic jicVar = null;
        if (((dqdkVar == null ? dqdk.e : dqdkVar).a & 1) != 0) {
            dqdk dqdkVar2 = dnxfVar.g;
            dplx dplxVar = (dqdkVar2 == null ? dqdk.e : dqdkVar2).b;
            intent = bvrq.a(dplxVar == null ? dplx.g : dplxVar);
        } else {
            intent = null;
        }
        dnwv dnwvVar2 = dnwv.UNKNOWN_ACTION_TYPE;
        int ordinal = dnwvVar.ordinal();
        this.d = bebuVar.a(intent, (ordinal == 7 || ordinal == 9) ? new ChattyFormsWebViewCallbacks() : null, dnxfVar, dtxq.a);
        this.b = !dnxfVar.b;
        this.f = !dnxfVar.j.isEmpty() ? new jic(dnxfVar.j, ckqc.FULLY_QUALIFIED, 0, 250) : jicVar;
        cjta c = cjtd.c(iloVar.cb());
        c.d = ddhoVar;
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = iloVar.ai().g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        c.s(bZ.bK());
        if ((dnxfVar.a & 2048) != 0) {
            c.g(dnxfVar.h);
        }
        if (dnxfVar.b) {
            ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        } else {
            ddhjVar = ddhj.VISIBILITY_VISIBLE;
        }
        c.w(ddhjVar);
        this.c = c.a();
    }

    @Override // defpackage.bdzv
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bdzv
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.bdzv
    public cqkl c() {
        this.d.a();
        return cqkl.a;
    }

    @Override // defpackage.bdzv
    public Boolean d() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bdzv
    public CharSequence e() {
        return this.e;
    }

    @Override // defpackage.bdzv
    @dzsi
    public jic f() {
        return this.f;
    }
}

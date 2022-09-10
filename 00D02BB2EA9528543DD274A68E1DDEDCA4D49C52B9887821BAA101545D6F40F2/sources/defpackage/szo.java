package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: szo  reason: default package */
/* loaded from: classes7.dex */
public class szo extends szn implements syx {
    @dzsi
    private final twj a;
    private final sxp b;
    private final sxn c;
    private final sus d;

    public szo(twk twkVar, sxq sxqVar, sxo sxoVar, sut sutVar, tlv tlvVar, amve amveVar) {
        this.a = twkVar.a(tlvVar, amveVar, dtxn.ep, dtxn.eo, true);
        this.b = sxqVar.a();
        sus a = sutVar.a(tlvVar, amveVar);
        this.d = a;
        Activity activity = (Activity) ((dxjd) sxoVar.a).a;
        sxo.a(activity, 1);
        cqhn a2 = sxoVar.b.a();
        sxo.a(a2, 2);
        btvo a3 = sxoVar.c.a();
        sxo.a(a3, 3);
        Executor a4 = sxoVar.d.a();
        sxo.a(a4, 4);
        sxo.a(a, 5);
        this.c = new sxn(activity, a2, a3, a4, a);
    }

    @Override // defpackage.szn
    public void OI(jjn jjnVar) {
        this.b.h(jjnVar);
    }

    @Override // defpackage.syx
    public dcdc<cqix<?>> a() {
        dccx F = dcdc.F();
        F.g(cqgr.fT(new sua(), this.a));
        if (this.d.a()) {
            F.g(cqgr.fT(new sua(), this.c));
        }
        F.g(cqgr.fT(new sua(), this.b));
        return F.f();
    }
}
